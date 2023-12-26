package practice.binarySearch;

public class PeakIndexInMountainArray {

    public static void main(String[] args) {

        int[] arr ={ 3,4,5,1};

        System.out.println(peakOfMountain(arr));
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

    public static int peakOfMountain2(int[] arr){

        int start =0;
        int end =arr.length - 1;

        int mid =start + (end -start)/2;

        while (start<end){

            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid -1]){
                return mid;
            }
            // array is in descending order

            else if(arr[mid]>arr[mid+1]){
                end =mid;
            }
            // array is in ascending order
            else if (arr[mid] > arr[mid-1]){
                start = mid+1;
            }
            else {
                return start;
            }
        }
       return -1;  //or return end
    }


}
