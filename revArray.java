public class revArray {
    public static void main(String[] args) {
        int[] arr = {2 , 3 ,4 , 5 , 6};
        rev(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void rev(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

}
