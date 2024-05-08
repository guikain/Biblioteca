import java.time.LocalDate;
import java.util.Scanner;

import controller.BibliotecaController;
import model.Biblioteca;
import model.Emprestimo;
import model.Livro;
import model.Usuario;
import view.BibliotecaView;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();


        //itens de teste!
        Livro l1 = new Livro("Biblia", "Deus", "Profético", LocalDate.of(2020, 10, 1), 1000);
        Livro l2 = new Livro("Livro1", "Autor1", "Romance", LocalDate.of(2021, 10, 1), 100);
        Livro l3 = new Livro("Livro2", "Autor2", "Aventura", LocalDate.of(2020, 10, 1), 100);
        Livro l4 = new Livro("Livro3", "Autor2", "Aventura", LocalDate.of(2021, 10, 1), 100);
        Livro l5 = new Livro("Livro4", "Autor3", "Romance", LocalDate.of(2019, 10, 1), 100);
        Livro l6 = new Livro("Livro5", "Autor3", "Ficcao", LocalDate.of(2018, 10, 1), 100);
        Livro l7 = new Livro("Livro6", "Autor4", "Investigação", LocalDate.of(2010, 10, 1), 100);
        Livro l8 = new Livro("Livro7", "Autor5", "Histórico", LocalDate.of(2022, 10, 1), 100);
        Livro l9 = new Livro("Livro8", "Autor5", "Revista", LocalDate.of(2019, 10, 1), 100);
        Livro l0 = new Livro("Livro1", "Autor2", "Romance", LocalDate.of(2020, 10, 1), 100);
        Usuario u1 = new Usuario("Guilherme", "41", "991051033", "Rua", "guilherme@email.com", LocalDate.of(2000, 7, 21));
        Usuario u2 = new Usuario("Joaozinho1", "41", "991051033", "Rua", "guilherme@email.com", LocalDate.of(1999, 5, 10));
        Usuario u3 = new Usuario("Joaozinho2", "41", "991051033", "Rua", "guilherme@email.com", LocalDate.of(1997, 5, 10));
        Usuario u4 = new Usuario("Joaozinho3", "41", "991051033", "Rua", "guilherme@email.com", LocalDate.of(2000, 5, 10));
        Usuario u5 = new Usuario("Joaozinho4", "41", "991051033", "Rua", "guilherme@email.com", LocalDate.of(1999, 7, 21));
        Usuario u6 = new Usuario("Joaozinho5", "41", "991051033", "Rua", "guilherme@email.com", LocalDate.of(2000, 5, 21));
        Usuario u7 = new Usuario("Joaozinho6", "41", "991051033", "Rua", "guilherme@email.com", LocalDate.of(1999, 5, 21));
        Usuario u8 = new Usuario("Joaozinho7", "41", "991051033", "Rua", "guilherme@email.com", LocalDate.of(2000, 5, 21));

        biblioteca.cadastrarLivro(l1);
        biblioteca.cadastrarLivro(l2);
        biblioteca.cadastrarLivro(l3);
        biblioteca.cadastrarLivro(l4);
        biblioteca.cadastrarLivro(l5);
        biblioteca.cadastrarLivro(l6);
        biblioteca.cadastrarLivro(l7);
        biblioteca.cadastrarLivro(l8);
        biblioteca.cadastrarLivro(l9);
        biblioteca.cadastrarLivro(l0);

        biblioteca.cadastrarUsuario(u1);
        biblioteca.cadastrarUsuario(u2);
        biblioteca.cadastrarUsuario(u3);
        biblioteca.cadastrarUsuario(u4);
        biblioteca.cadastrarUsuario(u5);
        biblioteca.cadastrarUsuario(u6);
        biblioteca.cadastrarUsuario(u7);
        biblioteca.cadastrarUsuario(u8);


        biblioteca.emprestarLivro(1, 1);
        biblioteca.emprestarLivro(1, 2);
        biblioteca.emprestarLivro(2, 3);
        biblioteca.emprestarLivro(3, 5);
        biblioteca.emprestarLivro(5, 4);
        biblioteca.emprestarLivro(1, 8);
        biblioteca.emprestarLivro(2, 4);


        Emprestimo b = biblioteca.buscarUsuarioPorCodigo(2).getEmprestimo().stream().findFirst().orElse(null);
        b.setDataDevolucao(LocalDate.of(2050, 10, 4));
        Emprestimo c = biblioteca.buscarUsuarioPorCodigo(5).getEmprestimo().stream().findFirst().orElse(null);
        c.setDataDevolucao(LocalDate.of(2050, 10, 4));






        BibliotecaController controller = new BibliotecaController(biblioteca);
        BibliotecaView view = new BibliotecaView(controller, scanner);
        view.menu();
    }
}
