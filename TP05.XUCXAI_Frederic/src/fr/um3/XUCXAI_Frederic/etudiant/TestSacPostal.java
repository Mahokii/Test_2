package fr.um3.XUCXAI_Frederic.etudiant;

public class TestSacPostal {
	public static void main(String[] args) {
		SacPostal sac = new SacPostal();
		Lettre amende = new Lettre("70 rue gabriel peri, Bordeaux", "34090", 100, 0.10, 2, true);
		Colis nintendo = new Colis("5 rue de l'egalite, Colombes", "92090", 100, 0.10, 2, "Le contenu est trop cool", 10);
		ObjetPostal ps5 = new Colis("FNAC", "34090", 100, .01, 2, "Le contenu est trop cool", 10);
		ObjetPostal fichePaie = new Lettre("rue Dupont, Caen", "34090", 100, .10, 2, true);
		sac.ajoutObjetPostal(amende);
		System.out.println(sac.Volume());
		sac.ajoutObjetPostal(nintendo);
		sac.ajoutObjetPostal(ps5);
		sac.ajoutObjetPostal(fichePaie);
		System.out.println(sac.Volume());

		System.out.println(sac);
		System.out.println(sac.Volume());
		System.out.println(new SacPostal(sac));
		System.out.println(sac);
		System.out.println(sac.Volume());
		System.out.println(new SacPostal("34090", sac));
		System.out.println(sac);
		sac.ajoutObjetPostal(amende);
		sac.ajoutObjetPostal(nintendo);
		sac.ajoutObjetPostal(ps5);
		sac.ajoutObjetPostal(fichePaie);
		System.out.println(sac);
		sac.SuppObjetPostal(0);
		sac.SuppObjetPostal(0);
		sac.SuppObjetPostal(0);
		System.out.println(sac);
		
		System.out.println(sac.ValeurRemboursement());
		System.out.println(new SacPostal(sac));
		System.out.println(sac);
	}

}
