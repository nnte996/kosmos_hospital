package com.user.app.entity;

public class Consultorios {
	
	private int consultorioId;
	private int numero;
	private int piso;
	
	public int getConsultorioId() {
		return consultorioId;
	}
	public void setConsultorioId(int consultorioId) {
		this.consultorioId = consultorioId;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	@Override
	public String toString() {
		return "Consultorios [consultorioId=" + consultorioId + ", numero=" + numero + ", piso=" + piso + "]";
	}

}