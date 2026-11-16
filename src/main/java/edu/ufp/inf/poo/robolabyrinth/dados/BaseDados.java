
package edu.ufp.inf.poo.robolabyrinth.dados;

import edu.ufp.inf.poo.robolabyrinth.modelo.Robo;
import edu.ufp.inf.poo.robolabyrinth.modelo.Artefacto;
import edu.ufp.inf.poo.robolabyrinth.modelo.Sala;
import edu.ufp.inf.poo.robolabyrinth.modelo.RegistoRecolha;
import edu.ufp.inf.poo.robolabyrinth.estruturas.TabelaSimbolos;

import java.util.List;
import java.util.Objects;

/**
 * Representa a base de dados do RoboLabyrinth.
 *
 * Gere as Tabelas de Simbolos das diferentes
 * entidades do sistema.
 */
public class BaseDados {

    // Tabelas de Simbolos
    private final TabelaSimbolos<String, Robo> robos;
    private final TabelaSimbolos<String, Artefacto> artefactos;
    private final TabelaSimbolos<String, Sala> salas;
    private final TabelaSimbolos<String, RegistoRecolha> registos;

    /**
     * Construtor da base de dados.
     */
    public BaseDados() {
        this.robos = new TabelaSimbolos<>();
        this.artefactos = new TabelaSimbolos<>();
        this.salas = new TabelaSimbolos<>();
        this.registos = new TabelaSimbolos<>();
    }

    // =========================
    // GESTAO DE ROBOS
    // =========================

    public void inserirRobo(Robo robo) {
        Objects.requireNonNull(robo, "Robo invalido.");
        robos.inserir(robo.getId(), robo);
    }

    public Robo obterRobo(String id) {
        return robos.obter(id);
    }

    public void editarRobo(String id, Robo robo) {
        Objects.requireNonNull(robo, "Robo invalido.");

        if (!id.equals(robo.getId())) {
            throw new IllegalArgumentException(
                    "O ID do robo nao pode ser alterado.");
        }

        robos.editar(id, robo);
    }

    public Robo removerRobo(String id) {
        return robos.remover(id);
    }

    public List<Robo> listarRobos() {
        return robos.listar();
    }

    // =========================
    // GESTAO DE ARTEFACTOS
    // =========================

    public void inserirArtefacto(Artefacto artefacto) {
        Objects.requireNonNull(artefacto, "Artefacto invalido.");
        artefactos.inserir(artefacto.getId(), artefacto);
    }

    public Artefacto obterArtefacto(String id) {
        return artefactos.obter(id);
    }

    public void editarArtefacto(String id, Artefacto artefacto) {
        Objects.requireNonNull(artefacto, "Artefacto invalido.");

        if (!id.equals(artefacto.getId())) {
            throw new IllegalArgumentException(
                    "O ID do artefacto nao pode ser alterado.");
        }

        artefactos.editar(id, artefacto);
    }

    public Artefacto removerArtefacto(String id) {
        return artefactos.remover(id);
    }

    public List<Artefacto> listarArtefactos() {
        return artefactos.listar();
    }

    // =========================
    // GESTAO DE SALAS
    // =========================

    public void inserirSala(Sala sala) {
        Objects.requireNonNull(sala, "Sala invalida.");
        salas.inserir(sala.getId(), sala);
    }

    public Sala obterSala(String id) {
        return salas.obter(id);
    }

    public void editarSala(String id, Sala sala) {
        Objects.requireNonNull(sala, "Sala invalida.");

        if (!id.equals(sala.getId())) {
            throw new IllegalArgumentException(
                    "O ID da sala nao pode ser alterado.");
        }

        salas.editar(id, sala);
    }

    public Sala removerSala(String id) {
        return salas.remover(id);
    }

    public List<Sala> listarSalas() {
        return salas.listar();
    }

    // =========================
    // GESTAO DE REGISTOS
    // =========================

    public void inserirRegisto(RegistoRecolha registo) {
        Objects.requireNonNull(registo, "Registo invalido.");
        registos.inserir(registo.getId(), registo);
    }

    public RegistoRecolha obterRegisto(String id) {
        return registos.obter(id);
    }

    public void editarRegisto(
            String id, RegistoRecolha registo) {

        Objects.requireNonNull(registo, "Registo invalido.");

        if (!id.equals(registo.getId())) {
            throw new IllegalArgumentException(
                    "O ID do registo nao pode ser alterado.");
        }

        registos.editar(id, registo);
    }

    public RegistoRecolha removerRegisto(String id) {
        return registos.remover(id);
    }

    public List<RegistoRecolha> listarRegistos() {
        return registos.listar();
    }

    // =========================
    // INFORMACAO DA BASE DE DADOS
    // =========================

    public void apresentarResumo() {
        System.out.println("===== BASE DE DADOS =====");
        System.out.println("Robos: " + robos.tamanho());
        System.out.println("Artefactos: " + artefactos.tamanho());
        System.out.println("Salas: " + salas.tamanho());
        System.out.println("Registos: " + registos.tamanho());
        System.out.println("=========================");
    }
}
