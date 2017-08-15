package mx.gob.sat.comercioexterior.servicio;

import java.util.List;

import mx.gob.sat.comercioexterior.servicio.response.Chofer;
import mx.gob.sat.comercioexterior.servicio.response.DetalleCAAT;
import mx.gob.sat.comercioexterior.servicio.response.DetalleCAATNav;
import mx.gob.sat.comercioexterior.servicio.response.Vehiculo;


@javax.jws.WebService (targetNamespace="http://sat.gob.mx/comercioexterior/caat/", serviceName="CAATService", portName="CAATPort", wsdlLocation="WEB-INF/wsdl/CAATService.wsdl")
public class CAATDelegate{

    mx.gob.sat.comercioexterior.servicio.CAAT _cAAT = null;

    public DetalleCAAT consultaDatosGenerales(String caat) throws Exception {
        return _cAAT.consultaDatosGenerales(caat);
    }

    public List<Vehiculo> consultaVehiculos(String caat) throws Exception {
        return _cAAT.consultaVehiculos(caat);
    }

    public List<Chofer> consultaChoferes(String caat) throws Exception {
        return _cAAT.consultaChoferes(caat);
    }

    public DetalleCAATNav consultaDatosGeneralesNAV(String caat) throws Exception {
        return _cAAT.consultaDatosGeneralesNAV(caat);
    }

    public CAATDelegate() {
        _cAAT = new mx.gob.sat.comercioexterior.servicio.CAAT(); }

}