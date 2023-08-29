package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV=0;
	
	public TV(Marca marca, boolean estado){
		this.marca=marca;
		this.estado=estado;
		this.canal=1;
		this.precio=500;
		this.volumen=1;
		TV.numTV++;
	}
	public Marca getMarca(){
		return this.marca;
	}
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	public int getCanal() {
		return this.canal;
	}
	public void setCanal(int canal) {
		this.canal=canal;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getVolumen() {
		return this.volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen=volumen;
	}
	public Control getControl() {		
		return this.control;
	}
	public void setControl(Control control) {
		this.control=control;
	}
	public void turnOn() {
		this.estado=true;
					}
	public void turnOff() {
		this.estado=false;
	}
	public boolean getEstado() {
		return this.estado;
	}
	public static int getNumTV(){
		return TV.numTV;
	}
	public void canalUp() {
		if(estado==true && canal>1 && canal<=120) {
			canal++;
		}
	}
	public void canalDown() {
		if(estado==true && canal>11 && canal<=120) {
			canal--;
		}
	}
	public void volumenUp() {
		if(estado==true && volumen>0 && volumen<=7) {
			volumen++;
		}
	}
	public void volumenDown() {
		if(estado==true && volumen>0 && volumen<=7) {
			volumen--;
		}
	}

}