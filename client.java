
public class client {
private String nom;
private String prenom;
private String préférences;
public client(String nom, String prenom, String préférences)	{
this.nom = nom;
this.prenom = prenom;
this.préférences = préférences;

	}
public void selectionnerProduitEnLigne() {
System.out.println("produit selectionner en ligne " + prenom + " " + nom);
}
public void recevoirLivraison() {
	System.out.println("livraison ressue par" + prenom + " " + nom );
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
public String getPréférences() {
	return préférences;
}
public void setPréférences(String préférences) {
	this.préférences = préférences;
}

}
