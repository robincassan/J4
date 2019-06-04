
public class Autocar extends Camion {
	protected float storagevol;
	protected int nbrpass;

	public Autocar(String model, int year, float price, String regNumber, char drivelic, float storagevol,
			int nbrpass) {
		super(model, year, price, regNumber, drivelic, storagevol);
		this.nbrpass = nbrpass;
	}

	public int getNbrpass() {
		return nbrpass;
	}

	public void setNbrpass(int nbrpass) {
		this.nbrpass = nbrpass;
	}

	public boolean peutTransporterPassagers(int nbp, float vmp) {
		if (nbp * vmp > this.storagevol) {
			return false;
		}
		return true;
	}
	// METHODE AFFICHER autocar

	public void afficherAutocar() {
		System.out.println("mod�le :" + this.model + "| ann�e de fabrication : " + this.year + " |prix : " + this.price
				+ "�| num�ro d'immatriculation : " + this.regNumber + "| type de permis requis : " + this.drivelic
				+ "| capacit� de stockage : " + this.storagevol + " m3");
	}
}
