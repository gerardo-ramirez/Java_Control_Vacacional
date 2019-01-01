import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
//Creamos los componentes:
//barra de menu:
    private JMenuBar mb;
    //opciones de la barra:
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno, labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
    private JTextField NombreTrabajador, APaterno,AMaterno;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scroll;
    private JTextArea area;
    String nombreAdministrador  ="";

    //creamos el constructor para darle forma a los componentes:
    public Principal(){
        setLayout(null);
                //Evitando  un Demonio:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
         Bienvenida ventanaBienvenida = new Bienvenida();
         nombreAdministrador = ventanaBienvenida.texto;

        //CREANDO MENU:
        //barrra:
        mb = new JMenuBar();
        mb.setBackground(new Color(255,0,0));
        setJMenuBar(mb);
        //menu opciones:

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255,255,255));
        mb.add(menuOpciones);
       
       //menu calcular:
       menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255,0,0));
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new Color(255,255,255));
        mb.add(menuCalcular);

        //menu acerca de:
        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255,0,0));
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
        menuAcercaDe.setForeground(new Color(255,255,255));
        mb.add(menuAcercaDe);

        //CREAMOS el SUBMENU:
        //color de fondo:
        menuColorFondo = new JMenu("Color de Fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.setForeground(new Color(255,0,0));
        menuOpciones.add(menuColorFondo);

        //ITEMS DE MENU:
        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono", 1, 14));
        miCalculo.setForeground(new Color(255,0,0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);


        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono", 1, 14));
        miRojo.setForeground(new Color(255,0,0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

         miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono", 1, 14));
        miNegro.setForeground(new Color(0,0,0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

         miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono", 1, 14));
        miMorado.setForeground(new Color(153, 51, 153));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setForeground(new Color(255,0,0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);
        
        miElCreador = new JMenuItem("El Creador");
        miElCreador.setFont(new Font("Andale Mono", 1, 14));
        miElCreador.setForeground(new Color(255,0,0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 14));
        miSalir.setForeground(new Color(255,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        //CREAMOS LOS JLABEL
        //label con imagen :
        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5,5,250,100);
        add(labelLogo);

        //label de bienvenidos:
        labelBienvenido = new JLabel("Bienvenido  " + nombreAdministrador);
        labelBienvenido.setBounds(280,30,300,50);
        labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
        labelBienvenido.setForeground(new Color(255,255,255));
        add(labelBienvenido);

        //titulo:
        labelTitle = new JLabel("Datos del Trabajador");
        labelTitle.setBounds(45,140,900,25);
        labelTitle.setFont(new Font("Andale Mono",0,24));
        labelTitle.setForeground(new Color(255, 255, 255));
        add(labelTitle);


        //Label de los JComboBox y JtextField ;
       //label y jtextField de Nombre completo
        labelNombre = new JLabel("Nombre Completo");
        labelNombre.setBounds(25,188,180,25);
        labelNombre.setFont(new Font("Andale Mono", 1, 12));
        labelNombre.setForeground(new Color(255, 255, 255));
        add(labelNombre);
        NombreTrabajador = new JTextField();
        NombreTrabajador.setBounds(25,213,150,25);
        NombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        NombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        NombreTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(NombreTrabajador);
        
        //label y JTextField de Apellido Paterno
        labelAPaterno = new JLabel("Apellido Paterno");
        labelAPaterno.setBounds(25,248,180,25);
        labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAPaterno.setForeground(new Color(255, 255, 255));
        add(labelAPaterno);
        APaterno = new JTextField();
        APaterno.setBounds(25,273,150,25);
        APaterno.setBackground(new java.awt.Color(224, 224, 224));
        APaterno.setFont(new java.awt.Font("Andale Mono", 1, 14));
        APaterno.setForeground(new java.awt.Color(255, 0, 0));
        add(APaterno);

         //label y JTextField de Apellido Materno
        labelAMaterno = new JLabel("Apellido Materno");
        labelAMaterno.setBounds(25,308,180,25);
        labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAMaterno.setForeground(new Color(255, 255, 255));
        add(labelAMaterno);
        AMaterno = new JTextField();
        AMaterno.setBounds(25,334,150,25);
        AMaterno.setBackground(new java.awt.Color(224, 224, 224));
        AMaterno.setFont(new java.awt.Font("Andale Mono", 1, 14));
        AMaterno.setForeground(new java.awt.Color(255, 0, 0));
        add(AMaterno);

        //label y ComboBox para Departamento:
        labelDepartamento = new JLabel("Selecciona el Departamento");
        labelDepartamento.setBounds(220,188,180,25);
        labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
        labelDepartamento.setForeground(new Color(255, 255, 255));
        add(labelDepartamento);

        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220,213,220,25);
        comboDepartamento.setBackground(new java.awt.Color(224, 224, 224));
        comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboDepartamento.setForeground(new java.awt.Color(255, 0, 0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atencion al Cliente");
        comboDepartamento.addItem("Departamento de logistica");
        comboDepartamento.addItem("Departamento de Gerencia");

         //label y ComboBox para Antiguedad:
        labelAntiguedad = new JLabel("Selecciona la antigüedad");
        labelAntiguedad.setBounds(220,248,180,25);
        labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        labelAntiguedad.setForeground(new Color(255, 255, 255));
        add(labelAntiguedad);

        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220,273,220,25);
        comboAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
        comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboAntiguedad.setForeground(new java.awt.Color(255, 0, 0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de servicio");
        comboAntiguedad.addItem("2 a 6 años de servicio");
        comboAntiguedad.addItem("7 o mas años de servicio");

        //label y textarea para mostrar el Resultado:
        labelResultado = new JLabel(" Resultado del Calculo");
        labelResultado.setBounds(220,307,180,25);
        //tipo de letra:
        labelResultado.setFont(new Font("Andale Mono", 1, 12));
        //color de la letra:
        labelResultado.setForeground(new Color(255, 255, 255));
        add(labelResultado);

        area=  new JTextArea();
        area.setEditable(false);
        area.setBackground(new Color(224, 224, 224));
        area.setFont(new Font("Andale Mono", 1 ,11));
        area.setForeground(new Color(255, 0, 0));
        area.setText("\n El resultado del cálculo de vacaciones es:");
        scroll = new JScrollPane(area);
        scroll.setBounds(220, 333, 385, 90);
        add(scroll);

        //label del Pie:
        labelFooter = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados.");
        labelFooter.setBounds(135,445,500,30);
        labelFooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
        labelFooter.setForeground(new java.awt.Color(255, 255, 255));
        add(labelFooter);

    }
    //accion de los botones
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == miCalculo ){
          //Alojamos los valores de los componentes:
            String trabajador = NombreTrabajador.getText();
            String AP= APaterno.getText();
            String AM= AMaterno.getText();
            //                                 selecciona el dato/ convierte a string 
            String datoDepto = comboDepartamento.getSelectedItem().toString();
            String datoAntiguedad = comboAntiguedad.getSelectedItem().toString();
           //equals hace la comparacion del "contenido" del objeto. 
            if(trabajador.equals("") || AP.equals("") || AM.equals("") || datoDepto.equals("") || datoAntiguedad.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");

            }else{
               // CONDICIONALES DE LOS DEPARTAMENTOS 3 Y DENTRO CONDICIONALES DE ANTIGUEDAD 3 X C/U.
               
                if(datoDepto.equals("Atencion al Cliente")){
                    if(datoAntiguedad.equals("1 año de servicio")){
                        area.setText("\n El trabajador " + trabajador + " "+ AM +" "+ AP +
                        "\n quien trabaja en " + datoDepto + " con " + datoAntiguedad +
                        "\n recibe 6 dias de vacaciones.");
                    }
                    if(datoAntiguedad.equals("2 a 6 años de servicio")){
                         area.setText("\n El trabajador " + trabajador + " "+ AM +" "+ AP +
                        "\n quien trabaja en " + datoDepto + " con " + datoAntiguedad +
                        "\n recibe 14 dias de vacaciones.");
                    }
                    if(datoAntiguedad.equals("7 o mas años de servicio")){
                         area.setText("\n El trabajador " + trabajador + " "+ AM +" "+ AP +
                        "\n quien trabaja en " + datoDepto + " con " + datoAntiguedad +
                        "\n recibe 21 dias de vacaciones.");
                    }
                }
                //----------------------------------------------
                 if(datoDepto.equals("Departamento de logistica")){
                    if(datoAntiguedad.equals("1 año de servicio")){
                        area.setText("\n El trabajador " + trabajador + " "+ AM +" "+ AP +
                        "\n quien trabaja en " + datoDepto + " con " + datoAntiguedad +
                        "\n recibe 8 dias de vacaciones.");
                    }
                    if(datoAntiguedad.equals("2 a 6 años de servicio")){
                         area.setText("\n El trabajador " + trabajador + " "+ AM +" "+ AP +
                        "\n quien trabaja en " + datoDepto + " con " + datoAntiguedad +
                        "\n recibe 16 dias de vacaciones.");
                    }
                    if(datoAntiguedad.equals("7 o mas años de servicio")){
                         area.setText("\n El trabajador " + trabajador + " "+ AM +" "+ AP +
                        "\n quien trabaja en " + datoDepto + " con " + datoAntiguedad +
                        "\n recibe 22 dias de vacaciones.");
                    }
                }
                //-----------------------------------------------
                 if(datoDepto.equals("Departamento de Gerencia")){
                    if(datoAntiguedad.equals("1 año de servicio")){
                        area.setText("\n El trabajador " + trabajador + " "+ AM +" "+ AP +
                        "\n quien trabaja en " + datoDepto + " con " + datoAntiguedad +
                        "\n recibe 10 dias de vacaciones.");
                    }
                    if(datoAntiguedad.equals("2 a 6 años de servicio")){
                         area.setText("\n El trabajador " + trabajador + " "+ AM +" "+ AP +
                        "\n quien trabaja en " + datoDepto + " con " + datoAntiguedad +
                        "\n recibe 18 dias de vacaciones.");
                    }
                    if(datoAntiguedad.equals("7 o mas años de servicio")){
                         area.setText("\n El trabajador " + trabajador + " "+ AM +" "+ AP +
                        "\n quien trabaja en " + datoDepto + " con " + datoAntiguedad +
                        "\n recibe 24 dias de vacaciones.");
                    }
                }

            }


        }
        if(e.getSource() == miRojo ){
            getContentPane().setBackground(new Color(255, 0, 0));

        }
        if(e.getSource() == miNegro ){
            getContentPane().setBackground(new Color( 0, 0, 0));

        }
        if(e.getSource() == miMorado ){
            getContentPane().setBackground(new Color(51, 0, 51));

        }
        if(e.getSource() == miNuevo){
            //limpiar todos los campos de texto.
            NombreTrabajador.setText("");
            AMaterno.setText("");
            APaterno.setText("");
            comboDepartamento.setSelectedIndex(0);
            comboAntiguedad.setSelectedIndex(0);
            area.setText("\n El resultado del cálculo de vacaciones es:");

        }
        if(e.getSource() == miSalir){
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
        if(e.getSource() == miElCreador){

            JOptionPane.showMessageDialog(null, "Desarrollado por Ramirez Gerardo");

        }
        


    }

    public static void main(String args[]){
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    }

}