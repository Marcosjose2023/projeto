
public class Prontuario extends Consulta{
	private String paciente;
	private String data_consulta2;
	private String hora_consulta;
	private String tipo_tratamento;
	
	
	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getData_consulta2() {
		return data_consulta2;
	}

	public void setData_consulta2(String data_consulta2) {
		this.data_consulta2 = data_consulta2;
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

	public Prontuario(int idCliente, String cpf, String nome, String telefone, int idFisioterapeuta, String nome2,
			String especialidade, int id_consulta, int id_paciente, int id_fisioterapeuta, int id_agendamento,
			String data_consulta, String paciente, String data_consulta2, String hora_consulta,
			String tipo_tratamento) {
		super(idCliente, cpf, nome, telefone, idFisioterapeuta, nome2, especialidade, id_consulta, id_paciente,
				id_fisioterapeuta, id_agendamento, data_consulta);
		this.paciente = paciente;
		this.data_consulta2 = data_consulta2;
		this.hora_consulta = hora_consulta;
		this.tipo_tratamento = tipo_tratamento;
	}
}
