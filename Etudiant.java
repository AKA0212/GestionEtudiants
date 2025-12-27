import java.time.LocalDate;
class Etudiant{

    // attributs de la classe Etudiant
    private int numero;
    private String prenom;
    private String nom;
    private String email;
    private LocalDate dateNaissance;


    //Constructeur sans parametre(valeur par defaut 0 pour les nombres et null pour les string)

    Etudiant(){

    }

    //Constructeur avec parametre nous permet de passer des valeurs lors de l'instanciation
    Etudiant(int numero, String prenom, String nom, String email, LocalDate dateNaissance){
        this.numero = numero;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
	this.dateNaissance = dateNaissance;
    }

    // Setters
    public static void setNumero(int numero){
    	this.numero = numero;
    }
    public static void setPrenom(String prenom){
    	this.prenom = prenom;
    }
    public static void setNom(String nom){
    	this.nom = nom;
    }
    public static void setEmail(String email){
    	this.email = email;
    }
    public void setDateNaissance(int annee, int mois, int jour){
   	this.dateNaissance = LocalDate.of(annee, mois, jour);
   }

    // Getters
    public int getNumero(){
	return numero;
    }
    public String getPrenom(){
	return prenom;
    }
    public String getNom(){
	return nom;
    }
    public String getEmail(){
    	return email;
    }
    public Date getDateNaissance(){
	return dateNaissance;
    }

    

}

