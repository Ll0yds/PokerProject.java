import java.util.Scanner;

public class Poker {
public static int nbPlayers;
public static int nbCardsPlayers = 0;
public static int nbCardsBoard;
public static Scanner sc;

public static int setPlayers () {
    Scanner sc = new Scanner(System.in);
	System.out.println("Veuillez entrer le nombre de joueur");
	nbPlayers = sc.nextInt();
	System.out.println("Il y a " + nbPlayers + " joueurs autour de la table");
	return nbPlayers;
}
public static void shuffle () {
	 System.out.println("Les cartes sont m�lang�es.");
 }
 public static void playersDeal () {
	 while (nbCardsPlayers < 2) {
		 nbCardsPlayers++;
		 if (nbCardsPlayers == 1) {
			 System.out.println(nbCardsPlayers + " carte distribu�e.");
		 }
		 else {
			 System.out.println(nbCardsPlayers + " cartes distribu�es.");
		 }
	 }
	 
 }
public static void burn () {
	 System.out.println("Une carte a �t� br�l�e.");
 }
public static void boardDeal (int nbCards, String dealName) {
	 nbCardsBoard += nbCards;
	 if (dealName == "Flop") {System.out.println(dealName + ": " + nbCards + " cartes ont �t� retourn�es.\n" + nbCardsBoard + " cartes sont au centre. ");
}
	 else {
		 System.out.println(dealName + ": " + nbCards + " carte a �t� retourn�e.\n" + nbCardsBoard + " cartes sont au centre. ");
	 }}
	public static void main(String[] args) throws InterruptedException {
		setPlayers();
		Thread.sleep(1000);
		shuffle();
		Thread.sleep(1000);
		playersDeal();
		Thread.sleep(1000);
		burn();
		Thread.sleep(1000);
		boardDeal (3, "Flop");
		Thread.sleep(1000);
		burn();
		Thread.sleep(1000);
		boardDeal(1, "Turn");
		Thread.sleep(1000);
		burn();
		Thread.sleep(1000);
		boardDeal(1, "River");
		

	}

}
