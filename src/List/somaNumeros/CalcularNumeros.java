package List.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class CalcularNumeros {

    int numero;
    private double getNumero;

    @Override
    public String toString() {
        return "CalcularNumeros{" +
                "numero=" + numero +
                '}';
    }

    public CalcularNumeros(int numero) {
        this.numero = numero;
    }

    private List<CalcularNumeros> numerosList;

    public CalcularNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumeros(int numero){
        numerosList.add(new CalcularNumeros(numero));
    }

    public double somaTotal(){
        double valorTotal = 0.0;

        for (CalcularNumeros calcularNumeros : numerosList){
            valorTotal += calcularNumeros.getNumero * calcularNumeros.getNumero;
        }

        return valorTotal;
    }


    public int encontrarMaiorNumero() {
        if (numerosList.isEmpty()) {
            throw new IllegalStateException("A lista está vazia, não é possível encontrar o maior número.");
        }

        int maiorNumero = numerosList.get(0).numero; // Inicializa o maior número com o primeiro elemento da lista

        for (CalcularNumeros calcularNumeros : numerosList) {
            if (calcularNumeros.numero > maiorNumero) {
                maiorNumero = calcularNumeros.numero;
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        if (numerosList.isEmpty()) {
            throw new IllegalStateException("A lista está vazia, não é possível encontrar o maior número.");
        }
        int menorNumero = numerosList.get(0).numero; // Inicializa o maior número com o primeiro elemento da lista

        for (CalcularNumeros calcularNumeros : numerosList) {
            if (calcularNumeros.numero < menorNumero) {
                menorNumero = calcularNumeros.numero;
            }
        }
        return menorNumero;
    }


    public void exibirNumeros(){
        System.out.println(numerosList);
    }


}
