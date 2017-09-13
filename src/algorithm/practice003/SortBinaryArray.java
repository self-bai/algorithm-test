package algorithm.practice003;

/**
 * Sort binary array in linear time
 * 线性时间排序二进制数组（线性时间即时间复杂度为O(n)）
 **/
public class SortBinaryArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1};
//        sortBinaryArray1(arr);
        sortBinaryArray2(arr);
    }

    /**
     * 统计数组中0的总数，然后将数组总数长度设为0，其余为1
     *
     * @param arr 给定数组
     */
    private static void sortBinaryArray1(int[] arr) {
        int count0 = 0; //记录数组中二进制0出现的次数
        for (int index = 0, len = arr.length; index < len; index++) {
            if (arr[index] == 0)
                arr[count0++] = 0;
        }
        for (int index = count0, len = arr.length; index < len; index++) {
            arr[count0++] = 1;
        }
        print(arr);
    }

    /**
     * @param arr 给定数组
     */
    private static void sortBinaryArray2(int[] arr) {
        int pivot = 1;//二进制1，比它小即为0
        int key0 = 0;   //记录当前二进制0写到的位置
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < pivot) { //如果这个位置的二进制为0
                int tmp = arr[key0];
                arr[key0] = arr[index];
                arr[index] = tmp;
                key0++;
            }
        }
        print(arr);
    }


    private static void print(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + "、");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
