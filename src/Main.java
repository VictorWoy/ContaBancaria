import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente victor = new Cliente();
		victor.setNome("Victor");
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro");
		
		Conta cc = new ContaCorrente(victor);
		Conta poupanca = new ContaPoupanca(victor);
		Conta poupancaPedro = new ContaPoupanca(pedro);
        List<Conta> contas = List.of(cc, poupanca, poupancaPedro);
		cc.depositar(100);
		cc.transferir(100, poupanca);

        Banco banco = new Banco();
        banco.setNome("Bradesco");
        banco.setContas(contas);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
        banco.listarClientes();
        banco.buscarContasPorCliente("Victor");
	}

}
