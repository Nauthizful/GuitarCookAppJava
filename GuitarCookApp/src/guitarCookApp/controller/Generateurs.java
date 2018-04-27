package guitarCookApp.controller;

import java.util.ArrayList;
import java.util.Random;

public class Generateurs {
	
	public static String randCouleur() {
		String result = "";
		Random index = new Random();
		ArrayList<String> couleurs = new ArrayList<String>();
		ArrayList<String> nuances = new ArrayList<String>();
		
		couleurs.add("Bleue");
		couleurs.add("Vert");
		couleurs.add("Rose");
		couleurs.add("Orange");
		
		nuances.add("clair");
		nuances.add(" ");
		nuances.add("foncé");
		
		result = couleurs.get(index.nextInt(4 - 0)) + " " + nuances.get(index.nextInt(3-0));
		
		return result;
	}
	
	public static String randTempo() {
		int result;
		Random rand = new Random();
		result = 70 + rand.nextInt(200 - 70);
		String resultat = Integer.toString(result);
		return resultat;
	}
	
	public static String randAccords() {
		
	}
}