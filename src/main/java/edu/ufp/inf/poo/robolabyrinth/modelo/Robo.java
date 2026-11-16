
package edu.ufp.inf.poo.robolabyrinth.modelo;

/**
 * Representa um robo do sistema RoboLabyrinth.
 *
 * Esta classe serve de base aos diferentes tipos de robos.
 */
public class Robo {

    // Atributos
    private String nome;
    private final String id;
    private double nivelBateria;
    private String estadoOperacional;

    /**
     * Construtor da classe Robo.
     *
     * @param nome nome do robo
     * @param id identificador unico do robo
     * @param nivelBateria nivel atual da bateria (0 a 100)
     * @param estadoOperacional estado atual do robo
     */
    public Robo(String nome, String id, double nivelBateria,
                String estadoOperacional) {

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome invalido.");
        }

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID invalido.");
        }

        if (nivelBateria < 0 || nivelBateria > 100) {
            throw new IllegalArgumentException("Nivel de bateria invalido.");
        }

        if (estadoOperacional == null || estadoOperacional.isBlank()) {
            throw new IllegalArgumentException("Estado operacional invalido.");
        }

        this.nome = nome;
        this.id = id;
        this.nivelBateria = nivelBateria;
        this.estadoOperacional = estadoOperacional;
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public String getEstadoOperacional() {
        return estadoOperacional;
    }

    // Setters

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome invalido.");
        }
        this.nome = nome;
    }

    public void setNivelBateria(double nivelBateria) {
        if (nivelBateria < 0 || nivelBateria > 100) {
            throw new IllegalArgumentException("Nivel de bateria invalido.");
        }
        this.nivelBateria = nivelBateria;
    }

    public void setEstadoOperacional(String estadoOperacional) {
        if (estadoOperacional == null || estadoOperacional.isBlank()) {
            throw new IllegalArgumentException("Estado invalido.");
        }
        this.estadoOperacional = estadoOperacional;
    }

    /**
     * Coloca o robo em estado de movimento.
     */
    public void mover() {
        if (nivelBateria <= 0) {
            throw new IllegalStateException("O robo nao tem bateria.");
        }

        if (!estadoOperacional.equalsIgnoreCase("Operacional")) {
            throw new IllegalStateException("O robo nao esta operacional.");
        }

        estadoOperacional = "Em movimento";
    }

    /**
     * Recarrega a bateria do robo.
     */
    public void recarregar() {
        nivelBateria = 100.0;
        estadoOperacional = "Operacional";
    }

    /**
     * Devolve os dados do robo em formato de texto.
     *
     * @return informacao do robo
     */
    @Override
    public String toString() {
        return "Robo{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", nivelBateria=" + nivelBateria +
                ", estadoOperacional='" + estadoOperacional + '\'' +
                '}';
    }
}
