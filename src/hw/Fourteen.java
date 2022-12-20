package hw;
/*
14. Write a Java program to print the area and perimeter of a rectangle.

Test Data:
Width = 5.5 Height = 8.5

Expected Output:

Area is 5.5 * 8.5 = 46.75
Perimeter is 2 * (5.5 + 8.5) = 28.0
 */
public class Fourteen {
    public static void main(String[] args) {            //main method
        float Width = 5.5f;                           //local variable
        float Height = 8.5f;
        System.out.println("Area = "+(Width * Height));
        System.out.println("Perimeter = "+(2*(Width + Height)));
    }
}
