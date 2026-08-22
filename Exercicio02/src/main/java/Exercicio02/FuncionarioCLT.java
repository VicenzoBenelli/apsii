package Exercicio02;

public class FuncionarioCLT extends Funcionario {
    private double valeTransporte;
    private double valeAlimentacao;

    public FuncionarioCLT(String nome, String matricula, double salarioBase, String dataAdmissao,
                          double valeTransporte, double valeAlimentacao) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public double getValeAlimentacao() {
        return valeAlimentacao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + valeTransporte + valeAlimentacao;
    }

    @Override
    public double calcularDesconto() {
        return super.calcularDesconto() + 50.0;
    }
}
