package algorithm.practice002;

/**
 * Print all sub-array with 0 sum
 * 打印所有相加和为0的子数组
 **/
public class FindAllSubarrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, -3, -1, 0, 4};
        int[] arr2 = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        findAllSubarrays(arr1);
//        findAllSubarrays(arr2);
    }

    private static void findAllSubarrays(int[] arr) {
        for (int low = 0, len = arr.length; low < len; low++) {
            int sum = 0;
            for (int high = low; high < len; high++) {
                sum += arr[high];
                if (sum == 0) {
                    System.out.printf("符合子数组：{%s} \n", getArr(arr, low, high));
                }
            }
        }
    }

    private static String getArr(int[] arr, int low, int high) {
        StringBuilder sb = new StringBuilder();
        for (; low < high; low++) {
            sb.append(arr[low] + ",");
        }
        sb.append(arr[high]);
        return sb.toString();
    }

}
