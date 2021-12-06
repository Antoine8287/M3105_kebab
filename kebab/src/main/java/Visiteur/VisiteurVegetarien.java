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

public class VisiteurVegetarien implements VisiteurRegime {

    private boolean estVegetarien=true;
    @Override
    public void visiter(Agneau agneau) {
        estVegetarien=false;
    }

    @Override
    public void visiter(Crevette crevette) {
        estVegetarien=false;
        
    }

	@Override
    public void visiter(Fromage fromage) {
        estVegetarien=false;    
    }

	@Override
    public void visiter(Oignon oignon) {
        //est vegetarien
        
    }

	@Override
    public void visiter(Pain pain) {
        //est vegetarien
    }

	@Override
    public void visiter(Salade salade) {
        //est vegetarien
        
    }

	@Override
    public void visiter(Sauce sauce) {
        //est vegetarien
        
    }

    @Override
    public void visiter(Thon thon) {
        estVegetarien=false;
    }

	@Override
    public void visiter(Tomate tomate) {
        //est vegetarien    
    }
    
    public boolean estVegetarien() {
        return this.estVegetarien;
    }

}