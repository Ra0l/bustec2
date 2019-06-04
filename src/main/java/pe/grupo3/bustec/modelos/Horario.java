package pe.grupo3.bustec.modelos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "horarios")
public class Horario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date tiempo;
	
	@JsonIgnore
	@OneToOne(mappedBy = "horario")
	private Viaje viaje;
	
	public Horario() {
		
	}

	public Horario(Date tiempo, Viaje viaje) {
		super();
		this.tiempo = tiempo;
		this.viaje = viaje;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getTiempo() {
		return tiempo;
	}

	public void setTiempo(Date tiempo) {
		this.tiempo = tiempo;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	@Override
	public String toString() {
		return "Horario [id=" + id + ", tiempo=" + tiempo + ", viaje=" + viaje + "]";
	}
	
}