package Exercicio01;

import java.util.ArrayList;
import java.util.Objects;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

	private final ArrayList<Aniversariante> aniversariantes = new ArrayList<>();

	@Override
	public void adicionarAniversariante(String nome, int dia, int mes) {
		aniversariantes.add(new Aniversariante(nome, dia, mes));
	}

	@Override
	public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
		ArrayList<String> nomes = new ArrayList<>();
		DataAniversario dataPesquisada = new DataAniversario(dia, mes);

		for (Aniversariante aniversariante : aniversariantes) {
			if (dataPesquisada.equals(aniversariante.getDataAniversario())) {
				nomes.add(aniversariante.getNome());
			}
		}

		return nomes;
	}

	@Override
	public void removerAniversariante(String nomeAniversariante) {
		for (int i = aniversariantes.size() - 1; i >= 0; i--) {
			Aniversariante aniversariante = aniversariantes.get(i);
			if (Objects.equals(aniversariante.getNome(), nomeAniversariante)) {
				aniversariantes.remove(i);
			}
		}
	}
}
