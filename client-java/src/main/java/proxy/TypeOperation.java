
package proxy;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="typeOperation">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CREDIT"/>
 *     <enumeration value="DEBIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeOperation")
@XmlEnum
public enum TypeOperation {

    CREDIT,
    DEBIT;

    public String value() {
        return name();
    }

    public static TypeOperation fromValue(String v) {
        return valueOf(v);
    }

}
