/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formulario;

//importando todas las libreria que se utilizarán
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    //Declarar los componentes
    private JLabel label1, label2, label3, label4, label5, label6;
    private JTextField textField;
    private JPasswordField password;
    private JRadioButton radio1, radio2;
    private ButtonGroup bg;
    private JComboBox combo;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JCheckBox check;
    private JButton boton1, boton2;
    private Color habilitado = new Color(184,231,225);
    
    //Constructor donde se da diseño a todos los componentes
    public Formulario(){
        setLayout(null);
        
        boton1 = new JButton("Cerrar");
        boton1.setBounds(640,500,100,30);
        add(boton1);
        boton1.addActionListener(this);
        boton1.setBackground(habilitado);
    }
    
    //Evento al presionar un boton
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        Formulario frame = new Formulario();
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
}
