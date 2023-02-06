public class AndroidApp extends App{

    public String systemAndroid;

    public AndroidApp(String name, String systemAndroid) {
        super(name);
        this.systemAndroid = systemAndroid;
    }

    public void runAdroidApp (){
        System.out.println("Aplikacja " + name + " działa na systemie " + systemAndroid);


    }


}
