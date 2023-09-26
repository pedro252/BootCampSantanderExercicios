package List.somaNumeros;

public class MainCalcular {
    public static void main(String[] args) {

        CalcularNumeros calcularNumeros = new CalcularNumeros();

        calcularNumeros.adicionarNumeros(220);
        calcularNumeros.adicionarNumeros(500);
        calcularNumeros.adicionarNumeros(1);
        calcularNumeros.exibirNumeros();

        int maiorNumero = calcularNumeros.encontrarMaiorNumero();
        System.out.println(maiorNumero);
        int menorNumero = calcularNumeros.encontrarMenorNumero();
        System.out.println(menorNumero);
    }
}
