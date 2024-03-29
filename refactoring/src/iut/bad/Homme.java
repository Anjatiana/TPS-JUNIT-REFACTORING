package iut.bad;

public class Homme extends Humain {


    public Homme() {
        super();
    }

    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
    
    public void details() {
        System.out.println("Nom: " + nom + ", Pr�nom: " + prenom + ", �ge: " + age);
    }
    
    @Override
    public String toString() {
        return "Nom: " + nom + ", Pr�nom: " + prenom + ", �ge: " + age;
    }
    
   
    public void manger() {
        System.out.println(nom + " est en train de manger.");
    }


    public void boire() {
        System.out.println(nom + " est en train de boire.");
    }
}
