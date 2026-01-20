import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Lilika",18);
        Pessoa pessoa2 = new Pessoa("Willian", 21);
        Pessoa pessoa3 = new Pessoa("Samara", 19);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("O tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeiro da lista: " + listaDePessoas.get(0));
        System.out.println("Lista completa: ");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }


    }
}