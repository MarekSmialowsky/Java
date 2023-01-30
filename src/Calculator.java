public class Calculator {
    public int add(int firstNumber, int secondNumber){
       // System.out.println("Wynik dodawania to: " + (firstNumber + secondNumber) );
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber){
      //  System.out.println("Wynik odejmowania to: " + (firstNumber - secondNumber) );
        return firstNumber - secondNumber;
    }


    public int multi(int firstNumber, int secondNumber){
      //  System.out.println("Wynik mnożenia to: " + (firstNumber * secondNumber) );
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber){
            return firstNumber / secondNumber;
    }

    public int mod(int firstNumber, int secondNumber){
     //   System.out.println("Modulo to: " + (firstNumber % secondNumber) );
        return firstNumber % secondNumber;
    }
}
