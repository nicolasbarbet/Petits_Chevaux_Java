import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Partie {
    protected Random de;
    public Plateau nvPlateau;

    /*
    Constructeur
     */
    public Partie() {
        Plateau nvPlateau = new Plateau();
    }

    /*
    Méthodes
     */

    public void initialiserJoueur(int nbJoueur){
        ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
        Scanner sc = new Scanner(System.in);
        if(nbJoueur>0 && nbJoueur<=4){
            for(int i=0; i<nbJoueur; i++){
                System.out.println("Joueur" + (i+1) + " - Entrez votre nom : ");
                String nom = sc.nextLine();
                joueurs.add(new JoueurHumain(nom, Couleur.values()[i]));
            }
        }
        /*Joueur j1 = new JoueurHumain("J1", Couleur.BLEU);
        Joueur j2 = new JoueurHumain("J2", Couleur.JAUNE);
        Joueur j3 = new JoueurHumain("J3", Couleur.VERT);
        Joueur j4 = new JoueurHumain("J4", Couleur.ROUGE);*/
    }

    public void initialiserPlateau(){

    }

    private int lancerDe(){
        return de.nextInt(6) + 1;
    }

    public void jouerUnTour(){
        int valeurDe = lancerDe();
    }

    /*
    public boolean estTerminee(){
        for(int testJoueur = 0; testJoueur < 4; testJoueur++){

        }
    }

    public Joueur getJoueurCourant(){

    }

    public void setJoueurCourant(Joueur j){

    }
*/
    public Plateau getPlateau(){
        return this.nvPlateau;
    }
/*
    public ArrayList<Joueur> getJoueurs(){
        return joueurs;
    }*/

    private void mangerLesPions(Case casePionAManger){

    }
}
