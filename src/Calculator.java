import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszą liczbę");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        int dodawanie = firstNumber + secondNumber;
        int odejmowanie = firstNumber - secondNumber;
        int mnozenie = firstNumber * secondNumber;
        int dzielenie = firstNumber / secondNumber;
        int  reszta = firstNumber % secondNumber;

        System.out.println("wynik dodawania " + dodawanie);
        System.out.println("wynik odejmowania " + odejmowanie);
        System.out.println("wynik mnożenia " + mnozenie);
        System.out.println("wynik dzielenia " + dzielenie);
        System.out.println("wynik reszty z dzielenia " + reszta);

    }
}
