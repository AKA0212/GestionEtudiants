class SeFaire{
    private int referenceMatiere;
    private int codeClasse;

    // Constructeur
    public SeFaire(){

    }

    public SeFaire(int referenceMatiere, int codeClasse){
        this.referenceMatiere = referenceMatiere;
        this.codeClasse = codeClasse;
    }

    // Setters
    public void setReferenceMatiere(int referenceMatiere){
        this.referenceMatiere = referenceMatiere;
    }

    public void setCodeClasse(int codeClasse){
        this.codeClasse = codeClasse;
    }

    // Getters
    public int getReferenceMatiere(){
        return referenceMatiere;
    }

    public int getCodeClasse(){
        return codeClasse;
    }
}