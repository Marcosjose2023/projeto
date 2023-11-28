package com.marcos.projeto;

import java.time.LocalDateTime;

public class SessaoFisioterapia extends Agendamento{
	private int idSessao;
	private LocalDateTime dataTratamento;
	private String tipoTratamento;

	public int getIdSessao() {
		return idSessao;
	}

	public void setIdSessao(int idSessao) {
		this.idSessao = idSessao;
	}

	public LocalDateTime getDataTratamento() {
		return dataTratamento;
	}

	public void setDataTratamento(LocalDateTime dataTratamento) {
		this.dataTratamento = dataTratamento;
	}

	public String getTipoTratamento() {
		return tipoTratamento;
	}

	public void setTipoTratamento(String tipoTratamento) {
		this.tipoTratamento = tipoTratamento;
	}
}
