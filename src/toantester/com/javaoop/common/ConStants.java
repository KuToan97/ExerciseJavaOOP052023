package toantester.com.javaoop.common;

public class ConStants {

    public static String browser;
    public static boolean report;
    public static boolean headless;

    public ConStants() {
    }

    public ConStants(String browser, boolean report, boolean headless) {
        this.browser = browser;
        this.report = report;
        this.headless = headless;
    }

    public static String getBrowser() {
        return browser;
    }

    public static boolean isReport() {
        return report;
    }

    public static boolean isHeadless() {
        return headless;
    }

    public static void setBrowser(String browser) {
        ConStants.browser = browser;
    }

    public static void setReport(boolean report) {
        ConStants.report = report;
    }

    public static void setHeadless(boolean headless) {
        ConStants.headless = headless;
    }

    public void getInfo() {
        System.out.println("+ Brower: " + browser);
        System.out.println("+ Report: " + report);
        System.out.println("+ Height: " + headless);
    }


}