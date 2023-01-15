package ws;

import java.util.Date;

public class Releve {
    private String rib;
    private Date dateReleve;
    private double solde;

    public Operations operation;

    public Releve(String rib, Date dateReleve, double solde) {
        this.rib = rib;
        this.dateReleve = dateReleve;
        this.solde = solde;
    }

    public Releve() {
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Operations getOperation() {
        return operation;
    }

    public void setOperation(Operations operation) {
        this.operation = operation;
    }
}
