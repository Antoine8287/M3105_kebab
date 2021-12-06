package kebab;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import kebab.ingredient.Agneau;
import kebab.ingredient.Crevette;
import kebab.ingredient.Fromage;
import kebab.ingredient.GaletteSarrazin;
import kebab.ingredient.Oignon;
import kebab.ingredient.Pain;
import kebab.ingredient.Salade;
import kebab.ingredient.Sauce;
import kebab.ingredient.Thon;
import kebab.ingredient.Tomate;


public class kebabTest {
	
	private static final Sauce SAUCE = new Sauce();
	private static final Pain PAIN = new Pain();
	private static final Agneau AGNEAU = new Agneau();
	private static final Salade SALADE = new Salade();
	private static final Tomate TOMATE = new Tomate();
	private static final Oignon OIGNON = new Oignon();
	private static final Crevette CREVETTE = new Crevette();
	private static final Fromage FROMAGE = new Fromage();
	private static final Thon THON = new Thon();
	private static final GaletteSarrazin GALETTE_SARRAZIN = new GaletteSarrazin();
	
	Kebab kebabAgneau;
	Kebab kebabVegetarien;
	Kebab kebabCrevette;
	Kebab kebabThon;
	
	public void bien_contenir_tous_les_ingredients_ajoutes_pendant_la_preparation() {

        // Kebab Agneau

        kebabAgneau = Kebabier.unKebab()
                .avec(SALADE)
                .avec(TOMATE)
                .avec(OIGNON)
                .avec(AGNEAU)
                .avec(PAIN)
                .avec(SAUCE)
                .preparerLeKebab();

        assertThat(kebabAgneau.listerLesIngredients())
        .containsExactly(SALADE, TOMATE, OIGNON, AGNEAU, PAIN, SAUCE);

        
        // Kebab Végétarien

        kebabVegetarien = Kebabier.unKebab()
                .avec(SALADE)
                .avec(TOMATE)
                .avec(OIGNON)
                .avec(FROMAGE)
                .avec(PAIN)
                .avec(SAUCE)
                .preparerLeKebab();

        assertThat(kebabVegetarien.listerLesIngredients())
        .containsExactly(SALADE, TOMATE, OIGNON, FROMAGE, PAIN, SAUCE);

        
        // Kebab Crevette

        kebabCrevette = Kebabier.unKebab()
                .avec(SALADE)
                .avec(TOMATE)
                .avec(OIGNON)
                .avec(CREVETTE)
                .avec(PAIN)
                .avec(SAUCE)
                .preparerLeKebab();

        assertThat(kebabCrevette.listerLesIngredients())
        .containsExactly(SALADE, TOMATE, OIGNON, CREVETTE, PAIN, SAUCE);

        
        // Kebab Thon

        kebabThon = Kebabier.unKebab()
                .avec(SALADE)
                .avec(TOMATE)
                .avec(OIGNON)
                .avec(THON)
                .avec(PAIN)
                .avec(SAUCE)
                .preparerLeKebab();

        assertThat(kebabThon.listerLesIngredients())
        .containsExactly(SALADE, TOMATE, OIGNON, THON, PAIN, SAUCE);
    }
	
    @Test
    public void kebabVegetarien_vegetarien() {
        assertThat(kebabVegetarien.estVegetarien()).isTrue();
     }

    @Test
    public void kebabAgneau_pas_vegetarien() {
        assertThat(kebabAgneau.estVegetarien()).isFalse();
    }

    @Test
    public void kebabThon_pas_vegetarien() {
        assertThat(kebabThon.estVegetarien()).isFalse();
    }
    
    @Test
    public void kebabCrevette_pas_vegetarien() {
        assertThat(kebabCrevette.estVegetarien()).isFalse();
    }
    
    public void kebabVegetarien_vrai() {
        assertThat(kebabVegetarien.estPescetarien()).isTrue();
     }

    @Test
    public void kebabAgneau_pas_pescetarien() {
        assertThat(kebabAgneau.estPescetarien()).isFalse();
    }

    @Test
    public void kebabThon_pescetarien() {
        assertThat(kebabThon.estPescetarien()).isTrue();
    }
    
    @Test
    public void kebabCrevette_pescetarien() {
        assertThat(kebabCrevette.estPescetarien()).isTrue();
    }
    
}
