package toantester.com.javaoop.baitap1;

import java.util.ArrayList;

public class ThongTinNhanVien {
    public static void main(String[] args) {
        NhanVien nv3 = new NhanVien();
        System.out.println("Họ và tên nhân viên: " + nv3.getFullname());
        System.out.println("Tuổi: " + nv3.getAge());
        System.out.println("Tên công ty: " + nv3.getNamecomany());
        System.out.println("Địa chỉ: " + nv3.getAddress());

        NhanVien nv1 = new NhanVien("Nguyễn Văn Hà",22,"JT Express","Phú Yên");
        NhanVien nv2 = new NhanVien("Hoàng Phuc",26,"JT Express","Phú Yên");
        ArrayList<NhanVien> nhanVienListArray=new ArrayList<>();
        nhanVienListArray.add(nv1);
        nhanVienListArray.add(nv2);

        for (NhanVien nv:nhanVienListArray){
            System.out.println("====================================");
            System.out.println(nv.getFullname());
            System.out.println(nv.getNamecomany());
            System.out.println(nv.getAge());
            System.out.println(nv.getAddress());
        }
    }
}
