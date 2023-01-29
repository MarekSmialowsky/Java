public class Tablice {

    public static void main(String[] args) {
        String[] winterMounths = new String[3];
        winterMounths[0] = "grudzien";
        winterMounths[1] = "styczen";
        winterMounths[2] = "luty";

        int[] numbers = new int[]{1, 4, 6};

        System.out.println(winterMounths[0]);
        System.out.println(winterMounths[1]);
        System.out.println(winterMounths[2]);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        for (int i = 0; i < winterMounths.length; i++) {
            System.out.println(winterMounths[i]);
        }
    }
}
