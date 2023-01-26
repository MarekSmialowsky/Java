public class StudentTest {
    public static void main(String[] args) {

        Student pierwszy = new Student();

        pierwszy.name = "Anton";
        pierwszy.secondName= "Antonowicz";
        pierwszy.emailAddress = "pierwszy@.com";
        pierwszy.nick = "Antonowsky";
        pierwszy.age = 25;
        pierwszy.indexNumber = 2157;

        Student drugi = new Student();

        drugi.name = "Wania";
        drugi.secondName= "Waniowicz";
        drugi.emailAddress = "drugi@com";
        drugi.nick = "Waniowsky";
        drugi.age = 22;
        drugi.indexNumber = 8873;

        Student trzeci = new Student();

        trzeci.name =  "Grażyna";
        trzeci.secondName = "Grażynowicz";
        trzeci.emailAddress = "trzeci@com";
        trzeci.nick = "Grażynowska";
        trzeci.age = 43;
        trzeci.indexNumber = 999;

        Student[] students = {pierwszy,drugi,trzeci};

        for (int i = 0; i < students.length;i++){
            students[i].przedstawSie();
            students[i].podajSwojWiek();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();
            students[i].info();
        }
    }
}
