package controller;

import view.*;

public class ControllerConfirmarPedido {


    public static void confirmaOpcao() {
        String opConfirmarPedido = "";
        
        opConfirmarPedido = ViewConfirmarPedido.respConfirmarPedido;

        switch (opConfirmarPedido) {
            case "1": // Realizar pedido
                
                break;
            case "2": // Voltar ao menu Principal
                ViewMenuPrincipial.exibirMenuPrincipal();
                ControllerMenuPrincipal.verificarOpcao();
                break; 
            case "3": // Sair do sistema 
                
                break;
            default:
                ViewConfirmarPedido.OpcaoInvalida();
                ViewConfirmarPedido.exibirConfirmacaoPedido();
                break;
        }
    }
}
