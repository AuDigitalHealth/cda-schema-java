//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.03 at 09:15:32 AM AEST 
//


package au.net.electronichealth.ns.cda._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Integer numbers (-1,0,1,2, 100, 3398129, etc.) are precise
 *             numbers that are results of counting and enumerating.
 *             Integer numbers are discrete, the set of integers is
 *             infinite but countable.  No arbitrary limit is imposed on
 *             the range of integer numbers. Two NULL flavors are
 *             defined for the positive and negative infinity.
 *          
 * 
 * <p>Java class for INT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INT">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}QTY">
 *       &lt;attribute name="value" type="{urn:hl7-org:v3}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INT")
@XmlSeeAlso({
    IVXBINT.class,
    POCDMT000040RegionOfInterestValue.class,
    SXCMINT.class
})
public class INT
    extends QTY
{

    @XmlAttribute(name = "value")
    protected BigInteger value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

}
