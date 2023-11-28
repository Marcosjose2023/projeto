package com.marcos.projeto;

import java.util.Scanner;

public class Menu {

    private Cliente[] armazenamentoCliente;
    private Fisioterapeuta[] armazenamentoFisioterapeuta;
    private int clienteAtual = 0;
    private int fisioterapeutaAtual = 0;
    private Scanner scanner;

    public Menu(){
        armazenamentoCliente = new Cliente[10];
        armazenamentoFisioterapeuta = new Fisioterapeuta[10];
        scanner = new Scanner(System.in);
    }

    //adicionar opcao no switc case
    // criar arrays do fisioterapeuta
    // criar o contador do fisiotepeuta
    // iniciar o arrys do fisioterapeuta
    // criar o metodo de registrar o fisioterapeuta
    // criar o metodo de buscar o fisioterapeuta



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
                case 4:
                    cadastrarFisioterapeuta();
                    break;
                case 5:
                    buscarFisioterapeutaPeloNome();
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

    private void cadastrarFisioterapeuta() {
        Fisioterapeuta fisioterapeuta = new Fisioterapeuta();

        System.out.println("Nome:");
        fisioterapeuta.setNome(scanner.nextLine());

        System.out.println("Cpf:");
        fisioterapeuta.setCpf(scanner.nextLine());

        System.out.println("Telefone");
        fisioterapeuta.setTelefone(scanner.nextLine());

        System.out.println("Especialidade");
        fisioterapeuta.setEspecialidade(scanner.nextLine());

        System.out.println("Cliente salvo, id: " + clienteAtual);
        armazenamentoFisioterapeuta[fisioterapeutaAtual] = fisioterapeuta;
        fisioterapeutaAtual++;
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
                System.out.println("Resumo: " + armazenamentoCliente[i].getResumo());
                break;
            }
        }
    }
    private void buscarFisioterapeutaPeloNome(){
        System.out.println("Digite o nome do fisioterapeuta:");
        String busca = scanner.nextLine();

        for(int i =0;i < armazenamentoFisioterapeuta.length;i++){
            if (armazenamentoFisioterapeuta[i].getNome().equals(busca)){
                System.out.println("Fisioterqapeuta encontrado:");
                System.out.println("Id: " + armazenamentoFisioterapeuta[i].getIdPessoa());
                System.out.println("Nome: " + armazenamentoFisioterapeuta[i].getNome());
                System.out.println("Telefone: " + armazenamentoFisioterapeuta[i].getTelefone());
                System.out.println("Cpf: " + armazenamentoFisioterapeuta[i].getCpf());
                System.out.println("Especialidade: " + armazenamentoFisioterapeuta[i].getEspecialidade());
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
