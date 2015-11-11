
package com.wsexample.sei.jaxws;

import java.awt.Image;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "uploadImage", namespace = "http://sei.wsexample.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadImage", namespace = "http://sei.wsexample.com/")
public class UploadImage {

    @XmlElement(name = "arg0", namespace = "")
    private Image arg0;

    /**
     * 
     * @return
     *     returns Image
     */
    public Image getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Image arg0) {
        this.arg0 = arg0;
    }

}
