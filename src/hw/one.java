package hw;

import sun.security.jca.GetInstance;

public class one {
    //1.1 Declare two instance variables.
    int a = 1000;  //Instance variable
    int b = 999;  //Instance variable

    //1.2 Declare one Instance method.
    public void m1(){        //Instance method
        /*1.3 Call both instance variables into the instance method inside the print
        statement/*

         */
        System.out.println(a);  //called instance variable and print
        System.out.println(b);   //called instance variable and print
    }
     //1.4 Declare the Main method.
    public static void main(String[] args) {    //Main method
        //1.5 Call the above instance method into the Main method and Run the programme.
        one o = new one();
        o.m1();      //called Static method into main method
        System.out.println(o.a- o.b);

    }
}