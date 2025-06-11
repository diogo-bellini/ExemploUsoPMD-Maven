package br.ufscar.dc.dsw;

public class Calculadora {

    public int somar(int a, int b) {
        System.out.println("Somando...");
        return a + b;
    }

    public int subtrair(int a, int b) {
        System.out.println("Subtraindo...");
        return a - b;
    }

    public int metodoDesnecessario(int x) {
        if (true) {
            return x;
        } else {
            return 0;
        }
    }

    public void variavelNaoUsada() {
        int inutil = 42;
        System.out.println("Olá");
    }
}
