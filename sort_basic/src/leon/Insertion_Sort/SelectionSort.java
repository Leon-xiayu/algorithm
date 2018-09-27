package Insertion_Sort;


public class SelectionSort {

    private SelectionSort() {
    }

    public  static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j])>0) {
                    swap(arr, i, j);
                }
            }

        }

    }

    private static void swap(Object[] arr, int i, int j) {
        Object a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    public static void main(String[] args) {
        int N = 20000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("Selection_Sort_Detect_Performance.SelectionSort", arr);

//        N = 200000;
//        Integer[] arr2 = SortTestHelper.generateRandomArray(N, 0, 100000);
//        SortTestHelper.testSort("Selection_Sort_Detect_Performance.SelectionSort", arr2);
    }
}
