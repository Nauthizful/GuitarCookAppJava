package guitarCookApp.constructeur;

public class Contraintes {
	private String carte;
	private String couleur;
	private String accords;
	private int tempo;

	public Contraintes(String carte, String couleur, String accords, int tempo) {
		this.carte = carte;
		this.couleur = couleur;
		this.accords = accords;
		this.tempo = tempo;
	}

	public String getCarte() {
		return carte;
	}

	public void setCarte(String carte) {
		this.carte = carte;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getAccords() {
		return accords;
	}

	public void setAccords(String accords) {
		this.accords = accords;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public String toString() {
		return "Contraintes : Carte : " + carte + ", couleur : " + couleur + ", suite d'accords : " + accords + ", tempo : " + tempo; 
	}

}