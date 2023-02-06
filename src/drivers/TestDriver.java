package drivers;

public class TestDriver {
    public static void main(String[] args) {
        WebDriver driver = getDriver("firefox");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();


         /*FirefoxDriver firefox = new FirefoxDriver();
         firefox.get();
         firefox.findElementBy();

         ChromeDriver chrome = new ChromeDriver();
         chrome.get();
         chrome.findElementBy();*/
    }

    private static WebDriver getDriver(String name) {

        if( name.equals("chrome")){
            return new ChromeDriver();
        } else if(name.equals("firefox")){
            return new FirefoxDriver();
        }return null;


    }
}
