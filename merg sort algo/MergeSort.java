public class MergeSort {
    public static void merge(int array[], int s, int mid, int e) {
        int n1 = mid - s + 1; // Size of left subarray
        int n2 = e - mid; // Size of right subarray

        // Left and right arrays
        int left[] = new int[n1];
        int right[] = new int[n2];

        // Copy values to left array
        for (int i = 0; i < n1; i++) {
            left[i] = array[s + i]; // Start from s
        }

        // Copy values to right array
        for (int j = 0; j < n2; j++) {
            right[j] = array[mid + 1 + j]; // Start from mid + 1
        }

        int i = 0, j = 0;
        // Merging the left and right arrays
        for (int k = s; k <= e; k++) { // Should run till e
            if (i < n1 && (j >= n2 || left[i] <= right[j])) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
        }
    }

    public static void ms(int array[], int s, int e) {
        // Base case
        if (s >= e) {
            return;   
        }
        
        // Find mid
        int mid = (s + e) / 2;

        // Left part sort
        ms(array, s, mid);

        // Right part sort
        ms(array, mid + 1, e);
        
        // Merge arrays
        merge(array, s, mid, e);
    }

    public static void main(String[] args) {
        int array[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int n = array.length;
        ms(array, 0, n - 1);

        // Print sorted array
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
