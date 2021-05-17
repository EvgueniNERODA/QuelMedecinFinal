package fr.eni.ecole.quelMedecin.bo;

import lombok.Data;

import java.time.LocalTime;
@Data
/**
 * Classe Creneau permettant l'ajout de créneaux aux médecins <br>
 * et comportant une méthode d'affichage
 * @author eneroda2021
 * @date
 */

public class Creneau {
    private LocalTime heureDebut;
    private int duree;
    private Medecin medecin;
    private LocalTime heureFin;

    public Creneau(LocalTime heureDebut, int duree, Medecin medecin) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.medecin = medecin;
        this.medecin.ajouterCreneau(this);
        heureFin = this.heureDebut.plusMinutes(this.duree);


    }

    public Creneau(LocalTime heureDebut, int duree) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        heureFin = this.heureDebut.plusMinutes(this.duree);

    }

    public Medecin getMedecin() {

        return medecin;
    }

    public void afficher (){
        LocalTime heureFin;

        System.out.printf("%s - %s (%d minutes) %n",this.heureDebut, this.heureFin, this.duree);


    }
}

