package Exercicio02;

public class Gerente extends FuncionarioCLT {
    private int tamanhoEquipe;
    private double percentualBonus;

    public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao,
                   double valeTransporte, double valeAlimentacao, int tamanhoEquipe,
                   double percentualBonus) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    public int getTamanhoEquipe() {
        return tamanhoEquipe;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + getSalarioBase() * percentualBonus;
    }

    @Override
    public double calcularDesconto() {
        double desconto = super.calcularDesconto();

        if (tamanhoEquipe > 10) {
            desconto += 100.0;
        }

        return desconto;
    }
}
