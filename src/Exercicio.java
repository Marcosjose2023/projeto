
public class Exercicio extends Sessao{
	private String sessao;
	private String tipo_tratamento;
	private String hora_sessao2;
	
	public Exercicio(int idCliente, String cpf, String nome, String telefone, int idFisioterapeuta, String nome2,
			String especialidade, String paciente, String data_consulta, String hora_consulta, String tipo_tratamento,
			String sessao, String tipo_tratamento2, String hora_sessao, String sessao2, String tipo_tratamento3,
			String hora_sessao2) {
		super(idCliente, cpf, nome, telefone, idFisioterapeuta, nome2, especialidade, paciente, data_consulta,
				hora_consulta, tipo_tratamento, sessao, tipo_tratamento2, hora_sessao);
		this.sessao = sessao;
		this.tipo_tratamento = tipo_tratamento;
		this.hora_sessao2 = hora_sessao2;
	}
	public String getSessao() {
		return sessao;
	}
	public void setSessao(String sessao) {
		this.sessao = sessao;
	}
	public String getTipo_tratamento() {
		return tipo_tratamento;
	}
	public void setTipo_tratamento(String tipo_tratamento) {
		this.tipo_tratamento = tipo_tratamento;
	}
	public String getHora_sessao2() {
		return hora_sessao2;
	}
	public void setHora_sessao2(String hora_sessao2) {
		this.hora_sessao2 = hora_sessao2;
	}
	
}
