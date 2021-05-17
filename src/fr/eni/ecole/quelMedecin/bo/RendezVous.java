package fr.eni.ecole.quelMedecin.bo;
/**
 * Classe RendezVous
 * comporte des liaisons unidéréctionnelles aves Creneau, Patient.<br>
 *
 * permet d'affécter un rendez-vous au médecin et au patient
 * @author eneroda
 * @date
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RendezVous {
    private Creneau creneau;
    private Patient patient;
    private LocalDate date;


    public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
        this.creneau = creneau;
        this.patient = patient;
        this.date = date;
    }

    public  void afficher (){
        System.out.printf("Rendez-vous du %s%n", this.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        this.creneau.afficher();
        System.out.printf("Avec le Dr %s%n", this.creneau.getMedecin().getNom());
        System.out.printf("Pour %s", this.patient);
    }
}
