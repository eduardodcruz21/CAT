package mx.gob.sat.comercioexterior.servicio;

import java.util.List;

import mx.gob.sat.comercioexterior.dao.CAATDAO;
import mx.gob.sat.comercioexterior.servicio.response.Chofer;
import mx.gob.sat.comercioexterior.servicio.response.DetalleCAAT;
import mx.gob.sat.comercioexterior.servicio.response.DetalleCAATNav;
import mx.gob.sat.comercioexterior.servicio.response.Vehiculo;

public class CAAT {

	public DetalleCAAT consultaDatosGenerales(String caat) throws Exception {
		return new CAATDAO().consultaDatosGenerales(caat);
	}

	public List<Vehiculo> consultaVehiculos(String caat) throws Exception {
		return new CAATDAO().consultaVehiculos(caat);
	}

	public List<Chofer> consultaChoferes(String caat) throws Exception {
		return new CAATDAO().consultaChoferes(caat);
	}
	
	public DetalleCAATNav consultaDatosGeneralesNAV(String caat) throws Exception {
		return new CAATDAO().consultaDatosGeneralesNAV(caat);
	}
}
