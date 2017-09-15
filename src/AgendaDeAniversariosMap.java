import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgendaDeAniversariosMap implements AgendaDeAniversarios{
	private Map<String,Aniversariante> aniversariantes;
	
	public AgendaDeAniversariosMap(){
		this.aniversariantes = new HashMap<String,Aniversariante>();
	}
	@Override
	public void adicionarAniversariante(Aniversariante aniv) {
		String nome = aniv.getNome();
		this.aniversariantes.put(nome, aniv);
		
	}

	@Override
	public String pesquisaAniversarioDe(String nome) throws AniversarianteInexistenteException {
		//Aniversariante aniv = this.aniversariantes.get(nome);
		for (Aniversariante a: this.aniversariantes.values()){
			if (a.getNome().equals(nome)){
				return "Data:"+a.getDiaAniversario()+"/"+a.getMesAniversario();
			}
		}
		
		throw new AniversarianteInexistenteException();
		
		
	}

	@Override
	public List<Aniversariante> obterAniversariantesDoMes(int mes) {
		List<Aniversariante>  lista = new ArrayList<Aniversariante>();
		for (Aniversariante a: this.aniversariantes.values()){
			if (a.getMesAniversario()== mes){
				lista.add(a);
			}
		}
		return lista;
	}

	@Override
	public void removerAniversariante(String nomeAniversariante) throws AniversarianteInexistenteException {
		if (this.aniversariantes.get(nomeAniversariante)!=null){
			this.aniversariantes.remove(nomeAniversariante);		
		} else {
			throw new AniversarianteInexistenteException();
		}
	}

}
