package Joran_Maxime_Joseph.Projet_Rogue;

import static org.junit.Assert.*;

import org.junit.Test;

import Joran_Maxime_Joseph.Projet_Rogue.Objet.Bouclier;

public class TestBouclier {

	@Test
	public void TestInstanceBouclier() 
	{
		Bouclier b= new Bouclier("boubou","B",10,3,3);
				
		assertNotNull(b);
	}

}
