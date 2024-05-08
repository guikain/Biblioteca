package model;

import java.time.LocalDate;

public class EmprestimoEspecial extends Emprestimo {
    public EmprestimoEspecial(int id, String livroID, String usuarioID, LocalDate dataEmprestimo) {
        super(id, livroID, usuarioID, dataEmprestimo);
    }

    @Override
    public LocalDate calcularDataDevolucao(LocalDate dataEmprestimo) {
        return dataEmprestimo.plusDays(14);
    }  
}