package List.ordenacaoNumero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumero implements Comparable<OrdenacaoNumero> {

    private int numero;

    public OrdenacaoNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return
                "numero=" + numero ;
    }

    @Override
    public int compareTo(OrdenacaoNumero n) {
        return Integer.compare(numero, n.getNumero());
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    //criar lista
    private List <OrdenacaoNumero> numeroList;
    //iniciar a lista

    public OrdenacaoNumero() {
        this.numeroList = new ArrayList<>();
    }
    //adicionar numero

    public void adicionarNumero(int numero){
        numeroList.add(new OrdenacaoNumero(numero));
    }

    public List<OrdenacaoNumero> ordenarAscendente(){
            List<OrdenacaoNumero> numeroAscendente = new ArrayList<>(numeroList);
        Collections.sort(numeroAscendente);
        return numeroAscendente;
    }
    public List<OrdenacaoNumero> ordenarDescendente() {
        List<OrdenacaoNumero> numeroDescendente = new ArrayList<>(numeroList);

        Collections.sort(numeroDescendente, new Comparator<OrdenacaoNumero>() {
            @Override
            public int compare(OrdenacaoNumero o1, OrdenacaoNumero o2) {
                // Para ordenar de forma decrescente invertemos a comparação
                return Integer.compare(o2.getNumero(), o1.getNumero());
            }
        });

        return numeroDescendente;
    }

}
