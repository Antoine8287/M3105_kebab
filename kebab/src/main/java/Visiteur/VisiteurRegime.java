package Visiteur;

import kebab.ingredient.Agneau;
import kebab.ingredient.Crevette;
import kebab.ingredient.Fromage;
import kebab.ingredient.Oignon;
import kebab.ingredient.Pain;
import kebab.ingredient.Salade;
import kebab.ingredient.Sauce;
import kebab.ingredient.Thon;
import kebab.ingredient.Tomate;

public interface VisiteurRegime {

	public void visiter(Agneau agneau);
	public void visiter(Crevette crevette);
	void visiter(Thon thon);
	void visiter(Fromage fromage);
	void visiter(Oignon oignon);
	void visiter(Pain pain);
	void visiter(Salade salade);
	void visiter(Sauce sauce);
	void visiter(Tomate tomate);

}
