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

public class Formulario extends JFrame implements ActionListener, ChangeListener{

    /**
     * @param args the command line arguments
     */
    
    //Declarar los componentes
    private JLabel label1, label2, label3, label4, label5, label6, label7;
    private JTextField textField;
    private JPasswordField password;
    private JRadioButton radio1, radio2;
    private ButtonGroup bg;
    private JComboBox combo;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JCheckBox check;
    private JButton boton1, boton2;
    private Color habilitado = new Color(25, 167, 206);
    private Color deshabilitado = new Color(176, 218, 255);
    
    //Constructor donde se da diseño a todos los componentes
    public Formulario(){
        setLayout(null);
        
        boton1 = new JButton("Cerrar");
        boton1.setBounds(640,500,100,30);
        add(boton1);
        boton1.addActionListener(this);
        boton1.setBackground(habilitado);
        
        label1 = new JLabel("FORMULARIO");
        label1.setBounds(350,10,100,30);
        add(label1);
        
        label2 = new JLabel("Usuario");
        label2.setBounds(25,50,50,30);
        add(label2);
        
        label3 = new JLabel("Clave");
        label3.setBounds(25,100,50,30);
        add(label3);
        
        label4 = new JLabel("Tipo de Usuario");
        label4.setBounds(25,150,100,30);
        add(label4);
        
        label5 = new JLabel("Cursos");
        label5.setBounds(25,200,50,30);
        add(label5);
        
        label6 = new JLabel("Comentarios");
        label6.setBounds(25,250,100,30);
        add(label6);
        
        label7 = new JLabel("Acepta los Terminos y Condiciones");
        label7.setBounds(25,450,200,30);
        add(label7);
        
        textField = new JTextField();
        textField.setBounds(150,50,400,30);
        add(textField);
        
        password = new JPasswordField();
        password.setBounds(150,100,400,30);
        add(password);
        
        bg = new ButtonGroup();
        radio1 = new JRadioButton("Estudiante");
        radio1.setBounds(150,150,100,30);
        add(radio1);
        bg.add(radio1);
        radio2 = new JRadioButton("Catedratico");
        radio2.setBounds(300,150,100,30);
        add(radio2);
        bg.add(radio2);
        
        combo = new JComboBox();
        combo.setBounds(150,200,250,30);
        add(combo);
        combo.addItem("Calculo");
        combo.addItem("Programacion I");
        combo.addItem("Derecho Informatico");
        combo.addItem("Fisica I");
        combo.addItem("Proceso Administrativo");
        
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(25,300,700,100);
        add(scrollPane);
        
        check = new JCheckBox("Acepto");
        check.setBounds(250,450,100,30);
        add(check);
        check.addChangeListener(this);
        
        boton2 = new JButton("Enviar");
        boton2.setBounds(25,500,100,30);
        add(boton2);
        boton2.setBackground(deshabilitado);
        boton2.addActionListener(this);
        boton2.setEnabled(false);
    }
    
    //Evento al presionar un boton
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            System.exit(0);
        }
        if(e.getSource() == boton2){
            setTitle("Formulario enviado exitosamente");
        }
    }
    
    //Evento al marcar el checkBox
    public void stateChanged(ChangeEvent e){
        if(check.isSelected() == true){
            boton2.setEnabled(true);
            boton2.setBackground(habilitado);
        }else{
            boton2.setEnabled(false);
            boton2.setBackground(deshabilitado);
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
