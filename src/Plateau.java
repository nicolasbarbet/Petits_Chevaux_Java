import java.util.ArrayList;

public class Plateau {
    protected ArrayList<CaseEcurie> ecuries;
    protected ArrayList<ArrayList<CaseDEchelle>> echelles;
    protected ArrayList<CaseDeChemin> chemin;

    public Plateau() {


        for(int indiceJoueur = 0; indiceJoueur < 4; indiceJoueur++) {
            for (int nbCase = 0; nbCase < 4; nbCase++) {
                ecuries.add(new CaseEcurie(Couleur.values()[indiceJoueur]));
            }
        }

        for(int indiceJoueur = 0; indiceJoueur < 4; indiceJoueur++) {
            echelles.add(new ArrayList<CaseDEchelle>());
            for (int nbCase = 0; nbCase < 4; nbCase++) {
                echelles.get(indiceJoueur).add(new CaseDEchelle(Couleur.values()[indiceJoueur]));
            }
        }

        for(int indiceJoueur = 0; indiceJoueur < 4; indiceJoueur++) {
            for (int nbCase = 0; nbCase < 56; nbCase++) {
                chemin.add(new CaseDeChemin());
            }
        }
    }

    public ArrayList<CaseEcurie> getEcuries(){
        return ecuries;
    }

    public ArrayList<ArrayList<CaseDEchelle>> getEchelles(){
        return echelles;
    }

    public ArrayList<CaseDeChemin> getChemin(){
        return chemin;
    }

    public void afficher(){
        //System.out.println("\033[31;1mHello\033[0m, \033[32;1;2mworld!\033[0m");
        for(int i=0; i<chemin.size(); i++){
            System.out.println("\033[31;1mX\033[0m");
        }
    }

    public void deplacerPionA(Pion pion, Case c){

    }
}
