public class BinarysrtAsc {
    static int srt(int[] arr , int t){
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid] > t){
                r = mid-1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2 , 4 , 6 , 8  , 12 , 16};
        int target = 8;
        System.out.print(srt(arr,target));
    }
}
