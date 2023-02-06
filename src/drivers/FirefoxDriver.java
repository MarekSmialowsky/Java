package drivers;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("otwieramy przeglądarkę za pomocą Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą Firefox");
    }
}
