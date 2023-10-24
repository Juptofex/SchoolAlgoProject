public class Multiplication1{

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Tu vas faire 5 multiplications");
		System.out.println("La valeur minimale des nombres a multiplier est 0, la valeur maximale est 10");
		System.out.println("Pour chaque multiplication, tu as droit a 1 essai");
		System.out.println("Tu recevras la reponse, si tu la rate");
		System.out.println("A la fin, le programme affichera le nombre de bonnes reponses.");
		// A NE PAS COMPLETER

	}


	/**
	 * fait resoudre des multiplications un certains nombre de fois et ce avec un certains nombre de chance par
	 * multipication
	 * @param nbrEssais nombre d'essais par multiplications
	 * @param borneMinNbr borne minimum des nombres generes
	 * @param borneMaxNbr borne maximum des nombres generes
	 * @param nbrMultiplication nombre de multiplication a effectuer
	 * @return le nombre de multiplications reussies
	 */
	public static int faireUneMultiplication(int nbrEssais, int borneMinNbr, int borneMaxNbr, int nbrMultiplication) {
		int res;
		int reussite = 0;
		for (int i = 1; i <= nbrMultiplication; i++) {
			int premierNombre = Utilitaires.unEntierAuHasardEntre(borneMinNbr, borneMaxNbr);
			int secondNombre = Utilitaires.unEntierAuHasardEntre(borneMinNbr, borneMaxNbr);
			System.out.println("Multiplication n°" + i);
			System.out.println("Calculez : " + premierNombre + " x " + secondNombre + " = ");
			for (int j = 1; j <= nbrEssais; j++) {
				System.out.println("Essai n°" + j + " : ");
				int reponseUtilisateur = scanner.nextInt();
				res = premierNombre * secondNombre;
				if (reponseUtilisateur == res) {
					System.out.println("Bonne reponse !");
					reussite++;
				}
			}
			System.out.println("La bonne reponse est : " + (premierNombre * secondNombre));
		}
		return reussite;
	}
	
	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		double nombreReel;
		int resultat;
		nombreReel = Math.random();
		resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
		return resultat;
	}
}