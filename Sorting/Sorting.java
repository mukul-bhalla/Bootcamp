package Sorting;

public class Sorting {
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < nums.length - i; j++) {
                if (nums[j] < nums[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = nums[min_idx];
            nums[min_idx] = nums[i];
            nums[i] = temp;

        }
    }

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static int Partition(int[] nums, int l, int h) {
        int i = l, j = h;
        int pivot = nums[l];
        do {
            do {
                i++;
            } while (nums[i] <= pivot);

            do {
                j--;
            } while (nums[j] > pivot);

            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        } while (i < j);

        int temp = nums[j];
        nums[j] = pivot;
        nums[l] = temp;

        return j;
    }

    public static void quickSort(int[] nums, int l, int h) {
        int middle;
        if (l < h) {
            middle = Partition(nums, l, h);
            quickSort(nums, l, middle);
            quickSort(nums, middle + 1, h);
        }

    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k++] = leftArray[i++];
        }
        while (j < n2) {
            arr[k++] = rightArray[j++];
        }

    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 90, 80, 70, 60, 50, 30, 20, 10, (int) 1e9 };
        mergeSort(nums, 0, nums.length - 1);
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}
