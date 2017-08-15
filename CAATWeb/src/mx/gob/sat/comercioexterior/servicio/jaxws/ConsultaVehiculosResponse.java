package mx.gob.sat.comercioexterior.servicio.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "consultaVehiculosResponse", namespace = "http://sat.gob.mx/comercioexterior/caat/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaVehiculosResponse", namespace = "http://sat.gob.mx/comercioexterior/caat/")
public class ConsultaVehiculosResponse {

    @XmlElement(name = "return", namespace = "")
    private List<mx.gob.sat.comercioexterior.servicio.response.Vehiculo> _return;

    /**
     * 
     * @return
     *     returns List<Vehiculo>
     */
    public List<mx.gob.sat.comercioexterior.servicio.response.Vehiculo> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<mx.gob.sat.comercioexterior.servicio.response.Vehiculo> _return) {
        this._return = _return;
    }

}
