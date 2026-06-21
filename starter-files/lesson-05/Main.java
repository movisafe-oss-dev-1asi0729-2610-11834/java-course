public class Main {

    private String titular;
    private double saldo;

    public Main(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: S/" + saldo);
    }

    public static void main(String[] args) {

        Main cuenta = new Main("Ana", 1000);

        cuenta.mostrarInformacion();

        cuenta.depositar(500);

        cuenta.retirar(200);

        cuenta.mostrarInformacion();
    }
}
