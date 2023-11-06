package service;

public class test {
    public static void main(String[] args) {
            CalculatriceWS calculWS = new CalculatriceWS();

            double val1 = 10.0;
            double val2 = 5.0;

            double result = calculWS.Somme(val1, val2);

            System.out.println("Le résultat de la somme est : " + result);
    }

}
