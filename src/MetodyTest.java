public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
        /*metody.policzWynik();
        int result = metody.pobierzWynik();
        int result2 = result *2;
        System.out.println("rezultat po mnożeniu to: " + result2);
        System.out.println("Rezultat przed mnożeniem to: " + result);*/
       /* metody.policzWynikParam(2);
        metody.policzWynikParam(100);
        metody.policzWynikParam(23);*/

        /*metody.add(2,6);
        int result = metody.add(4,10);*/

        int result = metody.add(2, 3,"hello");
        System.out.println(metody.add(5,5,"hello2"));
        System.out.println(result);

    }
}
