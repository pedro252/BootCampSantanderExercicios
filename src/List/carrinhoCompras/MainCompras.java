package List.carrinhoCompras;

public class MainCompras {

        public static void main(String[] args) {

            CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

            carrinhoCompras.adicionarItens("Bone", 15.00, 5);
            System.out.println("O valor de sua compra ficou: " + carrinhoCompras.calcularValorTotal());

            carrinhoCompras.exibirItens();
        }
}
