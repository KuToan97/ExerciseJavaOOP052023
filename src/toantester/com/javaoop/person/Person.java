package toantester.com.javaoop.person;

public class Person {

    public String name = "Toàn";
    public int age = 26;
    public String gender = "Nam";
    public String address = "Phú Yên";
    public String phone = "0971882250";

    public void getInfoPerson() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phone);
    }

    public Person() {

    }
    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}