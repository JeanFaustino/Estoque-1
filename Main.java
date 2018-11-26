package Exercicio;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        ListaDoEstoque l1 = new ListaDoEstoque();
        int op;
        
        do{
            System.out.println("--DIGITE--");
            System.out.println("1- Cadastrar Produto");
            System.out.println("2- Visualizar Produtos");
            System.out.println("3- Ver quantidade de produtos");
            System.out.println("4- Apagar todos os produtos");
            System.out.println("0- Sair");
            op = ler.nextInt();
            switch(op){
                case 1:
                    Produto p1 = new Produto();
                    System.out.println("Digite o nome do produto:");
                    ler.nextLine();
                    p1.setNome(ler.nextLine());
                    do{
                        System.out.println("Digite a quantidade:");
                        p1.setQuantidade(ler.nextInt());
                        if(p1.getQuantidade() <= 0){
                            System.out.println("Erro! Quantidade inválida.");
                        }
                    }while(p1.getQuantidade()<=0);
                    l1.adicionarProduto(p1);
                    System.out.println("Cadastrado com sucesso!");
                    break;
                    
                case 2:
                    if(l1.getLista().isEmpty()){
                        System.out.println("Não há produtos");
                    }else{
                        System.out.println(l1);
                    }
                    break;
                    
                case 3:
                    System.out.println("Total de itens cadastrados: "
                                    +l1.obterQuantidadeDeProdutos());
                    break;
                    
                case 4:
                    if(l1.getLista().isEmpty()){
                        System.out.println("Não há produtos para excluir.");
                    }else{
                        int confirma;
                        System.out.println("Tem certeza que deseja EXCLUIR TUDO?\n1-SIM\n2-Não");
                        confirma = ler.nextInt();
                        if(confirma==1){
                            l1.apagarTudo();
                            System.out.println("Produtos excluidos com sucesso!");
                        }else{
                            System.out.println("Opção cancelada!!");
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
                
                default:
                    System.out.println("Opção invalida!");
            }
        }while(op!=0);
    }
    
}
