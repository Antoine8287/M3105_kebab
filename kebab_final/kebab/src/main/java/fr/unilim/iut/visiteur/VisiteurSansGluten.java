package fr.unilim.iut.visiteur;

import fr.unilim.iut.ingredients.Agneau;
import fr.unilim.iut.ingredients.Crevette;
import fr.unilim.iut.ingredients.Fromage;
import fr.unilim.iut.ingredients.GaletteDeSarrasin;
import fr.unilim.iut.ingredients.Oignon;
import fr.unilim.iut.ingredients.Pain;
import fr.unilim.iut.ingredients.Salade;
import fr.unilim.iut.ingredients.Sauce;
import fr.unilim.iut.ingredients.Thon;
import fr.unilim.iut.ingredients.Tomate;

public class VisiteurSansGluten implements VisiteurRegime {
	
	private boolean estSansGluten = true;

	public void visiter(Agneau agneau) {
		// est sans gluten
	}

	public void visiter(Crevette crevette) {
		// est sans gluten
	}

	public void visiter(Fromage fromage) {
		// est sans gluten
	}

	public void visiter(Oignon oignon) {
		// est sans gluten
	}

	public void visiter(Pain Pain) {
		estSansGluten = false;

	}

	public void visiter(Salade salade) {
		// TODO Auto-generated method stub

	}

	public void visiter(Sauce Sauce) {
		// est sans gluten
	}

	public void visiter(Thon thon) {
		// est sans gluten
	}

	public void visiter(Tomate tomate) {
		// est sans gluten
	}

	public void visiter(GaletteDeSarrasin galetteDeSarrasin) {
		// est sans gluten
	}

	public boolean estSansGluten() {
		return this.estSansGluten;
	}

}
