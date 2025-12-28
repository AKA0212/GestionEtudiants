import java.time.LocalDate;

class Main{
	public static void main(String[] args){
	
	Etudiant etudiant1 =  new Etudiant(1, "Dieynaba Oumar", "Kane", "dieynabaoumar@gmail.com", LocalDate.of(2018, 05, 03));
	System.out.println("==================================================================================================");
        System.out.println("| Numero |          Prenom          |   Nom     |           email           |  Date de Naissance |");
        System.out.println("==================================================================================================");
        System.out.println("|      " + etudiant1.getNumero() + " |      " + etudiant1.getPrenom()  + "      |    " + etudiant1.getNom()  + "   | " + etudiant1.getEmail() + "   |     " + etudiant1.getDateNaissance() + "     | ");
        System.out.println("==================================================================================================");
   }
}
