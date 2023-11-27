public class Agendamento {
	 	private int idPaciente;
	    private int idFisioterapeuta;
	    private String nomePaciente;
	    private int dataAtual;
	    private String horario;
		
	    public Agendamento(int idPaciente, int idFisioterapeuta, String nomePaciente, int dataAtual, String horario) {
			this.idPaciente = idPaciente;
			this.idFisioterapeuta = idFisioterapeuta;
			this.nomePaciente = nomePaciente;
			this.dataAtual = dataAtual;
			this.horario = horario;
		}

		public int getIdPaciente() {
			return idPaciente;
		}

		public void setIdPaciente(int idPaciente) {
			this.idPaciente = idPaciente;
		}

		public int getIdFisioterapeuta() {
			return idFisioterapeuta;
		}

		public void setIdFisioterapeuta(int idFisioterapeuta) {
			this.idFisioterapeuta = idFisioterapeuta;
		}

		public String getNomePaciente() {
			return nomePaciente;
		}

		public void setNomePaciente(String nomePaciente) {
			this.nomePaciente = nomePaciente;
		}

		public int getDataAtual() {
			return dataAtual;
		}

		public void setDataAtual(int dataAtual) {
			this.dataAtual = dataAtual;
		}

		public String getHorario() {
			return horario;
		}

		public void setHorario(String horario) {
			this.horario = horario;
		}
	    
}
