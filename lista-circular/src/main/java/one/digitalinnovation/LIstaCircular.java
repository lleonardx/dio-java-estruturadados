package one.digitalinnovation;

public class LIstaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public T get(int index){
        return this.getNo(index).getConteudo();
    }
    private No<T> getNo(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia.")
        if(index == 0){
            return this.cauda;
        }
        No<T> noAUxiliar = this.cauda;
        for(int i=0;(i<index) && (noAUxiliar != null);i++){
            noAUxiliar = noAUxiliar.getNoProximo();
        }
        return noAUxiliar;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }
    public int size(){
        return this.tamanhoLista;
    }
}
