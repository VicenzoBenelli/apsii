package Exercicio01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MinhaAgendaDeAniversariosTest {

	@Test
	void deveAdicionarEObterTodosOsAniversariantesDaDataNaOrdemDeCadastro() {
		MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();
		agenda.adicionarAniversariante("Ana", 10, 5);
		agenda.adicionarAniversariante("Bruno", 20, 8);
		agenda.adicionarAniversariante("Carla", 10, 5);

		assertEquals(Arrays.asList("Ana", "Carla"), agenda.obterAniversariantesDoDia(10, 5));
		assertTrue(agenda.obterAniversariantesDoDia(1, 1).isEmpty());
	}

	@Test
	void deveRemoverTodosOsAniversariantesQuePossuemONomeInformado() {
		MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();
		agenda.adicionarAniversariante("Ana", 10, 5);
		agenda.adicionarAniversariante("Ana", 20, 8);
		agenda.adicionarAniversariante("Bruno", 20, 8);

		agenda.removerAniversariante("Ana");

		assertTrue(agenda.obterAniversariantesDoDia(10, 5).isEmpty());
		assertEquals(Arrays.asList("Bruno"), agenda.obterAniversariantesDoDia(20, 8));
	}

	@Test
	void deveRemoverSomenteNomeComGrafiaExata() {
		MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();
		agenda.adicionarAniversariante("Ana", 10, 5);

		agenda.removerAniversariante("ana");

		assertEquals(Arrays.asList("Ana"), agenda.obterAniversariantesDoDia(10, 5));
	}
}
