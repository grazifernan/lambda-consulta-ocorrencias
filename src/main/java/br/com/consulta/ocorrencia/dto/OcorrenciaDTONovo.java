//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.com.consulta.ocorrencia.dto;

import br.com.consulta.ocorrencia.domain.Canal;
import br.com.consulta.ocorrencia.domain.Cliente;
import br.com.consulta.ocorrencia.domain.Ocorrencia;
import java.sql.Timestamp;
import java.util.Date;

public class OcorrenciaDTONovo {
    private int codOcorrencia;
    private Cliente cliente;
    private Canal canal;
    private String titulo;
    private byte[] imagem;
    private int tipoOcorrencia;
    private int situacao;
    private String descricao;
    private Date dataOcorrencia;

    public OcorrenciaDTONovo() {
    }

    public OcorrenciaDTONovo(Ocorrencia ocorrencia) {
        this.codOcorrencia = ocorrencia.getCodOcorrencia();
        this.cliente = ocorrencia.getCliente();
        this.canal = ocorrencia.getCanal();
        this.titulo = ocorrencia.getTitulo();
        this.imagem = ocorrencia.getImagem();
        this.tipoOcorrencia = ocorrencia.getTipoOcorrencia();
        this.situacao = ocorrencia.getSituacao();
        this.descricao = ocorrencia.getDescricao();
        this.dataOcorrencia = ocorrencia.getDataOcorrencia();
    }

    public int getCodOcorrencia() {
        return this.codOcorrencia;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Canal getCanal() {
        return this.canal;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public byte[] getImagem() {
        return this.imagem;
    }

    public int getTipoOcorrencia() {
        return this.tipoOcorrencia;
    }

    public int getSituacao() {
        return this.situacao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Date getDataOcorrencia() {
        return this.dataOcorrencia;
    }

    public void setCodOcorrencia(int codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public void setTipoOcorrencia(int tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataOcorrencia(Timestamp dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }
}
