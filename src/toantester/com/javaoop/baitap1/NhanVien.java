package toantester.com.javaoop.baitap1;

public class NhanVien {

    String fullname="Nguyễn Văn Toàn";
    int age=27;
    String namecomany="JT Express";
    String address="Phú Yên";

    public NhanVien() {
    }
    public NhanVien(String fullname, int age, String namecomany, String address) {
        this.fullname = fullname;
        this.age = age;
        this.namecomany = namecomany;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }
    public String getNamecomany() {
        return namecomany;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
}
