package controller;
import model.ModelCardapio;
import view.*;

public class ControllerMenuPrincipal {
    public static void verificarOpcao() {
        String OpEscolhida = ViewMenuPrincipial.OpMenuPrincipal;

        switch (OpEscolhida) {
            case "1": // visualizar cardapio
                ModelCardapio.consultarEstoque();
                ViewApresentarCardapio.mostrar();
                ViewConfirmarPedido.exibirConfirmacaoPedido();
                ControllerConfirmarPedido.confirmaOpcao();
                break;
            
            case "2": // visualizar carrinho
                
                break;
        
            case "3": // visualizar pedidos
                
                break;
            
            case "4": // sair do sistema
                
                break;
        
            default:
                ViewMenuPrincipial.OpcaoInvalida();
                ViewMenuPrincipial.exibirMenuPrincipal();
                break;
        }
    }
}
