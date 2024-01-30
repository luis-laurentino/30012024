package view;

import java.util.*;

public class ViewConfirmarPedido {
    public static String respConfirmarPedido = "";
    
    public static void exibirConfirmacaoPedido() {
        Scanner scnRespConfirmarpedido = new Scanner(System.in);
        
        
        System.out.printf("\nSelecione a Opção desejada.");
        System.out.printf("\n1 - Realizar pedido");
        System.out.printf("\n2 - Voltar ao menu principal");
        System.out.printf("\n3 - Sair do sistema");
        
        System.out.printf("\nDigite a opcao desejada e pressione entrer para confirmar.\n");
        respConfirmarPedido = scnRespConfirmarpedido.nextLine();

        scnRespConfirmarpedido.close();
        
    }

    public static void OpcaoInvalida(){
        System.out.printf("\nOps! Voce selecionou uma opção invalida. Por favor selecione novamente entre as opcoes disponiveis.");
    }
}
