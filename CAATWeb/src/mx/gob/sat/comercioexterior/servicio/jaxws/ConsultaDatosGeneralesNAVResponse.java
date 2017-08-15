package mx.gob.sat.comercioexterior.servicio.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "consultaDatosGeneralesNAVResponse", namespace = "http://sat.gob.mx/comercioexterior/caat/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaDatosGeneralesNAVResponse", namespace = "http://sat.gob.mx/comercioexterior/caat/")
public class ConsultaDatosGeneralesNAVResponse {

    @XmlElement(name = "return", namespace = "")
    private mx.gob.sat.comercioexterior.servicio.response.DetalleCAATNav _return;

    /**
     * 
     * @return
     *     returns DetalleCAATNav
     */
    public mx.gob.sat.comercioexterior.servicio.response.DetalleCAATNav getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(mx.gob.sat.comercioexterior.servicio.response.DetalleCAATNav _return) {
        this._return = _return;
    }

}
