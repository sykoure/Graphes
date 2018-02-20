package data;

public class Graphe {

    private int sommet;
    private int valeur;
    private int matrice;

    public Graphe(int sommet){
        this.sommet = sommet;
    }

    public int getSommet() {
        return sommet;
    }

    public void setSommet(int sommet) {
        this.sommet = sommet;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public int getMatrice() {
        return matrice;
    }

    public void setMatrice(int matrice) {
        this.matrice = matrice;
    }
}
