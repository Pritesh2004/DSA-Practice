package practice.binarySearch;

public class SearchInInfiniteLengthArray {

    public static void main(String[] args) {

        int[] arr = {1, 4, 7, 9,16, 19, 34, 76, 104, 205,367,475,576,978,4767};
        int target = 76;
        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target){

        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;

            end = end + (end - start + 1) * 2;

            start = newStart;
        }
        return binarySearch(arr, target, start, end);

    }

    public static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){

            int mid = start + (end - start)/2;
            //if target equals to middle element
            if(target == arr[mid]){
                return mid;
            }

            if(target>arr[mid]){
                    start=mid + 1;
            }
            else if (target < arr[mid]) {
                    end = mid - 1;
            }
            else {
                    return mid;
            }
        }
        return -1;
    }
}
