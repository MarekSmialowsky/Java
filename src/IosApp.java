public class IosApp extends App {

    public String systemIos;

    public IosApp(String name, String systemIos) {
        super(name);
        this.systemIos = systemIos;
    }

    public void runIosApp() {
        System.out.println("Aplikacja " + name + " działa na systemie " + systemIos);

    }
}