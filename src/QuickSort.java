import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {445, 21, 34, 3, 1, 4, 2, 5, 45, 87, 921, 932};

        // Call the quicksort method to sort the array
        quickSort(arr, 0, arr.length-1);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {

        // Base case: if low is greater than or equal to high, the array is sorted
        if (low < high) {

            // partition the array
            int pivot = partition(arr, low, high);

            // recursively sort the left and right parts of the array
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        // set the pivot as the last element of the array
        int pivot = arr[high];
        int i = low - 1;

        // iterate over the array
        for (int j = low; j <= high-1; j++) {

            // if the current element is less than or equal to the pivot, swap it with the element at index i+1
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap the pivot with the element at index i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // return the pivot's index
        return i + 1;
    }
}
