package toantester.com.javaoop.baitap3.common;

import toantester.com.javaoop.baitap3.common.ConStants;

public class BaseTest extends ConStants {

    public void createDrive() {
        System.out.println("Open browser: "+ getBrowser());
        System.out.println("Open report: "+ ConStants.report);
        System.out.println("Healess Mode: "+ ConStants.headless);
    }
    public void closeDrive() {
        System.out.println("Close Brower: " +ConStants.browser);
    }
    public void closeDrive(String browser) {
        System.out.println("Close Brower: " +getBrowser());
    }


}
