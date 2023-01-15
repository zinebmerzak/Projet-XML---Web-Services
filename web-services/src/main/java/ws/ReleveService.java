package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "ReleveWS")
public class ReleveService {

    @WebMethod
    public Operation getOperations(@WebParam(name = "rib") String rib) {
        return new Operation(Math.random()*9888, new Date(), "Virement", TypeOperation.CREDIT);
    }
    @WebMethod
    public List<Operation> listOperations(){
        return List.of(
            new Operation(Math.random()*9888, new Date(), "Virement", TypeOperation.CREDIT),
            new Operation(Math.random()*9888, new Date(), "Prelevement Assurance", TypeOperation.DEBIT),
            new Operation(Math.random()*9888, new Date(), "Virement", TypeOperation.CREDIT)
        );
    }
}
