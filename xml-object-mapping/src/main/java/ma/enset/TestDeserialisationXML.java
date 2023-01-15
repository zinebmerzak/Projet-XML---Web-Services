package ma.enset;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class TestDeserialisationXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Releve releve = (Releve)unmarshaller.unmarshal(new File("releve.xml"));
        System.out.println("**********************************");
        for (Operation op:releve.operation.operations){
            System.out.println(op.toString());
        }
    }
}
