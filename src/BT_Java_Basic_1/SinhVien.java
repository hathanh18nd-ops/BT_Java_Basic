package BT_Java_Basic_1;

public class SinhVien {
    String masinhvien = "Mã sinh viên"; //biến toàn cục (instance)
    static String tensinhvien = "Tên sinh viên"; //biến toàn cục (static)

    public void sinhVien_A(){
        String masinhvien = "000001"; //biến local
        String tensinhvien = "Nguyễn Văn A";
        String namsinh = "1990";
        String gioitinh = "Nam";
        System.out.println(masinhvien+", "+tensinhvien+", "+namsinh+", "+gioitinh);
    }

    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        System.out.print(sinhVien.masinhvien+", ");
        System.out.print(tensinhvien+", ");
        System.out.println(ThongTin.namsinh+", "+ThongTin.gioitinh);
        sinhVien.sinhVien_A();

    }
}
