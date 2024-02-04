package practice.leethcode;

import java.util.Arrays;

public class practice {

    public static void main(String[] args) {
        int[] arr = {-2,5,8,3,-9,4,8,1};

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr,0,5);
    System.out.println("");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }    }
}
