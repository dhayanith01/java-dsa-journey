public class checkingEle {
    public static void main(String[] args) {
        int[] arr = {2 , 12 , 13 , 16 , 19 , 30 , 14 };
        int target = 1;
        present(arr,target);

    }
    static void present(int[] ele , int t){
        int flag = 0;
        for(int i = 0 ; i < ele.length ; i++){
            if(ele[i] == t){
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.println("Exists");
        }else {
            System.out.println("No");
        }

    }
}
