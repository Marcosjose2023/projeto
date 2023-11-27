
public class Cliente {
	private int idCliente;
    private String cpf;
    private String nome;
    private String telefone;
	
    public Cliente(int idCliente, String cpf, String nome, String telefone) {
		this.idCliente = idCliente;
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void exibirDetalhes() {
		System.out.println("detalhes do cliente:");
		System.out.println("id:" + idCliente);
		
	}
	public void amostrarMetodo() {
	}
}


