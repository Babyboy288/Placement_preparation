import java.util.Scanner;

public class Minimum_Coins {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] arr = {1,2,5,10,20,50,100,500,1000};
        int n = in.nextInt();
        //System.out.println(x);
        int c = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            int x = n/2;
            if(arr[i]<=x && n!=0){
                n=n-arr[i];
                c++;
            }
        }
        System.out.println(c);
    }
}
