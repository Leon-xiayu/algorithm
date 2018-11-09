package merge_sort_bottom_up;

public class InsertionSort {
    private InsertionSort() {
    }


    public static void sort(Comparable[] arr) {
        /**
         * 第i个元素放到前 [1,i-1]个数组中合适的位置
         */
        Integer n = arr.length;
        // 写法1
//            for( int j = i ; j > 0 ; j -- )
//                if( arr[j].compareTo( arr[j-1] ) < 0 )
//                    swap( arr, j , j-1 );
//                else
//                    break;
        // 写法2
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
                swap(arr, j, j - 1);
            }

        }

        // 写法3
//        Comparable e = arr[i];
//        int j = i;
//        for (; j > 0 && arr[j - 1].compareTo(e) > 0; j--)
//            arr[j] = arr[j - 1];
//        arr[j] = e;


    }

    // 对arr[l...r]的区间使用InsertionSort排序
    public static void sort(Comparable[] arr, int l, int r){

        for( int i = l + 1 ; i <= r ; i ++ ){
            Comparable e = arr[i];
            int j = i;
            for( ; j > l && arr[j-1].compareTo(e) > 0 ; j--)
                arr[j] = arr[j-1];
            arr[j] = e;
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }


}
