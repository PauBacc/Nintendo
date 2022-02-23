package test;

import java.time.LocalDate;
import java.util.Scanner;
import metier.*;


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
		
		Console c1 = new Hybride ("Switch", 250.0, LocalDate.parse("2017-03-17"));
		Console c2 = new Salon ("Ps5", 1000.0, LocalDate.parse("2020-11-19"));
		Jeu j1 = new Jeu ("MarioKart",c1);
		Jeu j2 = new Jeu ("Fifa",c2);
		Jeu j3 = new Jeu ("Pso2",c2);
		Jeu j4 = new Jeu ("Dmc",c2);
		Jeu j5 = new Jeu ("Fornite",c1);
		Boutique b = new Boutique("Badr","Paris 75006");
		
	}

}
