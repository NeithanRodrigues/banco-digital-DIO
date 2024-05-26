import java.util.ArrayList;
import java.util.List;

public class Banco {
    public List<Conta> contasList;

    public static void main(String[] args) {
        List<Conta> contasList = new ArrayList<>();
        ContaCorrente conta1 = new ContaCorrente("Nathan");
        ContaPoupanca conta2 = new ContaPoupanca("Roger");
        contasList.add(conta1);
        contasList.add(conta2);
        conta1.imprimirStatusCC();
        System.out.println(" ");
        conta1.depositar(500);
        conta1.sacar(270);
        conta1.transferir(100, conta2);
        conta1.imprimirStatusCC();
        System.out.println(" ");
        conta2.imprimirStatusPoupanca();
        System.out.println(" ");
        System.out.println("====CONTAS CADASTRADAS====");
        System.out.println(contasList);

    }
}
