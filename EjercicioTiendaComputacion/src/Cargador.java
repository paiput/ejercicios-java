
public class Cargador {
	private final String[][] datosInicialesComputadoras = {
		// Marca - Modelo - Procesador - Hilos - Frec - RAM - Marca Gráfica - Modelo Graf - VRAM - Cant Almacenamiento - Precio - Ganancia 
		{"Asus","Zenbook UX330", "Athlon 3000G","2","3.5f","1","Gigabyte","Geforce GT1030","1","80","20000","3000"},
		{"Lenovo","Thinkpad x1", "Ryzen 3","4","3.6f","2", "MSI","Geforce GT710","2","500","55000","4000"},
		{"Dell","XPS 13", "Core i5-10400F","6","2.9f","4","Zotac","Geforce GT730","1","240","45000","6000"},
		{"HP","Spectre X360","Ryzen 5 3600","6","3.8f","2","Asus","Geforce GT1030","2","160","35000","4000"},
		{"Acer","Aspire S","Core i5-10600K","6","3.8f","4","MSI","GeForce GT1030","2","500","40000","5000"},
		{"Apple","Macbook pro","Core i7-10700F","8","4.8f","16","MSI","GTX1650","6","1000","150000","25000"},
		{"MSI","GE62VR","Ryzen 5 3600X","6","4.0f","16","Red Dragon","RX580","8","1000","145000","15000"},
		{"Samsung","Notebook 7","Core i7-10700F","8","2.9f","16","Asus","RX6800","16","500","160000","18000"},
		{"Microsoft","Surface book","Core i7-10700K","8","3.8f","32", "Zotac","RTX3080","12","500","250000","23000"},
		{"Toshiba","Satellite 5","Ryzen 7 3700X","8","3.6f","16","Asus","RX570","4","240","120000","16000"},
		{"Lenovo","Thinkpad edge E560","Core i9-10850K","10","3.6f","16","Asus","RTX3070","8","2000","300000","28000"},
		{"Lenovo","Thinkpad carbon","Ryzen 7 5800X","8","3.6f","8","MSI","RTX3060","8","1000","200000","20000"},
		{"Asus","Zenbook 3","Ryzen 9 3900X","12","3.8f","16","Zotac","RTX3060 XLR8","12","2000","260000","26000"},
		{"Asus","Transformer 3 mini","Ryzen 9 5900X","12","3.7f","32","MSI","RX6700","12","3000","180000","12000"},
		{"Asus","PRO B9440","Ryzen 9 3950X","16","3.5f","16","Gigabyte","RX5600","6","1000","160000","15000"},
		{"Asus","N550JV","Ryzen 9 5950X","16","3.4f","8","Gigabyte","RTX3080 Ti","12","2000","420000","45000"},
		{"Dell","Infinity","Core Duo T2400","2","1.83f","2","MSI","550 Pulse","2","80","15000","2000"},
		{"Dell","Alienware","Ryzen Threadripper 3970X","32","4.5f","64","MSI","RX6800","16","4000","230000","22000"},
		{"Dell","XPS 15","Core DUO ULV U2500","2","1.2f","2","AMD","Radeon HD7950","3","160","11000","1500"},
		{"Dell","Latitude E7250","Dual Core Xeon LV 2.0","2","2","1","Nvidia","Geforce GTX580","1.5f","40","10000","900"},
		{"HP","Elitebook x360","Quad Core XEON E5310","4","1.6f","2","AMD","Radeon R7 370","2","80","13000","1000"},
		{"HP","Chromebook","Quad Core Xeon X5355","4","2.67f","4","NVidia","Quadro P1000","4","320","20000","2500"},
		{"Acer","Aspire E", "Core 2 Duo E6400","2","2.13f","2","Nvidia","Geforce GTX750","1","160","18000","2000"},
		{"Acer","Predator", "Intel Core i9-10900X","10","3.7f","16","Nvidia","Tesla C2070","6","6000","480000","50000"},
		{"Acer","Swift", "Core 2 Duo T5270","2","1.4f","4","AMD","Radeon Pro 555X","2","160","14000","3000"},
		{"Apple","Macbook Air","Core 2 Extreme QX6850","4","3","8","AMD","Radeon RX480","8","320","80000","4000"},
		{"MSI","Titan","Core i5-8259U","8","2.3f","8","Nvidia","Geforce GTX480M","4","500","66000","3200"},
		{"MSI","GS60 Ghost Pro","Core i5-8500B","6","3","4","AMD", "FirePro W9000","6","1000","44000","4000"},
		{"MSI","GE72 Apache Pro","Core i5-8265U","8","3.9f","4","AMD","Radeon RX Vega M GL870","4","1000","56000","5000"},
		{"Samsung","Chromebook plus","Core i5-8365U","4","1.6f","8","AMD","Radeon R9 285","2","320","36000","3500"},
		{"Samsung","Notebook 9","Core i7-8700T","6","2.4f","16","Nvidia","Geforce GTX1060","5","500","78000","6000"},
		{"Samsung","ATIV Book 9","Core i7-8559U","4","2.7f","8","AMD","Radeon RX580","4","1000","68000","4000"},
		{"Microsoft","Surface pro 4","Core i9-9900T","16","2.1f","16","AMD","FirePro W9100","16","8000","145000","9000"},
		{"Toshiba","Tecra","Ryzen 3 1100","4","3.2f","8","Nvidia","Quadro M5500","8","2000","95000","7000"},
		{"Toshiba","Satellite","Ryzen 5 1500","6","3.2f","8","Nvidia","Tesla M40","12","3000","120000","10000"},
		{"Toshiba","Kirabook","Core i7-3667U","2","2","4","Nvidia","Geforce GTX780","3","1000","77000","6500"},
		{"HP","Envy 15","Ryzen 3 1200X","4","3.4f","8","AMD","Radeon R9 290","4","1000","88000","7500"},
		{"HP","Pavilion","Core i5-3610ME","2","2.7f","8","Nvidia","Quadro P3200","6","500","91000","8000"},
		{"Dell","Resistencia","Core i5-3570T","4","2.3f","16","Nvidia","Geforce GTX880M","16","1000","65000","5000"},
		{"Dell","Inspiron 300","Ryzen 5 1400X","4","3.5f","8","AMD","Radeon R9 Nano","4","1000","80000","6000"},
		{"Dell","Inspiron 500","Core i3-3217UE","2","1.6f","4","AMD","Radeon RX5500","4","500","40000","4000"},
		{"Apple","Mac mini", "Core i7-8709G","4","3.1f","4","Nvidia","Geforce GTX Titan","6","1000","160000","18000"},
		{"Apple","IMac","Core i7-8809G","8","4.2f","8","Nvidia","Quadro P4000","16","2000","280000","26000"},
		{"Apple","IMac PRO","Core i9-10980XE","36","3","128","Nvidia", "Quadro RTX 8000","48","8000","680000","95000"},
		{"Samsung","Flash","Ryzen 7 1700X","8","3.4f","8","Nvidia","Geforce GTX970","4","2000","150000","18000"},
		{"Samsung","Odyssey", "Ryzen 7 1800X","16","3.6f","16","Nvidia","Titan Pascal","12","1000","240000","23000"},
		{"Acer","Spin","Core i5-1030G4","4","0.7f","4","Nvidia","Geforce GTX1060","6","2000","60000","8000"},
		{"Acer","Verizon","Core i5-1038NG7","4","2","4","Nvidia","Grid M60-1Q","1","80","42000","7000"},
		{"Acer","Veriton", "Core i5-1035G1","4","1","2","Nvidia","Geforce GTX480","1.5f","40","25000","4000"},
		{"Acer","TravelMate B", "Core i5-10300H","4","2.5f","1","Nvidia","Geforce GTX660","2","160","27000","4500"},
		{"Acer","TravelMate P", "Core i5-10400H","8","2.6f","4","AMD","Radeon 6970M","4","320","32000","5000"},
		{"Aurora","Alienware", "Ryzen 7 1800X","16","3.6f","8","AMD","Radeon Pro 580X","8","2000","77000","7000"},
		{"Dell","Inspiron One 2320","Core i5-10600K","6","4.1f","8","Nvidia","Geforce GTX780","3","320","55000","5000"},
		{"Dell","XPS One 27 Touch","Core i5-10400F","6","2.9f","4","AMD","Radeon RX580","8","500","68000","8000"},
		{"Gateway","Compact Desktop","Core i3-1005G1","2","1.2f","4","AMD","Radeon R9 290X","4","500","52000","7000"},
		{"Gateway","ZX4300-01e","Core i3-10110Y","2","1","2","Nvidia","Geforce GTX775M","4","240","27000","2000"},
		{"HP","500B E6500", "Core i3-10100TE","4","2.3f","1","Nvidia", "Grid M60-1Q","1","80","22000","3000"},
		{"HP","Omni 220 Quad","Core i3-10100E","4","3.2f","4","AMD","Radeon RX5300M","3","160","25000","2500"},
		{"HP", "Omni 27","Core i9-9880H","8","2.3f","32","Nvidia","Quadro RTX6000","24","4000","280000","3000"},
		{"HP","Touchsmart 600", "Core i9-9900","8","3.1f","64","Nvidia","Geforce RTX3090","24","8000","370000","45000"},
		{"HP","Touchsmart 9300 Elite","Core i7-8700B","6","3.2f","8","Nvidia","Geforce GTX1070","8","6000","87000","8000"},
		{"Lenovo","Ideacentre A720", "Core i5-4800H","4","2.5f","8","Nvidia","Quadro M6000","12","2000","65000","5000"},
		{"Lenovo","IdeaCentre B320","Core i5-8400","6","2.8f","16","Nvidia","Geforce GTX TITAN Z","6","1000","60000","4500"},
		{"Lenovo","IdeaCentre C315","Core i3-8145U","2","2.1f","2","Nvidia","Geforce GTX 780Ti","3","500","23000","3000"},
		{"Lenovo","Thinkcentre Edge 91z","Core i3-8100B","4","3.6f","4","AMD","sRadeon R9 280X","3","240","18000","3000"},
		{"Sony","VAIO Serie L","Core i3-9100TE","4","3.1f","2","Nvidia","Geforce GTX670","2","160","16000","2500"},
		{"Sony","VAIO VPCJ114","Core i3-8100","4","3.6f","2","AMD","Radeon R9 M395","2","40","12000","2000"}
	};
	private final String[][] datosInicialesProgramas = {
		//Nombre del programa - Hilos del procesador - Frecuencia - RAM - VRAM - Almacenamiento
		{"Microsoft Flight Simulator 2020","16","3.6f","32","16","150"},
		{"Cyberpunk 2077","8","3.6f","16","6","70"},
		{"Watch Dogs Legion","6","2.8f","16","6","45"},
		{"Final Fantasy XV: Windows Edition","8","3.5f","16","6","100"},
		{"The Witcher 3","8","3.4f","8","2","40"},
		{"Battlefield 5","4","3.5f","12","6","85"},
		{"Metro Exodus","8","3.5f","8","6","90"},
		{"Crysis 3","4","2.6f","4","1","50"},
		{"Arma 3","4","3.2f","6","2","30"},
		{"Call Of Duty: Black Ops Cold War","12","3.7f","16","8","120"},
		{"Red Dead Redemption 2","8","3.5f","12","6","180"},
		{"Half Life: Alyx","4","2.6f","12","6","95"},
		{"Counter Strike 1.6","1","0.5f","0.256f","0.032f","1"},
		{"AOE: Definitive edition","2","2","4","2","3"},
		{"League of legends","2","2","2","2","15"},
		{"Minecraft","4","3.2f","4","2","4"},
		{"Blender","2","1.6f","8","1","16"},
		{"3Ds Max 2022","4","2.5f","8","4","9"},
		{"Autodesk Maya 2022","8","4","4","4","5"},
		{"Autocad 2022","4","2.5f","16","4","10"},
		{"Photoshop 2021","4","2","8","2","5"},
		{"Adobe Premiere Elements 2021","4","3.6f","32","4","8"},
		{"Adobe After Effects 2020","4","3.6f","32","2","5"},
		{"Avid Pro Tools 2019","8","3.6f","64","1","15"},
		{"Android Studio","2","2.6f","9","2","4"},
		{"Visual Studio .NET","2","1.6f","1","1","10"},
		{"Eclipse","1","1.2f","4","1","0.15f"},
		{"Google Chrome","1","1","0.256f","1","0.6f"},
		{"Microsoft Office","2","1.6f","4","1","1"},
		{"AVG Free","1","1.5f","0.5","1","1.4f"} 
	};
	
