package com.microservicios.parejo.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limites-servicio")
public class Configuration {

	private int minimo;
	private int maximo;
	private String nombre;
	private boolean sino;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMinimo() {
		return minimo;
	}
	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}
	public int getMaximo() {
		return maximo;
	}
	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}
	
	public boolean isSino() {
		return sino;
	}
	public void setSino(boolean sino) {
		this.sino = sino;
	}
	
}
