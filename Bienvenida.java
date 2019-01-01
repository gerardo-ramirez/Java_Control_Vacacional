import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{
    private JTextField campo;
    private JLabel texto1, texto2, texto3, texto4;
    private JButton btn; 
    //escribir un modificador de acceso que dira quien tiene acceso a las variables y quien no.
    public static String texto ="";
    //Al ser publica la variable texto podra ser utilizada por cualquier interfaz.

    public Bienvenida(){
        setLayout(null);
        //Evitando  un Demonio:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");//titulo del programa.
        //cambiar color de interfaz 
        getContentPane().setBackground(new Color(255,0,0));
        /* colocar icono de interfaz*/ 
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png") ).getImage());
    //TABAJAMOS CON TEXTO1
    // colocar icono en JLabel.
    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    texto1 = new JLabel(imagen);
    texto1.setBounds(25,15,300,150);
    add(texto1);
    //TRABAJAMOS CON TEXTO2
    texto2 = new JLabel("Sistema de Control Vacacional");
    texto2.setBounds(35,135,300,30);
    //Darle estilo al texto:
                          /*Tipografia, estilo, pixeles*/ 
    texto2.setFont(new Font("Andale Mono", 3, 18));
    //color de la tipografia.
    texto2.setForeground(new Color(255,255,255));
    add(texto2);


        //TRABAJAMOS CON TEXTO3
    texto3 = new JLabel("Ingrese su nombre");
    texto3.setBounds(45,212,200,30);
    //Darle estilo al texto:
                          /*Tipografia, estilo, pixeles*/ 
    texto3.setFont(new Font("Andale Mono", 1, 12));
    //color de la tipografia.
    texto3.setForeground(new Color(255,255,255));
    add(texto3);

      //TRABAJAMOS CON TEXTO4
    texto4 = new JLabel("©2017 the Coca-Cola Company");
    texto4.setBounds(85,375,300,30);
    //Darle estilo al texto:
                          /*Tipografia, estilo, pixeles*/ 
    texto4.setFont(new Font("Andale Mono", 1, 12));
    //color de la tipografia.
    texto4.setForeground(new Color(255,255,255));
    add(texto4);

    //TABAJAMOS CAMPO JTEXTFIELD
    campo = new JTextField ();
    campo.setBounds(45,240,255,25);
    campo.setBackground(new Color(224,224,224));
    //tipo de letra.
     texto4.setFont(new Font("Andale Mono", 1, 14));
    //color de la tipografia.
    texto4.setForeground(new Color(255,0,0));
    
    add(campo);

    //TRABAJAMOS CON BTN
    btn= new JButton("Ingresar");
    btn.setBounds(125,280,100,30);
    btn.setBackground(new Color(255,255,255));
    btn.setFont(new Font("Andale Mono",1, 14));
    btn.setForeground(new Color(255,0,0));
    //Preparando el evento para el boton:
    btn.addActionListener(this);
    add(btn); 
    }
    //Evento que tiene el boton:
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== btn){
            //dentro de la variable publica texto alojamos el contenido del JTextField:
            texto = campo.getText().trim();//getText para traer su contenido.
            if(texto.equals("")){
                //esta linea representa un alert:
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
            } else{
       //CONECTAMOS CON INTERFAZ LICENCIA:
       //traemos el metodo main de la interfaz a unir
               Licencia ventanaLicencia = new Licencia();
               ventanaLicencia.setBounds(0,0,600,360);
               ventanaLicencia.setVisible(true);
               ventanaLicencia.setResizable(false);
               ventanaLicencia.setLocationRelativeTo(null);

               //agrgamos el setVisable para que la de Bienvenida no se vea.
               this.setVisible(false);
            }
        }

    }
    //Preparamos La ventana Interfaz
    public static void main(String args[]){
        Bienvenida ventana = new Bienvenida();
        ventana.setBounds(0,0,350,450);
        //que sea visible:
        ventana.setVisible(true);
        //que no se cambie el tamaño:
        ventana.setResizable(false);
        //que aparezca en el medio
        ventana.setLocationRelativeTo(null);
    }

}
