package List.catalogoLivros;

public class MainLivro {
    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Livro 1 ", "Autor 1", 2020);
        catalogoLivros.adicionarLivros("Livro 1 ", "Autor 2", 2024);
        catalogoLivros.adicionarLivros("Livro 3 ", "Autor 3", 2021);
        catalogoLivros.adicionarLivros("Livro 4 ", "Autor 4", 2022);
        catalogoLivros.adicionarLivros("Livro 5 ", "Autor 5", 2023);
        catalogoLivros.adicionarLivros("Livro 6 ", "Autor 6", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1 "));
    }
}
