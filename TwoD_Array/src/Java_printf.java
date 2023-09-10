import javax.swing.*;

@SuppressWarnings("ALL")
public class Java_printf {

    public static void main(String[] args) {

        System.out.printf("%d Trying of 'printf' funkcion.",123);
        String i = JOptionPane.showInputDialog("Who are You?");
        boolean MyBoo ;
        String x;
        String y;
        String z;
        String v;
        String MyStr;
        double MyDub;
        int MyInt;

        if (i.equals("Martin")) {
            MyBoo = false;
            x = "are NOT";
            y = "BestEmperor";
            MyStr ="InWholeUniverse.God";
            MyInt = 32;
            MyDub = 1991;

        } else  {
            MyBoo = true;
            x = "are";
            y = "Joxer";
            MyStr ="Loser.UAre";
            MyInt = 85;
            MyDub = 131545641;
        }

        char MyChar = '@';
        // [%]
        System.out.println("\n"+i);
        System.out.printf("Its %b. \n",MyBoo);                                      // %b for Boolean=boolean
        System.out.printf("You %s an Idiot.",x);                                    // %s for String
        System.out.printf("And your email is :  %s"+MyChar+MyStr,y);                // %c for Character=char
        System.out.printf("\n"+"You are %d.",MyInt);                                // %d for Integer=int
        System.out.printf("You was born at %f year, like true "+y+".",MyDub);       // %f for Double=double
        System.out.printf("It was %,f years, back.",MyDub);
        // [width/breite/sirka] - Minimum characters to be written as output.

    }


}
