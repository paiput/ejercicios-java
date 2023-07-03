
public class Programa {

	private String nombre;
	private int hilos;
	private float frecuencia, ram, vram, almacenamiento;

	public Programa(String nombre, String hilos, String frecuencia, String ram, String vram, String almacenamiento) {
		this.nombre = nombre;
		this.hilos = Integer.parseInt(hilos);
		this.ram = Float.parseFloat(ram);
		this.vram = Float.parseFloat(vram);
		this.almacenamiento = Float.parseFloat(almacenamiento);
		this.frecuencia = Float.parseFloat(frecuencia);		
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getHilos() {
		return hilos;
	}
	
	public float getFrecuencia() {
		return frecuencia;
	}
	
	public float getRam() {
		return ram;
	}
	
	public float getVram() {
		return vram;
	}
	
	public float getAlmacenamiento() {
		return almacenamiento;
	}
}
