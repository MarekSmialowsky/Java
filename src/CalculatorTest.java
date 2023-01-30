import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszą liczbę");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        /*int dodawanie = firstNumber + secondNumber;
        int odejmowanie = firstNumber - secondNumber;
        int mnozenie = firstNumber * secondNumber;
        int dzielenie = firstNumber / secondNumber;
        int reszta = firstNumber % secondNumber;*/
        Calculator calculator = new Calculator();

        System.out.println("wynik dodawania " + calculator.add(firstNumber,secondNumber));
        System.out.println("wynik odejmowania " + calculator.sub(firstNumber,secondNumber));
        System.out.println("wynik mnożenia " + calculator.multi(firstNumber,secondNumber));
        System.out.println("wynik dzielenia " + calculator.div(firstNumber,secondNumber));
        System.out.println("wynik reszty z dzielenia " + calculator.mod(firstNumber,secondNumber));


       /* calculator.add(firstNumber,secondNumber);
        calculator.sub(firstNumber,secondNumber);
        calculator.div(firstNumber,secondNumber);
        calculator.multi(firstNumber,secondNumber);
        calculator.mod(firstNumber,secondNumber);*/




    }
}
