public class Fisioterapia extends   Fisioterapeuta{
	private String paciente;
	private String data_consulta;
	private String hora_consulta;
	private String tipo_tratamento;
	
	public Fisioterapia(int idCliente, String cpf, String nome, String telefone, int idFisioterapeuta, String nome2,
			String especialidade, String paciente, String data_consulta, String hora_consulta, String tipo_tratamento) {
		super(idCliente, cpf, nome, telefone, idFisioterapeuta, nome2, especialidade);
		this.paciente = paciente;
		this.data_consulta = data_consulta;
		this.hora_consulta = hora_consulta;
		this.tipo_tratamento = tipo_tratamento;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	public String getData_consulta() {
		return data_consulta;
	}
	public void setData_consulta(String data_consulta) {
		this.data_consulta = data_consulta;
	}
	public String getHora_consulta() {
		return hora_consulta;
	}
	public void setHora_consulta(String hora_consulta) {
		this.hora_consulta = hora_consulta;
	}
	public String getTipo_tratamento() {
		return tipo_tratamento;
	}
	public void setTipo_tratamento(String tipo_tratamento) {
		this.tipo_tratamento = tipo_tratamento;
	}

    

}
