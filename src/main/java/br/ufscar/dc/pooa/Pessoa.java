package br.ufscar.dc.pooa;

public class Pessoa {

    private String n; // nome com uma letra só (ruim)
    private int i;    // idade com uma letra só (ruim)

    public Pessoa(String n, int i) {
        this.n = n;
        this.i = i;
    }

    public void imprimir() {
        System.out.println("Nome: " + n + ", Idade: " + i);
    }
}
