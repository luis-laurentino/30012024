package view;

import java.util.*;

public class ViewMenuPrincipial {
    
    public static String OpMenuPrincipal = "";

    
    public static void exibirMenuPrincipal() {
        Scanner scnOpMenuPrincipal = new Scanner(System.in);
        

        System.out.printf("\nMenu Principal. \n");
        System.out.printf("\nSelecione a opção desejada: \n");
        System.out.printf(" 1 - Visualizar Cardapio.\n");
        System.err.printf(" 2 - Visualizar carrinho de compra.\n");
        System.err.printf(" 3 - Visualizar pedidos feitos.\n");
        System.err.printf(" 4 - Sair do sistema.\n");
        
        
        System.err.printf("\nDigite o numero da opção desejada e tecle enter para confirmar.\n");
        OpMenuPrincipal = scnOpMenuPrincipal.nextLine();

        scnOpMenuPrincipal.close();
    }

    public static void OpcaoInvalida(){
        System.err.printf("\nOps! Você selecionou uma opção invalida, por favor seleicone uma das opções validas.\n");
    }
}
