package iut.bad;

import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;
    protected List<Humain> amis;


    public Humain() {
      
        amis = new ArrayList<>();
    }


    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        amis = new ArrayList<>();
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void details() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }


    @Override
    public void manger() {
        System.out.println(nom + " est en train de manger.");
    }


    @Override
    public void boire() {
        System.out.println(nom + " est en train de boire.");
    }

    
    public void ami(Humain ami) {
        ami(ami, 100); 
    }

   
    public void ami(Humain ami, int duree) {
        amis.add(ami);
        System.out.println(nom + " est maintenant ami avec " + ami.getNom() + " pour " + duree + " jours.");
    }
}
