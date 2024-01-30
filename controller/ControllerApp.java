package controller;
import view.*;
import model.*;

public class ControllerApp {

    public static void main(String[] args) throws Exception {
        ViewBemVindo.exibirBemVindo();
        ViewMenuPrincipial.exibirMenuPrincipal();
        ControllerMenuPrincipal.verificarOpcao();
       
    }

    
}
