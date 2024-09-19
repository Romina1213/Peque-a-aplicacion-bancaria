import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;

        System.out.println("*************************************");
        System.out.println("¡Bienvenid@ a tu aplicacion bancaria!");
        System.out.println( "\nNombre del cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: " + saldoDisponible + "$");
        System.out.println("\n*************************************");

        String menu = """ 
                *** Escriba el numero de la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        int numeroIngresado = 0;
        Scanner teclado = new Scanner(System.in);
        while (numeroIngresado != 9){
            System.out.println(menu);
            numeroIngresado = teclado.nextInt();
            switch (numeroIngresado){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldoDisponible + "$");
                    break;
                case 2:
                    System.out.println("Cual es el valor que desa retirar?");
                    double valorAretirar = teclado.nextDouble();
                    if(valorAretirar < saldoDisponible) {
                        saldoDisponible= saldoDisponible - valorAretirar;
                        System.out.println("Saldo restante: " + saldoDisponible + "$");
                    }else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Cual es el valor que vas a depositar?");
                    double depositar = teclado.nextDouble();
                    saldoDisponible = saldoDisponible + depositar;
                    System.out.println("El saldo actualizado es: " + saldoDisponible + "$");
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
