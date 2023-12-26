package practice.binarySearch;

import java.util.Arrays;

public class BsInSortedMatrix {

    public static void main(String[] args) {

        int[][] nums={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 8;

        System.out.println(Arrays.toString(search(nums,target)));

    }

    public static int[] binarySearch(int[][] nums,int row,int cStart,int cEnd, int target){

        while (cStart <= cEnd){

            int mid = cStart + (cEnd - cStart)/2;

            if(nums[row][mid] == target){
                return new int[]{row,mid};
            }
            else if (nums[row][mid] > target) {
                cEnd = mid -1;
            }
            else {
                cStart = mid +1;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] search(int[][] nums, int target){

        int rows = nums.length;
        int cols = nums[0].length;

        if(rows == 1){
            return binarySearch(nums,0,0,cols-1,target);
        }

        int rStart = 0;
        int rEnd = rows -1;
        int cMid = cols/2;

        while(rStart < (rEnd -1)){

            int mid = rStart + (rEnd - rStart)/2;
            if(nums[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            else if(nums[mid][cMid] < target){
                rStart = mid;
            }
            else {
                rEnd = mid;
            }

            if(nums[rStart][cMid]==target){
                return new int[]{rStart,cMid};
            }
            if(nums[rStart+1][cMid]==target){
                return new int[]{rStart+1,cMid};
            }


            if(target <= nums[rStart][cMid-1]){
                return binarySearch(nums,rStart,0,cMid-1,target);
            }
            if(target >= nums[rStart][cMid+1] && target <= nums[rStart][cols -1]){
                return binarySearch(nums,rStart,cMid+1,cols-1,target);
            }
            if(target <= nums[rStart+1][cMid-1]){
                return binarySearch(nums,rStart+1,0,cMid-1,target);
            }
            else{
                return binarySearch(nums,rStart+1,cMid+1,cols-1,target);
            }
        }
        return new int[]{-1,-1};
    }
}
