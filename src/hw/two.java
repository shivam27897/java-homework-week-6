package hw;

public class two {
    //2.1 Declare two static variables
    static int a = 100;   //Static variable
    static double b = 99.99d;   //Static variable
      //2.2 Declare one static method
    static void m1() {       // Declared Static method
        /*2.3 Call both static variables into the static method inside the print
        statement/*

         */
        System.out.println(a);  //called static variable and print
        System.out.println(b);   //called static variable and print
    }
      //2.4 Declare the Main method.
    public static void main(String[] args) {    //Main method
        //2.5 Call the static method into the Main method and Run the programme.
        two x = new two();
        x.m1();
        System.out.println(x.a+x.b);
    }
}
