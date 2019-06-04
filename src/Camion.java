
public class Camion extends Vehicule {
	protected float storagevol;

	public Camion(String model, int year, float price, String regNumber, char drivelic, float storagevol) {
		super(model, year, price, regNumber, drivelic);
		this.storagevol = storagevol;
		// TODO Auto-generated constructor stub
	}

	public float getStoragevol() {
		return storagevol;
	}

	public void setStoragevol(float storagevol) {
		this.storagevol = storagevol;
	}

	public boolean peutTransporterVolume(int volume) {
		if (volume > this.storagevol) {
			return false;
		}
		return true;

	}
	// METHODE AFFICHER CAMION

	public void afficherCamion() {
		System.out.println("modèle :" + this.model + "| année de fabrication : " + this.year + " |prix : " + this.price
				+ "€| numéro d'immatriculation : " + this.regNumber + "| type de permis requis : " + this.drivelic
				+ "| capacité de stockage : " + this.storagevol + " m3");
	}
}