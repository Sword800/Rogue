package Joran_Maxime_Joseph.Projet_Rogue;

import Joran_Maxime_Joseph.Projet_Rogue.Creature.Joueur;
import Joran_Maxime_Joseph.Projet_Rogue.Exception.ExceptionAbsenceDeSauvegarde;
import Joran_Maxime_Joseph.Projet_Rogue.Menu.CreerPersonnage;
import Joran_Maxime_Joseph.Projet_Rogue.Menu.LoadMenu;
import Joran_Maxime_Joseph.Projet_Rogue.Menu.StartMenu;

public class App 
{
    public static void main( String[] args )
    {
        StartMenu menu = new StartMenu();
        if(menu.entree.equalsIgnoreCase("n")) {
            Joueur j = new CreerPersonnage().Creation();
            Saisie saisie = new Saisie(j);
            saisie.jouer();
        }
        else {
            try {
                LoadMenu loader = new LoadMenu();
                Terrain t = loader.load();
                Saisie saisie = new Saisie(t);
                saisie.jouer();
            }
            catch (ExceptionAbsenceDeSauvegarde e){
                System.out.println(e.getMessage());
                Joueur j = new CreerPersonnage().Creation();
                Saisie saisie = new Saisie(j);
                saisie.jouer();
            }
        }
    }
}