package com.user.app.entity;

import java.sql.Time;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Citas")
public class Citas {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
	private int citaId;
	public String doctor;
	private LocalTime horarioConsulta;
	private String nombrePaciente;
	
	public int getCitaId() {
		return citaId;
	}
	public void setCitaId(int citaId) {
		this.citaId = citaId;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public LocalTime getHorarioConsulta() {
		return horarioConsulta;
	}
	public void setHorarioConsulta(LocalTime horarioConsulta) {
		this.horarioConsulta = horarioConsulta;
	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	
	@Override
	public String toString() {
		return "Citas [citaId=" + citaId + ", doctor=" + doctor + ", horarioConsulta=" + horarioConsulta
				+ ", nombrePaciente=" + nombrePaciente + "]";
	}
	public void setHorarioConsulta(Time time) {
		
	}
	
}