package algorithm.practice006;

/**
 * Find maximum length sub-array having given sum
 * 从给定数组中找出满足给定和的最大的子数组
 */
public class MaxLengthSubArray {

    public static void main(String[] args) {
        int[] arr = {5, 6, -5, 5, 3, 5, 3, -2, 0};
        int sum = 8;
        findMaxLengthSubArray(arr, sum);
    }

    private static void findMaxLengthSubArray(int[] arr, int sum) {
        int len = 0, start = 0, end = 0; //记录最大数组长度
        for (int low = 0, arrLen = arr.length; low < arrLen; low++) {
            int tmp = 0;
            for (int high = low; high < arrLen; high++) {
                tmp += arr[high];
                if (sum == tmp && high - low + 1 > len) {
                    len = high - low;
                    start = low;
                    end = high;
                }
            }
        }
        printf(arr, start, end);
    }

    private static void printf(int[] arr, int start, int end) {
        System.out.println("Maximum length sub-array is start " + start + " end " + end);
        for (; start < end; start++) {
            System.out.print(arr[start] + " ");
        }
        System.out.println(arr[end]);
    }
}
