package practice.binarySearch;

import java.util.Arrays;

public class BinarySearchIn2DArray {

    public static void main(String[] args) {

        int[][] nums ={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 50;

        System.out.println(Arrays.toString(search(nums,target)));
    }

    public static int[] search(int[][] nums, int target){

        int row = 0;
        int col = nums.length -1;

        while(row < nums.length && col >= 0){

            if(nums[row][col] == target){
                return new int[]{row, col};
            }
            else if(nums[row][col] < target){
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
