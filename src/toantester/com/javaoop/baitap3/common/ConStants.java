package toantester.com.javaoop.baitap3.common;

public class ConStants {

    public static String browser="Chrome";
    public static boolean report=true;
    public static boolean headless=true;

    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        ConStants.browser = browser;
    }
}