package practice;

public class CeilingOfNumInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1,4,11,14,16,24};
        int target = 43;
        int ans = ceilingOfNum(arr, target);

        System.out.println("Ceiling element of target element " +target+" is at indexed = "+ans);



    }

    //ceiling of target element => smallest no >= target
    static int ceilingOfNum(int[] arr, int target){

        int start=0;
        int end=arr.length -1 ;

        boolean isAscending = arr[start] < arr[end];

        if(target > arr[end]){
            return -1;
        }

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
        return  start;

    }
}
