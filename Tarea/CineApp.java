import java.util.Scanner;

public class CineApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double precioBase = 3500;
        double precioFinal;

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 0 || edad > 120) {
            System.out.println("Edad Cantidad No Valida. Por favor, ingrese un valor correcto ");
        } else if (edad < 5) {
            precioFinal = precioBase * 0.40;
            System.out.println("El precio de su boleto es: " + precioFinal);
        } else if (edad > 60) {
            precioFinal = precioBase * 0.45;
            System.out.println("El precio de su boleto es: " +  precioFinal);
        } else {
            System.out.println("¿Cuántos boletos desea comprar? ");
            int cantidadBoletos = sc.nextInt();

            if (cantidadBoletos < 1) {
                System.out.println("Cantidad No Valida. Minimo comprar un boleto ");
            } else {
                precioFinal = precioBase;
                if (cantidadBoletos >= 2) {
                    precioFinal *= 0.70;
                }
                precioFinal *= cantidadBoletos;
                System.out.println("Total a pagar por los boletos: " + cantidadBoletos + precioFinal);
            }
        }
    }
}