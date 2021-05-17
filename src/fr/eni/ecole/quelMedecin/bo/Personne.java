package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe Personne parent des classes Patient, Médecin.
 * comporte des attributs d'instance, une liaison unidirectionelle avec Adresse <br>
 * un constructeur et une méthode d'affichage
 * @author eneroda2021
 * @date
 */
public class Personne {
    protected String nom;
    protected String prenom;
    protected String numeroDeTelephone;
    protected Adresse adresse;

    public Personne(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
    }

    public void afficher (){
        System.out.printf("%s %s %nTéléphone : %s%n", this.nom.toUpperCase(), this.prenom, this.numeroDeTelephone);
    }
}
