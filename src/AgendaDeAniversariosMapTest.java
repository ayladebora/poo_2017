import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class AgendaDeAniversariosMapTest {

	@Test
	public void test() {
		
		
		AgendaDeAniversariosMap agenda = new AgendaDeAniversariosMap();
		Aniversariante aniv1  = new Aniversariante("José",3,10);
		Aniversariante aniv2 = new Aniversariante("Mário", 2, 10);
		agenda.adicionarAniversariante(aniv1);
		agenda.adicionarAniversariante(aniv2);
		List<Aniversariante> lista = agenda.obterAniversariantesDoMes(10);
		assertTrue(lista.size()==2);
		assertEquals(2,lista.size());
		try{
			agenda.removerAniversariante("José");
		} catch(AniversarianteInexistenteException e){
			fail("Não deveria lançar exceção");
		}
		lista = agenda.obterAniversariantesDoMes(10);
		assertTrue(lista.size() == 1);
	}

}
