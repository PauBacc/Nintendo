package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Hybride;
import metier.Jeu;
import metier.Salon;


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
		Boutique b1=new Boutique("GameCash","203 rue Saint-Catherine 33000 Bordeaux");
		Boutique b2 = new Boutique("Badr","Paris 75006");
		
		Console c1 = new Hybride ("Switch", 250.0, LocalDate.parse("2017-03-17"));
		Console c2 = new Salon ("Ps5", 1000.0, LocalDate.parse("2020-11-19"));
		Jeu j1 = new Jeu ("MarioKart",c1,b1);
		Jeu j2 = new Jeu ("Fifa",c2,b2);
		Jeu j3 = new Jeu ("Pso2",c2,b1);
		Jeu j4 = new Jeu ("Dmc",c2,b2);
		Jeu j5 = new Jeu ("Fornite",c1,b1);

		
		List<String> l1=new ArrayList();
		List<String> l2=new ArrayList();
		Collections.addAll(l1,"fifa","pso2","fornite");
		Collections.addAll(l2,"Dmc","pso2","Mariokart");
		
		Client client1=new Client(l1);
		Client client2=new Client(l2);
		
	
		j1.setBoutique(b1);
		j2.setBoutique(b1);
		j3.setBoutique(b1);
		j4.setBoutique(b1);
		j5.setBoutique(b1);
	
		

	}

}
