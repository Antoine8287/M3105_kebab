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

public class VisiteurPescetarien implements VisiteurRegime {
	private boolean estPescetarien=true;
	
    @Override
    public void visiter(Agneau agneau) {
    	estPescetarien=false;
    }

    @Override
    public void visiter(Crevette crevette) {
    	estPescetarien=false;
        
    }

	@Override
    public void visiter(Fromage fromage) {
		estPescetarien=false;    
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
    	estPescetarien=false;
    }

	@Override
    public void visiter(Tomate tomate) {
        //est vegetarien    
    }
    
    public boolean estPescetarien() {
        return this.estPescetarien();
    }
    
    public accepter(visiteurVegetarien) {
    	
    }

}
