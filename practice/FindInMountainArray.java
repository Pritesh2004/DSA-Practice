package practice;

public class FindInMountainArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(searchInMountain(arr,target));
    }

    public static int searchInMountain(int[] arr, int target){

        int peak = peakOfMountain(arr);

        int firstTry = binarySearch(arr,target,0,peak);
        if(firstTry !=-1){
            return firstTry;
        }
        return binarySearch(arr,target,peak + 1, arr.length-1);
    }

    public static int peakOfMountain(int[] arr){

        int start =0;
        int end = arr.length -1;
        int mid = start + (end - start)/2;

        while (start <= end){
            if(arr[mid] > arr[mid +1 ] && arr[mid] > arr[mid -1]){
                return mid;
            }
            else if(arr[mid]>arr[mid + 1]){
                mid = mid -1;
            }
            else if(arr[mid] > arr[mid -1 ]){
                mid = mid + 1;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target, int start, int end){



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
