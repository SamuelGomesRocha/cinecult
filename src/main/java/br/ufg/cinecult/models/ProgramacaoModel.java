package br.ufg.cinecult.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_PROGRAMACOES")
public class ProgramacaoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProgramacao;
    private String valor;
    @JsonDeserialize(using = LocalDateTimeListDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm[:ss]")
    private List<LocalDateTime> datasExibicao;
    private Integer quantidade;


    public ProgramacaoModel(Integer assentosRestantes) {
        this.quantidade=assentosRestantes;
    }

    public ProgramacaoModel() {

    }

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


    public Integer getQuantidade() {return quantidade;}
    public void setQuantidade(Integer quantidade) {this.quantidade = quantidade;}

    public List<LocalDateTime> getDatasExibicao() {
        return datasExibicao;
    }

    public void setDatasExibicao(List<LocalDateTime> datasExibicao) {
        this.datasExibicao = datasExibicao;
    }
}
