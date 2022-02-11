package fr.um3.XUCXAI_Frederic.etudiant;


public class Lettre extends ObjetPostal { //Lettre herite des attributs de la super class ObjetPostal
	//Attribut
	private boolean urgent;
	
	//Constructeur
	
	public Lettre(String destination, String codePostal, double poids, double volume, 
			int tauxRecommandation, boolean urgent) {
		super(destination,codePostal,poids,volume, tauxRecommandation); //mot-cle super recupere les attributs
		setUrgent(urgent);
		
	}
	
	//getter et setter pour etablir le caractere de l'objet
	
	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}
	
	public boolean isUrgent() {
		return urgent;
	}
	
	public String isUrgentDescription() {
		return isUrgent()?"urgent":"ordinaire";
	}
	
	public void toggleUrgent() {
		urgent = !urgent;
	}
	
	
	public double tarifAffranchissement() {
		return (isUrgent()?0.3:super.tarifAffranchissement());
	}
			
	
	public double tarifRemboursement() {
		switch(getTauxRecommandation()) {
		case 0:
			return 0;
		case 1:
			return 1.5;
		default:
			return 15;
		}
	}
	
	public String toString() { //redefinition de la methode de la super class pour la sous class
		return super.toString()+"/"+ isUrgentDescription();
	}
}
