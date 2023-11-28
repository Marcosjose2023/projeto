package com.marcos.projeto;

import java.util.Scanner;

public class Menu {

    private Cliente[] armazenamentoCliente;
    private int clienteAtual = 0;
    private Scanner scanner;

    public Menu(){
        armazenamentoCliente = new Cliente[10];
        scanner = new Scanner(System.in);
    }

    public void abrirMenu() {
        int instrucao = 0;

        while (instrucao != 6) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Buscar cliente pelo nome");
            System.out.println("3 - Buscar cliente pelo id");
            System.out.println("4 - Cadastrar fisioterapeuta");
            System.out.println("5 - Buscar fisioterapeuta pelo nome");
            System.out.println("6 - Sair");
            System.out.println("----------------------------------------------------------------");

            instrucao = scanner.nextInt();
            scanner.nextLine();

            switch (instrucao) {
                case 1:
                    novoCliente();
                    break;
                case 2:
                    buscaClientePorNome();
                    break;
                case 6:
                    System.out.println("SAINDO.");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        System.out.println("Fim da execução");
    }

    private void buscaClientePorNome() {
        System.out.println("Digite o nome a ser buscado:");
        String busca = scanner.nextLine();

        for(int i = 0; i < armazenamentoCliente.length; i++){
            if(armazenamentoCliente[i].getNome().equals(busca)){
                System.out.println("Cliente encontrado:");
                System.out.println("Id: " + armazenamentoCliente[i].getIdPessoa());
                System.out.println("Nome: " + armazenamentoCliente[i].getNome());
                System.out.println("Telefone: " + armazenamentoCliente[i].getTelefone());
                System.out.println("Cpf: " + armazenamentoCliente[i].getCpf());
                System.out.println("Resmo: " + armazenamentoCliente[i].getResumo());
                break;
            }
        }
    }

    private void novoCliente() {

        Cliente cliente = new Cliente();

        System.out.println("Nome:");
        cliente.setNome(scanner.nextLine());

        System.out.println("Cpf:");
        cliente.setCpf(scanner.nextLine());

        System.out.println("Telefone");
        cliente.setTelefone(scanner.nextLine());

        System.out.println("Resumo");
        cliente.setResumo(scanner.nextLine());

        System.out.println("Cliente salvo, id: " + clienteAtual);
        armazenamentoCliente[clienteAtual] = cliente;
        clienteAtual++;
    }

}
