package com.marcos.actividad24;

public class Transporte {
	enum Vehiculos {
		COCHE,
		FURGONETA,
		AVION
	}
	
	String nombre;
	Vehiculos vehiculo;

	public Transporte(String nombre, Vehiculos vehiculo) {
		this.nombre = nombre;
		this.vehiculo = vehiculo;
	}
	

	public Vehiculos getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculos vehiculo) {
		this.vehiculo = vehiculo;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}