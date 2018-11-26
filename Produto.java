package Exercicio;


public class Produto {
    private String nome;
    private int quantidade;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString(){
        return "\nProduto: " +this.nome+ ", quantidade: " +this.quantidade+ " unidade(s)";
    }
}
