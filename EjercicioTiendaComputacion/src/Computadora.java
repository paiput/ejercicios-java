
public class Computadora {

	private String marca, modelo, procesador, marcaGrafica, modeloGrafica;
	private int hilos, ram, almacenamiento, precio, ganancia;
	private float frecuencia, vram;

	//{"Asus","Zenbook UX330", "Athlon 3000G","2","3.5f","1","Gigabyte","Geforce GT1030","1","80","20000","3000"},
	public Computadora(String marca, String modelo, String procesador, String hilos, String frecuencia, String ram, String marcaGrafica, String modeloGrafica, String vram, String almacenamiento, String precio, String ganancia) {
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.hilos = Integer.parseInt(hilos);
		this.frecuencia = Float.parseFloat(frecuencia);
		this.ram = Integer.parseInt(ram);
		this.marcaGrafica = marcaGrafica;
		this.modeloGrafica = modeloGrafica;
		this.vram = Float.parseFloat(vram);
		this.almacenamiento = Integer.parseInt(almacenamiento);
		this.precio = Integer.parseInt(precio);
		this.ganancia = Integer.parseInt(ganancia);
	}
	
	public void mostrarDatos() {
		System.out.println("Especificaciones " + marca + " " + modelo + ": ");
		System.out.println(" - Procesador: " + procesador);
		System.out.println(" - Hilos: " + hilos);
		System.out.println(" - Frecuencia: " + frecuencia + "GHz");
		System.out.println(" - RAM: " + ram + "GB");
		System.out.println(" - Tarjeta gráfica: " + marcaGrafica + " " + modeloGrafica);
		System.out.println(" - VRAM: " + vram + "GB");
		System.out.println(" - Almacenamiento: " + almacenamiento + "GB");
		System.out.println(" - Precio: $" + precio);
		//System.out.println(" - Ganancia: $" + ganancia);
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getHilos() {
		return hilos;
	}
	
	public float getFrecuencia() {
		return frecuencia;
	}
	
	public int getRam() {
		return ram;
	}
	
	public float getVram() {
		return vram;
	}
	
	public int getAlmacenamiento() {
		return almacenamiento;
	}
	
	public int getGanancia() {
		return ganancia;
	}
	
	public String mostrarDatosReducidos() {
		return (marca + " " + modelo + " " + procesador + " " + ram + "GB " + almacenamiento + "GB");
	}

}
