package hw;
/*
15. Write a Java program to swap two variables.
 */
public class Fifteen {
    public static void main(String[] args)         //main method
    {
        int a = 15;
        int b = 27;
        int c = a;                    //swapping two variable value with using third variable
        a = b;
        b = c;
        System.out.println("Result : a, b = "+a+", "+ +b);
    }
}
