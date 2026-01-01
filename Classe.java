class Classe{
    private int codeClasse;
    private String nomClasse;
    enum Niveau {Licence, Master, Dut, Dic};
    Niveau niveau;
    public Classe(){

    }

    public Classe(int codeClasse, String nomClasse, Niveau niveau){
        this.codeClasse = codeClasse;
        this.nomClasse = nomClasse;
        this.niveau = niveau;
    }

    public void setCodeClasse(int codeClasse){
        this.codeClasse = codeClasse;
    }
    public void setNomClasse(String nomClasse){
        this.nomClasse = nomClasse;
    }
    public void setNiveau(Niveau niveau){
        this.niveau = niveau;
    }

    public int getCodeClasse(){
        return codeClasse;
    }

    public String getNomClasse(){
        return nomClasse;
    }

    public Niveau getNiveau(){
        return niveau;
    }


}