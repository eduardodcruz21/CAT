package mx.gob.sat.comercioexterior.servicio.response;

import java.io.Serializable;

public class Vehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String vin;
	private String numEconomico;
	private String tipo;
	private String transponder;
	private String numPlacas;
	private String estado;
	private String paisEmisor;

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getNumEconomico() {
		return numEconomico;
	}

	public void setNumEconomico(String numEconomico) {
		this.numEconomico = numEconomico;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTransponder() {
		return transponder;
	}

	public void setTransponder(String transponder) {
		this.transponder = transponder;
	}

	public String getNumPlacas() {
		return numPlacas;
	}

	public void setNumPlacas(String numPlacas) {
		this.numPlacas = numPlacas;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPaisEmisor() {
		return paisEmisor;
	}

	public void setPaisEmisor(String paisEmisor) {
		this.paisEmisor = paisEmisor;
	}
}
