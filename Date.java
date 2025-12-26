
class Date{
    private int jour;
    private int mois;
    private int annee;

    // Constructeur sans parametre tous les attributs sont initialisé par defaut à 0 
    Date(){

    }


    Date(int jour, int mois, int annee){
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    // Setters

    public void setJour(int jour){
        this.jour = jour;
    }

    public void setMois(int mois){
        this.mois = mois;
    }

    public void setAnnee(int annee){
        this.annee = annee;
    }

    // Getters

    public int getJour(){
        return jour;
    }

    public int getMois(){
        return mois;
    }

    public int getAnnee(){
        return annee;
    }


}