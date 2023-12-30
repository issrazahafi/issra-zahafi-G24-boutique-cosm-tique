
public class test {
	public static void main(String[]args) {
		boutique boutique = new boutiquecosmetique(1, 101, 201, "john" , "Doe" , "Paris");
		System.out.println(boutique);
		boutique.adapterProduitClient();
		boutique.collaborerLivraison();
	}

}
