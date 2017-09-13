package sort.merge;

/**
 * 归并排序
 */
public class Merge {

    private static int mark = 0;

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 6, 2};
        sort(arr);
    }

    private static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        printf(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;//分隔点
            mark++;
            System.out.print("正在进行第" + mark + "次分隔，得到");
            System.out.println("[" + low + "-" + mid + "],[" + (mid + 1) + "-" + high + "]");

            sort(arr, low, mid);//左边数组
            sort(arr, mid + 1, high);//右边数组
            merge(arr, low, mid, high);
        }
    }

    /**
     * 对数组中的某一段进行排序
     *
     * @param arr  数组
     * @param low  低位
     * @param mid  中位
     * @param high 高位
     */
    private static void merge(int[] arr, int low, int mid, int high) {
        System.out.println("合并:[" + low + "-" + mid + "] 和 [" + (mid + 1) + "-" + high + "]");
        int[] temp = new int[high - low + 1];
        int left = low;//左指针
        int right = mid + 1;//右指针
        int k = 0;//新数组要插入位置的指针
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {//将较小值插入新数组
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }
        //把左边剩余的数插入新数组
        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        //把右边剩余的数插入新数组
        while (right <= high) {
            temp[k++] = arr[right++];
        }
        //把新数组的数覆盖到原数组中
        for (int i = 0; i < temp.length; i++) {
            arr[i + low] = temp[i];
        }
    }

    private static void printf(int[] arr, int low, int high) {
        while (low < high) {
            System.out.print(arr[low++] + "、");
        }
        System.out.println(arr[high]);
    }
}
