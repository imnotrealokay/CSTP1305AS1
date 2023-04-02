public class QuickSort{
    public static void quickSort(int[] arr, int left, int right) {
    if (left < right) {
        int pivotIndex = partition(arr, left, right);
        quickSort(arr, left, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, right);
    }
}

public static int partition(int[] arr, int left, int right) {
    int pivotValue = arr[right];
    int i = left - 1;
    for (int j = left; j < right; j++) {
        if (arr[j] < pivotValue) {
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, right);
    return i + 1;
}

public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
public static void main(String[] args) {
    int[] arr = { 1, 5, 2, 94, 45, 28, 39, 25, 67, 32, 41, 65, 32, 41, 67 };
    QuickSort q = new QuickSort();
    q.quickSort(arr, 0, 4);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}}