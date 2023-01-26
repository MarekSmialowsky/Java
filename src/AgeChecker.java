import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        System.out.println("Proszę podaj swój wiek");
        Scanner scanner = new Scanner(System.in);
        int wiek = scanner.nextInt();
        if (wiek < 18 && wiek > 0) {
            System.out.println("Przykro mi nie mogę sprzedać Tobie alkoholu");
        } else if(wiek < 0) {
            System.out.println("Podałeś niepoprawną wartość");
        } else{
            System.out.println("Dziękuje za zakupy, życze miłego dnia");
        }
    }
}
