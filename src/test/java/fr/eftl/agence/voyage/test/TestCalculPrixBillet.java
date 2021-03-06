package fr.eftl.agence.voyage.test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;


import fr.eftl.agence.voyages.prix.CalculPrixBillet;
import fr.eftl.agence.voyages.prix.CalculPrixUnitaire;

public class TestCalculPrixBillet {
		
	
		@Test
		public void prixBilletclasseEco() {
			CalculPrixBillet prixBillet = new CalculPrixBillet();
			
			//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
			CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
			Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
			
			
			prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
			
			
			
			Integer prixObtenu =prixBillet.calculer("Paris", "Londres", "eco");
			Assert.assertEquals(200, prixObtenu ,0);
		}
		
		@Test
		public void prixBilletclassePre() {
			CalculPrixBillet prixBillet = new CalculPrixBillet();
			
			//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
			CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
			Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
			
			
			prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
			
			
			
			Integer prixObtenu =prixBillet.calculer("Paris", "Londres", "pre");
			Assert.assertEquals(400, prixObtenu ,0);
		}
		
		@Test
		public void prixBilletclasseBus() {
			CalculPrixBillet prixBillet = new CalculPrixBillet();
			
			//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
			CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
			Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
			
			
			prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
			
			
			
			Integer prixObtenu =prixBillet.calculer("Paris", "Londres", "bus");
			Assert.assertEquals(700, prixObtenu ,0);
		}
		
		@Test
		public void prixBilletclasseSC() {
			CalculPrixBillet prixBillet = new CalculPrixBillet();
			
			//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
			CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
			Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
			
			
			prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
			
			
			
			Integer prixObtenu =prixBillet.calculer("Paris", "Londres", "");
			Assert.assertEquals(200, prixObtenu ,0);
		}
}
