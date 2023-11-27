public class Fisioterapeuta extends Cliente{
	
	private int idFisioterapeuta;
    private String nome2;
    private String especialidade;
    
	public Fisioterapeuta(int idCliente, String cpf, String nome, String telefone, int idFisioterapeuta, String nome2,
			String especialidade) {
		super(idCliente, cpf, nome, telefone);
		this.nome2 = nome2;
		this.idFisioterapeuta = idFisioterapeuta;
		this.especialidade = especialidade;
	}
	public int getIdFisioterapeuta() {
		return idFisioterapeuta;
	}
	public void setIdFisioterapeuta(int idFisioterapeuta) {
		this.idFisioterapeuta = idFisioterapeuta;
	}
	public String getNome2() {
		return nome2;
	}
	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
    
}
