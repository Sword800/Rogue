package Joran_Maxime_Joseph.Projet_Rogue;

public abstract class Creature {
	
	private String nom;
	public int x;
	public int y;
	private int pv;
	private int degat;
	public String symbole;
	
	public Creature(String nom,int x,int y,int nb_actions,int pv,int degat)
	{
		this.nom=nom;
		this.x=x;
		this.y=y;
		this.pv=pv;
		this.degat=degat;	
		this.symbole = "@";
	}
}