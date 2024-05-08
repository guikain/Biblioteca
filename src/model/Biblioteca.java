package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import util.Util;

    public class Biblioteca{

        private List<Livro> livros;
        private List<Usuario> usuarios;

        public Biblioteca() {
            this.livros = new ArrayList<>();
            this.usuarios = new ArrayList<>();
        }
        public List<Livro> getLivros() {
            return livros;
        }
        public List<Usuario> getUsuarios() {
            return usuarios;
        }
        public void setLivros(List<Livro> livros) {
            this.livros = livros;
        }
        public void setUsuarios(List<Usuario> usuarios) {
            this.usuarios = usuarios;
        }

        public Usuario buscarUsuarioPorCodigo(int codigo) {
            return usuarios.stream().filter(u -> u.getId() == codigo).findFirst().orElse(null);
        }

        public String filtrarUserPorCodigo(int codigo) {

            List<Usuario> Lusers = usuarios.stream()
            .filter(u -> u.getId() == codigo)
            .collect(Collectors.toList());

            String Susers = "";
            for (Usuario usr : Lusers) {
                Susers += "\n ID: "+usr.getId();
                Susers += "\n Nome: "+usr.getNome();
                Susers += "\n DDD: "+usr.getDdd();
                Susers += "\n Telefone: "+usr.getTelefone();
                Susers += "\n Endereco: "+usr.getEndereco();
                Susers += "\n Email: "+usr.getEmail();
                Susers += "\n Data de nascimento: "+usr.getDataNascimento();
                Susers += "\n Quantidade de exemplares Disponiveis: "+usr.getVip()+"\n";
            }
            return Susers;
        }

        public String filtrarUserPorNome(String nome) {

            List<Usuario> Lusers = usuarios.stream()
            .filter(u -> u.getNome() == nome)
            .collect(Collectors.toList());

            String Susers = "";
            for (Usuario usr : Lusers) {
                Susers += "\n ID: "+usr.getId();
                Susers += "\n Nome: "+usr.getNome();
                Susers += "\n DDD: "+usr.getDdd();
                Susers += "\n Telefone: "+usr.getTelefone();
                Susers += "\n Endereco: "+usr.getEndereco();
                Susers += "\n Email: "+usr.getEmail();
                Susers += "\n Data de nascimento: "+usr.getDataNascimento();
                Susers += "\n Quantidade de exemplares Disponiveis: "+usr.getVip()+"\n";
            }
            return Susers;
        }
        
        public Livro buscarLivroPorCodigo(int codigo) {
            return livros.stream().filter(l -> l.getId() == codigo).findFirst().orElse(null);
        }

        public String filtrarLivrosPorCodigo(int codigo) {

            List<Livro> Llivros = livros.stream()
            .filter(l -> l.getId() == codigo)
            .collect(Collectors.toList());

            String Slivros = "";
            for (Livro liv : Llivros) {
                Slivros += "\n ID: "+liv.getId();
                Slivros += "\n Titulo: "+liv.getTitulo();
                Slivros += "\n Autor: "+liv.getAutor();
                Slivros += "\n Categoria: "+liv.getCategoria();
                Slivros += "\n Data de Publicacao: "+liv.getPublicacao();
                Slivros += "\n Quantidade de exemplares Disponiveis: "+liv.getQtdExemplares()+"\n";
            }
            return Slivros;
        }

        public String filtrarLivrosPorTitulo(String titulo) {

            List<Livro> Llivros = livros.stream()
            .filter(l -> l.getTitulo() == titulo)
            .collect(Collectors.toList());

            String Slivros = "";
            for (Livro liv : Llivros) {
                Slivros += "\n ID: "+liv.getId();
                Slivros += "\n Titulo: "+liv.getTitulo();
                Slivros += "\n Autor: "+liv.getAutor();
                Slivros += "\n Categoria: "+liv.getCategoria();
                Slivros += "\n Data de Publicacao: "+liv.getPublicacao();
                Slivros += "\n Quantidade de exemplares Disponiveis: "+liv.getQtdExemplares()+"\n";
            }
            return Slivros;
        }

        public String filtrarLivrosPorAutor(String autor) {

            List<Livro> Llivros = livros.stream()
            .filter(l -> l.getAutor() == autor)
            .collect(Collectors.toList());

            String Slivros = "";
            for (Livro liv : Llivros) {
                Slivros += "\n ID: "+liv.getId();
                Slivros += "\n Titulo: "+liv.getTitulo();
                Slivros += "\n Autor: "+liv.getAutor();
                Slivros += "\n Categoria: "+liv.getCategoria();
                Slivros += "\n Data de Publicacao: "+liv.getPublicacao();
                Slivros += "\n Quantidade de exemplares Disponiveis: "+liv.getQtdExemplares()+"\n";
            }
            return Slivros;
        }

        public String exibirUsuarios() {
            String Susers = "";
            for (Usuario usr : usuarios) {
                Susers += "\n ID: "+usr.getId();
                Susers += "\n Nome: "+usr.getNome();
                Susers += "\n DDD: "+usr.getDdd();
                Susers += "\n Telefone: "+usr.getTelefone();
                Susers += "\n Endereco: "+usr.getEndereco();
                Susers += "\n Email: "+usr.getEmail();
                Susers += "\n Data de nascimento: "+usr.getDataNascimento();
                Susers += "\n Quantidade de exemplares Disponiveis: "+usr.getVip()+"\n";
            }
            return Susers;
        }

        public String exibirLivros() {
            String Slivros = "";
            for (Livro liv : livros) {
                Slivros += "\n ID: "+liv.getId();
                Slivros += "\n Titulo: "+liv.getTitulo();
                Slivros += "\n Autor: "+liv.getAutor();
                Slivros += "\n Categoria: "+liv.getCategoria();
                Slivros += "\n Data de Publicacao: "+liv.getPublicacao();
                Slivros += "\n Quantidade de exemplares Disponiveis: "+liv.getQtdExemplares()+"\n";
            }
            return Slivros;
        }

        public String filtrarLivrosPorCategoria(String categoria) {

            List<Livro> Llivros = livros.stream()
            .filter(l -> l.getCategoria() == categoria)
            .collect(Collectors.toList());

            String Slivros = "";
            for (Livro liv : Llivros) {
                Slivros += "\n ID: "+liv.getId();
                Slivros += "\n Titulo: "+liv.getTitulo();
                Slivros += "\n Autor: "+liv.getAutor();
                Slivros += "\n Categoria: "+liv.getCategoria();
                Slivros += "\n Data de Publicacao: "+liv.getPublicacao();
                Slivros += "\n Quantidade de exemplares Disponiveis: "+liv.getQtdExemplares()+"\n";
            }
            return Slivros;
        }
        

        public void cadastrarUsuario(Usuario usuario){
            if (usuario != null && buscarUsuarioPorCodigo(usuario.getId()) == null) {
                usuarios.add(usuario);
            }
        }

        public void cadastrarLivro(Livro livro){
            if(livro != null && buscarLivroPorCodigo(livro.getId()) == null){
                livros.add(livro);
            }
        }


        public boolean emprestarLivro(int livroId, int usuarioId) {
            Livro livro = buscarLivroPorCodigo(livroId);
            Usuario usuario = buscarUsuarioPorCodigo(usuarioId);
    
            if (livro != null && usuario != null && livro.getQtdExemplares() > 0) {
                if (!usuario.possuiEmprestimosAtivos()) {
                    livro.setQtdExemplares(livro.getQtdExemplares() - 1);

                    Emprestimo novoEmprestimo;
                    if(usuario.getVip()){
                        novoEmprestimo = new EmprestimoEspecial(Util.generateEmprestimoId(), String.valueOf(livroId), String.valueOf(usuarioId), LocalDate.now());
                    }else{
                        novoEmprestimo = new EmprestimoNormal(Util.generateEmprestimoId(), String.valueOf(livroId), String.valueOf(usuarioId), LocalDate.now());
                    }
                    
                    livro.getEmprestimo().add(novoEmprestimo);
                    usuario.getEmprestimo().add(novoEmprestimo);
    
                    return true;
                }
            }
            return false;
        }

        public boolean devolverLivro(int livroId, int usuarioId) {
            Livro livro = buscarLivroPorCodigo(livroId);
            Usuario usuario = buscarUsuarioPorCodigo(usuarioId);
            
            if (livro == null || usuario == null) {
                return false;
            }
    
            Emprestimo emprestimo = usuario.getEmprestimo().stream()
                .filter(e -> e.getLivroID().equals(String.valueOf(livroId)) && e.getDataDevolucao() == null)
                .findFirst()
                .orElse(null);
    
            if (emprestimo != null) {
                emprestimo.setDataDevolucao(LocalDate.now());
                livro.setQtdExemplares(livro.getQtdExemplares() + 1);

                //atribui um status especial ao usuario se ele for um bom usuario
                usuario.setVip(usuario.qualificaParaEmprestimoEspecial());

                return true;
            }
    
            return false;
        }
    

        public void ordenarLivrosPorTitulo() {
        Collections.sort(livros);
        }

        public void ordenarUsuariosPorNome() {
            Collections.sort(usuarios);
            }

        @Override
        public String toString() {
            return "Biblioteca [livros=" + livros + ", usuarios=" + usuarios + "]";
        }

    }