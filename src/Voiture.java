
public class Voiture extends Vehicule {

	protected boolean carstereo;

	public Voiture(String model, int year, float price, String regNumber, char drivelic, boolean carstereo) {
		super(model, year, price, regNumber, drivelic);
		this.carstereo = carstereo;
	}

	public Boolean getCarstereo() {
		return carstereo;
	}

	public void setCarstereo(Boolean carstereo) {
		this.carstereo = carstereo;
	}

// METHODE AJOUTER autoradio
	public void ajouterAutoradio() {
		this.carstereo = true;
	}

// METHODE enlever autoradio
	public void enleverAutoradio() {
		this.carstereo = false;
	}

// METHODE AFFICHER VOITURE

	public void afficherVoiture() {
		System.out.println("modèle :" + this.model + "| année de fabrication : " + this.year + " |prix : " + this.price
				+ "€| numéro d'immatriculation : " + this.regNumber + "| type de permis requis : " + this.drivelic
				+ "|presence de radio :" + this.carstereo);

	}
}
