package Selection_Sort_Generate_Test_Cases;

public class SelectionSort {

    private SelectionSort() {
    }

    private static void sort(Comparable[] arr) {
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
        Integer[] arr = SortTestHelper.generateRandomArray(100,10,1000);
        SelectionSort.sort(arr);
        SortTestHelper.printArray(arr);
    }
}
