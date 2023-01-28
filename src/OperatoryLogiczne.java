public class OperatoryLogiczne {

    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        // && -> true wtedy gdy wyrażenia skłądowe są równe true
        System.out.println(firstValue&&secondValue); // false
        System.out.println(firstValue&&thirdValue);  // true
        System.out.println(secondValue&&fourthValue);// false
        // || _> gdy jedno wyrażenie składowe jest równe true
        System.out.println(firstValue||secondValue); // true
        System.out.println(secondValue||fourthValue); // false
        System.out.println(firstValue||thirdValue); // true
        // ! negacja - zwraca wartość przeciwną do wyrażenia, przed którym sie znajduje
        System.out.println(!firstValue); // false
        System.out.println(!secondValue);// true
        System.out.println(!(firstValue&&secondValue)); // true


    }
}
