import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		amostrarMetodo("adicionarCliente");

        System.out.print("Digite o ID do Cliente: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite o CPF do Cliente: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o Nome do Cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o Telefone do Cliente: ");
        String telefone = scanner.nextLine();

        Cliente novoCliente = new Cliente(idCliente, cpf, nome, telefone);

        System.out.println("Cliente adicionado com sucesso!");
    }

    private static void amostrarMetodo(String string) {
		
		
	}

	public void exibirInformacoesCliente(List<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in);

        amostrarMetodo("exibirInformacoesCliente");

        System.out.print("Digite o ID do Cliente: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine(); 

        for (Cliente cliente : listaClientes) {
            if (cliente.getIdCliente() == idCliente) {
                System.out.println("\nInformações do Cliente:");
                System.out.println("ID: " + cliente.getIdCliente());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Telefone: " + cliente.getTelefone());
                return;
            }
        }

        System.out.println("Cliente não encontrado com o ID fornecido.");
    }

    public void listarClientes(List<Cliente> listaClientes) {
        amostrarMetodo("listarClientes");

        System.out.println("\nLista de Clientes:");
        for (Cliente cliente : listaClientes) {
            System.out.println("ID: " + cliente.getIdCliente() +
                    ", Nome: " + cliente.getNome() +
                    ", CPF: " + cliente.getCpf() +
                    ", Telefone: " + cliente.getTelefone());
        }
    }   
}	
		
	

