package org.example.exercicio1;

public class Principal {
    public static void main(String[] args) {

        Banco banco = new Banco("João", "123.456.789-00", 1000.0);
        System.out.println("Nome: " + banco.getNome());
        System.out.println("CPF: " + banco.getCpf());
        System.out.println("Saldo: " + banco.getSaldo());

        System.out.println("-----------------------------");

        Banco banco2 = new Banco();
        System.out.println("Nome: " + banco2.getNome());
        System.out.println("CPF: " + banco2.getCpf());
        System.out.println("Saldo: " + banco2.getSaldo());

        System.out.println("--------------Imprimir valor de B1---------------");
        System.out.println("Nome: " + banco.getNome());
        System.out.println("CPF: " + banco.getCpf());
        System.out.println("Saldo: " + banco.getSaldo());

        //"--------------Alterar Saldo de B1---------------"
        banco.setSaldo(2000.0);

        System.out.println("--------------Imprimir valor de B1 após alteração---------------");
        System.out.println("Nome: " + banco.getNome());
        System.out.println("CPF: " + banco.getCpf());
        System.out.println("Saldo: " + banco.getSaldo());


    }
}
