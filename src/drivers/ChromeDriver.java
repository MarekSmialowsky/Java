package drivers;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("otwieramy przeglądarkę za pomocą Chrome");

    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą Chrome");
    }
}
