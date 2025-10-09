package BT_Java_Basic_5;

import java.util.ArrayList;

public class Collection_Functions {
    static void listArray() {
        ArrayList<Integer> listSoChan = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                listSoChan.add(i);
            }
        }
        System.out.println();
        System.out.print("List số chẵn từ 0-50 gồm: ");
        for (int j = 0; j < listSoChan.size(); j++) {
            System.out.print(listSoChan.get(j) + "  ");
        }
    }

    static void nhanVien() {
        ArrayList<String> listThongTin = new ArrayList<>();
        listThongTin.add("Nguyen Van A");
        listThongTin.add("Phòng Java");
        listThongTin.add("DEV");
        System.out.println("Thông tin nhán viên:");
        for (int i = 0; i < listThongTin.size(); i++) {
            System.out.println(listThongTin.get(i));
        }
    }

    public static void main(String[] args) {
        listArray();
        System.out.println();
        nhanVien();

    }

}
