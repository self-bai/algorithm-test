package sort.quick;


/**
 * 快速排序
 * 2017-08-30 14:00
 **/
public class Quick {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1, 5, 3};
        sort(arr, 0, arr.length - 1);
        print(arr);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = getMiddle(arr, low, high);
            sort(arr, low, middle - 1);
            sort(arr, middle + 1, high);
        }
    }

    private static int getMiddle(int[] arr, int low, int high) {
        int tmp = arr[low]; //数组的第一个作为基准元素
        while (low < high) {    //起始位置要小于结束位置
            //起始位置小于结束位置 并且从高位位置开始查找到的元素大于等于基准元素时候不发生交换,直至找到小于基准元素的元素
            while (low < high && arr[high] >= tmp) {
                high--;
            }
            arr[low] = arr[high];   //比基准元素小的移动到低端
            //起始位置小于结束位置 并且从低位查找到的元素小于等于基准元素时候不发生交换,直至找到大于基准元素的元素
            while (low < high && arr[low] <= tmp) {
                low++;
            }
            arr[high] = arr[low];   //比基准元素大的移动到高端
        }
        arr[low] = tmp; //将基准元素放入尾部
        return low; //返回基准元素的位置
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
