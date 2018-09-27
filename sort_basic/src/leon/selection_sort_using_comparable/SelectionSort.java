package selection_sort_using_comparable;

import java.util.Arrays;

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
        Double[] d = {10.0,4.0,2.0,12.0,100.0};
        SelectionSort.sort(d);
        Arrays.asList(d).stream().forEach(System.out::println);
        System.out.println();

        Integer[] i = {100,409,378,10,523,23};
        SelectionSort.sort(i);
        Arrays.asList(i).stream().forEach(System.out::println);
        System.out.println();

        String[] s = {"D","A","D","H","C","G"};
        SelectionSort.sort(s);
        Arrays.asList(s).stream().forEach(System.out::println);
        System.out.println();

        Person[] p=new Person[4];
        p[0] = new Person("B",23);
        p[1] = new Person("D",22);
        p[2] = new Person("A",22);
        p[3] = new Person("C",21);
        SelectionSort.sort(p);
        Arrays.asList(p).stream().forEach(System.out::println);
    }
}
