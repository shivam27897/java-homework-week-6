package hw;
/*10. Write a Java program that takes a number as input and prints its
multiplication table up to 10. */
public class ten {
    int a = 8, b = 1;             //Instance variable
    ten(int a, int b)             // two argument constructor
    {
        this.a = a;
        this.b = b;
        System.out.println("8 * "+b +" = " +(a*b));      // Concatenation
    }

    public static void main(String[] args) {              //main method
        ten c = new ten(8,1);
        ten d = new ten(8,2);
        ten e = new ten(8,3);
        ten f = new ten(8,4);
        ten g = new ten(8,5);                   //calling two argument constructor
        ten h = new ten(8,6);
        ten i = new ten(8,7);
        ten j = new ten(8,8);
        ten k = new ten(8,9);
        ten l = new ten(8,10);
    }
}