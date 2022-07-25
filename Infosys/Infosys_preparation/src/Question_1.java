
/*Question:
        Problem Statement:

        While playing an RPG game, you were assigned to complete one of the hardest quests in this game. There are n
        monsters you’ll need to defeat in this quest. Each monster i is described with two integer numbers – poweri and
        bonusi. To defeat this monster, you’ll need at least poweri experience points. If you try fighting this monster
        without having enough experience points, you lose immediately. You will also gain bonusi experience points if
        you defeat this monster. You can defeat monsters in any order.

        The quest turned out to be very hard – you try to defeat the monsters but keep losing repeatedly. Your friend
        told you that this quest is impossible to complete. Knowing that, you’re interested, what is the maximum possible number of monsters you can defeat?

        (Question difficulty level: Hardest)

        Input:

        The first line contains an integer, n, denoting the number of monsters. The next line contains an integer, e,
        denoting your initial experience.
        Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, poweri, which represents power of
        the corresponding monster.
        Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, bonusi, which represents bonus for
        defeating the corresponding monster.
        Input	Output	Output Description
        2
        123
        78
        130
        10
        0	2
        Initial experience level is 123 points.
        Defeat the first monster having power of 78 and bonus of 10. Experience level is now 123+10=133.
        Defeat the second monster.
        3--mon
        100-int_pow
        101-mon_1_pow
        100-mon_2_pow
        304-mon_3_pow
        100-mon_3_bon
        1-mon_3_bon
        524	-mon_3_bon
        2-output
        Initial experience level is 100 points.
        Defeat the second monster having power of 100 and bonus of 1. Experience level is now 100+1=101.
        Defeat the first monster having power of 101 and bonus of 100. Experience level is now 101+100=201.
        The third monster can’t be defeated.*/


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        //get input from user
        Scanner in = new Scanner(System.in);
        int mon = in.nextInt();
        int inipow = in.nextInt();
        int[] monpow = new int[mon];
        int[] monbon = new int[mon];
        for (int i = 0; i < mon; i++) {
            monpow[i] = in.nextInt();
        }
        for (int i = 0; i < mon; i++) {
            monbon[i] = in.nextInt();
        }
        //creating a monster class to map to power and bonsi of the monster
        class monster{
            private final int power ,bonus;
            public monster(int power,int bonus){
                this.power = power;
                this.bonus = bonus;
            }
        }
        //creating a array and and mapping with our input
        monster[] mont = new monster[mon];
        for (int i = 0; i < mon; i++) {
            mont[i] = new monster(monpow[i], monbon[i]);
        }
        Arrays.sort(mont, Comparator.comparingInt(m -> m.power));
        // sorting the array using comparator  new variable -> wrt power

        //checking the ini power and defeating the monster
        int c = 0;
        for (monster m:mont ) {
            //class subvaraible of this  variable
            if(inipow<m.power){
                break;
            }
            else{
                inipow+=m.bonus;
                c++;
            }
        }
        System.out.println(c);
    }
}
