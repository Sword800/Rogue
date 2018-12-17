package Joran_Maxime_Joseph.Projet_Rogue.Creature;

import java.util.Random;

import Joran_Maxime_Joseph.Projet_Rogue.Actions;
import Joran_Maxime_Joseph.Projet_Rogue.Terrain;
import Joran_Maxime_Joseph.Projet_Rogue.Exception.ExceptionAttaqueImpossible;
import Joran_Maxime_Joseph.Projet_Rogue.Exception.ExceptionDeplacementIllegal;
import Joran_Maxime_Joseph.Projet_Rogue.Exception.ExceptionMarcheSurObjet;
import Joran_Maxime_Joseph.Projet_Rogue.Exception.ExceptionOuvrePorte;

/**
 * Gobelin est une classe qui représente les Gobelins
 * 
 * @author Joran_Maxime_Joseph
 * @version 1.0
 */
public class Gobelin extends Creature {
	
	/**
	 * Constructeur avec attribut
	 * @param nom qui représente le nom du gobelin
	 * @param x qui représente les coordonnées x du gobelin
	 * @param y qui représente les coordonnées y du gobelin
	 * @param nb_actions qui représente le nb_actions du gobelin
	 * @param pv qui représente les pv du gobelin
	 * @param degat qui représente les degats du goblein
	 */
	public Gobelin(String nom,int x,int y,int nb_actions,int pv,int degat)
	{
		super(nom,x,y,nb_actions,pv,degat);
		this.setSymbole("G") ;
	}
	
	@Override
	public void IA(Terrain t) throws ExceptionDeplacementIllegal, ExceptionMarcheSurObjet,ExceptionAttaqueImpossible, ExceptionOuvrePorte{
		
		switch(this.close_to_player(t))
				{
		case(1) : 
				this.attaquer(Actions.BAS, t);
				break;
		case(2) :
				this.attaquer(Actions.HAUT, t);
				break;
		case(3) :
				this.attaquer(Actions.DROITE, t);
				break;
		case(4) :
				this.attaquer(Actions.GAUCHE, t);
				break;
		default : 
		Actions a;
		Random rand = new Random();
		int r = rand.nextInt();
			r = rand.nextInt(4);
			if(r == 0) {
				a = Actions.HAUT;
			}
			else if(r == 1) {
				a = Actions.BAS;
			}
			else if(r == 2) {
				a = Actions.GAUCHE;
			}
			else {
				a = Actions.DROITE;
			}
			a.deplace(this,t);
		
		break;
				}
	}	
}
