import java.util.ArrayList;
import java.util.List;

public class AgendaDeAniversariosList implements AgendaDeAniversarios {
	private List<Aniversariante> aniversariantes;
	public AgendaDeAniversariosList(){
		this.aniversariantes = new ArrayList<Aniversariante>();
	}
	@Override
	public void adicionarAniversariante(Aniversariante aniv) {
		// TODO Auto-generated method stub

	}

	@Override
	public String pesquisaAniversarioDe(String nome) throws AniversarianteInexistenteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aniversariante> obterAniversariantesDoMes(int mes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removerAniversariante(String nomeAniversariante) throws AniversarianteInexistenteException {
		// TODO Auto-generated method stub

	}

}
