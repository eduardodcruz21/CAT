package mx.gob.sat.comercioexterior.servicio.response;

import java.io.Serializable;

public class DetalleCAAT implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nombre;
	private String rfc;
	private String domicilio;
	private String nombreDirGral;
	private String nombreContacto;
	private String telefonoContacto;
	private String email;
	private String extranjero;
	private String tipoEmpresa;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getNombreDirGral() {
		return nombreDirGral;
	}

	public void setNombreDirGral(String nombreDirGral) {
		this.nombreDirGral = nombreDirGral;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExtranjero() {
		return extranjero;
	}

	public void setExtranjero(String extranjero) {
		this.extranjero = extranjero;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}
}
