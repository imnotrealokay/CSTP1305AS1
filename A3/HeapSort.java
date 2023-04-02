public class HeapSort {
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void bubbleDown(int[] arr, int i, int n) {
        if (i >= n)
            return;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;
        if (left < n && arr[left] > arr[max]) {
            max = left;
        }
        if (right < n && arr[right] > arr[max]) {
            max = right;
        }
        if (max != i) {
            swap(arr, i, max);
            bubbleDown(arr, max, n);
        }
    }

    void bubbleUp(int[] arr, int n) {
        int last_node = n - 1;
        int parent = (last_node - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            bubbleDown(arr, i, n);
        }
    }

    void heap_sort(int[] arr) {
        int n = arr.length;
        bubbleUp(arr, n);
        
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            bubbleDown(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 33, 92, 24, 50, 39, 86, 81, 13, 65, 32, 41, 67};
        HeapSort h = new HeapSort();

        h.heap_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}