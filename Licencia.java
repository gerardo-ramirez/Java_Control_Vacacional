import javax.swing.*;
import javax.swing.event.*;//para evento de jtextbox
import java.awt.*;
import java.awt.event.*; //para evento de boton 

public class Licencia extends JFrame implements ActionListener, ChangeListener{

    private JLabel titulo1, titulo2;
    private JCheckBox check1;
    private JButton btn1, btn2;
    private JScrollPane scroll;
    private JTextArea area;
    //creamos una variable para agregar  la variable publica  texto:
    String nombre="";

    public Licencia(){
        setLayout(null);
                //Evitando  un Demonio:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
       //importamos variable publica texto:
       Bienvenida importaTexto = new Bienvenida();
       nombre =importaTexto.texto;

       //CREAMOS TITULO TRABAJAMOS JLABEL
        titulo1 = new JLabel("TERMINOS Y CONDICIONES");
        titulo1.setBounds(215,5,200,30);
        titulo1.setFont(new Font("Andale Mono", 1 ,14));
        titulo1.setForeground(new Color(0, 0, 0));
        add(titulo1);

        //CREAMOS EL AREA DE TEXTO TRABAJAMOS CON JTEXTAREA :
        area = new JTextArea();
        //Prohibimos la edicion del texto con este codigo:
        area.setEditable(false);
    
        area.setFont(new Font("Andale Mono", 0 ,9));
        //insertamos subtitulo:
        area.setText("\n\n          TÉRMINOS Y CONDICIONES" +
        "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +

                    "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n          http://www.youtube.com/ernestoperezm" );
        //COLOCAMOS TODO DENTRO DE UN JSCROLLPANE.
        scroll = new JScrollPane(area);
        scroll.setBounds(10,40,575,200);
        add(scroll);


        //COMPONENTE JTEXTBOX
        check1 = new JCheckBox("Yo " + nombre + " Acepto");
        check1.setBounds(10,250,300,30);
        //le indico que se le va agregar un evento:
        check1.addChangeListener(this);
        add(check1);

        //CREAMOS LOS BOTONES:
        btn1= new JButton("Continuar");
        btn1.setBounds(10,290,100,30);
        //le indico que se le va agregar un evento:
        btn1.addActionListener(this);
        //indicamos que el estado inicial será deshabilitado.
        btn1.setEnabled(false);
        add(btn1);


        btn2= new JButton("No Acepto");
        btn2.setBounds(120,290,100,30);
        //le indico una accion:
        btn2.addActionListener(this);
        //indicamos que el estado inicial será habilitado.
        btn2.setEnabled(true);
        add(btn2);
        
      /*CREAMOS UN OBJETO ImageIcon que va a ir dentro del JLabel
      este objeto se llama imagen y colocamos la ruta*/ 
        ImageIcon imagen = new ImageIcon("images/coca-cola.png");
        titulo2 = new JLabel(imagen);
        titulo2.setBounds(315,135,300,300);
        add(titulo2);
    }
    //ESTRUCTURAS DE EVENTOS 

    //evento de checkBox
    public void stateChanged(ChangeEvent e){
      if(check1.isSelected() == true){
          btn1.setEnabled(true);
          btn2.setEnabled(false);
      }else{
           btn1.setEnabled(false);
          btn2.setEnabled(true);
      }

    }
    //evento de Botones

    //Enlaces a su respectiva interfaz:
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn1){
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
        this.setVisible(false);

        } else if( e.getSource() == btn2){
        Bienvenida ventana = new Bienvenida();
        ventana.setBounds(0,0,350,450);
        //que sea visible:
        ventana.setVisible(true);
        //que no se cambie el tamaño:
        ventana.setResizable(false);
        //que aparezca en el medio
        ventana.setLocationRelativeTo(null);
        this.setVisible(false);

        }
       

    }
    public static void  main(String args[]){
        Licencia ventanaLicencia = new Licencia();
        ventanaLicencia.setBounds(0,0,600,360);
        ventanaLicencia.setVisible(true);
        ventanaLicencia.setResizable(false);
        ventanaLicencia.setLocationRelativeTo(null);
    }

}