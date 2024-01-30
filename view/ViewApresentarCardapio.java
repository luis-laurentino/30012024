package view;
import controller.*;

public class ViewApresentarCardapio {
    

    public static void mostrar(){
        System.out.printf("Lista de produtos: \n");
       
        System.out.printf(ControllerInterfaceControler.receitasDisponiveis + "\n" + ControllerInterfaceControler.receitasIndisponiveis);

        
    }
}
