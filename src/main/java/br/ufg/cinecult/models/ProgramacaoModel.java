package br.ufg.cinecult.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "TB_PROGRAMACOES")
public class ProgramacaoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProgramacao;
    private String valor;
    private String dataExibicao;
    private String horarioExibicao;


    public UUID getIdProgramacao() {
        return idProgramacao;
    }

    public void setIdProgramacao(UUID idProgramacao) {
        this.idProgramacao = idProgramacao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDataExibicao() {
        return dataExibicao;
    }

    public void setDataExibicao(String dataExibicao) {
        this.dataExibicao = dataExibicao;
    }

    public String getHorarioExibicao() {
        return horarioExibicao;
    }

    public void setHorarioExibicao(String horarioExibicao) {
        this.horarioExibicao = horarioExibicao;
    }
}
