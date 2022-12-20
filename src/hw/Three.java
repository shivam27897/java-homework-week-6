package hw;

public class Three {
    //3.1 Declare one instance and one static variable.
    int a = 50;  //Instance variable
    static int b = 5;  //Static variable
    //3.2 Declare one instance method.
    public void m1(){        //Instance method
    // 3.4 Call both instance and static variable
        System.out.println(a);          //called instance variable
        System.out.println(b);          //called static variable
    }
    //3.3 Declare one static method.
    static void m2() {       // Declared Static method
    //3.4 Call both instance and static variable
        Three obj = new Three();  //created object
        System.out.println(obj.a);  //called instance variable
        System.out.println(b);   //called static variable
    }
    //3.5 Declare the Main method.
    public static void main(String[] args) {   //Main method
    //3.6 Call both instance and static methods into the Main method and run the programme
        Three T = new Three();
        T.m1();                   //called Instance method
        System.out.println(T.a * b);
        T.m2();                  ////called static method
        System.out.println(T.a / b);
    }
}