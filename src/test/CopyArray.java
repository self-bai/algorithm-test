package test;

public class CopyArray {

    public static void main(String[] args) {
        copy();
    }

    private static void copy() {
        int[] ids1 = {1, 3, 5, 7, 9};
        int[] ids2 = {0, 2, 4, 6, 8};
        int[] ids3 = new int[5];
        System.arraycopy(ids2, 1, ids1 , 0, 2);
        printf(ids1);
        System.out.println();
        printf(ids3);
    }

    private static void printf(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
