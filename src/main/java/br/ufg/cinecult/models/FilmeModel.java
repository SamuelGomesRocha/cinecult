package br.ufg.cinecult.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_FILMES")
public class FilmeModel implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idFilme;
    private String titulo;
    private String direcao;
    private String sinopse;
    private String anoEstreia;
    private String duracao;
    private String caminhoImagem;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_programacao")
    private ProgramacaoModel programacao;

    public ProgramacaoModel getProgramacao() {
        return programacao;
    }

    public UUID getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(UUID idFilme) {
        this.idFilme = idFilme;
    }

    public void setProgramacao(ProgramacaoModel programacao) {
        this.programacao = programacao;
    }

    public UUID getIdProduct() {
        return idFilme;
    }

    public void setIdProduct(UUID idProduct) {
        this.idFilme = idProduct;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getAnoEstreia() {
        return anoEstreia;
    }

    public void setAnoEstreia(String anoEstreia) {
        this.anoEstreia = anoEstreia;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }


}
