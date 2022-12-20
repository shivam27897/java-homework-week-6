package hw;
/*5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)/*
 */
public class five {
    void Addition(int a, int b)        // Instance method with No return type & with parameters
    {
        System.out.println("Addition is " +(a+b));
    }
    void Subtraction(int c, int d)       // Instance method with No return type & with parameters
    {
        System.out.println("Subtraction is " +(c-d));
    }

    static void Multiplication(int w, int x)         // Static method with No return type & with parameters
    {
        System.out.println("Multiplication is " +(w*x));
    }
    static void Division(int y, int z)              // Static method with No return type & with parameters
    {
        System.out.println("Division is " +(y/z));
    }

    public static void main(String[] args) {        //Main method
        five f = new five();
        f.Addition(50,50);
        f.Subtraction(50,25);
        Multiplication(9,3);
        Division(10000,10);


    }
}
