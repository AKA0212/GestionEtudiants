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
    public void setNumero(int numero){
    	this.numero = numero;
    }
    public void setPrenom(String prenom){
    	this.prenom = prenom;
    }
    public void setNom(String nom){
    	this.nom = nom;
    }
    public void setEmail(String email){
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
    public LocalDate getDateNaissance(){
	return dateNaissance;
    }

   // Affichage des infos d'un Etudiant
   //public void afficherEtudiant(){
//	System.out.println("==================================================================================================");
//	System.out.println("| Numero |	        Prenom		|   Nom	    |		email		|  Date de Naissance  |");
//	System.out.println("==================================================================================================");
//	System.out:.println("| " +  get"											      |");
//	System.out.println("==================================================================================================");
  // } 

}

