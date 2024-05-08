
import java.time.LocalDate;
import model.Biblioteca;
import model.Livro;
import model.Usuario;


public class Teste {
    public static void main(String[] args) throws Exception {
        Biblioteca bibli = new Biblioteca();     

        Livro a = new Livro("Biblia", "Deus", "Profético", LocalDate.of(0, 1, 1), 1000);
        Usuario g = new Usuario("Guilherme", "41", "991051033", "Rua", "guilherme@email.com", LocalDate.of(1997, 7, 21));
        
        
        System.out.println("Biblioteca Vazia");
        System.out.println(bibli);
        
        bibli.cadastrarLivro(a);
        bibli.cadastrarUsuario(g);

        System.out.println("Itens Cadastrados");
        System.out.println(bibli);


        System.out.println("Buscas");
        System.out.println(bibli.buscarLivroPorCodigo(1));
        System.out.println(bibli.buscarUsuarioPorCodigo(1));
        //System.out.println(bibli.buscarLivrosPorAutor("Deus"));
        //System.out.println(bibli.buscarLivrosPorCategoria("Profético"));
        System.out.println(bibli.filtrarLivrosPorTitulo("Biblia"));

        System.out.println("Emprestimos");
        System.out.println(bibli.emprestarLivro(1, 1));
        System.out.println(bibli.emprestarLivro(1, 1));
        
        //teste de atraso (para testar eu defini que em qualificaParaEmprestimoEspecial() bastava 2 empréstimos)
        //Emprestimo b = bibli.buscarLivroPorCodigo(1).getEmprestimo().stream().findFirst().orElse(null);
        //b.setDataDevolucao(LocalDate.of(2050, 10, 4));


        bibli.devolverLivro(1, 1);
        System.out.println(bibli.emprestarLivro(1, 1));
        System.out.println("Devolucao");
        System.out.println(bibli.devolverLivro(1, 1));
        System.out.println(g);

        
    }
}
