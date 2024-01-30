package view;

import java.util.*;

public class ViewAdicionarCliente {
    public static String nomeCliente, cpfCliente;

    
    public static void identificarCliente() {
        Scanner scnNomeCliente = new Scanner(System.in);
        Scanner scnCpfCliente = new Scanner(System.in);  

        System.out.printf("Digite o seu nome completo.");
        nomeCliente = scnNomeCliente.nextLine();

        System.out.printf("Digite o seu CPF.");
        cpfCliente = scnCpfCliente.nextLine();

        scnNomeCliente.close();
        scnCpfCliente.close();
        
    }
}
