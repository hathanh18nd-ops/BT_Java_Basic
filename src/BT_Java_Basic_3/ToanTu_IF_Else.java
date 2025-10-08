package BT_Java_Basic_3;

public class ToanTu_IF_Else {
    static int number = 100;
    static int a, b, c;

    static int getA() {
        a = number / 4;
        System.out.println("Giá trị a: "+a);
        return a;
    }

    static int getB() {
        if ((a > number) && (a >= 1000)) {
            b = a;
        } else {
            b = number / 2 - 10;
            System.out.println("Giá trị b: "+number+"/2 - 10 = "+b);
        }
        return b;
    }

    static int getC() {
        if ((b > number) || (b < a)) {
            c = b;
        } else if (a == b) {
            c = a;
        } else {
            c = (a + b) / 2;
            System.out.println("Giá trị c: ("+a+" + "+b+")/2 = "+c);
        }
        return c;
    }
    static int getD(){
        int d=(a+b)%2;
        System.out.println("Giá trị d: ("+a+" + "+b+")%2 = "+d);
        return d;
    }

    public static void soSanh(int n) {
        System.out.print("n = "+n+"; ");
        if (n == number) {
            System.out.println("n = " + number);
        } else if (n < number) {
            System.out.println("n < " + number);
        } else if (n > number) {
            System.out.println("n > " + number);
        } else {
            System.out.println("Giá trị nhập vào không hợp lệ!");
        }
    }

    public static void main(String[] args) {
        soSanh(99);
        getA();
        getB();
        getC();
        getD();

    }
}
