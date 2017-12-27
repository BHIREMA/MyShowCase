
package com.jaxws.series.bottom.up.approach.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getBookNameBasedOnISBN", namespace = "http://service.approach.up.bottom.series.jaxws.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBookNameBasedOnISBN", namespace = "http://service.approach.up.bottom.series.jaxws.com/")
public class GetBookNameBasedOnISBN {

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
