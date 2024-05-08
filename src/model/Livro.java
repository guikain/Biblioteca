package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import util.Util;

public class Livro implements Comparable<Livro> {
    private String titulo, autor, categoria;
    private LocalDate publicacao;
    private int id, qtdExemplares;
    private List<Emprestimo> emprestimo;

    public Livro(String titulo, String autor, String categoria, LocalDate publicacao, int qtdExemplares) {
        this.id = Util.generateLivroId();
        setTitulo(titulo);
        setAutor(autor);
        setCategoria(categoria);
        setPublicacao(publicacao);
        setQtdExemplares(qtdExemplares);
        this.emprestimo = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getQtdExemplares() {
        return qtdExemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public LocalDate getPublicacao() {
        return publicacao;
    }

    public List<Emprestimo> getEmprestimo() {
        return emprestimo;
    };

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = Util.normalizeString(titulo);
    }

    public void setAutor(String autor) {
        this.autor = Util.normalizeString(autor);
    }

    public void setCategoria(String categoria) {
        this.categoria = Util.normalizeString(categoria);
    }

    public void setPublicacao(LocalDate publicacao) {
        if (Util.validateLocalDate(publicacao)) {
            this.publicacao = publicacao;
        }
    }

    public void setQtdExemplares(int qtdExemplares) {
        if (Util.validateQuantity(qtdExemplares)) {
            this.qtdExemplares = qtdExemplares;
        }
    }

    @Override
    public int compareTo(Livro livro) {
        return this.titulo.compareTo(livro.getTitulo());
    }

    @Override
    public String toString() {
        return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", categoria=" + categoria + ", publicacao="
                + publicacao + ", qtdExemplares=" + qtdExemplares + ", emprestimo=" + emprestimo + "]";
    }

   
}