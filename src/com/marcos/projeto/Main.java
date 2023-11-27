package com.marcos.projeto;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		amostrarMetodo("adicionarCliente");

        Cliente paciente = new Cliente();

//        System.out.print("Digite o CPF do com.marcos.projeto.Cliente: ");
//        paciente.setCpf(scanner.nextLine());
//
        System.out.print("Digite o Nome do com.marcos.projeto.Cliente: ");
        paciente.setNome(scanner.nextLine());

//        System.out.print("Digite o Telefone do com.marcos.projeto.Cliente: ");
//        paciente.setTelefone(scanner.nextLine());

        Agendamento a = new Agendamento();
        a.setPaciente(paciente);

        System.out.println("com.marcos.projeto.Cliente adicionado com sucesso!");
        System.out.println("Nome do cliente -> " + a.getPaciente().getNome());
    }

//    private static void amostrarMetodo(String string) {
//
//
//	}
//
//	public void exibirInformacoesCliente(List<com.marcos.projeto.Cliente> listaClientes) {
//        Scanner scanner = new Scanner(System.in);
//
//        amostrarMetodo("exibirInformacoesCliente");
//
//        System.out.print("Digite o ID do com.marcos.projeto.Cliente: ");
//        int idCliente = scanner.nextInt();
//        scanner.nextLine();
//
//        for (com.marcos.projeto.Cliente cliente : listaClientes) {
//            if (cliente.get() == idCliente) {
//                System.out.println("\nInformações do com.marcos.projeto.Cliente:");
//                System.out.println("ID: " + cliente.getIdCliente());
//                System.out.println("CPF: " + cliente.getCpf());
//                System.out.println("Nome: " + cliente.getNome());
//                System.out.println("Telefone: " + cliente.getTelefone());
//                return;
//            }
//        }
//
//        System.out.println("com.marcos.projeto.Cliente não encontrado com o ID fornecido.");
//    }
//
//    public void listarClientes(List<com.marcos.projeto.Cliente> listaClientes) {
//        amostrarMetodo("listarClientes");
//
//        System.out.println("\nLista de Clientes:");
//        for (com.marcos.projeto.Cliente cliente : listaClientes) {
//            System.out.println("ID: " + cliente.getIdCliente() +
//                    ", Nome: " + cliente.getNome() +
//                    ", CPF: " + cliente.getCpf() +
//                    ", Telefone: " + cliente.getTelefone());
//        }
//    }
}	
		
	

