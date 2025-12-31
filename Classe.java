class Classe{
    private int codeClasse;
    private String nomClasse;
    private enum Niveau{"Licence", "Master", "Dut","Dic"};

    public Classe(){

    }

    public Classe(int codeClasse, String nomClasse, enum Niveau){
        this.codeClasse = codeClasse;
        this.nomClasse = nomClasse;
        this.Niveau = Niveau;
    }

    public void setCodeClasse(int codeClasse){
        this.codeClasse = codeClasse;
    }
    public void setNomClasse(String nomClasse){
        this.nomClasse = nomClasse;
    }
    public void setNiveau(){}// a definir

    public int getCodeClasse(){
        return codeClasse;
    }

    public String getNomClasse(){
        return nomClasse;
    }

    //public enum getNiveau()


}