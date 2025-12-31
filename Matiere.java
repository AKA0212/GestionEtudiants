class Matiere{
    private int reference;
    private String libelle;
    private short coefficient;

    // Constructeur
    public Matiere(){

    }

    public Matiere(int reference, String libelle, short coefficient){
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

    public void setCoefficient(short coefficient){
        this.coefficient = coefficient;
    }

    // Getters
    public int getReference(){
        return reference;
    }

    public String getLibelle(){
        return libelle;
    }

    public short getCoefficient(){
        return coefficient;
    }

}