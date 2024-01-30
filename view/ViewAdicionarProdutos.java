package view;

import java.util.Scanner;

public class ViewAdicionarProdutos {
    public static Integer receita = 0;
    public static Integer quantidade = 0;

    
    public static void selecionarProduto() {
        Scanner scnReceita = new Scanner(System.in);
        Scanner scnQuantidadeDesejada = new Scanner(System.in);  

        System.out.printf("Digite a opção de produto desejado.");
        receita = scnReceita.nextInt();

        System.out.printf("Digite a quantidade desejada.");
        quantidade = scnQuantidadeDesejada.nextInt();

        scnReceita.close();
        scnQuantidadeDesejada.close();
        
    }
}
