import java.util.Scanner;

public class CuentaCorriente {
    public static void main(String[] args) {
        double monto;

        // Creación de cuentas (ahora con tipo de cuenta)
        Usuario cuenta1 = new Usuario("Juan Perrez", 22000, "Corriente");
        Usuario cuenta2 = new Usuario("Diana Prince", 178000, "Ahorros");

        try (Scanner scn = new Scanner(System.in)) {
            // Menú de operaciones (más claro)
            System.out.println("**********************************");
            System.out.println("Cuentas disponibles:");
            System.out.println("1) " + cuenta1.getRetiro());
            System.out.println("2) " + cuenta2.getRetiro());
            System.out.println("**********************************");
            System.out.println("¿Qué operación desea realizar?:\n A - Consultar datos de cuenta\n B - Retiros\n T - Transferencias");
            String seleccion = scn.nextLine();

            // toUpperCase para que ignore minúscula y mayúscula
            switch (seleccion.toUpperCase()) {
            // ver datos de cuentas
            case "A":
                System.out.println("Seleccione una cuenta (1 o 2):");
                int cuen = Integer.parseInt(scn.nextLine());
                switch (cuen) {
                    case 1:
                        System.out.println(cuenta1.getDatosCuenta());
                        break;
                    case 2:
                        System.out.println(cuenta2.getDatosCuenta());
                        break;
                    default:
                        System.out.println("Cuenta no válida.");
                        break;
                }
                break;

            // retirar montos de dinero de una cuenta
            case "B":
                System.out.println("Seleccione una cuenta (1 o 2):");
                int cuenB = Integer.parseInt(scn.nextLine());
                switch (cuenB) {
                    case 1:
                        System.out.println("Ingrese el monto a retirar:");
                        monto = Double.parseDouble(scn.nextLine());
                        Usuario.setRetiros(cuenta1, monto);
                        System.out.println(cuenta1.getDatosCuenta());
                        break;
                    case 2:
                        System.out.println("Ingrese el monto a retirar:");
                        monto = Double.parseDouble(scn.nextLine());
                        Usuario.setRetiros(cuenta2, monto);
                        System.out.println(cuenta2.getDatosCuenta());
                        break;
                    default:
                        System.out.println("Cuenta no válida.");
                        break;
                }
                break;

            case "T":
                // Mostrar resumen rápido antes de transferir
                System.out.println("--- Transferencias ---");
                System.out.println("1) " + cuenta1.getRetiro());
                System.out.println("2) " + cuenta2.getRetiro());
                System.out.println("Seleccione cuenta origen (1 o 2):");
                int origen = Integer.parseInt(scn.nextLine());
                System.out.println("Seleccione cuenta destino (1 o 2):");
                int destino = Integer.parseInt(scn.nextLine());
                if (origen == destino) {
                    System.out.println("Error: la cuenta origen y la destino deben ser diferentes.");
                    break;
                }
                System.out.println("Ingrese monto a transferir:");
                monto = Double.parseDouble(scn.nextLine());
                Usuario cuentaOrigen = (origen == 1) ? cuenta1 : cuenta2;
                Usuario cuentaDestino = (destino == 1) ? cuenta1 : cuenta2;
                Usuario.setTransferencia(cuentaOrigen, cuentaDestino, monto);
                System.out.println(cuenta1.getDatosCuenta());
                System.out.println(cuenta2.getDatosCuenta());
                break;
            default:
                System.out.println("Opción no válida. Use A, B o T.");
                break;
        }
            System.out.println("**********************************");
        }
    }
}
