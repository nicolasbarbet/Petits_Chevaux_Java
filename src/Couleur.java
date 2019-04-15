public enum Couleur {
    JAUNE('J'),
    BLEU('B'),
    VERT('V'),
    ROUGE('R');

    protected char symbole;

    Couleur(char symbole) {
        this.symbole = symbole;
    }

    public char getSymbole() {
        return symbole;
    }
}
