package sort.bubble;

/**
 * 冒泡排序
 * 每次循环，将最大值移动到最后对应的位置
 * 2017-08-30 13:54
 **/
public class Bubble {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1, 5, 3};
        sort(arr);
        print(arr);
    }

    private static void sort(int[] arr) {
        int tmp;
        for (int low = 0, len = arr.length; low < len; low++) {
            for (int high = 0; high < len - low - 1; high++) {
                if (arr[high] > arr[high + 1]) {
                    tmp = arr[high + 1];
                    arr[high + 1] = arr[high];
                    arr[high] = tmp;
                }
            }
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
