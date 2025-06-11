package br.ufscar.dc.pooa;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(3, 5);
        System.out.println("Resultado: " + resultado);

        Pessoa p = new Pessoa("Ana", 30);
        p.imprimir();
    }
}
