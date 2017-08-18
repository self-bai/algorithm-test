package algorithm.practice001;

import java.util.HashMap;
import java.util.Map;

/**
 * Find Pair with given sum in a array
 * 从给定数组中找出符合给定和的对
 */
public class FindPair {

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1, 5, 3};
        int sum = 10;
        findPair1(arr, sum);
        findPair2(arr, sum);
    }

    /**
     * 直接通过遍历数组查找符合对
     *
     * @param arr 给定数组
     * @param sum 给定和
     */
    private static void findPair1(int[] arr, int sum) {
        for (int left = 0, len = arr.length; left < len; left++) {
            for (int right = left + 1; right < len; right++) {
                if (arr[left] + arr[right] == sum) {
                    System.out.printf("找到符合对，arr[%d] + arr[%d]：%d + %d \n",
                            left, right, arr[left], arr[right]);
//                    return; //是否找到一对即可
                }
            }
        }
    }

    /**
     * 使用Map来查找符合对，以空间换时间。缺点：非数组顺序
     *
     * @param arr 给定数组
     * @param sum 给定和
     */
    private static void findPair2(int[] arr, int sum) {
        //定义一个空的Map集合，其key-value（数值-位置）
        Map<Integer, Integer> map = new HashMap<>();
        for (int left = 0, len = arr.length; left < len; left++) {
            int rightVal = sum - arr[left];
            if (map.containsKey(rightVal)) {
                System.out.printf("找到符合对，arr[%d] + arr[%d]：%d + %d \n", left, map.get(rightVal), arr[left], rightVal);
//                return; //是否找到一对即可
            }
            map.put(arr[left], left);
        }
    }

}
