package view;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import controller.BibliotecaController;
import model.Livro;
import model.Usuario;

public class BibliotecaView {
    private Scanner scanner;
    private BibliotecaController controller;

    public BibliotecaView(BibliotecaController controller, Scanner scanner) {
        this.scanner = scanner;
        this.controller = controller;
    }

    public void menu() {
        while (true) {
            System.out.println("\n*** Menu Principal da Biblioteca ***");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Usuário");
            System.out.println("3. Consultar Usuarios");
            System.out.println("4. Consultar Livros");
            System.out.println("5. Emprestar Livro");
            System.out.println("6. Devolver Livro");
            System.out.println("7. Relatórios");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            int option = readInt();
            controller.setBibliotecaView(this);
            controller.menuSelect(option);
        }
    }

    public void cadastrarLivro() {
        try {
            System.out.print("Digite o título do livro: ");
            String titulo = scanner.nextLine().strip().toLowerCase();
    
            System.out.print("Digite o autor do livro: ");
            String autor = scanner.nextLine().strip().toLowerCase();
            if (!autor.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\s]*")) {
                throw new IllegalArgumentException("O autor não pode conter números.");
            }
    
            System.out.print("Digite a categoria do livro: ");
            String categoria = scanner.nextLine().strip().toLowerCase();
            if (!categoria.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\s]*")) {
                throw new IllegalArgumentException("A categoria não pode conter números.");
            }
    
            System.out.print("Digite a data de publicação (yyyy-MM-dd): ");
            String data = scanner.nextLine().strip();
            LocalDate publicacao = LocalDate.parse(data);
    
            System.out.print("Digite a quantidade de exemplares: ");
            String qtdExemplaresStr = scanner.nextLine().strip();
            if (!qtdExemplaresStr.matches("\\d+")) {
                throw new IllegalArgumentException("A quantidade de exemplares deve conter apenas números.");
            }
            int qtdExemplares = Integer.parseInt(qtdExemplaresStr);
    
