public class ContaPoupanca extends Conta {

    public ContaPoupanca(String proprietario) {
        super(proprietario);
    }

    public void imprimirStatusPoupanca() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirStatus();
    }
}