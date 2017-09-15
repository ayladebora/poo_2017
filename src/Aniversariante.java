
public class Aniversariante {
	private String nome;
	private int diaAniversario;
	private int mesAniversario;
	
	public Aniversariante(String nome, int diaAniversario, int mesAniversario){
		this.nome = nome;
		this.diaAniversario = diaAniversario;
		this.mesAniversario  = mesAniversario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}

	public int getMesAniversario() {
		return mesAniversario;
	}

	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}
	
	public String toString(){
		return this.nome+", aniversário:"+this.diaAniversario+"/"+this.mesAniversario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diaAniversario;
		result = prime * result + mesAniversario;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aniversariante other = (Aniversariante) obj;
		if (diaAniversario != other.diaAniversario)
			return false;
		if (mesAniversario != other.mesAniversario)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	


}
