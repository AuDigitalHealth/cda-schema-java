//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.03 at 09:15:32 AM AEST 
//


package au.net.electronichealth.ns.cda._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_ActRelationshipEntryRelationship.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipEntryRelationship">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CAUS"/>
 *     &lt;enumeration value="COMP"/>
 *     &lt;enumeration value="GEVL"/>
 *     &lt;enumeration value="MFST"/>
 *     &lt;enumeration value="REFR"/>
 *     &lt;enumeration value="RSON"/>
 *     &lt;enumeration value="SAS"/>
 *     &lt;enumeration value="SPRT"/>
 *     &lt;enumeration value="SUBJ"/>
 *     &lt;enumeration value="XCRPT"/>
 *     &lt;enumeration value="AUTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActRelationshipEntryRelationship")
@XmlEnum
public enum XActRelationshipEntryRelationship {

    CAUS,
    COMP,
    GEVL,
    MFST,
    REFR,
    RSON,
    SAS,
    SPRT,
    SUBJ,
    XCRPT,
    AUTH;

    public String value() {
        return name();
    }

    public static XActRelationshipEntryRelationship fromValue(String v) {
        return valueOf(v);
    }

}