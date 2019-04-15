public class Pion {
    protected String id;

    public Pion(String id, Couleur couleur) {
        this.id = id;
    }

    public Couleur getCouleur(){
        return Couleur.values()[0];
    }
}
