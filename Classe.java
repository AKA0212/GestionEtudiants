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


}