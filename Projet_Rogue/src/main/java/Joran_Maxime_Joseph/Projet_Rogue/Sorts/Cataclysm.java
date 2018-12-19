package Joran_Maxime_Joseph.Projet_Rogue.Sorts;

import Joran_Maxime_Joseph.Projet_Rogue.Terrain;
import Joran_Maxime_Joseph.Projet_Rogue.Exception.ExceptionNotEnoughMana;

/**
 * Cataclysme est une classe qui permet de lancer un sort qui touche tous les ennemis sur le terrain
 * 
 * @author Joran_Maxime_Joseph
 * @version 1.0
 */

public class Cataclysm extends Sort{
	/**
	 * Constructeur Cataclysm
	 */
	public Cataclysm()
	{
		super();
	}
	/**
	 * Constructeur Cataclysme avec parametre
	 * @param nom qui représente le nom du sort
	 * @param Cout qui représente le cout du sort
	 */
	public Cataclysm(String nom,int Cout)
	{
		super(nom,Cout);
	}
	
	@Override
	public void Effet(Terrain t) throws ExceptionNotEnoughMana{
		if(t.getPersonnage().getMana() < this.getCout())
			throw new ExceptionNotEnoughMana();
		t.getPersonnage().setMana(t.getPersonnage().getMana()-this.getCout());
		for(int i = 0;i< t.getEnnemis().size();i++) {
			t.getEnnemis().get(i).setPv(t.getEnnemis().get(i).getPv() - 10);
		}
		System.out.println("Le cataclysm se déchaine ! Tout les ennemis perdent 10Pv");		
	}
}
