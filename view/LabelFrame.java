package view;

import view.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LabelFrame extends JFrame 
{
   private final JLabel label1;
  

   public LabelFrame()
   {
      super("Sistema Padaria");
      setLayout(new FlowLayout(FlowLayout.CENTER)); 

      String saudacao = ViewBemVindo.bemVindo;

      
      label1 = new JLabel(saudacao);
      add(label1);
      label1.setHorizontalTextPosition(SwingConstants.CENTER);
      label1.setVerticalTextPosition(SwingConstants.BOTTOM);
      
      ButtonFrame();
    
   }

   
  
   public void ButtonFrame()
   {
      final JButton exibirCardapioBtn; 
      final JButton visualizarCarrinhoBtn; 
      final JButton visualizarPedidosBtn;
      final JButton sairBtn;
   
      exibirCardapioBtn = new JButton("Exibir Cardapio"); 
      add(exibirCardapioBtn); 
      

      visualizarCarrinhoBtn = new JButton("Visualizar Carrinho"); 
      add(visualizarCarrinhoBtn);
      
      
      visualizarPedidosBtn = new JButton("Visualizar Pedidos"); 
      add(visualizarPedidosBtn);
      

      sairBtn = new JButton("Sair do Sistema"); 
      add(sairBtn);
      




      ButtonHandler handler = new ButtonHandler();
      exibirCardapioBtn.addActionListener(handler);
      visualizarCarrinhoBtn.addActionListener(handler);
      visualizarPedidosBtn.addActionListener(handler);
      sairBtn.addActionListener(handler);
   }

   // inner class for button event handling
   private class ButtonHandler implements ActionListener 
   {
      // handle button event
      @Override
      public void actionPerformed(ActionEvent event)
      {
        String evt1 = event.getActionCommand();

        if (evt1.equals("Exibir Cardapio")) {
            
        }

        
      }
   } 

   
   
} 