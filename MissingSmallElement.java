import java.util.Scanner;
public class MissingSmallElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<arr.length;i++ ){
            arr[i] = sc.nextInt();
        }

        boolean found[] = new boolean[n+2];
        for(int i=0 ; i<n;i++ ){
            if(arr[i]>0 && arr[i]<=n){
                found[arr[i]] = true;
            }
        }

        for(int i=1 ; i<n+1;i++ ){
            if(!found[i]){
                System.out.println(i);
                break;
            }
        }

    }
}
