
import java.util.List;

public interface AgendaDeAniversarios {

	/**
	 * Cadastra um novo aniversariante
	 */
	public void adicionarAniversariante(Aniversariante aniv);
	
	/**
	 * Pesquisa a data de aniversário de uma certa pessoa
	 * @param nome O nome da pessoa a pesquisar
	 * @return A data do aniversário da pessoa no formado dd/mm (dia/mês)
	 * @throws AniversarianteInexistenteException caso não exista aniversariante com este nome.
	 */
	public String pesquisaAniversarioDe(String nome) throws AniversarianteInexistenteException;

	/**
	 * Retorna uma lista contendo os nomes dos aniversariantes do mês passado
	 * como parâmetro
	 * 
	 * @param mes
	 *            O mês (1-12) cujos aniversariantes se quer pesquisar
	 * @return uma lista com os aniversariantes desse mês
	 */
	public List<Aniversariante> obterAniversariantesDoMes(int mes);

	/**
	 * Remove o(s) aniversariante(s) que tenham como nome o valor passado como
	 * parâmetro e lança exceção caso não exista aniversariante com esse nome
	 * 
	 * @param nomeAniversariante
	 *            O nome do aniversariante
	 * @throws AniversarianteInexistenteException
	 *             Caso não exista esse aniversariante
	 */
	public void removerAniversariante(String nomeAniversariante) throws AniversarianteInexistenteException;
}
