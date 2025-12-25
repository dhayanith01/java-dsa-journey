import java.sql.SQLOutput;
import java.util.*;
public class Finding_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean flag = false;

        for(int i=0 ; i<arr.length;i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value");
        int t = sc.nextInt();
        for(int i=0 ; i<arr.length;i++ ){
            if(arr[i] == t){
                flag = true;
                System.out.println("Present");
                return;
            }

        }
        if(!flag){
            System.out.print("no");
        }


    }

}
