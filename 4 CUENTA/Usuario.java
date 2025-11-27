import java.util.Random;

public class Usuario {
    private final String titular;
    private double saldo;
    private final long numero_cuenta;
    private final String tipoCuenta;

    // Constructor por defecto (tipo Corriente)
    public Usuario(String titular, double saldo) {
        this(titular, saldo, "Corriente");
    }

    // Constructor con tipo de cuenta explícito
    public Usuario(String titular, double saldo, String tipoCuenta) {
        this.titular = titular;
        Random aleatorio = new Random();
        this.saldo = saldo;
        // Genera un número de cuenta positivo
        this.numero_cuenta = Math.abs(aleatorio.nextLong());
        this.tipoCuenta = tipoCuenta;
    }

    // Método estático para retiros (setRetiros) - MEJORA: Validación de saldo
    public static void setRetiros(Usuario cliente, double cantidad) {
        if (cliente.saldo >= cantidad) {
            cliente.saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + cliente.saldo);
        } else {
            System.out.println("Error: Saldo insuficiente. Saldo actual: " + cliente.saldo);
        }
    }

    // metodo estatico para transferencias (setTransferencia)
    public static void setTransferencia(Usuario titu1, Usuario titu2, double cantidad) {
        if (titu1.saldo >= cantidad) {
            titu1.saldo -= cantidad;
            titu2.saldo += cantidad;
            System.out.println("Transferencia exitosa.");
        } else {
            System.out.println("Error: Saldo insuficiente para transferencia. Saldo actual: " + titu1.saldo);
        }
    }

    // metodo getRetiro
    public String getRetiro() {
        return "Titular: " + titular + " | Tipo: " + tipoCuenta + " | Saldo actual: " + saldo;
    }

    // Método getDatosCuenta
    public String getDatosCuenta() {
        return "Titular: " + titular + "\nTipo de cuenta: " + tipoCuenta + "\nNúmero de cuenta: " + numero_cuenta + "\nSaldo: " + saldo;
    }
}
