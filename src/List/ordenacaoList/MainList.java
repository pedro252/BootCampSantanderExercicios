package List.ordenacaoList;

public class MainList {
    public static void main(String[] args){
        OrdenaPessoas ordenaPessoas = new OrdenaPessoas();
        ordenaPessoas.adicionarPessoa("Pessoas 1", 20, 1.85);
        ordenaPessoas.adicionarPessoa("Pessoas 2", 18, 1.76);
        ordenaPessoas.adicionarPessoa("Pessoas 3", 25, 1.91);
        ordenaPessoas.adicionarPessoa("Pessoas 4", 47, 1.87);
        ordenaPessoas.adicionarPessoa("Pessoas 5", 53, 1.57);

        System.out.println(ordenaPessoas.ordenarPorIdade());
        System.out.println(ordenaPessoas.ordenarPorAltura());
    }
}
