package pe.grupo3.bustec.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "buses")
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String placa;
	
	@JsonIgnore
	@OneToOne(mappedBy = "bus")
	private Viaje viaje;
	
	public Bus() {
		
	}

	public Bus(String placa, Viaje viaje) {
		super();
		this.placa = placa;
		this.viaje = viaje;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", placa=" + placa + ", viaje=" + viaje + "]";
	}
	
}
