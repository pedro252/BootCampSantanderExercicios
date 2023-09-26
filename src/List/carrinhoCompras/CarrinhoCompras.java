package List.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Produto> produtoList;

    public CarrinhoCompras() {
        this.produtoList = new  ArrayList<>();
    }

    public void adicionarItens (String nome, double preco, int quatidade){
        produtoList.add(new Produto(nome, preco, quatidade));
    }

    public void removerItem (String nome){

        List<Produto> produtosParaRemover = new ArrayList<>();
        for (Produto p : produtoList){
            if (p.getNome().equals(nome)){
                produtosParaRemover.add(p);
            }
        }
        produtoList.removeAll(produtosParaRemover);

    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;

        for (Produto produto : produtoList) {
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }

        return valorTotal; // Retorna o valor total calculado
    }

    public void exibirItens(){
        System.out.println(produtoList);
    }


}


