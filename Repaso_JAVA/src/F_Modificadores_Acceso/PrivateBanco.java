package F_Modificadores_Acceso;

public class PrivateBanco {
    private double balance;

    public void depositar(double cantidad) {
        balance += cantidad;
    }

    private void mostrarBalance() {
        System.out.println("Balance: " + balance);
    }
}
