package fr.eni.ecole.quelMedecin.bo;

/**
 *classe Adresse, permettant l'affichage d'une  adresse
 * @author eneroda2021
 * @date
 */
public class Adresse  {
private String mentionsComplémentaires;
private int numeroVoie;
private String complementVoie;
private String nomVoie;
private int codePostal;
private String nomVille;


    public Adresse(String mentionsComplémentaires, int numeroVoie, String complementVoie, String nomVoie, int codePostal, String nomVille) {
        this.mentionsComplémentaires = mentionsComplémentaires;
        this.numeroVoie = numeroVoie;
        this.complementVoie = complementVoie;
        this.nomVoie = nomVoie;
        this.codePostal = codePostal;
        this.nomVille = nomVille;
    }

    public Adresse(int numeroVoie, String complementVoie, String nomVoie, int codePostal, String nomVille) {
        this.numeroVoie = numeroVoie;
        this.complementVoie = complementVoie;
        this.nomVoie = nomVoie;
        this.codePostal = codePostal;
        this.nomVille = nomVille;
    }

    public void afficher (){
        System.out.printf("%s%n" +
                "%d%s %s%n" +
                "%5d %s", this.mentionsComplémentaires == null ? "": this.mentionsComplémentaires, this.numeroVoie, this.complementVoie == null ? "": this.complementVoie, this.nomVoie, this.codePostal, this.nomVille );
    }
}
