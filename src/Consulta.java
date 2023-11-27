public class Consulta extends Fisioterapeuta{
	 private int id_consulta;       
	 private int id_paciente;       
	 private int id_fisioterapeuta; 
	 private int id_agendamento ; 
	 private String data_consulta;
	 
	public Consulta(int idCliente, String cpf, String nome, String telefone, int idFisioterapeuta, String nome2,
			String especialidade, int id_consulta, int id_paciente, int id_fisioterapeuta, int id_agendamento,
			String data_consulta) {
		super(idCliente, cpf, nome, telefone, idFisioterapeuta, nome2, especialidade);
		this.id_consulta = id_consulta;
		this.id_paciente = id_paciente;
		this.id_fisioterapeuta = id_fisioterapeuta;
		this.id_agendamento = id_agendamento;
		this.data_consulta = data_consulta;
	}
	public int getId_consulta() {
		return id_consulta;
	}
	public void setId_consulta(int id_consulta) {
		this.id_consulta = id_consulta;
	}
	public int getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}
	public int getId_fisioterapeuta() {
		return id_fisioterapeuta;
	}
	public void setId_fisioterapeuta(int id_fisioterapeuta) {
		this.id_fisioterapeuta = id_fisioterapeuta;
	}
	public int getId_agendamento() {
		return id_agendamento;
	}
	public void setId_agendamento(int id_agendamento) {
		this.id_agendamento = id_agendamento;
	}
	public String getData_consulta() {
		return data_consulta;
	}
	public void setData_consulta(String data_consulta) {
		this.data_consulta = data_consulta;
	}

}
