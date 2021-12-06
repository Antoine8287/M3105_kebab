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

public class VisiteurPescetarien implements VisiteurRegime {

	private boolean estPescetarien = true;

	public void visiter(Agneau agneau) {
		estPescetarien = false;
	}

	public void visiter(Crevette crevette) {
		// est pescetarien
	}

	public void visiter(Fromage fromage) {
		// est pescetarien
	}

	public void visiter(Oignon oignon) {
		// est pescetarien
	}

	public void visiter(Pain Pain) {
		// est pescetarien
	}

	public void visiter(Salade salade) {
		// est pescetarien

	}

	public void visiter(Sauce Sauce) {
		// est pescetarien
	}

	public void visiter(Thon thon) {
		// est pescetarien
	}

	public void visiter(Tomate tomate) {
		// est pescetarien

	}

	public boolean estPescetarien() {
		return this.estPescetarien;
	}

	public void visiter(GaletteDeSarrasin galetteDeSarrasin) {
		// est pescetarien
	}

}
