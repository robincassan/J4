
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicule moto = new Vehicule("bmw", 1998, 5000.0f, "BWB0001", 'B');
		Camion J9 = new Camion("J9", 2009, 20000.0f, "987 BCD 75", 'B', 25.0f);
		Voiture twingo = new Voiture("twingo", 2019, 10000.0f, "1234 AZ 49", 'B', true);
		Autocar FRI = new Autocar("FRI", 2005, 90000.0f, "4567WX01", 'D', 3, 53);

		System.out.println(J9.age());
		System.out.println(moto.age());
		System.out.println(twingo.age());
		System.out.println(FRI.age());

		J9.afficherVehicule();
		moto.afficherVehicule();
		twingo.afficherVehicule();
		FRI.afficherVehicule();

		twingo.afficherVoiture();

		System.out.println(J9.peutTransporterVolume(7));
		System.out.println(FRI.peutTransporterVolume(1));

		System.out.println(moto.coutLocation());
		System.out.println(J9.coutLocation());
		System.out.println(twingo.coutLocation());
		System.out.println(FRI.coutLocation());

		System.out.println(FRI.peutTransporterPassagers(40, 0.1f));

		J9.afficherCamion();
		FRI.afficherCamion();

		FRI.afficherAutocar();

	}

}
