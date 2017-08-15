package mx.gob.sat.comercioexterior.servicio.response;

import java.io.Serializable;

public class DetalleCAATNav implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nombre;
	private String representanteLegal;
	private String pais;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRepresentanteLegal() {
		return representanteLegal;
	}

	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
