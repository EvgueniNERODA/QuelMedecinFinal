package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Classe patient, comportant les attibuts d'instance, un constructeur, et une méthode d'affichage
 */
public class Patient extends Personne {
    private char sexe;
    private long numSecu;
    private LocalDate dateNaissance;
    private String commentaires;

    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe,  long numSecu, LocalDate dateNaissance, String commentaires,Adresse adresse) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.sexe = sexe;
        this.numSecu = numSecu;
        this.dateNaissance = dateNaissance;
        this.commentaires = commentaires;
    }

    public void afficher (){
        super.afficher();
        System.out.printf("Sexe : %s%nSécurité sociale : %d%n" +
                "Date de naissance : %s%nCommentaires : %s%n" +
                "Adresse : %n",
                this.sexe == 'F'? "Féminin" : "Masculin",this.numSecu, this.dateNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
                this.commentaires == null ? "Aucun commentaire" : this.commentaires);
        this.adresse.afficher();
    }
}
