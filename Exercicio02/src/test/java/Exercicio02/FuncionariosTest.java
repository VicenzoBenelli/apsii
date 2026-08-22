package Exercicio02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FuncionariosTest {
    private static final double MARGEM = 0.0001;

    @Test
    void deveCalcularSalarioEDescontoDoFuncionario() {
        Funcionario funcionario = new Funcionario(
                "Ana Costa", "F001", 2500.0, "01/03/2020");

        assertEquals(2500.0, funcionario.calcularSalario(), MARGEM);
        assertEquals(200.0, funcionario.calcularDesconto(), MARGEM);
    }

    @Test
    void deveSomarBeneficiosEAcrescentarDescontoDoFuncionarioClt() {
        FuncionarioCLT funcionario = new FuncionarioCLT(
                "Bruno Reis", "C001", 3000.0, "10/06/2021", 220.0, 400.0);

        assertEquals(3620.0, funcionario.calcularSalario(), MARGEM);
        assertEquals(290.0, funcionario.calcularDesconto(), MARGEM);
    }

    @Test
    void deveSomarBonusEAcrescentarDescontoParaGerenteComEquipeMaiorQueDez() {
        Gerente gerente = new Gerente(
                "Carla Mendes", "G001", 8000.0, "15/01/2018",
                300.0, 500.0, 12, 0.20);

        assertEquals(10400.0, gerente.calcularSalario(), MARGEM);
        assertEquals(790.0, gerente.calcularDesconto(), MARGEM);
    }

    @Test
    void naoDeveAcrescentarDescontoParaGerenteComEquipeDeDezPessoas() {
        Gerente gerente = new Gerente(
                "Gerente", "G002", 5000.0, "01/01/2020",
                200.0, 300.0, 10, 0.10);

        assertEquals(450.0, gerente.calcularDesconto(), MARGEM);
    }

    @Test
    void deveUsarBolsaComoSalarioDoEstagiarioSemDesconto() {
        Estagiario estagiario = new Estagiario(
                "Diego Alves", "E001", 0.0, "05/08/2024", 1500.0, 20);

        assertEquals(1500.0, estagiario.calcularSalario(), MARGEM);
        assertEquals(0.0, estagiario.calcularDesconto(), MARGEM);
    }

    @Test
    void deveIncluirParticipacaoNosLucrosNoSalarioDoDiretor() {
        Diretor diretor = new Diretor(
                "Diretor", "D001", 10000.0, "01/01/2015",
                350.0, 600.0, 20, 0.25, 5000.0);

        assertEquals(18450.0, diretor.calcularSalario(), MARGEM);
        assertEquals(950.0, diretor.calcularDesconto(), MARGEM);
    }

    @Test
    void toStringDeveUsarCalculosPolimorficos() {
        Estagiario estagiario = new Estagiario(
                "Diego Alves", "E001", 0.0, "05/08/2024", 1500.0, 20);

        String texto = estagiario.toString();

        assertTrue(texto.startsWith("Estagiario{"));
        assertTrue(texto.contains("salario=1500.0"));
        assertTrue(texto.contains("desconto=0.0"));
        assertTrue(texto.contains("salarioLiquido=1500.0"));
    }
}
