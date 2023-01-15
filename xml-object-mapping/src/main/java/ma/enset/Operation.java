package ma.enset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Operation{
    @XmlAttribute
    private double montant;
    @XmlAttribute
    private Date date;
    @XmlAttribute
    private TypeOperation type;
    @XmlAttribute
    private String description;

    public Operation() {
    }

    public Operation(double montant, Date date, TypeOperation type, String description) {
        this.type = type;
        this.montant = montant;
        this.date = date;
        this.description = description;
    }


    public TypeOperation getType() {
        return type;
    }

    public void setType(TypeOperation type) {
        this.type = type;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "montant=" + montant +
                ", date=" + date +
                ", type=" + type +
                ", description='" + description + '\'' +
                '}';
    }
}
