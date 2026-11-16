
package edu.ufp.inf.poo.robolabyrinth.modelo;

/**
 * Representa um artefacto encontrado no labirinto.
 *
 * Esta classe serve de base aos diferentes tipos
 * de artefactos.
 */
public class Artefacto {

    // Atributos
    private final String id;
    private String descricao;
    private double peso;
    private double valorCientifico;

    /**
     * Construtor da classe Artefacto.
     *
     * @param id identificador unico
     * @param descricao descricao do artefacto
     * @param peso peso do artefacto
     * @param valorCientifico valor cientifico
     */
    public Artefacto(String id, String descricao,
                     double peso, double valorCientifico) {

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID invalido.");
        }

        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("Descricao invalida.");
        }

        validarPeso(peso);
        validarValor(valorCientifico);

        this.id = id;
        this.descricao = descricao;
        this.peso = peso;
        this.valorCientifico = valorCientifico;
    }

    // Getters

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }

    public double getValorCientifico() {
        return valorCientifico;
    }

    /**
     * Devolve o valor do artefacto.
     *
     * Nas subclasses este metodo pode ser redefinido.
     *
     * @return valor do artefacto
     */
    public double getValor() {
        return valorCientifico;
    }

    // Setters

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException(
                    "Descricao invalida.");
        }

        this.descricao = descricao;
    }

    public void setPeso(double peso) {
        validarPeso(peso);
        this.peso = peso;
    }

    public void setValorCientifico(double valorCientifico) {
        validarValor(valorCientifico);
        this.valorCientifico = valorCientifico;
    }

    /**
     * Valida o peso do artefacto.
     */
    private void validarPeso(double peso) {
        if (!Double.isFinite(peso) || peso < 0) {
            throw new IllegalArgumentException(
                    "Peso invalido.");
        }
    }

    /**
     * Valida o valor cientifico.
     */
    private void validarValor(double valor) {
        if (!Double.isFinite(valor) || valor < 0) {
            throw new IllegalArgumentException(
                    "Valor cientifico invalido.");
        }
    }

    @Override
    public String toString() {
        return "Artefacto{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                ", peso=" + peso +
                ", valorCientifico=" + valorCientifico +
                '}';
    }
}
