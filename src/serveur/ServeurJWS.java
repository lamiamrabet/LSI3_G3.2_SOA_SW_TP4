package serveur;

import service.CalculatriceWS;
import javax.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {
        CalculatriceWS calcul =new CalculatriceWS();
        String url= "http://localhost:8084/";
        Endpoint.publish(url,calcul);
        System.out.println("Web service deployé sur "+url);
    }
}