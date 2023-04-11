package died.guia04;

public class App {

	public static void main(String[] args) {
		byte a[] = { 2, 4, 5, 8, 6, 4 };
		Apuesta ap1 = new Apuesta("pedro", a);
		byte a2[] = { 7, 9, 8, 2, 4, 3 };
		Apuesta ap2 = new Apuesta("luis", a2);
		byte a3[] = { 5, 4, 2, 3, 5, 14 };
		Apuesta ap3 = new Apuesta("lucas", a3);
		byte a4[] = { 12, 14, 15, 18, 16, 41 };
		Apuesta ap4 = new Apuesta("juan", a4);

		// for(byte unNumero : ap1.getNros()) {
		// System.out.println(unNumero);
		// }

		Sorteo sorteo1 = new Sorteo();
		sorteo1.setApuestas(ap1);
		sorteo1.setApuestas(ap2);
		sorteo1.setApuestas(ap3);
		sorteo1.setApuestas(ap4);

		// compruebo que se haya cargado bien las apuestas con la funcion setApuestas
//		for(Apuesta unNumero : sorteo1.getApuestas()) {
//			for(byte nros : unNumero.getNros()) {
//			System.out.print(nros + " ");
//		}
//			System.out.println("");
//		}

		// Realizamos el sorteo

		sorteo1.generarSorteo();

		sorteo1.calcularGanadores();

		System.out.print("Los nros del sorteo son: ");

		for (byte unNumero : sorteo1.getSorteo()) {
			System.out.print(unNumero + ", ");
		}

		System.out.println("");
		sorteo1.leerGanadores();

		// for(Apuesta unNumero : sorteo1.getGanadores()) {

		// for(byte unNro : unNumero.getNros()) {

		// System.out.println(unNro);

		// }

		// }

	}
}
