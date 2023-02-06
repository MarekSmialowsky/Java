public class AppChecker {

    public static void main(String[] args) {

        AndroidApp AAA = new AndroidApp("AAA","Android");
        AAA.Appinfo();
        AAA.runAdroidApp();

        IosApp BBB = new IosApp("BBB", "IOS");
        BBB.Appinfo();
        BBB.runIosApp();
    }


}
