package com.marcos.projeto;

public class Sessao extends Agendamento{
	private String tipoTratamento;
	private String horaSessao;

	public String getTipoTratamento() {
		return tipoTratamento;
	}

	public void setTipoTratamento(String tipoTratamento) {
		this.tipoTratamento = tipoTratamento;
	}

	public String getHoraSessao() {
		return horaSessao;
	}

	public void setHoraSessao(String horaSessao) {
		this.horaSessao = horaSessao;
	}
}
