package hw;
/*7. Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/
public class seven {
    public static void main (String args[])                      //main method
    {
        int F = 50;                                            //local variable
        float Celsius  = ((F-32)*5/9);
        System.out.println("Result : "+Celsius+"°c");          //concatenation
    }
}
