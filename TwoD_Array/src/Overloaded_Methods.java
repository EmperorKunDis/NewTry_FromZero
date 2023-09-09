public class Overloaded_Methods {

    public static void main(String[] args) {

        int x = add(2,6);
        System.out.println(x);

        int y = add(2,6,20);
        System.out.println(y);

        int z = add(2,6,20,60);
        System.out.println(z);

        double a = add(2.2,6.4);
        System.out.println(a);

        double b = add(2.9,6.7,20.12);
        System.out.println(b);

        double c = add(2.36,6.56,20.986514,60.895);
        System.out.println(c);

    }
    static int add(int a,int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }static int add(int a,int b,int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }static int add(int a,int b,int c,int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
    static double add(double a,double b) {
        System.out.println("This is overloaded method #4");
        return a + b;
    }static double add(double a,double b,double c) {
        System.out.println("This is overloaded method #5");
        return a + b + c;
    }static double add(double a,double b,double c,double d) {
        System.out.println("This is overloaded method #6");
        return a + b + c + d;
    }
}
