import java.util.ArrayList;
import java.util.List;
public class boutique {
	private int idProduit;
private int idClient;
private int idLivreur;
private String nom  ;
private String prenom;
private String localisation;

public boutique(int idProduit, int idClient, int idLivreur ,String nom, String prenom, String localisation) {
this.idProduit = idProduit;
this.idClient = idClient;
this.idLivreur = idLivreur;
this.nom = nom;
this.prenom = prenom;
this.localisation = localisation;
}
public void adapterProduitClient() {
	System.out.println("Adapter produit au client");
}
public void collaborerLivraison() {
	System.out.println("Collaborer a la livraison");
}
public String tostring() {
	return"boutique{"+ "idPruduit=" + idProduit + ", idClient=" + idClient + ", idlivreur=" + idLivreur +
			", nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + ", localisation='" + localisation + '\'' + '}';
	
}
}