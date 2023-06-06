package toantester.com.javaoop.testcase;

import toantester.com.javaoop.common.BaseTest;
import toantester.com.javaoop.common.ConStants;
public class TestCase extends BaseTest {
    private String email="nguyenvantoan17121997@gmail.com";
    private String password="1234567";


    public TestCase(String browser, boolean report, boolean headless, String email, String password) {
        super(browser, report, headless);
        this.email = email;
        this.password = password;
    }

    public TestCase() {
        super(browser, report, headless);
    }

    public void getInfo(){
        super.getInfo();
    }

    public void TC1() {
        TestCase testCase = new TestCase("Google Chrome", true, true, "nguyenvantoan17121997@gmailcom", "123456");
        System.out.println("Step 1: Nhập email: " + email);
        System.out.println("Step 2: Nhập Password: " + password);
        System.out.println("Step 3: Kết quả chạy ");
        testCase.getInfo();
    }
    public void TC2() {
        TestCase testCase = new TestCase("Google Chrome", false, false, "nguyenvantoan17121997@gmailcom", "123456");
        System.out.println("Step 1: Nhập email: " + email);
        System.out.println("Step 2: Không nhập password");
        System.out.println("Step 3: Kết quả chạy ");
        testCase.getInfo();
    }
    public static void main(String[] args) {
        TestCase testCase = new TestCase();
        System.out.println("Tescase 1");
        testCase.TC1();
        System.out.println("Tescase 2");
        testCase.TC2();
    }
}