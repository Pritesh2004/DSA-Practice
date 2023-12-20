package practice;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {72, 67, 45, 8, 0, -3, -15};
        int target = 72;
        int ans = binarySearch(arr, target);

        System.out.println("Target element is at indexed = "+ans);
    }

    static int binarySearch(int[] arr, int target){

        int start=0;
        int end=arr.length -1 ;

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
