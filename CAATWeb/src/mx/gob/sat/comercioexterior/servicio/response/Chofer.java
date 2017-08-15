package mx.gob.sat.comercioexterior.servicio.response;

import java.io.Serializable;

public class Chofer implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nacionalidad;
	private String curp;
	private String paisResidencia;
	private String direccion;

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getPaisResidencia() {
		return paisResidencia;
	}

	public void setPaisResidencia(String paisResidencia) {
		this.paisResidencia = paisResidencia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
