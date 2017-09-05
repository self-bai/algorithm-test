package sort;

/**
 * 2017-08-30 17:20
 **/
public class Test {

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1, 5, 3, 2, 1};
        sort(arr);
        printf(arr);
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {   //i为偶数
                int tmpI = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    int tmpJ = arr[j];
                    if (tmpJ % 2 != 0) {    //j为奇数
                        arr[i] = tmpJ;
                        arr[j] = tmpI;
                        break;
                    }
                }
            }
        }
    }

    private static void printf(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
