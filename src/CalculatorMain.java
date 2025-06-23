import java.io.PrintWriter;
import java.util.Scanner;


public class CalculatorMain {

    public static void main(String[] args)  {
        boolean start = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Starting Calculator------");
        System.out.println("Welcome to Calculator App");
        while (start) {
            System.out.println("Please enter your 2 values seperated with a space");
            int v1= in.nextInt();
            int v2=in.nextInt();
            System.out.println("Please select operation u want to perform +  -  *  / or p if want calculate powers");
            String input=in.next();
            char a= input.charAt(0);
            if( a=='+')System.out.println(Add(v1,v2));
            else if(a=='-')System.out.println(sub(v1,v2));
            else if(a=='*')System.out.println(mult(v1,v2));
            else if(a=='/')System.out.println(div(v1,v2));
            else System.out.println(myPow(v1,v2));
            System.out.println("do you want to do more calcs? YES NO");
            String ans=in.next();
            start= ans.equals("yes");
        }
        in.close();
    }

    static int Add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static float div(float a, float b) {
        if(b==0) {return 0;}
        return a / b;
    }

    static int mult(int a, int b) {
        return a * b;
    }

    static double myPow(double x, int t) {
        double res = 1;
        long n = t;
        if (t < 0) {
            n = -t;
            x = 1 / x;
        }
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * x;
            }
            x = x * x;
            n = n >> 1;
        }

        return res;
    }
}

