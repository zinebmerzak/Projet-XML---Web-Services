package ws;

import java.util.Date;

public class Operation {
    private double montant;
    private Date date;
    private String description;
    private TypeOperation type;

    public Operation(double montant, Date date, String description, TypeOperation type) {
        this.montant = montant;
        this.date = date;
        this.description = description;
        this.type = type;
    }

    public Operation() {
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

    public TypeOperation getType() {
        return type;
    }

    public void setType(TypeOperation type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "montant=" + montant +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }
}
