package List.catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivros (String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor (String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAno = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l : livroList){
                if(l.getAnopublicacao() >= anoInicial && l.getAnopublicacao() <= anoFinal){
                    livroPorIntervaloAno.add(l);
                }
            }

        }
        return livroPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }
}
