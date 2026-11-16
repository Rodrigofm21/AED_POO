
package edu.ufp.inf.poo.robolabyrinth.modelo;

import java.time.LocalDateTime;

/**
 * Representa o registo de uma recolha de artefacto
 * realizada por um robo.
 */
public class RegistoRecolha {

    // Atributos
    private final String id;
    private LocalDateTime instante;

    // Associacoes com Robo e Artefacto
    private final Robo robo;
    private final Artefacto artefacto;

    /**
     * Construtor da classe RegistoRecolha.
     *
     * @param id identificador unico do registo
     * @param robo robo que realizou a recolha
     * @param artefacto artefacto recolhido
     */
    public RegistoRecolha(String id, Robo robo,
                          Artefacto artefacto) {

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID invalido.");
        }

        if (robo == null) {
            throw new IllegalArgumentException("Robo invalido.");
        }

        if (artefacto == null) {
            throw new IllegalArgumentException("Artefacto invalido.");
        }

        this.id = id;
        this.robo = robo;
        this.artefacto = artefacto;
        this.instante = null;
    }

    // Getters

    public String getId() {
        return id;
    }

    public LocalDateTime getInstante() {
        return instante;
    }

    public Robo getRobo() {
        return robo;
    }

    public Artefacto getArtefacto() {
        return artefacto;
    }

    /**
     * Regista a recolha do artefacto,
     * guardando a data e hora do acontecimento.
     */
    public void registarRecolha() {

        if (instante != null) {
            throw new IllegalStateException(
                    "Esta recolha ja foi registada.");
        }

        instante = LocalDateTime.now();

        System.out.println(
                "Recolha registada com sucesso!");
    }

    /**
     * Verifica se a recolha ja foi registada.
     *
     * @return true se estiver registada
     */
    public boolean isRegistada() {
        return instante != null;
    }

    @Override
    public String toString() {
        return "RegistoRecolha{" +
                "id='" + id + '\'' +
                ", instante=" + instante +
                ", robo=" + robo.getNome() +
                ", artefacto=" + artefacto.getDescricao() +
                '}';
    }
}
