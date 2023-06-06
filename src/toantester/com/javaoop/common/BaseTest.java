package toantester.com.javaoop.common;

public class BaseTest extends ConStants {

    public BaseTest(String browser, boolean report, boolean headless) {
        super(browser, report, headless);
    }
    public void createDrive() {
        getInfo();
    }
    public void closeDrive() {
        setBrowser("Google Chrome");
        System.out.println("Close Brower: " +getBrowser());
    }
}
