import java.util.Scanner;

public class is_unique {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean n = isUnique(s);
        System.out.println(n);

    }
    static boolean isUnique(String s){
        if(s.length()>128){
            return false;
        }
        //boolean[] arr = new boolean[128];
        boolean y= true;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            int c =0;
            for (int j = 0; j < s.length(); j++) {
                if(x==s.charAt(j)){
                    c++;
                    if(c>1){
                        y = false;
                    }
                }
            }
        }
        return y;
    }
}
