package hw;
/*12. Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 Expected Output : 2.138888888888889 */
public class Twelve {
    void Operation(double a, double b, double c, double d)       // instance method with No return type & with parameters
    {
        System.out.println("Multiplication is " +((a * b - b* b)/(c - d)));
    }

    public static void main(String[] args) {           // main method
        Twelve T = new Twelve();                     //create object using class name
        T.Operation(25.5,3.5,40.5,4.5);       // called local variable using object
    }
}
