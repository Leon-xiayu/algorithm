package quick_sort;


import insertion_Sort_Advance.SortTestHelper;

public class QuickSort {

    public QuickSort() {

    }

    public static void sort(Comparable[] arr) {
        int n = arr.length - 1;
        sort(arr, 0, n - 1);
    }

    public static void sort(Comparable[] arr, int l, int r) {
        if (l >= r) return;
        int p = partition(arr, l, r);
        sort(arr, l, p - 1);
        sort(arr, p + 1, r);
    }

    //[l,r]前闭后闭区间
    //返回p，使得arr[l...p-1]<arr[p],arr[p+1...r]>arr[p]
    private static int partition(Comparable[] arr, int l, int r) {
        // arr[l+1...j] < v ; arr[j+1...i) > v
        Comparable v = arr[l];
        int j = l;
        for (int i = l + 1; i < r; i++) {
            if (arr[i].compareTo(v) < 0) {
                j++;
                swap(arr, i, j);
                //优雅的写法swap(arr,i,++j);
            }
        }
        swap(arr, l, j);
        return j;
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int n = 100000;
        Comparable[] arr = SortTestHelper.generateRandomArray(n, 0, n);
        SortTestHelper.testSort("quick_sort.QuickSort",arr);
    }

}
