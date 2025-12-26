
class Etudiant{

    // attributs de la classe Etudiant
    private int numero;
    private String prenom;
    private String nom;
    private String email;


    //Constructeur sans parametre(valeur par defaut 0 pour les nombres et null pour les string)

    Etudiant(){

    }

    //Constructeur avec parametre nous permet de passer des valeurs lors de l'instanciation
    Etudiant(int numero, String prenom, String nom, String email){
        this.numero = numero;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
    }

}

