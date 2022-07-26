import java.util.Arrays;
import java.util.Scanner;

public class Check_permutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String v = in.nextLine();
        String d = in.nextLine();
        boolean s = permutation(v,d);
        System.out.println(s);

    }
    static String sortstring(String v){
        char[] c = v.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    static boolean permutation(String v ,String d){
        if(v.length()!=d.length()){
            return false;
        }
        return sortstring(v).equals(sortstring(d));
    }
}
