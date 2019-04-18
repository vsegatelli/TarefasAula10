package br.com.digitalhouse;

public class Exercicio1 {
    public static void main(String[] args) {

        Pessoa victor = new Pessoa("Victor ", 1234);
        Pessoa henrique = new Pessoa("Henrique ", 1234);

        System.out.println(victor == henrique);
    }
}
