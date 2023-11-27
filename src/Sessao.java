public class Sessao extends Fisioterapia{
	private String sessao;
	private String tipo_tratamento2;
	private String hora_sessao;
	public Sessao(int idCliente, String cpf, String nome, String telefone, int idFisioterapeuta, String nome2,
			String especialidade, String paciente, String data_consulta, String hora_consulta, String tipo_tratamento,
			String sessao, String tipo_tratamento2, String hora_sessao) {
		super(idCliente, cpf, nome, telefone, idFisioterapeuta, nome2, especialidade, paciente, data_consulta,
				hora_consulta, tipo_tratamento);
		this.sessao = sessao;
		this.tipo_tratamento2 = tipo_tratamento2;
		this.hora_sessao = hora_sessao;
	}
	public String getSessao() {
		return sessao;
	}
	public void setSessao(String sessao) {
		this.sessao = sessao;
	}
	public String getTipo_tratamento2() {
		return tipo_tratamento2;
	}
	public void setTipo_tratamento2(String tipo_tratamento2) {
		this.tipo_tratamento2 = tipo_tratamento2;
	}
	public String getHora_sessao() {
		return hora_sessao;
	}
	public void setHora_sessao(String hora_sessao) {
		this.hora_sessao = hora_sessao;
	}

}
