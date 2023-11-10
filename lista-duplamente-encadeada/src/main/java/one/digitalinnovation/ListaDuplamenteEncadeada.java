package one.digitalinnovation;

public class ListaDuplamenteEncadeada <T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public int ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        tamanhoLista = 0;
    }

    public int size(){
        return tamanhoLista;
    }




}
