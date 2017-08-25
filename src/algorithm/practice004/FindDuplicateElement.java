package algorithm.practice004;

import java.util.HashMap;
import java.util.Map;

/**
 * find a duplicate element in a limited range array
 * 在范围数组中找到重复的元素
 * 2017-08-25 14:46
 **/
public class FindDuplicateElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 100};
        findDuplicate1(arr);
        System.out.println();
        findDuplicate2(arr);
    }

    /**
     * 普通方式，时间复杂度O方
     *
     * @param arr 范围数组
     */
    private static void findDuplicate1(int[] arr) {
        System.out.print("范围数组中重复的数字有：");
        for (int index = 0; index < arr.length; index++) {
            boolean isDuplicate = false;
            for (int key = 0; key < arr.length && key != index; key++) {
                if (arr[key] == arr[index]) {
                    System.out.print(arr[index] + "、");
                    break;
                }
            }
        }
    }

    /**
     * @param arr 范围数组
     */
    private static void findDuplicate2(int[] arr) {
        System.out.print("范围数组中重复的数字有：");
        HashMap<Integer, Integer> duplicateMap = new HashMap<>();
        for (int key = 0; key < arr.length; key++) {
            if (duplicateMap.get(arr[key]) != null) {
                System.out.print(arr[key] + "、");
            }
            duplicateMap.put(arr[key], key);
        }
    }
}
