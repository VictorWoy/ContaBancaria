import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

    public void listarClientes() {
        List<String> nomes = new ArrayList<>();

        if (contas == null) throw new RuntimeException("Não tem clientes cadastrados");
        
        System.out.printf("\n=============Clientes do banco: %s===============\n", this.nome);

        for (Conta conta : contas) {
            Cliente cliente = conta.getCliente();
            if (cliente != null) {
                String nomeCliente = cliente.getNome();
                if (nomeCliente != null && !nomes.contains(nomeCliente)) {
                    nomes.add(nomeCliente);
                    System.out.println(nomeCliente);
                }
            }
        }
    }

    public void buscarContasPorCliente(String nome) {
        List<Conta> resultado = new ArrayList<>();
        for (Conta conta : contas) {
            if (conta.getCliente().getNome().equalsIgnoreCase(nome)) {
                System.out.printf("Numero da conta do cliente %s: %s \n", nome, conta.getNumero());
                resultado.add(conta);
            }
        }
    }

}