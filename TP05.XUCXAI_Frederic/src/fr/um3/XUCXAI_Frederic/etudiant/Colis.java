package fr.um3.XUCXAI_Frederic.etudiant;

public class Colis extends ObjetPostal { //Colis herite des attributs de la super class ObjetPostal
	//Attribut
	
	private String contenu;
	private double euro;
	
	//Constructeur
	
	public Colis(String destination, String codePostal, double poids, double volume,
			int tauxRecommandation, String contenu, double euro) {
		super(destination,codePostal,poids,volume, tauxRecommandation);
		setContenu(contenu);
		setEuro(euro);
	}
	
	// getter et setter sur le contenu et valeur declares
	public String getContenu() {
		return contenu;
	}
	
	public void setContenu(String contenu) {
		if(contenu != null && contenu.length()>=10)
			this.contenu = contenu;
		else
			System.err.println("erreur sur le contenu declare");
	}
	
	public double getEuro() {
		return euro;
	}
	
	public void setEuro(double euro) {
		if (euro > 0)
			this.euro = euro;
		else
			System.err.println("Le montant declare est incorrect");
	}
	
	public double tarifAffranchissement() {
		return super.tarifAffranchissement() + (getVolume() > 0.2?3.:0.);
	}
	
	public double tarifRemboursement() {
		switch(getTauxRecommandation()) {
		case 0:
			return 0.1 * getEuro();
		case 1:
			return 0.3 * getEuro();
		default:
			return 0.6 * getEuro();
		}
	}
	
	public String toString() { //redefinition de la methode de la super class pour la sous class
		return "Colis: "+super.toString()+"/"+getVolume()+"/"+getEuro();
	}
}
