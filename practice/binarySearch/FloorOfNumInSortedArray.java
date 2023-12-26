package practice.binarySearch;

public class FloorOfNumInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1,5,6,14,16,24};
        int target = 15;
        int ans = floorOfNum(arr, target);

        System.out.println("floor element is at indexed = "+ans);
    }

    //floor of target element => greatest no <= target
    static int floorOfNum(int[] arr, int target){

        int start=0;
        int end=arr.length -1 ;

        boolean isAscending = arr[start] < arr[end];

        if(target < arr[0]){
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
        return  end;

    }
}
