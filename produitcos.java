
public class produitcos {
private String nom;
private String marque;
private double prix;
public produitcos(String nom, String marque,  double prix ) {
	this.nom = nom;
	this.marque = marque;
	this.prix = prix;
}
public String obtenirDetailsProduit() {
	return "nom: " + nom + "\nmarque: " + marque + "\nPrix: " + prix;
}
}
