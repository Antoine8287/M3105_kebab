package kebab;

import java.util.List;

import Visiteur.VisiteurPescetarien;
import Visiteur.VisiteurVegetarien;
import kebab.ingredient.*;

public class Kebab {
    
    private List<Ingredient> ingredients;
    private VisiteurVegetarien visiteurVegetarien;
    private VisiteurPescetarien visiteurPescetarien;

    
    public Kebab(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> listerLesIngredients() {
        return this.ingredients;
    }
    
    public boolean estVegetarien() {
    	for (Ingredient ingredient : ingredients) {
    		ingredient.accepter(visiteurVegetarien);
    	}
		return visiteurVegetarien.estVegetarien();
    }
    
    public boolean estPescetarien() {
    	for (Ingredient ingredient : ingredients) {
    		ingredient.accepter(visiteurPescetarien);
    	}
		return visiteurPescetarien.estPescetarien();
    }

}