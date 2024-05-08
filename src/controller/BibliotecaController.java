package controller;

import model.Biblioteca;
import model.Livro;
import model.Usuario;
import view.BibliotecaView;

public class BibliotecaController {
    private Biblioteca biblioteca;
    private BibliotecaView bibliotecaView;

    public BibliotecaController(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public BibliotecaView getBibliotecaView() {
        return bibliotecaView;
    }

    public void setBibliotecaView(BibliotecaView bibliotecaView) {
        this.bibliotecaView = bibliotecaView;
    }

    public void menuSelect(int opcao) {
        switch (opcao) {
            case 1:
                bibliotecaView.cadastrarLivro();
                break;
            case 2:
                bibliotecaView.cadastrarUsuario();
                break;
            case 3:
                bibliotecaView.consultarUsuario();
                break;
            case 4:
                bibliotecaView.consultarLivro();
                break;
            case 5:
                biblioteca.emprestarLivro(bibliotecaView.IDLivro(), bibliotecaView.IDUser());
                break;
            case 6:
                biblioteca.devolverLivro(bibliotecaView.IDLivro(), bibliotecaView.IDUser());
                break;
            case 7:
                // Lógica para mostrar relatórios
                break;
            case 8:
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida! Por favor, tente novamente.");
                break;
        }
    }

    public void livroSelect(int opcao) {
        switch (opcao) {
            case 1:
                System.out.println(biblioteca.exibirLivros());
                break;
            case 2:
                int id = bibliotecaView.consultarLivroPorID();
                if( id > 0){
                    System.out.println(biblioteca.filtrarLivrosPorCodigo(id));
                }
                break;
            case 3:
                String titulo = bibliotecaView.consultarLivroPorTitulo();
                if( titulo != null){
                    System.out.println(biblioteca.filtrarLivrosPorTitulo(titulo));
                }
                break;
            case 4:
                String autor = bibliotecaView.consultarLivroPorAutor();
                if( autor != null){
                    System.out.println(biblioteca.filtrarLivrosPorAutor(autor));
                }
                break;
            case 5:
                String categoria = bibliotecaView.consultarLivroPorCategoria();
                if( categoria != null){
                    System.out.println(biblioteca.filtrarLivrosPorCategoria(categoria));
                }
                break;
            case 6:
                System.out.println("Voltando...");
                bibliotecaView.menu();
                break;
            default:
                System.out.println("Opção inválida! Por favor, tente novamente.");
        }
    }

    public void userSelect(int opcao) {
        switch (opcao) {
            case 1:
                System.out.println(biblioteca.exibirUsuarios());
                break;
            case 2:
                int id = bibliotecaView.consultarUserPorID();
                if( id > 0){
                    System.out.println(biblioteca.filtrarUserPorCodigo(id));
                }
                break;
            case 3:
                String nome = bibliotecaView.consultarUserPorNome();
                if( nome != null){
                    System.out.println(biblioteca.filtrarUserPorNome(nome));
                }
                break;
            case 4:
                System.out.println("Voltando...");
                bibliotecaView.menu();
                break;
            default:
                System.out.println("Opção inválida! Por favor, tente novamente.");
        }
    }


    
    public void relatorioSelect(int opcao) {
        switch (opcao) {
            case 1:
                //livros emprestados
                break;
            case 2:
                //livros mais populares
                break;
            case 3:
                //usuarios com atraso
                break;
            case 4:
                //usuarios com emprestimo
            case 5:
            System.out.println("Voltando...");
            bibliotecaView.menu();
            break;
            default:
                System.out.println("Opção inválida! Por favor, tente novamente.");
        }
    }

    public String cadastrarLivro(Livro livro) {
       try {
        biblioteca.cadastrarLivro(livro);
        return "Livro adicionado";
       } catch (Exception e) {
        return "Erro";
       }
       
    }
    public String cadastrarUsuario(Usuario usuario) {
        try {
         biblioteca.cadastrarUsuario(usuario);
         return "Usuario adicionado";
        } catch (Exception e) {
         return "Erro";
        } 
     }

}