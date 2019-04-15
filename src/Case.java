import java.util.ArrayList;

public abstract class Case {
    protected ArrayList<Pion> chevaux;
    /**
     * 
     */
    public Case(){

    }

    /**
     *
     * @return
     */
    public ArrayList<Pion> getChevaux(){
        return chevaux;
    }

    public void ajouterCheval(Pion pion){
        chevaux.add(pion);
    }

    /**
     *
     * @param pion
     * @return
     */
    public boolean peutPasser(Pion pion){
        if(chevaux.get(0) == null){
            return true;
        }
        else{
            for(int i = 0; i<chevaux.size(); i++){
                if(chevaux.get(0).getCouleur() != pion.getCouleur()){
                    return false;
                }
            }
            return true;
        }
    }

    /**
     *
     * @param pion
     * @return
     */
    /*public boolean peutSArreter(Pion pion){

    }*/
}
