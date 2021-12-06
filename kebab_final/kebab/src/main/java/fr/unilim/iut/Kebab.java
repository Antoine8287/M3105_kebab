package fr.unilim.iut;

import java.util.List;

import fr.unilim.iut.ingredients.Ingredient;
import fr.unilim.iut.visiteur.*;

public class Kebab {
	
	private List<Ingredient> ingredients;
	
	public Kebab(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public List<Ingredient> listerLesIngredients() {
		return this.ingredients;
	}
	
	public boolean estVegetarien() {
		VisiteurVegetarien visiteurVegetarien = new VisiteurVegetarien();
		for (Ingredient ingredient : ingredients) {
			ingredient.accepter(visiteurVegetarien);
		}
		return visiteurVegetarien.estVegetarien();
	}

	public boolean estPescetarien() {
		VisiteurPescetarien visiteurPescetarien = new VisiteurPescetarien();
		for (Ingredient ingredient : ingredients) {
			ingredient.accepter(visiteurPescetarien);
		}
		return visiteurPescetarien.estPescetarien();
	}

	public boolean estSansGluten() {
		VisiteurSansGluten visiteurSansGluten = new VisiteurSansGluten();
		for (Ingredient ingredient : ingredients) {
			ingredient.accepter(visiteurSansGluten);
		}
		return visiteurSansGluten.estSansGluten();
	}

}
