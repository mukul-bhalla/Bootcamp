package Graph;

import java.util.*;

public class Graph {
    public static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int node) {
        System.out.println(node + " ");
        visited[node] = true;
        for (Integer i : graph.get(node)) {
            if (visited[i] == false) {
                dfs(graph, visited, i);
            }
        }
    }

    public static void bfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int V) {
        Queue<Integer> q = new LinkedList<>();
        q.add(V);
        visited[V] = true;
        while (!q.isEmpty()) {
            Integer node = q.poll();
            System.out.println(node + " ");
            for (Integer i : graph.get(node)) {
                if (visited[i] == false) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<Integer>());
        }
        graph.get(1).add(2);
        graph.get(1).add(4);
        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(3).add(2);
        graph.get(3).add(4);
        graph.get(4).add(1);
        graph.get(4).add(3);

        for (int i = 0; i <= V; i++) {
            System.out.print(i + " -> [");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println(" ]");
        }
        boolean visited[] = new boolean[V + 1];
        bfs(graph, visited, 1);

    }
}
