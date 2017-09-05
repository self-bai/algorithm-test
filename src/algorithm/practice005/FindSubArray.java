package algorithm.practice005;

/**
 * find largest sub-array formed by consecutive integers
 * 找到由连续整数形成的最大子阵列
 * 2017-08-25 16:15
 **/
public class FindSubArray {

    public static void main(String[] args) {
        int[] arr = {2, 100, 2, 1, 4, 3, 1, 0};
        findMaxSubArray(arr);
    }

    /**
     * @param arr 范围数组
     */
    private static void findMaxSubArray(int[] arr) {
        int len = 1, start = 0, end = 0, arrLen = arr.length;
        for (int low = 0; low < arrLen - 1; low++) {
            int minVal = arr[low], maxVal = arr[low];
            for (int high = low + 1; high < arrLen; high++) {
                minVal = Math.min(minVal, arr[high]);
                maxVal = Math.max(maxVal, arr[high]);
                if (isConsecutive(arr, low, high, minVal, maxVal) && len < maxVal - minVal + 1) {
                    len = maxVal - minVal + 1;
                    start = low;
                    end = high;
                }
            }
        }
        System.out.println("The largest sub-array is [" + start + "," + end + "]");
        printf(arr, start, end);
    }

    private static boolean isConsecutive(int[] arr, int low, int high, int min, int max) {
        // 防止越界
        if (max - min != high - low) return false;
        boolean[] isDuplicate = new boolean[high - low + 1];
        for (int k = low; k < high; k++) {
            //每個元素是否只出現一次
            if (isDuplicate[arr[k] - min])
                return false;
            isDuplicate[arr[k] - min] = true;
        }
        return true;
    }

    private static void printf(int[] arr, int start, int end) {
        for (; start < end; start++) {
            System.out.print(arr[start] + " ");
        }
        System.out.println(arr[end]);
    }
}
