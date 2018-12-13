package Joran_Maxime_Joseph.Projet_Rogue;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestTerrain {

	@Test
	public void TestInstanceTerrain() 
	{
		Joueur j = new Joueur("Jojo", 5, 5, 1, 10, 5, 1, 0);
		Epee epee = new Epee("Excaliburne", "t", 10, 8, 8);
		ArrayList<Creature> ennemis = new ArrayList<Creature>();
		
		Terrain t= new Terrain(10, j, ennemis,epee);
		
		assertNotNull(t);
	}
	
	@Test
	public void TestDeplacerPersonnageHaut() throws ExceptionDeplacementIllegal,ExceptionMarcheSurObjet
	{
		Joueur j = new Joueur("Jojo", 5, 5, 1, 10, 5, 1, 0);
		Epee epee = new Epee("Excaliburne", "t", 10, 8, 8);
		ArrayList<Creature> ennemis = new ArrayList<Creature>();
		
		Terrain t= new Terrain(10, j, ennemis,epee);
		
		t.deplacerPersonnage(Actions.HAUT);
		assertEquals(4,j.x);
	}
	
	@Test
	public void TestDeplacerPersonnageBas() throws ExceptionDeplacementIllegal,ExceptionMarcheSurObjet
	{
		Joueur j = new Joueur("Jojo", 5, 5, 1, 10, 5, 1, 0);
		Epee epee = new Epee("Excaliburne", "t", 10, 8, 8);
		ArrayList<Creature> ennemis = new ArrayList<Creature>();
		
		Terrain t= new Terrain(10, j, ennemis,epee);
		
		t.deplacerPersonnage(Actions.BAS);
		assertEquals(6,j.x);

	}
	
	@Test
	public void TestDeplacerPersonnageGauche() throws ExceptionDeplacementIllegal,ExceptionMarcheSurObjet
	{
		Joueur j = new Joueur("Jojo", 5, 5, 1, 10, 5, 1, 0);
		Epee epee = new Epee("Excaliburne", "t", 10, 8, 8);
		ArrayList<Creature> ennemis = new ArrayList<Creature>();
		
		Terrain t= new Terrain(10, j, ennemis,epee);
		
		t.deplacerPersonnage(Actions.GAUCHE);
		assertEquals(4,j.y);

	}
	
	@Test
	public void TestDeplacerPersonnageDroite() throws ExceptionDeplacementIllegal,ExceptionMarcheSurObjet
	{
		Joueur j = new Joueur("Jojo", 5, 5, 1, 10, 5, 1, 0);
		Epee epee = new Epee("Excaliburne", "t", 10, 8, 8);
		ArrayList<Creature> ennemis = new ArrayList<Creature>();
		
		Terrain t= new Terrain(10, j, ennemis,epee);
		
		t.deplacerPersonnage(Actions.DROITE);
		assertEquals(6,j.y);

		
	}

}
