package fr.um3.XUCXAI_Frederic.etudiant;


public abstract class ObjetPostal {
	//attributs
	
	private String destination = "unknow"; 
	private String codePostal = "unknow";
	private double poids;
	private double volume; //utilisation du mot-cle protected pour acceder aux attributs depuis les methodes des sous-classe Lettre et Colis
	private int tauxRecommandation;
	
	//Constructeur
	
	public ObjetPostal(String destination, String codePostal, double poids, double volume,
			int tauxRecommandation) {
		setDestination(destination);
		setCodePostal(codePostal);
		setPoids(poids);
		setVolume(volume);
		setTauxRecommandation(tauxRecommandation);
	}

	
	// Getter et Setter associes 
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		if (destination != null && destination.length()>=3)
			this.destination = destination;
		else
			System.err.println("La destination que vous avez saisie n'existe pas");
	}
	
	public String getCodePostal() {
		return codePostal;
	}
	
	//boolean qui definit si la chaine de caractere saisi est bien un code postal FR
	
	public static boolean estUnCodePostal(String codePostal) { //codePostal situe en France
		if (codePostal == null)
			return false;
		if (codePostal.length() == 5) {
			for (int i=0; i< codePostal.length() ; i++) {
				if (!Character.isDigit(codePostal.charAt(i)))
					return false;
			}
			return true;
		}
		return false;
	}
	
	
	public void setCodePostal(String codePostal) {
		if (estUnCodePostal(codePostal))
			this.codePostal = codePostal;
		else
			System.err.println("Le code postal saisie n'est pas valide");
	}
	
	public double getPoids() {
		return poids;
	}
	
	public void setPoids(double poids) {
		if (poids >= 0 && poids <= 1000)
			this.poids = poids;
		else
			System.err.println("erreur");
	}
	
	
	public double getVolume() {
		return volume;
	}
	
	//creation de setter pour les attributs qui permettent de calculer le volume de l'objet postal
	
	
	public void setVolume(double volume) {
		if (volume > 0)
			this.volume = volume;
		else
			System.err.println("[setVolume] Erreur setteur : " + volume);
	}
	
	public int getTauxRecommandation() {
		return tauxRecommandation;
	}
	
	public void setTauxRecommandation(int tauxRecommandation) {
		if (tauxRecommandation>=0 && tauxRecommandation<=2)
			this.tauxRecommandation = tauxRecommandation;
		else
			System.err.println("erreur sur le taux de recommandation");
	}
	
	public double tarifAffranchissement() {
		double base = 0.5;
		switch(getTauxRecommandation()) {
		case 1:
			base += 0.5;
			break;
		case 2:
			base += 1.5;
			break;
		}
		return base;
	}
	
	public abstract double tarifRemboursement(); //initialisation de la methode qui sera redefini par les sous-classe

	
	public String toString() { // definition de la methode toString pour afficher l'objet instancie
		return getCodePostal()+"/"+getDestination()+"/"+getTauxRecommandation();
	}
}
