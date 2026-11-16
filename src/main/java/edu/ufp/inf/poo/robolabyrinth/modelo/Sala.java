
package edu.ufp.inf.poo.robolabyrinth.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representa uma sala do labirinto.
 *
 * Cada sala pode conter varios artefactos.
 */
public class Sala {

    // Atributos do UML
    private final String id;
    private String codigo;
    private String tipoZona;
    private Integer novaAttr;
    private int nivelSeguranca;
    private double nivelPerigo;
    private LocalDate dataDetecao;

    // Artefactos existentes na sala
    private final Map<String, Artefacto> artefactos;

    /**
     * Construtor da classe Sala.
     *
     * @param id identificador unico
     * @param codigo codigo da sala
     * @param tipoZona tipo de zona
     * @param novaAttr atributo indicado no UML
     * @param nivelSeguranca nivel de seguranca
     * @param nivelPerigo nivel de perigo
     * @param dataDetecao data de detecao
     */
    public Sala(String id, String codigo, String tipoZona,
                Integer novaAttr, int nivelSeguranca,
                double nivelPerigo, LocalDate dataDetecao) {

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID invalido.");
        }

        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Codigo invalido.");
        }

        if (tipoZona == null || tipoZona.isBlank()) {
            throw new IllegalArgumentException("Tipo de zona invalido.");
        }

        if (nivelSeguranca < 0) {
            throw new IllegalArgumentException("Nivel de seguranca invalido.");
        }

        if (!Double.isFinite(nivelPerigo) || nivelPerigo < 0) {
            throw new IllegalArgumentException("Nivel de perigo invalido.");
        }

        if (dataDetecao == null) {
            throw new IllegalArgumentException("Data de detecao invalida.");
        }

        this.id = id;
        this.codigo = codigo;
        this.tipoZona = tipoZona;
        this.novaAttr = novaAttr;
        this.nivelSeguranca = nivelSeguranca;
        this.nivelPerigo = nivelPerigo;
        this.dataDetecao = dataDetecao;
        this.artefactos = new HashMap<>();
    }

    // Getters

    public String getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipoZona() {
        return tipoZona;
    }

    public Integer getNovaAttr() {
        return novaAttr;
    }

    public int getNivelSeguranca() {
        return nivelSeguranca;
    }

    public double getNivelPerigo() {
        return nivelPerigo;
    }

    public LocalDate getDataDetecao() {
        return dataDetecao;
    }

    // Setters

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Codigo invalido.");
        }
        this.codigo = codigo;
    }

    public void setTipoZona(String tipoZona) {
        if (tipoZona == null || tipoZona.isBlank()) {
            throw new IllegalArgumentException("Tipo de zona invalido.");
        }
        this.tipoZona = tipoZona;
    }

    public void setNovaAttr(Integer novaAttr) {
        this.novaAttr = novaAttr;
    }

    public void setNivelSeguranca(int nivelSeguranca) {
        if (nivelSeguranca < 0) {
            throw new IllegalArgumentException("Nivel invalido.");
        }
        this.nivelSeguranca = nivelSeguranca;
    }

    public void setNivelPerigo(double nivelPerigo) {
        if (!Double.isFinite(nivelPerigo) || nivelPerigo < 0) {
            throw new IllegalArgumentException("Nivel invalido.");
        }
        this.nivelPerigo = nivelPerigo;
    }

    public void setDataDetecao(LocalDate dataDetecao) {
        if (dataDetecao == null) {
            throw new IllegalArgumentException("Data invalida.");
        }
        this.dataDetecao = dataDetecao;
    }

    /**
     * Adiciona um artefacto a sala.
     *
     * @param artefacto artefacto a adicionar
     */
    public void adicionarArtefacto(Artefacto artefacto) {

        if (artefacto == null) {
            throw new IllegalArgumentException(
                    "O artefacto nao pode ser null.");
        }

        if (artefactos.containsKey(artefacto.getId())) {
            throw new IllegalArgumentException(
                    "O artefacto ja existe nesta sala.");
        }

        artefactos.put(artefacto.getId(), artefacto);
    }

    /**
     * Remove um artefacto da sala pelo ID.
     *
     * @param id identificador do artefacto
     */
    public void removerArtefacto(String id) {

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID invalido.");
        }

        if (!artefactos.containsKey(id)) {
            throw new IllegalArgumentException(
                    "Artefacto nao encontrado nesta sala.");
        }

        artefactos.remove(id);
    }

    /**
     * Lista os artefactos existentes na sala.
     *
     * @return lista de artefactos
     */
    public List<Artefacto> listarArtefactos() {
        return Collections.unmodifiableList(
                new ArrayList<>(artefactos.values()));
    }

    @Override
    public String toString() {
        return "Sala{" +
                "id='" + id + '\'' +
                ", codigo='" + codigo + '\'' +
                ", tipoZona='" + tipoZona + '\'' +
                ", nivelSeguranca=" + nivelSeguranca +
                ", nivelPerigo=" + nivelPerigo +
                ", dataDetecao=" + dataDetecao +
                ", quantidadeArtefactos=" + artefactos.size() +
                '}';
    }
}
