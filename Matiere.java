class Matiere{
    private int reference;
    private String libelle;
    private int coefficient;

    // Constructeur
    public Matiere(){

    }

    public Matiere(int reference, String libelle, int coefficient){
        this.reference = reference;
        this.libelle = libelle;
        this.coefficient = coefficient;
    }

    // Setters
    public void setReference(int reference){
        this.reference = reference;
    }

    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    public void setCoefficient(int coefficient){
        this.coefficient = coefficient;
    }

    // Getters
    public int getReference(){
        return reference;
    }

    public String getLibelle(){
        return libelle;
    }

    public int getCoefficient(){
        return coefficient;
    }

}