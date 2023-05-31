package toantester.com.javaoop.person;

public class InfomationPerson {

    public static void main(String[] args) {
        Person person = new Person();
        person.getInfoPerson();

        System.out.println("==========================================================================");
        Person person1 = new Person("Hà", 28, "Nam", "Bình Định", "0971885520");
        Person person2 = new Person("Hảo", 32, "Nữ", "TP.HCM", "0818865246");
        person1.getInfoPerson();
        System.out.println("==========================================================================");
        person2.getInfoPerson();
    }
}
