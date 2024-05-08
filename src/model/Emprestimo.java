package model;

import java.time.LocalDate;

public abstract class Emprestimo {
    protected int id;
    protected String livroID, usuarioID;
    protected LocalDate dataEmprestimo, dataDevolucao, dataDevPrevista;

    public Emprestimo(int id, String livroID, String usuarioID, LocalDate dataEmprestimo) {
        this.id = id;
        this.livroID = livroID;
        this.usuarioID = usuarioID;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevPrevista = calcularDataDevolucao(dataEmprestimo);
    }

    public abstract LocalDate calcularDataDevolucao(LocalDate dataEmprestimo);

        public int getId() {
            return id;
        }

        public String getLivroID() {
            return livroID;
        }

        public String getUsuarioID() {
            return usuarioID;
        }

        public LocalDate getDataEmprestimo() {
            return dataEmprestimo;
        }

        public LocalDate getDataDevolucao() {
            return dataDevolucao;
        }

        public LocalDate getDataDevPrevista() {
            return dataDevPrevista;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setLivroID(String livroID) {
            this.livroID = livroID;
        }

        public void setUsuarioID(String usuarioID) {
            this.usuarioID = usuarioID;
        }

        public void setDataEmprestimo(LocalDate dataEmprestimo) {
            this.dataEmprestimo = dataEmprestimo;
        }

        public void setDataDevolucao(LocalDate dataDevolucao) {
            this.dataDevolucao = dataDevolucao;
        }

        public void setDataDevPrevista(LocalDate dataDevPrevista) {
            this.dataDevPrevista = dataDevPrevista;
        }

        @Override
        public String toString() {
            return "Emprestimo [ID=" + id + ", livroID=" + livroID + ", usuarioID=" + usuarioID + ", dataEmprestimo=" + dataEmprestimo
                    + ", dataDevolucao=" + dataDevolucao + ", dataDevPrevista=" + dataDevPrevista + "]";
        }
    
    }
