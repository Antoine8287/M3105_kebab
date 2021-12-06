package fr.unilim.iut;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import static fr.unilim.iut.helper.Kebabier.unKebab;
import fr.unilim.iut.ingredients.*;

public class KebabTest {

	private static final Sauce SAUCE = new Sauce();
	private static final Pain PAIN = new Pain();
	private static final Agneau AGNEAU = new Agneau();
	private static final Oignon OIGNON = new Oignon();
	private static final Tomate TOMATE = new Tomate();
	private static final Salade SALADE = new Salade();
	private static final Thon THON = new Thon();
	private static final Fromage FROMAGE = new Fromage();
	private static final Crevette CREVETTE = new Crevette();
	private static final GaletteDeSarrasin GALETTE= new GaletteDeSarrasin();
	
	Kebab kebabAgneau;
	Kebab kebabVegetarien;
	Kebab kebabThon;
	Kebab kebabCrevette;
	Kebab kebabGalette;

	@Before
	public void confectionnerLesKebabs() {
		kebabAgneau = unKebab()
				.avec(SALADE)
				.avec(TOMATE)
				.avec(OIGNON)
				.avec(AGNEAU)
				.avec(PAIN)
				.avec(SAUCE)
				.preparerLeKebab();
		
		kebabVegetarien = unKebab()
				.avec(SALADE)
				.avec(TOMATE)
				.avec(OIGNON)
				.avec(PAIN)
				.avec(SAUCE)
				.preparerLeKebab();
		
		kebabThon = unKebab()
				.avec(THON)
				.avec(FROMAGE)
				.avec(SALADE)
				.avec(TOMATE)
				.avec(OIGNON)
				.avec(PAIN)
				.avec(SAUCE)
				.preparerLeKebab();
		
		kebabCrevette = unKebab()
				.avec(CREVETTE)
				.avec(SALADE)
				.avec(TOMATE)
				.avec(OIGNON)
				.avec(PAIN)
				.avec(SAUCE)
				.preparerLeKebab();
		
		kebabGalette = unKebab()
				.avec(SALADE)
				.avec(TOMATE)
				.avec(OIGNON)
				.avec(GALETTE)
				.avec(SAUCE)
				.preparerLeKebab();
	}

	@Test
	public void bien_contenir_tout_les_ingredients_ajoutes_pendant_la_preparation() {
		assertThat(kebabAgneau.listerLesIngredients()).containsExactly(
				SALADE, TOMATE, OIGNON, AGNEAU, PAIN, SAUCE);

		assertThat(kebabVegetarien.listerLesIngredients()).containsExactly(
				SALADE, TOMATE, OIGNON, PAIN, SAUCE);
		
		assertThat(kebabThon.listerLesIngredients()).containsExactly(
				THON, FROMAGE, SALADE, TOMATE, OIGNON, PAIN, SAUCE);
		
		assertThat(kebabCrevette.listerLesIngredients()).containsExactly(
				CREVETTE, SALADE, TOMATE, OIGNON, PAIN, SAUCE);
		
		assertThat(kebabGalette.listerLesIngredients()).containsExactly(
				SALADE, TOMATE, OIGNON, GALETTE, SAUCE);
	}

	@Test
	public void le_kebab_est_vegetarien() {
		assertFalse(kebabAgneau.estVegetarien());
		
		assertTrue(kebabVegetarien.estVegetarien());
		
		assertFalse(kebabCrevette.estVegetarien());
		
		assertFalse(kebabThon.estVegetarien());
	}
	
	@Test
	public void le_kebab_est_pescetarien() {
		assertFalse(kebabAgneau.estPescetarien());
		
		assertTrue(kebabVegetarien.estPescetarien());
		
		assertTrue(kebabCrevette.estPescetarien());
		
		assertTrue(kebabThon.estPescetarien());
	}
	
	@Test
	public void le_kebab_est_sans_gluten() {
		assertFalse(kebabAgneau.estSansGluten());
		
		assertFalse(kebabVegetarien.estSansGluten());
		
		assertFalse(kebabCrevette.estSansGluten());
		
		assertFalse(kebabThon.estSansGluten());
		
		assertTrue(kebabGalette.estSansGluten());
	}

}
