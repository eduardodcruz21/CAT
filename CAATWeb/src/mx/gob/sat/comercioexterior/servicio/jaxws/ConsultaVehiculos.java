package mx.gob.sat.comercioexterior.servicio.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "consultaVehiculos", namespace = "http://sat.gob.mx/comercioexterior/caat/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaVehiculos", namespace = "http://sat.gob.mx/comercioexterior/caat/")
public class ConsultaVehiculos {

    @XmlElement(name = "arg0", namespace = "")
    private String arg0;

    /**
     * 
     * @return
     *     returns String
     */
    public String getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(String arg0) {
        this.arg0 = arg0;
    }

}