	private Computadora[] computadoras;
	private Programa[] programas;

	public Computadora[] cargarComputadoras() {
		computadoras = new Computadora[datosInicialesComputadoras.length];
		for (int i=0; i<datosInicialesComputadoras.length; i++) {
			computadoras[i] = new Computadora(
				datosInicialesComputadoras[i][0], 
				datosInicialesComputadoras[i][1], 
				datosInicialesComputadoras[i][2], 
				datosInicialesComputadoras[i][3], 
				datosInicialesComputadoras[i][4], 
				datosInicialesComputadoras[i][5], 
				datosInicialesComputadoras[i][6], 
				datosInicialesComputadoras[i][7], 
				datosInicialesComputadoras[i][8], 
				datosInicialesComputadoras[i][9], 
				datosInicialesComputadoras[i][10], 
				datosInicialesComputadoras[i][11]
			);
		}
		return computadoras;
	}
	
	public Programa[] cargarProgramas() {
		programas = new Programa[datosInicialesProgramas.length];
		for (int i=0; i<datosInicialesProgramas.length; i++) {
			programas[i] = new Programa(
				datosInicialesProgramas[i][0], 
				datosInicialesProgramas[i][1], 
				datosInicialesProgramas[i][2], 
				datosInicialesProgramas[i][3], 
				datosInicialesProgramas[i][4], 
				datosInicialesProgramas[i][5]
			);
		}
		return programas;
	}
	
}
