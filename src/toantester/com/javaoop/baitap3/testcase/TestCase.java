package toantester.com.javaoop.baitap3.testcase;

import toantester.com.javaoop.baitap3.common.BaseTest;
import toantester.com.javaoop.baitap3.common.ConStants;

public class TestCase extends BaseTest {

    public void loginCMS(){
        createDrive();
        System.out.println("Native to url: https://cms.anhtester.com/");
        System.out.println("Enter email and password ");
        System.out.println("Click login button ");
        System.out.println("Verify redirect to admin page ");
        System.out.println("Click login button ");
        closeDrive();

    }
    public void addCategoryCMS(){
        ConStants.setBrowser("Firebox");
        createDrive();
        System.out.println("Native to url: https://cms.anhtester.com/");
        System.out.println("Enter email and password ");
        System.out.println("Click login button");
        System.out.println("Verify redirect to admin page");

        System.out.println("Click login button");
        System.out.println("Click on the Product menu");
        System.out.println("Click on the add new category button");
        System.out.println("Enter all fields on the form create new category");
        System.out.println("Click on the Save button");
        System.out.println("Verify add new Category successfully");

        closeDrive();
    }

    public static void main(String[] args) {
        TestCase testCase=new TestCase();
        testCase.loginCMS();
        System.out.println("=================================");
        testCase.addCategoryCMS();
    }

}
