package fr.um3.XUCXAI_Frederic.etudiant;


public class TestObjetPostal {
	public static void main(String[] args) {
		/*
		ObjetPostal a = new ObjetPostal("49 rue youri gagarine, Colombes", "92700", 5.4, 36.3, 25.0, 1.9, 2);
		a.setDestination("ar");
		if (!a.getDestination().equals("ar"))
			System.err.println("erreur sur le mutateur Destination");
		else
			System.out.println("ok");
		
		a.setCodePostal("CB21RH");
		if (!a.getCodePostal().equals("CB21RH"))
			System.err.println("erreur sur le mutateur CodePostal");
		else
			System.out.println("ok");
		
		a.setLongueur(36.3);
		a.setLargeur(25.0);
		a.setHauteur(1.9);
		a.setVolume(a.getLongueur(),a.getLargeur(), a.getHauteur());
		if (a.getLongueur()!=36.3)
			System.err.println("erreur sur le mutateur Longueur/Largeur/Hauteur");
		else if (a.getLargeur()!=25.0)
			System.err.println("erreur sur le mutateur Longueur/Largeur/Hauteur");
		else if (a.getHauteur()!=1.9)
			System.err.println("erreur sur le mutateur Longueur/Largeur/Hauteur");
		else
			System.out.println(a.getLongueur()+"\n"+ a.getLargeur() + "\n"+ a.getHauteur()+ "\n"+ a.getVolume()+"m3");
		
		System.out.println(a);
		a.setTauxRecommandation(8);
		if (a.getTauxRecommandation()!=8)
			System.err.println("erreur sur le mutateur TauxRecommandation");
		*/
		Lettre b = new Lettre("49 rue youri gagarine, Colombes", "92700", 5.4, 36.3, 2, true);
		System.out.println(b);
		Colis c = new Colis("49 rue youri gagarine Colombes", "92700", 5, 100, 2, "cadeaux", 36.4);
		System.out.println(c);
		
		
		b.tarifAffranchissement();
		if (b.getTauxRecommandation() == 2 && b.isUrgent() && b.tarifAffranchissement() == 2.3)
			System.out.println("ok\n"+b.tarifAffranchissement()+"€");
		else
			System.err.println("erreur");
		
		
		System.out.println(c.getVolume());
		
		c.tarifAffranchissement();
		
		if (c.getTauxRecommandation() == 2 && c.getVolume() == 100 && c.tarifAffranchissement() == 6.5)
			System.out.println("ok\n"+c.tarifAffranchissement()+"€");
		else
			System.err.println("erreur");

		if (b.getTauxRecommandation() == 2 && b.tarifRemboursement() == 15.0)
			System.out.println(b.tarifRemboursement()+"€");
		else
			System.err.println("erreur");
		if (c.getTauxRecommandation() == 2 && c.tarifRemboursement() == 21.84)
			System.out.println(c.tarifRemboursement()+"€");
		else
			System.err.println("erreur");
		
		// switch(***nom_de_la_fonction***)
		//case 0: = si
		//		return 0.1
		//case 1: = else if
		//		return 0.3*
		//default: else
		
		/*public class sacPostal{
		 *private List<ObjectPostal>mysac = new ArrayList<Objectlist>();
		 *private double capacite = 0.5
		 *public SacPostal(){} constructeur vide à ini
		 *Public Sacpostal(double capacite) teste la capacite du sac
		 *getter/setter capacite
		 *
		 *public double volume(){}
		 *
		 *
		 *interet possible avec les objets list
		 *
		 *for(ObjetPostal obj ; sacPostal){
		 *volume+= obj.getVolume
		 *}
		 *return volume
		 *
		 *mySac.remove(i).
		 *
		 *faire des methodes avec des booleans
		 *
		 *pour verifier si l'objet a bien ete ajouter
		 *
		 *public boolean add(ObjetPostal){
		 *	if (getVolume() + obj.getVolume <= get.capacite()
		 *		mySac.add(obj)
		 *		return true;
		 *else return false
		 *
		 *
		 *public SacPostal getSPCodePostal(String Codepostal)
		 *		SacPostal sp = new SacPostal(get.capacite())
		 *	if (CP == null) 
		 *		return sp
		 *int i = 0;
		 *while (i < this.sacPostal.size() (taille du sac)
		 *	if (get(i).getCP().equals(CP)){
		 *	SP.add(get(i));
		 *	remove(i);
		 *} else i++
		 *
		 *return SP;
		 *
		 *
		 *Pour lettre urgente même chose mais test suppelementaire
		 *
		 *if get(i) instanceof (lettre)
		 *	Lettre l = (lettre)get.(i)
		 *	if (listUrg()){
		 *	SP.add(l)
		 *	remove(i)
		 *}
		 *else i++
		 *
		 *
		 *
		*/
	}
	
}
