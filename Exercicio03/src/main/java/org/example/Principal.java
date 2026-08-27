package org.example;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       Scanner tlc = new Scanner(System.in);
       Livro livro = new Livro();
       CD cd = new CD();

       System.out.println("Digite o nome do Livro:");
       livro.setNome(tlc.nextLine());

       System.out.println("Digite o valor do Livro:");
       livro.setPreco(tlc.nextDouble());
       tlc.nextLine();

       System.out.println("Digite o autor do Livro:");
       livro.setAutor(tlc.nextLine());

       System.out.println("\nDigite o nome do CD:");
       cd.setNome(tlc.nextLine());

       System.out.println("Digite o valor do CD:");
       cd.setPreco(tlc.nextDouble());

       System.out.println("Digite o número de faixas do CD:");
       cd.setNumFaixas(tlc.nextInt());

       cd.exibeinformacoes();
       livro.exibeinformacoes();




    }
}