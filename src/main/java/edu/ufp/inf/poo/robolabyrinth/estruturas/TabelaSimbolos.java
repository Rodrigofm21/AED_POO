
package edu.ufp.inf.poo.robolabyrinth.estruturas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * Tabela de Simbolos generica baseada em HashMap.
 *
 * @param <K> tipo da chave
 * @param <V> tipo do valor armazenado
 */
public class TabelaSimbolos<K, V> {

    private final Map<K, V> tabela;

    /**
     * Cria uma tabela de simbolos vazia.
     */
    public TabelaSimbolos() {
        this.tabela = new HashMap<>();
    }

    /**
     * Insere um novo elemento.
     *
     * @param chave identificador do elemento
     * @param valor elemento a armazenar
     */
    public void inserir(K chave, V valor) {
        Objects.requireNonNull(chave, "A chave nao pode ser null.");
        Objects.requireNonNull(valor, "O valor nao pode ser null.");

        if (tabela.containsKey(chave)) {
            throw new IllegalArgumentException(
                    "Ja existe um elemento com esta chave: " + chave);
        }

        tabela.put(chave, valor);
    }

    /**
     * Consulta um elemento pela chave.
     *
     * @param chave identificador
     * @return elemento encontrado ou null
     */
    public V obter(K chave) {
        Objects.requireNonNull(chave, "A chave nao pode ser null.");
        return tabela.get(chave);
    }

    /**
     * Verifica se determinada chave existe.
     *
     * @param chave identificador
     * @return true se existir
     */
    public boolean contem(K chave) {
        Objects.requireNonNull(chave, "A chave nao pode ser null.");
        return tabela.containsKey(chave);
    }

    /**
     * Edita/substitui um elemento existente.
     *
     * @param chave identificador
     * @param novoValor novo elemento
     * @return elemento anterior
     */
    public V editar(K chave, V novoValor) {
        Objects.requireNonNull(chave, "A chave nao pode ser null.");
        Objects.requireNonNull(novoValor, "O valor nao pode ser null.");

        if (!tabela.containsKey(chave)) {
            throw new NoSuchElementException(
                    "Elemento nao encontrado: " + chave);
        }

        return tabela.put(chave, novoValor);
    }

    /**
     * Remove um elemento pela chave.
     *
     * @param chave identificador
     * @return elemento removido
     */
    public V remover(K chave) {
        Objects.requireNonNull(chave, "A chave nao pode ser null.");

        if (!tabela.containsKey(chave)) {
            throw new NoSuchElementException(
                    "Elemento nao encontrado: " + chave);
        }

        return tabela.remove(chave);
    }

    /**
     * Lista todos os elementos armazenados.
     *
     * @return lista nao modificavel dos elementos
     */
    public List<V> listar() {
        return Collections.unmodifiableList(
                new ArrayList<>(tabela.values()));
    }

    /**
     * Lista todas as chaves.
     *
     * @return lista nao modificavel das chaves
     */
    public List<K> listarChaves() {
        return Collections.unmodifiableList(
                new ArrayList<>(tabela.keySet()));
    }

    /**
     * Devolve a quantidade de elementos.
     *
     * @return numero de elementos
     */
    public int tamanho() {
        return tabela.size();
    }

    /**
     * Verifica se a tabela esta vazia.
     *
     * @return true se estiver vazia
     */
    public boolean estaVazia() {
        return tabela.isEmpty();
    }
}
