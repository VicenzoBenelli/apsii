package org.example;

public class Livro extends Produto implements InfoGerais{

    private String Autor;

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    @Override
    public void exibeinformacoes() {
        System.out.println("\n--- Informações do Livro ---");
        System.out.println("Autor: " + getAutor());
        System.out.println("Preço: R$ " + getPreco());
    }
}
