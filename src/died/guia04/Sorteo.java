package died.guia04;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Sorteo {
	private int semana;
	private int anio;
	private ArrayList<Apuesta> Apuestas;
	byte sorteo[] = new byte[6];
	private ArrayList<Apuesta> Ganadores;

	public Sorteo() {
		// TODO Auto-generated constructor stub
		Calendar fecha = new GregorianCalendar();

		// int semanaMes = fecha.get(WeekFields of(fecha.getMonth(), 1).weekOfMonth());
		this.semana = fecha.get(Calendar.WEEK_OF_YEAR);
		this.anio = fecha.get(Calendar.YEAR);
		this.Apuestas = new ArrayList<>();
		this.Ganadores = new ArrayList<>();
	}

	public void setApuestas(Apuesta apuestas) {
		this.Apuestas.add(apuestas);
	}

	public ArrayList<Apuesta> getApuestas() {
		return Apuestas;
	}

	public int getSemana() {
		return semana;
	}

	public int getAnio() {
		return anio;
	}

	public byte[] getSorteo() {
		return sorteo;
	}

	public ArrayList<Apuesta> getGanadores() {
		return this.Ganadores;
	}

	public void generarSorteo() {
		for (int i = 0; i < 6; i++) {
			byte numero = (byte) (Math.random() * 42 + 0);
			this.sorteo[i] = numero;
		}
	}

	public void calcularGanadores() {
		int mayorAcertador = 0;
		int cantidadAcertadores = 0;
		int contador = 0;
		// Primero recorro una vez para ver el max de aciertos
		for (int i = 0; i < Apuestas.size(); i++) {
			if (mayorAcertador < Apuestas.get(i).calcularAcierto(sorteo)) {
				mayorAcertador = Apuestas.get(i).calcularAcierto(sorteo);
			}
		}
		// Segunda vez que recorro busco esos max de aciertos los cuento y los guardo en
		// ganadores
		for (int i = 0; i < Apuestas.size(); i++) {
			if (mayorAcertador == Apuestas.get(i).calcularAcierto(sorteo)) {
				cantidadAcertadores++;
				Ganadores.add(Apuestas.get(i));
			}
		}

	}

	public void leerGanadores() {
		System.out.println("Los nros ganadores son: ");
		System.out.println("{");
		for (Apuesta unNumero : this.getGanadores()) {
			System.out.print(unNumero.getNombre() + "");
			System.out.print("(");

			for (byte unNro : unNumero.getNros()) {

				System.out.print(unNro + ", ");

			}
//			ERROR CON getCantidadAciertos me devuelve siempre 0
			System.out.println(") con " + unNumero.getCantidadAciertos() + " aciertos");

		}
		System.out.print("}");
	}

}
