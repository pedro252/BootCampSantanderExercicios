package List.ordenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaPessoas {
    private List<Pessoas> pessoasList;

    public OrdenaPessoas(){
        this.pessoasList = new ArrayList<>(); //iniciar a lista com `0`
    }

    public void  adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordenarPorIdade() {
        List<Pessoas> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoas> ordenarPorAltura(){
        List<Pessoas> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new CompararPorAltura());
        return pessoasPorAltura;
    }


}
