package com.marcos.projeto;

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

}
