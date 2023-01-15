import proxy.Operation;
import proxy.ReleveService;
import proxy.ReleveWS;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        ReleveService stub = new ReleveWS().getReleveServicePort();
        List<Operation> operations = stub.listOperations();
        for (Operation op:operations){
            System.out.println(op.getDate());
            System.out.println(op.getMontant());
            System.out.println(op.getType());
            System.out.println(op.getDescription());
        }
        Operation op2 = stub.getOperations("011112222333344445555666");
        System.out.println(op2.getMontant());
    }
}
