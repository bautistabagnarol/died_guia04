package died.guia04;

import java.util.Arrays;

public class Apuesta {

	private String nombre;
	// byte[] Arreglo;
	private byte nros[];
	private int cantidadAciertos;

	public Apuesta(String nombre, byte nrosAjugar[]) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.nros = Arrays.copyOf(nrosAjugar, nrosAjugar.length);
		this.cantidadAciertos = 0;
	}

	public int calcularAcierto(byte[] nrosSalidos) {
		int contador = 0;
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 6; k++) {

				if (nros[i] == nrosSalidos[k]) {
					contador++;
				}
			}
		}
		cantidadAciertos = contador;
		return contador;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getCantidadAciertos() {
		return this.cantidadAciertos;
	}

	public byte[] getNros() {
		return nros;

	}

}
