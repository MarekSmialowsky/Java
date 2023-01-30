public class Auto {

    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    public Auto() {

    }

    public Auto(String marka, String model, Integer rok, Integer przebieg){
        this.marka = marka;
        this.model = model;
        this.rok =rok;
        this.przebieg = przebieg;
    }

    public void jedz(){
        System.out.println("jedz");
    }

    public void  hamuj(){
        System.out.println("hamuj");
    }

    public void info(){
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rok );
        System.out.println("Przebieg: " + przebieg);
    }
}
