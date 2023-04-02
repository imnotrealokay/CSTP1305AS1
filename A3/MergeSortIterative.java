public class MergeSortIterative {
    void mergeSort(int[] inputArray) {
        int n = inputArray.length;
        int p, i, l, mid, h;
        for(p = 2; p <= n; p = p * 2) {
            for(i = 0; i + p - 1 < n; i = i + p) {
                l = i;
                h = i + p - 1;
                mid = (l + h) / 2;
                merge(inputArray, l, mid, h);
            }
            if(p/2 <n) {
                merge(inputArray, 0, p/2, n - 1);
            }
        }
        
    }

    void merge(int A[], int l, int mid, int h) {
        int i = l, j = mid + 1, k = l;
        int B[] = new int[A.length];
        while(i <= mid && j <= h) {
            if(A[i] < A[j]) {
                B[k++] = A[i++];
            }else {
                B[k++] = A[j++];
            }
        }
        for(; i <= mid; i++) {
            B[k++] = A[i];
        }
        for(; j <= h; j++) {
            B[k++] = A[j];
        }
        for(i = l; i <= h; i++) {
            A[i] = B[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 33, 92, 24, 50, 39, 86, 81, 13, 65, 32, 41, 67 };
        MergeSortIterative m = new MergeSortIterative();
        
        m.mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}