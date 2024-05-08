package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import util.Util;

public class Usuario implements Comparable<Usuario>{
    private int id;
    private String nome, ddd, telefone, endereco, email;
    private List<Emprestimo> emprestimo;
    private LocalDate dataNascimento;
    private boolean vip;
    
    public Usuario(String nome, String ddd, String telefone, String endereco, String email, LocalDate dataNascimento) {
        this.id = Util.generateUsuarioId();
        setNome(nome);
        setDdd(ddd);
        setTelefone(telefone);
        setEndereco(endereco);
        setEmail(email);
        setDataNascimento(dataNascimento);
        this.emprestimo = new ArrayList<>();
        this.vip = false;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getDdd() {
        return id;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public List<Emprestimo> getEmprestimo() {
        return emprestimo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public boolean getVip() {
        return vip;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = Util.normalizeString(nome);
    }

    public void setDdd(String ddd) {
        this.ddd = ddd.strip();
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone.strip();
    }

    public void setEndereco(String endereco) {
        this.endereco = Util.normalizeString(endereco);
    }

    public void setEmail(String email) {
        if (Util.isValidEmail(email)) {
            this.email = email.strip().toLowerCase();
        } else {
            System.out.println("O email deve conter '@' e '.' para ser válido.");
        }
    }

    public void setEmprestimo(List<Emprestimo> emprestimo) {
        this.emprestimo = emprestimo;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public boolean possuiEmprestimosAtivos() {
        return emprestimo.stream()
                          .anyMatch(e -> e.getDataDevolucao() == null);
    }

    public int contarEmprestimosPontuais() {
        return (int) emprestimo.stream()
                                .filter(e -> e.getDataDevolucao() != null && !e.getDataDevolucao().isAfter(e.getDataDevPrevista()))
                                .count();
    }

    public boolean qualificaParaEmprestimoEspecial() {
        return contarEmprestimosPontuais() >= 20;
    }

    @Override
    public int compareTo(Usuario usuario) {
        return this.nome.compareTo(usuario.getNome());
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", DDD=" + ddd + ", endereco=" + telefone + ", endereco=" + endereco + ", email=" + email + ", dataNascimento=" + dataNascimento +  ", VIP=" + vip + ", emprestimo=" + emprestimo + "]";
    }
    
}