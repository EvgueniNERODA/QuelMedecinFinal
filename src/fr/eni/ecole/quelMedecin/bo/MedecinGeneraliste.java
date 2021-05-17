package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe medecin généraliste héritant de la classe Medecin <br>
 * utilise la méthide d'affichage de personne en Override
 * @author eneroda2021
 * @date
 */
public class MedecinGeneraliste extends Medecin{

    private static int Tarif = 25;

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone, adresse);
    }


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



    public static int getTarif() {

        return Tarif;

    }

    public static void setTarif(int tarif) {

        Tarif = tarif;


    }

@Override
   public void afficher (){
        super.afficher();
       System.out.printf("tarif : %d%n", MedecinGeneraliste.Tarif);
       this.afficherAdresseEtCreneaux();
   }
}
