public class ContaCorrente extends Conta {
    public ContaCorrente(String proprietario) {
        super(proprietario);
    }

    public void imprimirStatusCC() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirStatus();
    }
}
