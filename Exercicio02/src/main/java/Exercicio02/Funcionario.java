package Exercicio02;

public class Funcionario {
    private String nome;
    private String matricula;
    private double salarioBase;
    private String dataAdmissao;

    public Funcionario(String nome, String matricula, double salarioBase, String dataAdmissao) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public double calcularDesconto() {
        return salarioBase * 0.08;
    }

    @Override
    public String toString() {
        double liquido = calcularSalario() - calcularDesconto();

        return getClass().getSimpleName() + "{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salarioBase=" + salarioBase +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", salario=" + calcularSalario() +
                ", desconto=" + calcularDesconto() +
                ", salarioLiquido=" + liquido +
                '}';
    }
}
