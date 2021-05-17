package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe médecin parent des classes médecinGénéralisete et médecinSpécialiste et héritant de la classe Personne<br>
 * comportant une liaison bidiréctionnelle avec créneaux, un constructeur, une méthode d'affichage
 * et une méthode d'ajout de créneau
 * @author eneroda2021
 * @date
 */
public class Medecin extends Personne {
    public static final int MAX_CRENEAUX = 15;
    protected Creneau [] creneaux = new Creneau[MAX_CRENEAUX];


    public Medecin(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone, adresse);

    }

    public Medecin(String nom, String prenom, String numeroDeTelephone, Adresse adresse, Creneau[] creneaux) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.creneaux = creneaux;
    }

    public String getNumeroDeTelephone (){
        return this.numeroDeTelephone;
    }
    public String  getNom (){
        return this.nom;
    }
    public void setNumeroDeTelephone(String  numeroDeTelephone){
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public void afficherAdresseEtCreneaux (){
        System.out.println("Adresse : ");
        this.adresse.afficher();
        System.out.println("Creneaux : ");
        for (int i = 0; i < this.creneaux.length; i++) {
            if (this.creneaux[i]!= null){
                this.creneaux[i].afficher();
            }

        }
    }
    public void ajouterCreneau(Creneau creneauAajouter){
        if (this != creneauAajouter.getMedecin()){
            System.err.println("Désolé le créneau est déjà occupé par un autre médecin");
        }else {
            for (int i = 0; i < this.creneaux.length; i++) {
                if (this.creneaux [i] != null) {
                    this.creneaux[i]= creneauAajouter;

                    break;
                }
            }
        }

    }
}
