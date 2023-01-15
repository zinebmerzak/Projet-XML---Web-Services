package ma.enset;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.Date;

public class TestSerialisationXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Operation op1 = new Operation(3500, new Date(),TypeOperation.CREDIT,"Virement");
        Releve releve = new Releve();
        releve.setRIB("011112222333344445555666");
        releve.setDateReleve(new Date());
        releve.setSolde(75000);
        releve.operation = new Operations();
        releve.operation.setDateDebut("2023-10-01");
        releve.operation.setDateFin("2023-10-31");
        releve.operation.operations.add(op1);
        releve.operation.operations.add(new Operation(3500, new Date(),TypeOperation.CREDIT,"Virement"));
        releve.operation.operations.add(new Operation(600, new Date(),TypeOperation.DEBIT,"Prelevement Assurance"));
        releve.operation.operations.add(new Operation(12000, new Date(),TypeOperation.CREDIT,"Vers Especes"));

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve,System.out);
        marshaller.marshal(releve,new File("releve.xml"));
    }
}
