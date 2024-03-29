package iut.bad;

public class Femme extends Humain {

   
    public Femme() {
        super();
    }


    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }


    public static void main(String[] args) {
        Homme john = new Homme("Doe", "John", 30);
        Femme jane = new Femme("Doe", "Jane", 25);

        john.ami(jane);
    }
}
