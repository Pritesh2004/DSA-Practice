package practice.binarySearch;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] nums = {9,10,15,17,9,8,4,2,1};
        int target = 4;

        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }

        if(nums[pivot] == target){
            return pivot;
        }

        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length -1);

    }

    public static int findPivot(int[] nums){

        int start = 0;
        int end = nums.length - 1;
        int n = nums.length;

        if(n == 1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }

        while (start <= end){

            int mid = start + (end - start)/2;

            if(mid < end && nums[mid] > nums[mid + 1] ){
                return mid;
            }
            else if(mid > start && nums[mid]<nums[mid - 1]){
                return mid - 1;
            }
            else if (nums[mid] == nums[start] && nums[mid] == nums[end]) {

                if(nums[start] > nums[start + 1]){
                    return start;
                }
                start++;

                if (nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[end] < nums[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target,int start,int end){


        boolean isAscending = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start)/2;

            //if target equals to middle element
            if(target == arr[mid]){
                return mid;
            }

            // if array is in ascending order
            if(isAscending){
                if(target>arr[mid]){
                    start=mid + 1;
                }
                else if (target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    return mid;
                }

                //if array is in descending order
            }else{
                if(target<arr[mid]){
                    start=mid + 1;
                }
                else if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            }

        }
        return  -1;

    }
}
