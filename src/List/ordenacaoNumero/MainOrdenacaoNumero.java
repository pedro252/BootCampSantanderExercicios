package List.ordenacaoNumero;

public class MainOrdenacaoNumero {
    public static void main(String[] args) {


        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

        ordenacaoNumero.adicionarNumero(9);
        ordenacaoNumero.adicionarNumero(2);
        ordenacaoNumero.adicionarNumero(3);
        ordenacaoNumero.adicionarNumero(4);
        ordenacaoNumero.adicionarNumero(5);
        ordenacaoNumero.adicionarNumero(6);
        ordenacaoNumero.adicionarNumero(7);
        ordenacaoNumero.adicionarNumero(8);
        ordenacaoNumero.adicionarNumero(1);

        System.out.println(ordenacaoNumero.ordenarAscendente());
        System.out.println(ordenacaoNumero.ordenarDescendente());
    }
}
