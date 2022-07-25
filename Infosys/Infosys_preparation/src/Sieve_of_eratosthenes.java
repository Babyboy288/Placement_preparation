/*find the prime number using sieve of eratosthenes method */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sieve_of_eratosthenes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sieveoferatosthenes(n));

    }
    static ArrayList<Integer> sieveoferatosthenes(int n){
        boolean[] arr = new boolean[n+1];
        //creating a new boolean array
        Arrays.fill(arr,true);
        //Array method to apply a boolean value to the arrqay
        for (int i = 2; i*i < n ; i++) {
            // iterating from 2 to n^2
            if(arr[i]){
                //in boolean function u dont need to assign it as true
                //if u leave as arr[i] then it enter the loop if its true
                int x = 2;
                while(i*x<=n){
                    arr[i*x]=false;
                    x++;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=2 ; i<arr.length; i++){
            if(arr[i]){
                res.add(i);
            }
        }
    return res;
    }

}
