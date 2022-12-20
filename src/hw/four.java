package hw;

public class four {
    //4.1 Declare two instance and two static variables.
    int a = 10;                          //Instance variable
    static double b = 9.99d;            //Static variable
    static String name1 = "Elite ";      //Static variable
    String name2 = "Mobile";           //Instance variable

    //4.2 Declare one instance method.
    public void m1() {                   //Instance method
    // 4.4 Call all four instance and static variable
        System.out.println(a);          //called instance variable to instance method using directly
        System.out.println(b);          //called static variable to instance method using directly
        System.out.print(four.name1);     //called static variable to instance method using class name
        System.out.println(name2);       //called instance variable to instance method using directly
    }

    //4.3 Declare one static method.
    static void m2() {                //Static method
        //4.4 Call all four instance and static variable
        four obj = new four();       //created object
        System.out.println(obj.a);       //Called Instance Variable to static method using object
        System.out.println(b);          //Called static Variable to static method using directly
        System.out.println(name1);     //Called static Variable to static method using directly
        System.out.println(obj.name2);  //Called Instance Variable to static method using object
    }
    //4.5 Declare the Main method.
    public static void main(String[] args) {          //Main method
    //4.6 Call both instance and static methods into the Main method and run the programme.
        four f = new four();
        f.m1();                       //called instance method into main method using object
        m2();                        //called static method into main method using directly
    }
}