package fr.um3.XUCXAI_Frederic.etudiant;

import java.util.ArrayList;


public class SacPostal {
	//Attribut
	
	private static final double CAPACITE_DEFAULT = 0.5;
	private double capacite_max;
	private ArrayList<ObjetPostal> Sac = new ArrayList<ObjetPostal> ();
	
	
	//Constructeur
	
	public SacPostal() { //Capacite maximale du SacPostal initialiser à 0.5
		this(CAPACITE_DEFAULT);
	}
	
	public SacPostal(double capacite_max) { //Cas de fabrication d'un SacPostal d'un autre volume sur demande
		setCapacite(capacite_max);
	}
	
	public SacPostal(String codePostal, SacPostal sac) {
		sac = new SacPostal(getCapacite());
		int i = 0;		
		if (ObjetPostal.estUnCodePostal(codePostal))
			while (i<Sac.size())
				if ((codePostal.equals(Sac.get(i).getCodePostal())))
					ajoutObjetPostal(sac.SuppObjetPostal(i));
				else
					i++;

	}
	
	public SacPostal(SacPostal sac) {
		sac = new SacPostal(getCapacite());
		int i = 0;
		while (i<Sac.size())
			if (Sac.get(i) instanceof Lettre && ((Lettre)Sac.get(i)).isUrgent())
				ajoutObjetPostal(sac.SuppObjetPostal(i));
			else
				i++;
	}

	//Getter et Setter
	
	
	public double getCapacite() {
		return capacite_max;
	}
	
	public void setCapacite(double capacite) { //Enregistre la capacite du sac et ne peut exceder la taille par defaut
		this.capacite_max = capacite_max > 0? capacite_max : CAPACITE_DEFAULT;
	}
	
	
	public double Volume() { //volume total du sac 
		double volume = 0.005;
		for(int i = 0; i < Sac.size(); i++) {
			volume += Sac.get(i).getVolume();
			}
		return volume;
	}
	
	public boolean ajoutObjetPostal(ObjetPostal obj) { //Si l'objet existe et que le volume du sac + celui de l'objet ne depasse pas celle de la capacite max
		if (obj != null && Volume() + obj.getVolume() < getCapacite()) {
			Sac.add(obj);
			return true; //ajout du sac + return true pour dire que l'ajoute s'est effectuer
		}
		return false;
	}
	
	public ObjetPostal SuppObjetPostal(int position) { //supprime l'objet à la position voulu
		ObjetPostal a = null;
		if (position < Sac.size())
			a = Sac.get(position);
			Sac.remove(position);
		return a;
	}
	
	public double ValeurRemboursement() { //calcul la valeur total des objets perdus ou contenu dans le sac
		double valeur = 0;
		for(ObjetPostal obj : Sac)
			if (obj instanceof Colis)
				valeur += ((Colis) obj).getEuro();
		return valeur;
	}
	
	public String toString() {
		String affiche ="*******************\n";
		for (int i = 0; i<Sac.size(); i++) {
			affiche += "Objet["+i+"] : "+ Sac.get(i)+"\n";
		}
		return affiche;
		
		}
	
}