            Livro livro = new Livro(titulo, autor, categoria, publicacao, qtdExemplares);
            controller.cadastrarLivro(livro);
        } catch (DateTimeParseException e) {
            System.out.println("A data precisa estar no formato yyyy-MM-dd");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Desculpe, ocorreu um erro inesperado.");
            scanner.nextLine();
        }
    }
    
    public void cadastrarUsuario() {
        try {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine().strip().toLowerCase();
            if (!nome.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\s]*")) {
                throw new IllegalArgumentException("O nome não pode conter números.");
            }
    
            System.out.print("Digite o ddd: ");
            String ddd = scanner.nextLine().strip();
            if (!ddd.matches("\\d{2,3}")) {
                throw new IllegalArgumentException("O DDD deve conter apenas números e ter no mínimo 2 e no máximo 3 dígitos.");
            }
    
            System.out.print("Digite o telefone: ");
            String telefone = scanner.nextLine().strip();
            if (!telefone.matches("\\d+")) {
                throw new IllegalArgumentException("O telefone deve conter apenas números.");
            }
    
            System.out.print("Digite o endereço: ");
            String endereco = scanner.nextLine().strip().toLowerCase();
    
            System.out.print("Digite o e-mail: ");
            String email = scanner.nextLine().strip().toLowerCase();
            if (!email.contains("@") || !email.contains(".")) {
                throw new IllegalArgumentException("O e-mail deve conter '@' e '.'");
            }
    
            System.out.print("Digite a data de nascimento (yyyy-MM-dd): ");
            String dataNascimento = scanner.nextLine();
            LocalDate dataNasc = LocalDate.parse(dataNascimento);
    
            Usuario usuario = new Usuario(nome, ddd, telefone, endereco, email, dataNasc);
            controller.cadastrarUsuario(usuario);
        } catch (DateTimeParseException e) {
            System.out.println("A data precisa estar no formato yyyy-MM-dd");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Desculpe, ocorreu um erro inesperado.");
            scanner.nextLine();
        }
    }

    public void consultarUsuario() {
        while (true) {
            System.out.println("\n*** Consulta de Usuarios ***");
            System.out.println("1. Consultar todos");
            System.out.println("2. Consultar por ID");
            System.out.println("3. Consultar por Nome");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            int option = readInt();
            controller.setBibliotecaView(this);
            controller.userSelect(option);
        }
    }

    public void consultarLivro() {
        while (true) {
            System.out.println("\n*** Consulta de Livros ***");
            System.out.println("1. Consultar todos");
            System.out.println("2. Consultar por ID");
            System.out.println("3. Consultar por Titulo");
            System.out.println("4. Consultar por Autor");
            System.out.println("5. Consultar por Categoria");
            System.out.println("6. Voltar");
            System.out.print("Escolha uma opção: ");
            int option = readInt();
            controller.setBibliotecaView(this);
            controller.livroSelect(option);
        }
    }

    public void relatorios() {
        while (true) {
            System.out.println("\n*** Relatorios ***");
            System.out.println("1. Livros emprestados");
            System.out.println("2. Livros mais populares");
            System.out.println("3. Usuarios com atraso");
            System.out.println("4. Usuarios com emprestimo");
            System.out.println("6. Voltar");
            System.out.print("Escolha uma opção: ");
            int option = readInt();
            controller.setBibliotecaView(this);
            controller.relatorioSelect(option);
        }
    }

    public int consultarUserPorID() {
        try {
            System.out.print("Digite o ID: ");
            return scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Desculpe, ocorreu um erro inesperado.");
            scanner.nextLine();
            return 0;
        }
    }

    public String consultarUserPorNome() {
        try {
            System.out.print("Digite o Nome: ");
            String nome = scanner.nextLine().strip().toLowerCase();
            if (!nome.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\s]*")) {
                throw new IllegalArgumentException("O nome não pode conter números.");
            }
            return nome;
        } catch (Exception e) {
            System.out.println("Desculpe, ocorreu um erro inesperado.");
            scanner.nextLine();
            return null;
        }
    }

    public int consultarLivroPorID() {
        try {
            System.out.print("Digite o ID: ");
            return scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Desculpe, ocorreu um erro inesperado.");
            scanner.nextLine();
            return 0;
        }
    }

    public String consultarLivroPorTitulo() {
        try {
            System.out.print("Digite o Título: ");
            String titulo = scanner.nextLine().strip().toLowerCase();
            if (!titulo.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\s]*")) {
                throw new IllegalArgumentException("O título não pode conter números.");
            }
            return titulo;
        } catch (Exception e) {
            System.out.println("Desculpe, ocorreu um erro inesperado.");
            scanner.nextLine();
            return null;
        }
    }

    public String consultarLivroPorAutor() {
        try {
            System.out.print("Digite o nome do Autor: ");
            String autor = scanner.nextLine().strip().toLowerCase();
            if (!autor.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\s]*")) {
                throw new IllegalArgumentException("O nome do autor não pode conter números.");
            }
            return autor;
        } catch (Exception e) {
            System.out.println("Desculpe, ocorreu um erro inesperado.");
            scanner.nextLine();
            return null;
        }
    }

    public String consultarLivroPorCategoria() {
        try {
            System.out.print("Digite a Categoria: ");
            return scanner.nextLine();

        } catch (Exception e) {
            System.out.println("Desculpe, ocorreu um erro inesperado.");
            scanner.nextLine();
            return null;
        }
    }

    public int IDLivro() {
        try {
            System.out.print("Digite o ID do Livro: ");
            return scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Desculpe, ocorreu um erro inesperado.");
            scanner.nextLine();
            return 0;
        }
    }

    public int IDUser() {
        try {
            System.out.print("Digite o ID do usuario: ");
            return scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Desculpe, ocorreu um erro inesperado.");
            scanner.nextLine();
            return 0;
        }
    }

    private int readInt() {
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Por favor, insira um número válido: ");
        }
            int input = scanner.nextInt();
            scanner.nextLine();
        return input;
    }

    public void close() {
        scanner.close();
    }
}