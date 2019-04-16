import java.util.Scanner;


public class PetitsChevaux {
    public PetitsChevaux() {

    }

    public static void main(String [] args){
        Partie nvPartie = new Partie();
        Scanner sc = new Scanner(System.in);


        //Initialisation des joueurs
        System.out.println("Combien de joueur ?");
        int nbJoueur = sc.nextInt();
        nvPartie.initialiserJoueur(nbJoueur);
    }
}
