public class Switch {
    public static void main(String[] args) {
        String danie = "Frytki";

        switch(danie){
            case "Pizza":
                System.out.println("cena 22");
                break;
            case "Zupa":
                System.out.println("cena 15");
                break;
            case "Frytki":
                System.out.println("cena 20");
                break;
            default:
                System.out.println("nie ma potrawy w MENU");
        }
    }
}
