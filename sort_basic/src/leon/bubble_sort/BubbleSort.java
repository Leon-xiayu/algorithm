package bubble_sort;

import insertion_Sort_Advance.SortTestHelper;

import java.util.Arrays;

public class BubbleSort {

    private BubbleSort() {
    }

    public static void sort(Comparable[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
               if(arr[i].compareTo(arr[j])>0){
                   swap(arr,i,j);
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
        Integer N = 20000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, N);
        Integer[] arr2 = Arrays.copyOf(arr, N);

        SortTestHelper.testSort("bubble_sort.BubbleSort",arr);
        SortTestHelper.testSort("insertion_Sort_Advance.SelectionSort",arr2);


    }

}
