package selection_Sort_Generate_Test_Cases;

public class SortTestHelper {
    public static Integer[] generateRandomArray(int n, int rangeL, int rangeR) {
        assert rangeL <= rangeR;
        Integer[] integers = new Integer[n];
        for (int i = 0; i < n; i++) {
            integers[i] = new Integer((int) (Math.random() * (rangeR - rangeL + 1) + rangeL));
        }
        return integers;
    }

    // 打印arr数组的所有内容
    public static void printArray(Object arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
        return;
    }
}
