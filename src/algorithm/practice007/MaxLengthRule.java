package algorithm.practice007;

import java.util.HashMap;
import java.util.Map;

/**
 * Find maximum length sub-array equals number of 0's and 1's
 * 从给定集合中找出满足01格式的最大长度的数组
 * For example
 * Input: {0, 0, 1, 0, 1, 0, 0}
 * Output: Largest subArray is {0, 1, 0, 1} or {1, 0, 1, 0}
 */
public class MaxLengthRule {

    public static void main(String[] args) {

    }

    /**
     * 思路：将0换为-1，使用Map，key存放首次出现的sum，value存放对应的位置
     *
     * @param arr 给定数组
     */
    private static void findMaxLengthRule(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = 0, start = 0, high = 0, sum = 0;
        map.put(0, -1); //当子数组相加为0时，进行加1操作
    }

    private static void printf(int[] arr, int low, int high) {
        for (; low < high; low++) {
            System.out.print(arr[low] + " ");
        }
        System.out.println(arr[high]);
    }
}
