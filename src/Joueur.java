import java.util.ArrayList;

public abstract class Joueur {
    protected String nom;
    protected Case caseDeDepart;
    protected ArrayList<Pion> chevaux;
    protected Couleur couleur;

    public Joueur(String nom, Couleur couleur) {
        this.nom = nom;
        this.couleur = couleur;
    }

    public Case getCaseDeDepart(){
        return this.caseDeDepart;
    }

    public void setCaseDeDepart(Case caseDeDepart){
        this.caseDeDepart = caseDeDepart;
    }

    public ArrayList<Pion> getChevaux(){
        return chevaux;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public Couleur getCouleur(){
        return null;
    }

    //abstract Pion choisirPion(int positionPion, Plateau plateau);

}
