import java.time.LocalDate;
//import java.io.File;// biblio pour les fichiers

class Main{
	public static void main(String[] args){

        //File fichierEtudiant = new File();//declaration, initialisation et creation d'un fichier
        //fichierEtudiant.createNewFile("Etudiant.csv");

	Etudiant etudiant1 =  new Etudiant(1, "Dieynaba Oumar", "Kane", "dieynabaoumar@gmail.com", LocalDate.of(2018, 05, 03));
	System.out.println("==================================================================================================");
        System.out.println("| Numero |          Prenom          |   Nom     |           email           |  Date de Naissance |");
        System.out.println("==================================================================================================");
        System.out.println("|      " + etudiant1.getNumero() + " |      " + etudiant1.getPrenom()  + "      |    " + etudiant1.getNom()  + "   | " + etudiant1.getEmail() + "   |     " + etudiant1.getDateNaissance() + "     | ");
        System.out.println("==================================================================================================");

        // test de creation de classse
         Classe classe1 = new Classe(1, "GLSI-B", "Licence");
	System.out.println("==================================================================================================");
        System.out.println("| Code |      Nom Classe         |  Niveau     |");
	System.out.println("==================================================================================================");
        System.out.println("|      " + classe1.getCodeClasse() + " |      " + classe1.getNomClasse()  + "      |    " + classe1.getNiveau()  + "   | ");
	System.out.println("==================================================================================================");



   }
}
