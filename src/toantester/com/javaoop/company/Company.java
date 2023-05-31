package toantester.com.javaoop.company;

import toantester.com.javaoop.person.Person;

public class Company extends Person {

    public void getInfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getGender());
    }
    public static void main(String[] args) {
        Company company=new Company();
        company.getInfo();
    }
}
