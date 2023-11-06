package service;

@WebService (name="CalculatriceWS")
public class CalculatriceWS {

    @WebMethod (operationName = "Somme")
    public double Somme(@WebParam(name = "a") double a,@WebParam(name = "b") double b){
        return a+b;
    }

}
