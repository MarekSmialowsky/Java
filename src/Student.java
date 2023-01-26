public class Student {

    public String name;
    public String secondName;
    public Integer age;
    public Integer indexNumber;
    public String emailAddress;
    public String nick;

    public void przedstawSie(){
        System.out.println("Nazywam się " + name + " " + secondName);
    }


    public void zalogujSie(){
        System.out.println("Loguje sie do skrzynki "+ emailAddress + " za pomocą " + nick);
    }

    public void podajSwojWiek(){
        System.out.println("Mam " + age + " lat");
    }

    public void podajNrIndeksu() {
        System.out.println("Mój numer indeksu to " + indexNumber);
    }

    public void info(){
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + secondName);
        System.out.println("Wiek: " + age);
        System.out.println("Numer indeksu: " + indexNumber);
        System.out.println("Login w systemie: "+ nick);
        System.out.println("Adres email: " + emailAddress);
    }


}
