package BT_Java_Basic_4;

public class For_Array {
    public static void main(String[] args) {
        int arrChan[] = new int[26];
        System.out.print("Các số chẵn từ 0 - 50 là: ");
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
                arrChan[i / 2] = i;
            }
        }
        System.out.println();
        System.out.print("Các phần tử trong mảng arrChan: ");
        for (int j = 0; j < arrChan.length; j++) {
            System.out.print(arrChan[j] + "  ");
        }
    }
}
