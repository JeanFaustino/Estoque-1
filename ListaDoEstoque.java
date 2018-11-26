package Exercicio;

import java.util.ArrayList;


public class ListaDoEstoque {
    private ArrayList<Produto> lista;
    
    public ListaDoEstoque(){
        lista = new ArrayList<Produto>();
    }
    public ArrayList<Produto> getLista(){
        return lista;
    }
    public void setLista(ArrayList<Produto> lista){
        this.lista = lista;
    }
    @Override
    public String toString(){
        return "Lista Do Estoque = " +lista;
    }
    public void adicionarProduto(Produto p1){
        this.lista.add(p1);
    }
    public void apagarTudo(){
        this.lista.clear();
    }
    public int obterQuantidadeDeProdutos(){
        return this.lista.size();
    }
}
