package fr.unilim.iut.visiteur;

import fr.unilim.iut.ingredients.*;

public interface VisiteurRegime {
	void visiter(Agneau agneau);
	void visiter(Crevette crevette);
	void visiter(Fromage fromage);
	void visiter(Oignon oignon);
	void visiter(Pain Pain);
	void visiter(Salade salade);
	void visiter(Sauce Sauce);
	void visiter(Thon thon);
	void visiter(Tomate tomate);
	void visiter(GaletteDeSarrasin galetteDeSarrasin);
}
