package practice.sortingAlgos;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr ={7,4,10,2,8,1,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr){

        for (int i = 0; i <arr.length ; i++) {

            int last = arr.length - i -1;
            int maxIndex = maxNumber(arr, 0 , last);
            swap(arr,maxIndex,last);
        }
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    public static int maxNumber(int[] arr, int start, int last){

        int max = start;

        for (int i = 0; i <=last ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
