package one.digitalinnovation;

public class LIstaCircular<T> {
    private No<T> cabeca;
    private No<T> calda;
    private int tamanhoLista;

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }
    public int size(){
        return this.tamanhoLista;
    }
}