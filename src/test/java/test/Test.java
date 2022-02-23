package test;

import java.util.Scanner;

import metier.Boutique;
import metier.Console;
import metier.Jeu;

public class Test {

	public static String saisieString(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		String saisie= sc.nextLine();
		return saisie;
	}

	public static double saisieDouble(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		double saisie= sc.nextDouble();
		return saisie;
	}

	public static int saisieInt(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int saisie= sc.nextInt();
		return saisie;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Console c1 = new Console ("Switch");
		Console c2 = new Console ("Ps5");
		Jeu j1 = new Jeu ("MarioKart",c1);
		Jeu j2 = new Jeu ("Fifa",c2);
		Jeu j3 = new Jeu ("Pso2",c2);
		Jeu j4 = new Jeu ("Dmc",c2);
		Jeu j5 = new Jeu ("Fornite",c1);
		Boutique b = new Boutique("Badr","Paris 75006");
		
	}

}
