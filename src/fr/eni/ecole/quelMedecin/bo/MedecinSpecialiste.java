package fr.eni.ecole.quelMedecin.bo;

/**
 * classe MedecinSpecialiste héritant de la classe Médecin <br>
 * comporte uen constructeur, des attributs d'instance et une méthode d'affichage
 */
public class MedecinSpecialiste extends Medecin{
    private String specialite;
    private int tarif;

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse,  String specialite, int tarif) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.specialite = specialite;
        this.tarif = tarif;
    }

    @Override
    public void afficher (){
        super.afficher();
        System.out.printf("Spécialité : %s%nTarif : %d€%n", this.specialite, this.tarif);
        this.afficherAdresseEtCreneaux();
    }
}
