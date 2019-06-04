
public class Vehicule {

	protected String model;
	protected int year;
	protected float price;
	protected String regNumber;
	protected char drivelic;

	public Vehicule(String model, int year, float price, String regNumber, char drivelic) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
		this.regNumber = regNumber;
		this.drivelic = drivelic;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public char getDrivelic() {
		return drivelic;
	}

	public void setDrivelic(char drivelic) {
		this.drivelic = drivelic;
	}

	public int age() {
		int age = 2019 - this.year;
		return age;
	}
	// METHODE AFFICHER VEHICULE

	public void afficherVehicule() {
		System.out.println("modèle :" + this.model + "| année de fabrication : " + this.year + " |prix : " + this.price
				+ "€| numéro d'immatriculation : " + this.regNumber + "| type de permis requis : " + this.drivelic);

	}
	// methode calcul du coût de location

	public float coutLocation() {
		float coutloc;
		if (age() < 1) {
			coutloc = this.price / 200.0f;
		}
		coutloc = this.price / 250.0f;
		return coutloc;
	}

}
