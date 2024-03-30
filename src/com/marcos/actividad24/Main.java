package com.marcos.actividad24;

import com.marcos.actividad24.Transporte.Vehiculos;

public class Main {

	public static void main(String[] args) {
		Transporte ejemploTransporte = new Transporte("Amazon", Vehiculos.FURGONETA);
		Producto ejemploProducto = new Producto("Portatil", ejemploTransporte);

		String nombreProducto = ejemploProducto.getNombre();
		String nombreTransportista = ejemploTransporte.getNombre();
		Vehiculos vehiculo = ejemploTransporte.getVehiculo();

		System.out.println("Nombre producto: " + nombreProducto + "\n" +
				"Empresa de Transporte: " + nombreTransportista + "\n" +
				"Vehiculo: " + vehiculo);
	}

}
