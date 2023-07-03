import java.util.Scanner;

public class Principal {
	static int opc;
	static Scanner s = new Scanner(System.in);
	static Computadora[] computadoras;
	static Programa[] programas;
	static boolean fin = false;

	public static void main(String[] args) {
		Cargador cargador = new Cargador();
		
		computadoras = cargador.cargarComputadoras();
		programas = cargador.cargarProgramas();
		
		System.out.println("Tienda de computación");
		do {
			mostrarMenu();
			generarAccion();
		} while (!fin);
	}
	
	public static void generarAccion() {
		switch (opc) {
		case 1:
			System.out.println("-- Computadora más económica --");
			mostrarComputadoraMasEconomica();
			break;
		case 2:
			System.out.println("-- Computadora más cara --");
			mostrarComputadoraMasCara();
			break;
		case 3:
			mostrarPosibleComputadora();
			break;
		case 4:
			mostrarProgramasAptos();
			break;
		case 5:
			fin = true;
			System.out.println("Gracias por su visita");
			break;
		}
	}
	
	public static void mostrarMenu() {
		System.out.println("----- MENÚ -----");
		System.out.println(" 1 -> Mostrar computadora más económica");
		System.out.println(" 2 -> Mostrar computadora más cara");
		System.out.println(" 3 -> Solicitar recomendación");
		System.out.println(" 4 -> Mostrar programas que puedo correr");
		System.out.println(" 5 -> Salir");
		System.out.println("Ingrese código de operación:");
		opc = Utiles.ingresarEntero(s, 1, 5);
	}
	
	public static void mostrarComputadoras() {
		for (int i=0; i<computadoras.length; i++) {
			System.out.println((i+1) + " - " + computadoras[i].mostrarDatosReducidos());
		}
	}
	
	public static void mostrarProgramas() {
		for (int i=0; i<programas.length; i++) {
			System.out.println((i+1) + " - " + programas[i].getNombre());
		}
	}
	
	public static boolean sonCompatibles(Computadora compu, Programa programa) {
		boolean compatibles = false;
		if (
			compu.getHilos() >= programa.getHilos() &&
			compu.getFrecuencia() >= programa.getFrecuencia() &&
			(float)compu.getRam() >= programa.getRam() &&
			(float)compu.getVram() >= programa.getVram() && 
			(float)compu.getAlmacenamiento() >= programa.getAlmacenamiento()
		) {
			compatibles = true;
		}
		return compatibles;
	}
	
	public static void ordenarPorGanancia(Computadora[] compus, int cant) {	
		for (int i=0; i<cant-1; i++) {
            for (int j=0; j<cant-i-1; j++) {
                if (compus[j].getGanancia() < compus[j + 1].getGanancia()) {
                    Computadora temp = compus[j];
                    compus[j] = compus[j + 1];
                    compus[j + 1] = temp;
                }
            }
        }
	}
	
	public static void mostrarComputadoraMasEconomica() {
		Computadora compuMasBarata = computadoras[0];
		for (int i=1; i<computadoras.length; i++) {
			if (computadoras[i].getPrecio() < compuMasBarata.getPrecio()) {
				compuMasBarata = computadoras[i];
			}
		}
		compuMasBarata.mostrarDatos();
	}
	
	public static void mostrarComputadoraMasCara() {
		Computadora compuMasCara = computadoras[0];
		for (int i=1; i<computadoras.length; i++) {
			if (computadoras[i].getPrecio() > compuMasCara.getPrecio()) {
				compuMasCara = computadoras[i];
			}
		}
		compuMasCara.mostrarDatos();
	}
	
	/* Funcion para recomendar notebook en base a varios programas
	 * 
	 * public static void mostrarPosibleComputadora() {
		Programa[] programasSeleccionados = new Programa[programas.length];
		System.out.println("Seleccione el programa que desea instalar para poder recomendarle una computadora:");
		mostrarProgramas();
		int seguir = 1, contador = 0, indice;
		do {
			System.out.print("Ingrese el número de programa: ");
			indice = Utiles.ingresarEntero(s, 1, programas.length);
			programasSeleccionados[contador] = programas[indice-1];
			System.out.print("Desea agregar otro programa? (0=no 1=si): ");
			seguir = Utiles.ingresarEntero(s, 0, 1);
		} while (seguir == 1 && contador < 30);
		
	}*/
	
	public static void mostrarPosibleComputadora() {
		System.out.println("Seleccione el programa que desea instalar para poder recomendarle una computadora:");
		mostrarProgramas();
		System.out.print("Ingrese el número de programa: ");
		int indice = Utiles.ingresarEntero(s, 1, programas.length);
		Programa programaSeleccionado = programas[indice-1];
		Computadora[] compusRecomendadas = new Computadora[computadoras.length];
		int cont = 0;
		for (int i=0; i<computadoras.length; i++) {
			if (sonCompatibles(computadoras[i], programaSeleccionado)) {
				compusRecomendadas[cont++] = computadoras[i];
			}
		}
		ordenarPorGanancia(compusRecomendadas, cont);
		System.out.println("Le recomendamos las siguientes computadoras");
		for (int i=0; i<cont; i++) {
			System.out.println((i+1) + " - " + compusRecomendadas[i].mostrarDatosReducidos());
		}
	}

	public static void mostrarProgramasAptos() {
		Computadora compuSeleccionada;
		System.out.println("Seleccione una computadora de la lista para saber que programas puede correr:");
		mostrarComputadoras();
		System.out.print("Seleccione el numero de computadora:");
		int indice = Utiles.ingresarEntero(s, 1, computadoras.length);
		compuSeleccionada = computadoras[indice-1];
		System.out.println("Puede correr los siguientes programas:");
		for (int i=0; i<programas.length; i++) {
			if (sonCompatibles(compuSeleccionada, programas[i])) {
				System.out.println((i+1) + " - " + programas[i].getNombre());
			}
		}
	}
}
