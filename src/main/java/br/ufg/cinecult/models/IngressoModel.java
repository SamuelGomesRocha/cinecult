package br.ufg.cinecult.models;

import br.ufg.cinecult.enums.FormaPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "TB_INGRESSOS")
public class IngressoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idIngresso;
    @ManyToOne
    @JoinColumn(name = "id_filme")
    private FilmeModel filme;
    @OneToOne
    @JoinColumn(name = "usuario_id_usuario")
    private UsuarioModel usuario;
    private String assento;
    private Double valor;
    private FormaPagamento formaPagamento;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm[:ss]")
    private LocalDateTime dataExibicao;

    public UUID getIdIngresso() {
        return idIngresso;
    }

    public void setIdIngresso(UUID idIngresso) {
        this.idIngresso = idIngresso;
    }

    public LocalDateTime getDataExibicao() {
        return dataExibicao;
    }

    public void setDataExibicao(LocalDateTime dataExibicao) {
        this.dataExibicao = dataExibicao;
    }

    public FilmeModel getFilme() {
        return filme;
    }

    public void setFilme(FilmeModel filme) {
        this.filme = filme;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
