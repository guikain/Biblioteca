package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
            .filter(u -> u.getNome().equals(nome))
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
            .filter(l -> l.getTitulo().equals(titulo))
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
            .filter(l -> l.getAutor().equals(autor))
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
            .filter(l -> l.getCategoria().equals(categoria))
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

        public List<Emprestimo> livrosEmprestados() {
            List<Emprestimo> emprestimosAtivos = new ArrayList<>();
            for (Usuario usuario : usuarios) {
                emprestimosAtivos.addAll(usuario.getEmprestimo().stream()
                        .filter(emprestimo -> emprestimo.getDataDevolucao() == null)
                        .collect(Collectors.toList()));
            }
            return emprestimosAtivos;
        }

        public String relatorioLivrosEmprestados() {
            StringBuilder relatorio = new StringBuilder();
            List<Emprestimo> emprestimosAtivos = livrosEmprestados();
            if (emprestimosAtivos.isEmpty()) {
                relatorio.append("Nenhum livro emprestado atualmente.");
            } else {
                relatorio.append("Livros emprestados atualmente:\n");
                for (Emprestimo emprestimo : emprestimosAtivos) {
                    Livro livro = buscarLivroPorCodigo(Integer.parseInt(emprestimo.getLivroID()));
                    Usuario usuario = buscarUsuarioPorCodigo(Integer.parseInt(emprestimo.getUsuarioID()));
                    relatorio.append("\nLivro: ").append(livro.getTitulo());
                    relatorio.append("\n   Usuario: ").append(usuario.getNome());
                    relatorio.append("\n   Data de Empréstimo: ").append(emprestimo.getDataEmprestimo());
                    relatorio.append("\n   Data de Devolução Prevista: ").append(emprestimo.getDataDevPrevista());
                    relatorio.append("\n");
                }
            }
            return relatorio.toString();
        }

        public String relatorioLivrosPopulares() {
            StringBuilder relatorio = new StringBuilder();
            List<Livro> livrosMaisPopulares = livrosPopulares();
            if (livrosMaisPopulares == null) {
                relatorio.append("Nenhum livro emprestado ainda.");
            } else {
                relatorio.append("Livros mais populares:\n");
                for (Livro livro : livrosMaisPopulares) {
                    relatorio.append("\nTitulo: ").append(livro.getTitulo());
                    relatorio.append("\n   Autor: ").append(livro.getAutor());
                    relatorio.append("\n   Categoria: ").append(livro.getCategoria());
                    relatorio.append("\n   Data de Publicação: ").append(livro.getPublicacao());
                    relatorio.append("\n   Quantidade de Exemplares Disponíveis: ").append(livro.getQtdExemplares());
                    relatorio.append("\n");
                }
            }
            return relatorio.toString();
        }

        public int contarEmprestimosAtrasadosPorUsuario(Usuario usuario) {
            return (int) usuario.getEmprestimo().stream()
                    .filter(e -> e.getDataDevolucao() != null && e.getDataDevolucao().isAfter(e.getDataDevPrevista()))
                    .count();
        }
        
        public String relatorioUsuariosComAtraso() {
            StringBuilder relatorio = new StringBuilder();
            List<Usuario> usuariosComAtraso = usuarios.stream()
                    .filter(u -> contarEmprestimosAtrasadosPorUsuario(u) > 0)
                    .collect(Collectors.toList());
        
            if (usuariosComAtraso.isEmpty()) {
                relatorio.append("Nenhum usuário com atraso.");
            } else {
                relatorio.append("Usuários com atraso:\n");
                for (Usuario usuario : usuariosComAtraso) {
                    relatorio.append("\nNome: ").append(usuario.getNome());
                    relatorio.append("\n   ID: ").append(usuario.getId());
                    relatorio.append("\n   DDD: ").append(usuario.getDdd());
                    relatorio.append("\n   Telefone: ").append(usuario.getTelefone());
                    relatorio.append("\n   Endereço: ").append(usuario.getEndereco());
                    relatorio.append("\n   Email: ").append(usuario.getEmail());
                    relatorio.append("\n   Data de Nascimento: ").append(usuario.getDataNascimento());
                    relatorio.append("\n   Quantidade de Exemplares Disponíveis: ").append(usuario.getVip());
                    relatorio.append("\n");
                }
            }
            return relatorio.toString();
        }

        public String relatorioUsuariosComEmprestimo() {
            StringBuilder relatorio = new StringBuilder();
            List<Usuario> usuariosComEmprestimo = UsuariosComEmprestimo();
            if (usuariosComEmprestimo.isEmpty()) {
                relatorio.append("Nenhum usuário com empréstimo ativo.");
            } else {
                relatorio.append("Usuários com empréstimo ativo:\n");
                for (Usuario usuario : usuariosComEmprestimo) {
                    relatorio.append("\nNome: ").append(usuario.getNome());
                    relatorio.append("\n   ID: ").append(usuario.getId());
                    relatorio.append("\n   DDD: ").append(usuario.getDdd());
                    relatorio.append("\n   Telefone: ").append(usuario.getTelefone());
                    relatorio.append("\n   Endereço: ").append(usuario.getEndereco());
                    relatorio.append("\n   Email: ").append(usuario.getEmail());
                    relatorio.append("\n   Data de Nascimento: ").append(usuario.getDataNascimento());
                    relatorio.append("\n   Quantidade de Exemplares Disponíveis: ").append(usuario.getVip());
                    relatorio.append("\n");
                }
            }
            return relatorio.toString();
        }


        public List<Livro> livrosPopulares() {
            Map<Livro, Integer> contagemEmprestimos = new HashMap<>();
            for (Emprestimo emprestimo : livrosEmprestados()) {
                Livro livro = buscarLivroPorCodigo(Integer.parseInt(emprestimo.getLivroID()));
                contagemEmprestimos.put(livro, contagemEmprestimos.getOrDefault(livro, 0) + 1);
            }
            if (contagemEmprestimos.isEmpty()) {
                return null;
            } else {
                int max = Collections.max(contagemEmprestimos.values());
                return contagemEmprestimos.entrySet().stream()
                        .filter(entry -> entry.getValue() == max)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());
            }
        }

        public List<Usuario> UsuariosComAtraso() {
            LocalDate hoje = LocalDate.now();
            return usuarios.stream()
                    .filter(usuario -> usuario.getEmprestimo().stream()
                            .anyMatch(emprestimo -> emprestimo.getDataDevPrevista().isBefore(hoje) && emprestimo.getDataDevolucao() == null))
                    .collect(Collectors.toList());
        }

        public List<Usuario> UsuariosComEmprestimo() {
            return usuarios.stream()
                    .filter(usuario -> usuario.getEmprestimo().stream()
                            .anyMatch(emprestimo -> emprestimo.getDataDevolucao() == null))
                    .collect(Collectors.toList());
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