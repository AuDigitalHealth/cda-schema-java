//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.03 at 09:15:32 AM AEST 
//


package au.net.electronichealth.ns.cda._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleStatusTerminated.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleStatusTerminated">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="terminated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleStatusTerminated")
@XmlEnum
public enum RoleStatusTerminated {

    @XmlEnumValue("terminated")
    TERMINATED("terminated");
    private final String value;

    RoleStatusTerminated(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleStatusTerminated fromValue(String v) {
        for (RoleStatusTerminated c: RoleStatusTerminated.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
