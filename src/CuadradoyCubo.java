import java.util.*;

public class CuadradoyCubo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese numero");
        double numero= input.nextDouble();
        double CuadradoNumero,CuboNumero;

        CuadradoNumero=Math.pow(numero,2);
        CuboNumero=Math.pow(numero,3);

        System.out.println("El cuadrado del numero es "+Math.round(CuadradoNumero));
        System.out.println("El cubo del numero es "+Math.round(CuboNumero));

    }
}