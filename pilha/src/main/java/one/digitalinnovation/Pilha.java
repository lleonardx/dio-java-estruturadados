package one.digitalinnovation;
public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }
    //Exclui o ultimo elemento da Pilha
    public No pop(){
        if(!isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }return null;

    }
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }
    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        if(refNoEntradaPilha == null){
            return true;
        }else
            return false;

        //OR
        //return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "----------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "----------------\n";
        No noAuxiliar = refNoEntradaPilha;
        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "================\n";
        return stringRetorno;

    }

}
