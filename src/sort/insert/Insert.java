package sort.insert;

/**
 * 直接插入排序
 * 在要排序的一组数中,假设前面(n-1)[n>=2]个数已经是排好顺序的,现在要把第n个数插到前面的有序数中,
 * 使得这n个数也是排好顺序的。如此反复进行,直到全部排好顺序。
 * 2017-08-30 14:16
 **/
public class Insert {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1, 5, 3};
        sort(arr);
        printf(arr);
    }

    private static void sort(int[] arr) {
        int tmp;    //记录中间元素
        for (int high = 1, len = arr.length; high < len; high++) {
            tmp = arr[high];    //当前要插入到有序数组中的值
            int low = high - 1;
            //从未排序的位置开始进行比较,直至找到大于中间元素的元素,将其以后的整体后移一个单位
            for (; low >= 0 && tmp < arr[low]; low--) {
                arr[low + 1] = arr[low];
            }
            arr[low + 1] = tmp;
        }
    }

    private static void printf(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
