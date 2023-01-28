public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0 && number <= 10){
            System.out.println("Liczba większa od zera oraz mniejsza od 11");
        }else if(number > 10 ){
            System.out.println("Liczba jest więkasza od 10");
        } else if(number < -10){
            System.out.println("Liczba mniejsza od -10");
        }else if (number == 0){
            System.out.println("Liczba równa zero");
        }else {
            System.out.println("Liczba z przedziału -10 do 0");
        }
    }
}
