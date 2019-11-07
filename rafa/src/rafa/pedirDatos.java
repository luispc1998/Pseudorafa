package rafa;

import java.util.Scanner;

public class pedirDatos {

	public static void main(String[] args) {
		System.out.println("Holi, welcome to my app");
		Scanner teclado = null;

		try {// Try para poder cerrar con finally el scanner

			teclado = new Scanner(System.in);

			int numero = 0;

			do {
				showOptions();
				String eleccion = teclado.nextLine();
				numero = Integer.parseInt(eleccion);

			} while (numero != 1 && numero != 2 && numero != 3);

			switch (numero) {
			case 1:
				ClaseDummy1[] array = rellenarArrayWeb(teclado);
				printArray(array);

				break;
			case 2:
				ClaseDummy2[] array2 = rellenarArrayMovil(teclado);
				printArray(array2);
				break;

			case 3:
				ClaseDummy3[] array3 = rellenarArrayIot(teclado);
				printArray(array3);
			}
		} finally {
			teclado.close();
		}

	}

	private static <T> void printArray(T[] array) {
		StringBuilder sb = new StringBuilder();

		sb.append("{");
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i].toString());
			if (i < array.length - 1)
				sb.append(",");
		}
		sb.append("}");
		System.out.println(sb.toString());

	}

	private static ClaseDummy1[] rellenarArrayWeb(Scanner teclado) {

		ClaseDummy1[] resultado = new ClaseDummy1[2]; // Creamos el array

		for (int i = 0; i < resultado.length; i++) { // Lo iteramos
			resultado[i] = pedirDatosAppWeb(teclado); // Rellenamos
		}
		return resultado; // Retornar resultado
	}

	private static ClaseDummy1 pedirDatosAppWeb(Scanner teclado) {
		System.out.print("Dame el dato 1: ");
		String campo1 = teclado.nextLine();

		System.out.print("Dame el dato 2: ");
		String campo2 = teclado.nextLine();

		return new ClaseDummy1(campo1, campo2);
	}

	private static void showOptions() {
		System.out.println("Pon 1 para la app web");
		System.out.println("Pon 2 para la app movil");
		System.out.println("Por 3 para la app IoT");
		System.out.print("Opción: ");
	}

	private static ClaseDummy2[] rellenarArrayMovil(Scanner teclado) {
		ClaseDummy2[] resultado = new ClaseDummy2[2]; // Creamos el array

		for (int i = 0; i < resultado.length; i++) { // Lo iteramos
			resultado[i] = pedirDatosAppMovil(teclado); // Rellenamos
		}
		return resultado; // Retornar resultado
	}

	private static ClaseDummy2 pedirDatosAppMovil(Scanner teclado) {

		System.out.print("Dame el dato 1, el boolean: ");
		String campo1 = teclado.nextLine();
		boolean boo = Boolean.valueOf(campo1);

		System.out.print("Dame el dato 2, string: ");
		String campo2 = teclado.nextLine();

		return new ClaseDummy2(boo, campo2);
	}

	private static ClaseDummy3[] rellenarArrayIot(Scanner teclado) {

		ClaseDummy3[] array = new ClaseDummy3[2];

		for (int i = 0; i < array.length; i++) {
			array[i] = pedirDatosIot(teclado);
		}

		return array;
	}

	private static ClaseDummy3 pedirDatosIot(Scanner teclado) {
		System.out.print("Penes: ");
		String campo1 = teclado.nextLine();
		boolean valor1 = Boolean.valueOf(campo1);

		System.out.print("Penes2: ");
		String campo2 = teclado.nextLine();
		boolean valor2 = Boolean.valueOf(campo2);

		System.out.print("Protocolo: ");
		String campo3 = teclado.nextLine();
		Protocolo protocolo = Protocolo.valueOf(campo3);

		return new ClaseDummy3(valor1, valor2, protocolo);
	}

}
