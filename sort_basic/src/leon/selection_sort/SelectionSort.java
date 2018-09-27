package selection_sort;

public class SelectionSort {

    private SelectionSort() {

    }

    /**
     * 排序算法（O（n^2））:
     * 选择排序：它的工作原理是每一次从待排序的数据元素中选出最小（或最大）的一个元素，
     * 存放在序列的起始位置，直到全部待排序的数据元素排完。
     *
     * @param arr int类型数组
     */
    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }

        }

    }

    private static void swap(int[] arr, int i, int j) {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    public static void main(String[] args) {
        int[] arr = {20,9,8,7,6,4,3,2};
        SelectionSort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
