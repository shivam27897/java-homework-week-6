package hw;
/*6. Write a program to enter any radius value of the circle and find out the
        area.(Formula of Area A=PI*r*r).*/
public class six {
    public void multiplication() {

        int r = 10;
        float pi = 3.14f;
        float A = pi * r * r;
        System.out.println("Radious of Circle is " + A);

    }

    public static void main(String[] args) {
        six s = new six();
        s.multiplication();
    }
}