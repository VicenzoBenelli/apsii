package Exercicio01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AniversarianteTest {

	@Test
	void deveConstruirAniversarianteComDiaEMes() {
		Aniversariante aniversariante = new Aniversariante("Ana", 10, 5);

		assertEquals("Ana", aniversariante.getNome());
		assertEquals(new DataAniversario(10, 5), aniversariante.getDataAniversario());
	}

	@Test
	void deveConstruirAniversarianteComDataEncapsulada() {
		DataAniversario data = new DataAniversario(20, 8);

		Aniversariante aniversariante = new Aniversariante("Bruno", data);

		assertEquals("Bruno", aniversariante.getNome());
		assertSame(data, aniversariante.getDataAniversario());
	}

	@Test
	void deveConsiderarIguaisSomenteNomeEDataIguais() {
		Aniversariante aniversariante = new Aniversariante("Carla", 3, 11);
		Aniversariante mesmoNomeEData = new Aniversariante("Carla", new DataAniversario(3, 11));
		Aniversariante outroNome = new Aniversariante("Carlos", 3, 11);
		Aniversariante outraData = new Aniversariante("Carla", 4, 11);

		assertTrue(aniversariante.equals(mesmoNomeEData));
		assertEquals(aniversariante.hashCode(), mesmoNomeEData.hashCode());
		assertFalse(aniversariante.equals(outroNome));
		assertFalse(aniversariante.equals(outraData));
		assertNotEquals(aniversariante, null);
		assertNotEquals(aniversariante, "Carla");
	}
}
