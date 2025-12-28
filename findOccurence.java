public class findOccurence {
    public static void main(String[] args) {
        int[] arr = {2 , 4 , 7 , 2 , 8 , 1 , 9 , 2};
        int target = 2;
        System.out.println(count(arr , target));
    }
    static int count(int[] a , int t){
        if(a.length == 0){
            return -1;
        }
        int count = 0;
        for(int i=0 ; i<a.length;i++ ){
            if(a[i] == t){
                count++;
            }

    }

        return count;
    }
}
