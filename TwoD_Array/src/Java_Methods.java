public class Java_Methods {

    public static void main(String[] args) {

        String wordend = "ther";
        int FingersLeft = 5;
        int FingersRight = 6;
        int age = 32;
        int height = 186;


        hello(wordend);


        int j = add(FingersLeft,FingersRight);
        double u;
        u = inteligence(age,height);
        String o = Uare(u);

        System.out.println("You have "+j+" fingers.");
        System.out.println("And Your IQ is "+u+".");
        System.out.println("So you are "+o+".");

        //hello();
        //hello();
        //hello();

    }

     static int add(int x,int y) {

        int z = x + y;
        return z;

        //return x + y;

     }

     static double inteligence(int h,int j) {
        double IQ = h * (j/100);
        return IQ;
     }

     static String Uare(double bobek){

        String k;

         if (bobek<150) {
            k = "Idiot";
        } else {
            k = "almoust like Martin";
        }
         return k;


     }


    static void hello(String word) {
        System.out.println("Hello Bro"+word);
    }

}
