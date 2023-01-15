import jakarta.xml.ws.Endpoint;
import ws.ReleveService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/", new ReleveService());
        System.out.println("Web service deployed on http://0.0.0.0:9191/");

    }
}
