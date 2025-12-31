class EtreNote{
    private double noteCC;
    private double noteDS;

    // Constructeur
    public EtreNote(){

    }

    public EtreNote(double noteCC, double noteDS){
        this.noteCC = noteCC;
        this.noteDS = noteDS;
    }

    // Setters
    public void setNoteCC(double noteCC){
        this.noteCC = noteCC;
    }
    public void setNoteDS(double noteDS){
        this.noteDS = noteDS;
    }
    // Getters

    public double getNoteCC(){
        return noteCC;
    }
    public double getNoteDS(){
        return noteDS;
    }


}