package metier;

import java.util.List;

public class Client {
	private List<String> listeAchat;

	public Client(List<String> listeAchat) {
		this.listeAchat = listeAchat;
	}
	

	private String nom;
	private String prenom;
	
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
}
