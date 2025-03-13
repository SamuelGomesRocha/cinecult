package br.ufg.cinecult.models;

import br.ufg.cinecult.enums.FormaPagamento;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_INGRESSOS")
public class IngressoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idIngresso;
    @OneToOne
    @JoinColumn(name = "programacao_id_programacao")
    private ProgramacaoModel programacao;
    @OneToOne
    @JoinColumn(name = "filme_id_filme")
    private FilmeModel filme;
    @OneToOne
    @JoinColumn(name = "usuario_id_usuario")
    private UsuarioModel usuario;
    private String assento;
    private Double valor;
    private FormaPagamento formaPagamento;

    public UUID getIdIngresso() {
        return idIngresso;
    }

    public void setIdIngresso(UUID idIngresso) {
        this.idIngresso = idIngresso;
    }

    public ProgramacaoModel getProgramacao() {
        return programacao;
    }

    public void setProgramacao(ProgramacaoModel programacao) {
        this.programacao = programacao;
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
