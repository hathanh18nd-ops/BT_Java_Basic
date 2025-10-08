package BT_Java_Basic_2;

public class Calculator {
    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static float tinhTich(float a, float b) {
        return a * b;
    }

    public int tinhHieu(int a, int b) {
        int h = a - b;
        System.out.println("Hiệu của 2 số nguyên a-b: " + h);
        return h;
    }

    public String tinhThuong(int a, int b) {
        String t = (a % b == 0) ? "a chia hết cho b" : "a không chia hết cho b";
        System.out.println("a = "+a+", b = "+b+": "+t);
        return t;
    }

    public static void main(String[] args) {
        int c = tinhTong(5, 9);
        System.out.println("Tổng của 2 số nguyên a+b: " + c);
        float d = tinhTich(4.5F, 5.4F);
        System.out.println("Tích của 2 số thực a*b: " + d);
        Calculator calculator = new Calculator();
        calculator.tinhHieu(18, 5);
        calculator.tinhThuong(13,5);
    }
}
