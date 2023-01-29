public class PetlaFor {
    public static void main(String[] args) {

        int number = 100;

        for (int i = 0; i <= number; i++){
            System.out.println(i);
        }

        for (int i = 0; i <= number; i++){
            if(i%5==0)
                System.out.println(i);

        }
    }
}
