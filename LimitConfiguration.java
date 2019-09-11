package com.microservicios.parejo.limitsservice;

public class LimitConfiguration {

	private int maximum;
	private int minimum;
	private String nombre;
	private boolean sino;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public LimitConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LimitConfiguration(int maximum, int minimum, String nombre, boolean sino) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
		this.nombre = nombre;
		this.sino = sino;
	}
	public LimitConfiguration(boolean sino) {
		this.sino = sino;
	}
	public boolean isSino() {
		return sino;
	}
	public void setSino(boolean sino) {
		this.sino = sino;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	
	
}
