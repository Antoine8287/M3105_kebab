package fr.unilim.iut.helper;

import java.util.ArrayList;
import java.util.List;

import fr.unilim.iut.Kebab;
import fr.unilim.iut.ingredients.Ingredient;

public class Kebabier {
	
	List<Ingredient> ingredients;
	
	public Kebabier() {
		this.ingredients = new ArrayList<Ingredient>();
	}

	public Kebabier avec(Ingredient ingredient) {
		this.ingredients.add(ingredient);
		return this;
	}

	public Kebab preparerLeKebab() {
		return new Kebab(this.ingredients);
	}
	
	public static Kebabier unKebab() {
		return new Kebabier();
	}

}
