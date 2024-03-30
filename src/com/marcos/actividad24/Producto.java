package com.marcos.actividad24;

public class Producto {
	String nombre;
	Transporte transportista;
	
	public Producto(String nombre, Transporte transportista) {
		this.nombre = nombre;
		this.transportista = transportista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Transporte getTransportista() {
		return transportista;
	}

	public void setTransportista(Transporte transportista) {
		this.transportista = transportista;
	}
	
}