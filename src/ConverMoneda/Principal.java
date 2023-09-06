/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConverMoneda;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.regex.Pattern;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author oscar
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(this);
        cerrarPequenio.setVisible(true);
        cerrarGrande.setVisible(false);
        iniciarConvMoneda();
        iniciarConvTemperatura();
        iniciarConvUniMedidas();
        iniciarBtnConvertirMoneda();
        iniciarBtnCancelarMoneda();
        iniciarBtnMenuPrincipal();
        iniciarBtnMenuPrincipalTemp();
        iniciarBtnConvertirTemp();
        iniciarBtnCancelarTemp();
        iniciarBtnMenuUM();
        iniciarBtnConvertirUM();
        iniciarBtnCancelarUM();
        rbtnLocalExtran.setSelected(true);
    }

    public void iniciarConvMoneda() {
        convMonedaPequenio.setVisible(true);
        convMonedaGrande.setVisible(false);
    }

    public void agrandarBtnConvMoneda() {
        convMonedaPequenio.setVisible(false);
        convMonedaGrande.setVisible(true);
    }

    public void iniciarConvTemperatura() {
        convTemperaturaPequenio.setVisible(true);
        convTemperaturaGrande.setVisible(false);
    }

    public void agrandarBtnConvTemperatura() {
        convTemperaturaPequenio.setVisible(false);
        convTemperaturaGrande.setVisible(true);
    }

    public void iniciarConvUniMedidas() {
        convUniMedidasPequenio.setVisible(true);
        convUniMedidasGrande.setVisible(false);
    }

    public void agrandarBtnConvUniMedidas() {
        convUniMedidasPequenio.setVisible(false);
        convUniMedidasGrande.setVisible(true);
    }

    public void iniciarBtnConvertirMoneda() {
        convertirPequenio.setVisible(true);
        convertirGrande.setVisible(false);
    }

    public void agrandarBtnConvertirMoneda() {
        convertirPequenio.setVisible(false);
        convertirGrande.setVisible(true);
    }

    public void iniciarBtnCancelarMoneda() {
        cancelarPequenio.setVisible(true);
        cancelarGrande.setVisible(false);
    }

    public void agrandarBtnCancelarMoneda() {
        cancelarPequenio.setVisible(false);
        cancelarGrande.setVisible(true);
    }

    public void iniciarBtnMenuPrincipal() {
        MenPrincPequenio.setVisible(true);
        MenPrincGrande.setVisible(false);
    }

    public void agrandarBtnMenPrincipal() {
        MenPrincPequenio.setVisible(false);
        MenPrincGrande.setVisible(true);
    }
    
    public void iniciarBtnMenuPrincipalTemp() {
        menuPequenioTemp.setVisible(true);
        menuGrandeTemp.setVisible(false);
    }

    public void agrandarBtnMenPrincipalTemp() {
        menuPequenioTemp.setVisible(false);
        menuGrandeTemp.setVisible(true);
    }
    
    public void iniciarBtnConvertirTemp() {
        convPequenioTemp.setVisible(true);
        convGrandeTemp.setVisible(false);
    }

    public void agrandarBtnConvertirTemp() {
        convPequenioTemp.setVisible(false);
        convGrandeTemp.setVisible(true);
    }
    
    public void iniciarBtnCancelarTemp() {
        cancelPequenioTemp.setVisible(true);
        cancelGrandeTemp.setVisible(false);
    }

    public void agrandarBtnCancelarTemp() {
        cancelPequenioTemp.setVisible(false);
        cancelGrandeTemp.setVisible(true);
    }
    
    public void iniciarBtnMenuUM() {
        menuPequenioUM.setVisible(true);
        menuGrandeUM.setVisible(false);
    }

    public void agrandarBtnMenuUM() {
        menuPequenioUM.setVisible(false);
        menuGrandeUM.setVisible(true);
    }
    
    public void iniciarBtnConvertirUM() {
        convPequenioUM.setVisible(true);
        convGrandeUM.setVisible(false);
    }

    public void agrandarBtnConvertirUM() {
        convPequenioUM.setVisible(false);
        convGrandeUM.setVisible(true);
    }
    
    public void iniciarBtnCancelarUM() {
        cancelPequenioUm.setVisible(true);
        cancelGrandeUM.setVisible(false);
    }

    public void agrandarBtnCancelarUM() {
        cancelPequenioUm.setVisible(false);
        cancelGrandeUM.setVisible(true);
    }

    public void llenarcomboMonedaExtranjeraLocal() {
        comboSeleccionMoneda.addItem("Seleccione la conversión...");
        comboSeleccionMoneda.addItem("Convertir de Euros a Dólar");
        comboSeleccionMoneda.addItem("Convertir de Libras Esterlinas a Dólar");
        comboSeleccionMoneda.addItem("Convertir de Yen Japonés a Dólar");
        comboSeleccionMoneda.addItem("Convertir de Won Surcoreano a Dólar");
        comboSeleccionMoneda.addItem("Convertir de Pesos Mexicanos a Dólar");
        comboSeleccionMoneda.addItem("Convertir de Pesos Argentinos a Dólar");
        comboSeleccionMoneda.addItem("Convertir de Quetzal a Dólar");
    }

    public void llenarcomboMonedaLocalExtranjera() {
        comboSeleccionMoneda.addItem("Seleccione la conversión...");
        comboSeleccionMoneda.addItem("Convertir de Dólar a Euros");
        comboSeleccionMoneda.addItem("Convertir de Dólar a Libras Esterlinas");
        comboSeleccionMoneda.addItem("Convertir de Dólar a Yen Japonés");
        comboSeleccionMoneda.addItem("Convertir de Dólar a Won Surcoreano");
        comboSeleccionMoneda.addItem("Convertir de Dólar a Pesos Mexicanos");
        comboSeleccionMoneda.addItem("Convertir de Dólar a Pesos Argentinos");
        comboSeleccionMoneda.addItem("Convertir de Dólar a Quetzal");
    }
    
    public void llenarcomboTemperatura() {
        comboTemperatura.addItem("Seleccione la conversión...");
        comboTemperatura.addItem("Grados Celcius a Grados Farenheit");
        comboTemperatura.addItem("Grados Celcius a Kelvin");
        comboTemperatura.addItem("Grados Farenheit a Grados Celcius");
        comboTemperatura.addItem("Kelvin a Grados Celcius");
        comboTemperatura.addItem("Kelvin a Grados Farenheit");
    }
    
    public void llenarcomboUM() {
        comboUM.addItem("Seleccione la conversión...");
        comboUM.addItem("Metro a Kilómetro");
        comboUM.addItem("Metro a Centímetro");
        comboUM.addItem("Metro a Pulgada");
        comboUM.addItem("Centímetro a Kilómetro");
        comboUM.addItem("Centímetro a Metro");
        comboUM.addItem("Centímetro a Pulgada");
        comboUM.addItem("Pulgada a Kilometro");
        comboUM.addItem("Pulgada a Metro");
        comboUM.addItem("Pulgada a Centímetro");
        comboUM.addItem("Kilómetro a Metro");
        comboUM.addItem("Kilómetro a Centímetro");
        comboUM.addItem("Kilómetro a Pulgada");
    }

    public String formatearResultado(Double cantFormat) {
        NumberFormat df = NumberFormat.getInstance();
        df.setMaximumFractionDigits(2);
        return df.format(cantFormat);
    }

    public void LimpiarComboMonedas() {
        comboSeleccionMoneda.removeAllItems();
    }
    
    public void LimpiarComboTemperatura() {
        comboTemperatura.removeAllItems();
    }
    
    public void LimpiarComboUM() {
        comboUM.removeAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        imagenPrincipal = new javax.swing.JLabel();
        textoImgPrincipal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cerrarPequenio = new javax.swing.JLabel();
        cerrarGrande = new javax.swing.JLabel();
        jPanelSlider1 = new diu.swe.habib.JPanelSlider.JPanelSlider();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        convMonedaGrande = new javax.swing.JLabel();
        convMonedaPequenio = new javax.swing.JLabel();
        convTemperaturaPequenio = new javax.swing.JLabel();
        convTemperaturaGrande = new javax.swing.JLabel();
        convUniMedidasPequenio = new javax.swing.JLabel();
        convUniMedidasGrande = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboSeleccionMoneda = new javax.swing.JComboBox<>();
        rbtnLocalExtran = new javax.swing.JRadioButton();
        rbtnExtranLocal = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cantidadConvertir = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        convertirPequenio = new javax.swing.JLabel();
        cancelarPequenio = new javax.swing.JLabel();
        MenPrincPequenio = new javax.swing.JLabel();
        convertirGrande = new javax.swing.JLabel();
        cancelarGrande = new javax.swing.JLabel();
        MenPrincGrande = new javax.swing.JLabel();
        lblerror = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        comboTemperatura = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtvalorTemp = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        convPequenioTemp = new javax.swing.JLabel();
        cancelPequenioTemp = new javax.swing.JLabel();
        convGrandeTemp = new javax.swing.JLabel();
        cancelGrandeTemp = new javax.swing.JLabel();
        menuPequenioTemp = new javax.swing.JLabel();
        menuGrandeTemp = new javax.swing.JLabel();
        lblerrorTemp = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        comboUM = new javax.swing.JComboBox<>();
        valorUM = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        convPequenioUM = new javax.swing.JLabel();
        convGrandeUM = new javax.swing.JLabel();
        cancelPequenioUm = new javax.swing.JLabel();
        cancelGrandeUM = new javax.swing.JLabel();
        menuPequenioUM = new javax.swing.JLabel();
        menuGrandeUM = new javax.swing.JLabel();
        lblerrorUM = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BIENVENIDOS");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagenPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5AB6.gif"))); // NOI18N
        jPanel1.add(imagenPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 12, -1, 293));

        textoImgPrincipal.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        textoImgPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoImgPrincipal.setText("BIENVENIDOS");
        jPanel1.add(textoImgPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 316, 230, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 350));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHALLENGE ONE ALURA G5 - CONVERSOR DE MONEDAS Y MAS");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 30));

        cerrarPequenio.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cerrarPequenio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarPequenio.setText("X");
        cerrarPequenio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cerrarPequenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarPequenioMouseEntered(evt);
            }
        });
        jPanel3.add(cerrarPequenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 30, 30));

        cerrarGrande.setBackground(new java.awt.Color(255, 255, 255));
        cerrarGrande.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        cerrarGrande.setForeground(new java.awt.Color(255, 0, 0));
        cerrarGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarGrande.setText("X");
        cerrarGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cerrarGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarGrandeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarGrandeMouseExited(evt);
            }
        });
        jPanel3.add(cerrarGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 30, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 30));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("¿QUÉ QUIERES HACER?");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 39, 298, 43));

        convMonedaGrande.setBackground(new java.awt.Color(0, 204, 204));
        convMonedaGrande.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        convMonedaGrande.setForeground(new java.awt.Color(255, 0, 0));
        convMonedaGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convMonedaGrande.setText("Conversor de moneda");
        convMonedaGrande.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        convMonedaGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convMonedaGrandeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                convMonedaGrandeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                convMonedaGrandeMouseExited(evt);
            }
        });
        jPanel2.add(convMonedaGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 290, 50));

        convMonedaPequenio.setBackground(new java.awt.Color(0, 204, 204));
        convMonedaPequenio.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        convMonedaPequenio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convMonedaPequenio.setText("Conversor de moneda");
        convMonedaPequenio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        convMonedaPequenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                convMonedaPequenioMouseEntered(evt);
            }
        });
        jPanel2.add(convMonedaPequenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 250, 30));

        convTemperaturaPequenio.setBackground(new java.awt.Color(0, 204, 204));
        convTemperaturaPequenio.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        convTemperaturaPequenio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convTemperaturaPequenio.setText("Conversor de temperatura");
        convTemperaturaPequenio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        convTemperaturaPequenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                convTemperaturaPequenioMouseEntered(evt);
            }
        });
        jPanel2.add(convTemperaturaPequenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 250, 30));

        convTemperaturaGrande.setBackground(new java.awt.Color(0, 204, 204));
        convTemperaturaGrande.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        convTemperaturaGrande.setForeground(new java.awt.Color(255, 0, 0));
        convTemperaturaGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convTemperaturaGrande.setText("Conversor de temperatura");
        convTemperaturaGrande.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        convTemperaturaGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convTemperaturaGrandeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                convTemperaturaGrandeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                convTemperaturaGrandeMouseExited(evt);
            }
        });
        jPanel2.add(convTemperaturaGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 290, 50));

        convUniMedidasPequenio.setBackground(new java.awt.Color(0, 204, 204));
        convUniMedidasPequenio.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        convUniMedidasPequenio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convUniMedidasPequenio.setText("Conversor Uni. de Medida");
        convUniMedidasPequenio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        convUniMedidasPequenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                convUniMedidasPequenioMouseEntered(evt);
            }
        });
        jPanel2.add(convUniMedidasPequenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 250, 30));

        convUniMedidasGrande.setBackground(new java.awt.Color(0, 204, 204));
        convUniMedidasGrande.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        convUniMedidasGrande.setForeground(new java.awt.Color(255, 0, 0));
        convUniMedidasGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convUniMedidasGrande.setText("Conversor Uni. de Medida");
        convUniMedidasGrande.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        convUniMedidasGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convUniMedidasGrandeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                convUniMedidasGrandeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                convUniMedidasGrandeMouseExited(evt);
            }
        });
        jPanel2.add(convUniMedidasGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 290, 50));

        jPanelSlider1.add(jPanel2, "card2");

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Moneda");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 23, 222, 23));

        comboSeleccionMoneda.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        comboSeleccionMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la conversión...", "Convertir de Dólar a Euros", "Convertir de Dólar a Libras Esterlinas", "Convertir de Dólar a Yen Japonés", "Convertir de Dólar a Won Surcoreano", "Convertir de Dólar a Peso Mexicano", "Convertir de Dólar a Peso Argentino", "Convertir de Dólar a Quetzal" }));
        comboSeleccionMoneda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel4.add(comboSeleccionMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 107, 284, 30));

        buttonGroup1.add(rbtnLocalExtran);
        rbtnLocalExtran.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        rbtnLocalExtran.setText("Moneda Local a Extranjera");
        rbtnLocalExtran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnLocalExtranMouseClicked(evt);
            }
        });
        jPanel4.add(rbtnLocalExtran, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        buttonGroup1.add(rbtnExtranLocal);
        rbtnExtranLocal.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        rbtnExtranLocal.setText("Moneda Extranjera a Local");
        rbtnExtranLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnExtranLocalMouseClicked(evt);
            }
        });
        jPanel4.add(rbtnExtranLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Ingrese la cantidad:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        cantidadConvertir.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cantidadConvertir.setText("0.00");
        cantidadConvertir.setBorder(null);
        cantidadConvertir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadConvertirKeyTyped(evt);
            }
        });
        jPanel4.add(cantidadConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 121, 29));

        jSeparator1.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 204, 204));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 121, 10));

        convertirPequenio.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        convertirPequenio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convertirPequenio.setText("Convertir");
        convertirPequenio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        convertirPequenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                convertirPequenioMouseEntered(evt);
            }
        });
        jPanel4.add(convertirPequenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 259, 80, -1));

        cancelarPequenio.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cancelarPequenio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarPequenio.setText("Cancelar");
        cancelarPequenio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        cancelarPequenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelarPequenioMouseEntered(evt);
            }
        });
        jPanel4.add(cancelarPequenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 259, 80, -1));

        MenPrincPequenio.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        MenPrincPequenio.setText("Menú Principal");
        MenPrincPequenio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        MenPrincPequenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenPrincPequenioMouseEntered(evt);
            }
        });
        jPanel4.add(MenPrincPequenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        convertirGrande.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        convertirGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convertirGrande.setText("Convertir");
        convertirGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        convertirGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convertirGrandeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                convertirGrandeMouseExited(evt);
            }
        });
        jPanel4.add(convertirGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 100, 40));

        cancelarGrande.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cancelarGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarGrande.setText("Cancelar");
        cancelarGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        cancelarGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarGrandeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelarGrandeMouseExited(evt);
            }
        });
        jPanel4.add(cancelarGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 90, 40));

        MenPrincGrande.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        MenPrincGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenPrincGrande.setText("Menú Principal");
        MenPrincGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        MenPrincGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenPrincGrandeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenPrincGrandeMouseExited(evt);
            }
        });
        jPanel4.add(MenPrincGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 130, 40));

        lblerror.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblerror.setForeground(new java.awt.Color(255, 0, 0));
        lblerror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblerror.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel4.add(lblerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 200, 30));

        jPanelSlider1.add(jPanel4, "card3");

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("Temperatura");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        comboTemperatura.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        comboTemperatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la conversión...", "Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius", "Kelvin a Grados Celcius", "Kelvin a Grados Farenheit" }));
        comboTemperatura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel5.add(comboTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 270, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Ingrese el valor a convertir:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        txtvalorTemp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtvalorTemp.setText("0.00");
        txtvalorTemp.setBorder(null);
        txtvalorTemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvalorTempKeyTyped(evt);
            }
        });
        jPanel5.add(txtvalorTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 90, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 204, 204));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 90, 10));

        convPequenioTemp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        convPequenioTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convPequenioTemp.setText("Convertir");
        convPequenioTemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        convPequenioTemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convPequenioTempMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                convPequenioTempMouseEntered(evt);
            }
        });
        jPanel5.add(convPequenioTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, -1));

        cancelPequenioTemp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cancelPequenioTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelPequenioTemp.setText("Cancelar");
        cancelPequenioTemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        cancelPequenioTemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelPequenioTempMouseEntered(evt);
            }
        });
        jPanel5.add(cancelPequenioTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 70, -1));

        convGrandeTemp.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        convGrandeTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convGrandeTemp.setText("Convertir");
        convGrandeTemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        convGrandeTemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convGrandeTempMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                convGrandeTempMouseExited(evt);
            }
        });
        jPanel5.add(convGrandeTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 110, 40));

        cancelGrandeTemp.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cancelGrandeTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelGrandeTemp.setText("Cancelar");
        cancelGrandeTemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        cancelGrandeTemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelGrandeTempMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelGrandeTempMouseExited(evt);
            }
        });
        jPanel5.add(cancelGrandeTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 110, 40));

        menuPequenioTemp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        menuPequenioTemp.setText("Menú Principal");
        menuPequenioTemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        menuPequenioTemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPequenioTempMouseEntered(evt);
            }
        });
        jPanel5.add(menuPequenioTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        menuGrandeTemp.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        menuGrandeTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuGrandeTemp.setText("Menú Principal");
        menuGrandeTemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        menuGrandeTemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuGrandeTempMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuGrandeTempMouseExited(evt);
            }
        });
        jPanel5.add(menuGrandeTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 150, 40));

        lblerrorTemp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblerrorTemp.setForeground(new java.awt.Color(255, 0, 0));
        lblerrorTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblerrorTemp.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel5.add(lblerrorTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 184, 210, 20));

        jPanelSlider1.add(jPanel5, "card4");

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setText("Unidades de Medida");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 11, -1, -1));

        comboUM.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        comboUM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la conversión...", "Metro a Kilómetro", "Metro a Centímetro", "Metro a Milímetro", "Centímetro a Kilómetro", "Centímetro a Metro", "Centímetro a Milímetro", "Milímetro a Kilometro", "Milímetro a Metro", "Milímetro a Centímetro", "Kilómetro a Metro", "Kilómetro a Centímetro", "Kilómetro a Milímetro", " " }));
        comboUM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel6.add(comboUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 270, -1));

        valorUM.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        valorUM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        valorUM.setText("0.00");
        valorUM.setBorder(null);
        valorUM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorUMKeyTyped(evt);
            }
        });
        jPanel6.add(valorUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 80, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(0, 204, 204));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 80, 10));

        convPequenioUM.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        convPequenioUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convPequenioUM.setText("Convertir");
        convPequenioUM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        convPequenioUM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                convPequenioUMMouseEntered(evt);
            }
        });
        jPanel6.add(convPequenioUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 70, -1));

        convGrandeUM.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        convGrandeUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convGrandeUM.setText("Convertir");
        convGrandeUM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        convGrandeUM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convGrandeUMMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                convGrandeUMMouseExited(evt);
            }
        });
        jPanel6.add(convGrandeUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 110, 40));

        cancelPequenioUm.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cancelPequenioUm.setText("Cancelar");
        cancelPequenioUm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        cancelPequenioUm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelPequenioUmMouseEntered(evt);
            }
        });
        jPanel6.add(cancelPequenioUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 60, 20));

        cancelGrandeUM.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cancelGrandeUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelGrandeUM.setText("Cancelar");
        cancelGrandeUM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        cancelGrandeUM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelGrandeUMMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelGrandeUMMouseExited(evt);
            }
        });
        jPanel6.add(cancelGrandeUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 100, 40));

        menuPequenioUM.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        menuPequenioUM.setText("Menú Principal");
        menuPequenioUM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        menuPequenioUM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPequenioUMMouseEntered(evt);
            }
        });
        jPanel6.add(menuPequenioUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        menuGrandeUM.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        menuGrandeUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuGrandeUM.setText("Menú Principal");
        menuGrandeUM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        menuGrandeUM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuGrandeUMMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuGrandeUMMouseExited(evt);
            }
        });
        jPanel6.add(menuGrandeUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 130, 40));

        lblerrorUM.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblerrorUM.setForeground(new java.awt.Color(255, 0, 0));
        lblerrorUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(lblerrorUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 150, 20));

        jPanelSlider1.add(jPanel6, "card5");

        getContentPane().add(jPanelSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 370, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarGrandeMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cerrarGrandeMouseClicked

    private void cerrarPequenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarPequenioMouseEntered
        // TODO add your handling code here:
        cerrarPequenio.setVisible(false);
        cerrarGrande.setVisible(true);
    }//GEN-LAST:event_cerrarPequenioMouseEntered

    private void cerrarGrandeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarGrandeMouseExited
        // TODO add your handling code here:
        cerrarPequenio.setVisible(true);
        cerrarGrande.setVisible(false);
    }//GEN-LAST:event_cerrarGrandeMouseExited

    private void convMonedaGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convMonedaGrandeMouseClicked
        // TODO add your handling code here:
        jPanelSlider1.nextPanel(15, jPanel4, jPanelSlider1.right);
        imagenPrincipal.setIcon(new ImageIcon("C:\\Users\\oscar\\Documents\\NetBeansProjects\\ConversorMonedayMas\\src\\Imagenes\\dinero-05.gif"));
        textoImgPrincipal.setText("Conversor de Moneda");
        imagenPrincipal.setPreferredSize(new Dimension(250, 263));
    }//GEN-LAST:event_convMonedaGrandeMouseClicked

    private void convMonedaGrandeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convMonedaGrandeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_convMonedaGrandeMouseEntered

    private void convMonedaGrandeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convMonedaGrandeMouseExited
        // TODO add your handling code here:
        iniciarConvMoneda();
    }//GEN-LAST:event_convMonedaGrandeMouseExited

    private void convMonedaPequenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convMonedaPequenioMouseEntered
        // TODO add your handling code here:
        agrandarBtnConvMoneda();
    }//GEN-LAST:event_convMonedaPequenioMouseEntered

    private void convTemperaturaPequenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convTemperaturaPequenioMouseEntered
        // TODO add your handling code here:
        agrandarBtnConvTemperatura();
    }//GEN-LAST:event_convTemperaturaPequenioMouseEntered

    private void convTemperaturaGrandeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convTemperaturaGrandeMouseEntered
        // TODO add your handling code here:
        //iniciarConvTemperatura();
    }//GEN-LAST:event_convTemperaturaGrandeMouseEntered

    private void convTemperaturaGrandeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convTemperaturaGrandeMouseExited
        // TODO add your handling code here:
        iniciarConvTemperatura();
    }//GEN-LAST:event_convTemperaturaGrandeMouseExited

    private void convUniMedidasPequenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convUniMedidasPequenioMouseEntered
        // TODO add your handling code here:
        agrandarBtnConvUniMedidas();
    }//GEN-LAST:event_convUniMedidasPequenioMouseEntered

    private void convUniMedidasGrandeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convUniMedidasGrandeMouseEntered
        // TODO add your handling code here:
        //jPanelSlider1.nextPanel(40, jPanel4, jPanelSlider1.right);
    }//GEN-LAST:event_convUniMedidasGrandeMouseEntered

    private void convUniMedidasGrandeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convUniMedidasGrandeMouseExited
        // TODO add your handling code here:
        iniciarConvUniMedidas();
    }//GEN-LAST:event_convUniMedidasGrandeMouseExited

    private void convertirPequenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertirPequenioMouseEntered
        // TODO add your handling code here:
        agrandarBtnConvertirMoneda();
    }//GEN-LAST:event_convertirPequenioMouseEntered

    private void convertirGrandeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertirGrandeMouseExited
        // TODO add your handling code here:
        iniciarBtnConvertirMoneda();
    }//GEN-LAST:event_convertirGrandeMouseExited

    private void cancelarPequenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarPequenioMouseEntered
        // TODO add your handling code here:
        agrandarBtnCancelarMoneda();
    }//GEN-LAST:event_cancelarPequenioMouseEntered

    private void cancelarGrandeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarGrandeMouseExited
        // TODO add your handling code here:
        iniciarBtnCancelarMoneda();
    }//GEN-LAST:event_cancelarGrandeMouseExited

    private void MenPrincPequenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenPrincPequenioMouseEntered
        // TODO add your handling code here:
        agrandarBtnMenPrincipal();
    }//GEN-LAST:event_MenPrincPequenioMouseEntered

    private void MenPrincGrandeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenPrincGrandeMouseExited
        // TODO add your handling code here:
        iniciarBtnMenuPrincipal();
    }//GEN-LAST:event_MenPrincGrandeMouseExited

    private void rbtnExtranLocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnExtranLocalMouseClicked
        // TODO add your handling code here:
        LimpiarComboMonedas();
        llenarcomboMonedaExtranjeraLocal();
    }//GEN-LAST:event_rbtnExtranLocalMouseClicked

    private void rbtnLocalExtranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnLocalExtranMouseClicked
        // TODO add your handling code here:
        LimpiarComboMonedas();
        llenarcomboMonedaLocalExtranjera();
    }//GEN-LAST:event_rbtnLocalExtranMouseClicked

    private void convertirGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertirGrandeMouseClicked
        // TODO add your handling code here:
        int opcion = comboSeleccionMoneda.getSelectedIndex();
        Double cantidad;
        Double resultado;
        if (cantidadConvertir.getText().equalsIgnoreCase("") || cantidadConvertir.getText().equalsIgnoreCase("0.00")) {
            JOptionPane.showMessageDialog(null, "Ingrese la cantidad a convertir", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (rbtnLocalExtran.isSelected() == true) {
                cantidad = Double.parseDouble(cantidadConvertir.getText());
                switch (opcion) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Seleccione una opción de conversión", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1:
                        resultado = cantidad / 1.12249;
                        JOptionPane.showMessageDialog(null, cantidad + " dólares estadounidenses" + "\nes igual a\n" + formatearResultado(resultado) + " Euros", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    case 2:
                        resultado = cantidad / 1.31;
                        JOptionPane.showMessageDialog(null, cantidad + " dólares estadounidenses" + "\nes igual a\n" + formatearResultado(resultado) + " Libras Esterlinas", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    case 3:
                        resultado = cantidad / 0.0072517368;
                        JOptionPane.showMessageDialog(null, cantidad + " dólares estadounidenses" + "\nes igual a\n" + formatearResultado(resultado) + " Yen Japonés", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    case 4:
                        resultado = cantidad / 0.00078775371;
                        JOptionPane.showMessageDialog(null, cantidad + " dólares estadounidenses" + "\nes igual a\n" + formatearResultado(resultado) + " Won Surcoreano", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    case 5:
                        resultado = cantidad / 0.059342592;
                        JOptionPane.showMessageDialog(null, cantidad + " dólares estadounidenses" + "\nes igual a\n" + formatearResultado(resultado) + " Pesos Mexicanos", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    case 6:
                        resultado = cantidad / 0.0037825696;
                        JOptionPane.showMessageDialog(null, cantidad + " dólares estadounidenses" + "\nes igual a\n" + formatearResultado(resultado) + " Pesos Argentinos", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    case 7:
                        resultado = cantidad / 0.12858718;
                        JOptionPane.showMessageDialog(null, cantidad + " dólares estadounidenses" + "\nes igual a\n" + formatearResultado(resultado) + " Quetzal", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Algo salio mal", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (rbtnExtranLocal.isSelected() == true) {
                cantidad = Double.parseDouble(cantidadConvertir.getText());
                switch (opcion) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Seleccione una opción de conversión", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1:
                        resultado = cantidad / 0.89070447;
                        JOptionPane.showMessageDialog(null, cantidad + " Euros" + "\nes igual a\n" + formatearResultado(resultado) + " Dólares estadounidenses", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    case 2:
                        resultado = cantidad / 0.76167501;
                        JOptionPane.showMessageDialog(null, cantidad + " Libras Esterlinas" + "\nes igual a\n" + formatearResultado(resultado) + " Dólares estadounidenses", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    case 3:
                        resultado = cantidad / 137.56868;
                        JOptionPane.showMessageDialog(null, cantidad + " Yen Japonés" + "\nes igual a\n" + formatearResultado(resultado) + " Dólares estadounidenses", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    case 4:
                        resultado = cantidad / 1268.074;
                        JOptionPane.showMessageDialog(null, cantidad + " Won Surcoreano" + "\nes igual a\n" + formatearResultado(resultado) + " Dólares estadounidenses", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    case 5:
                        resultado = cantidad / 16.841186;
                        JOptionPane.showMessageDialog(null, cantidad + " Pesos Mexicanos" + "\nes igual a\n" + formatearResultado(resultado) + " Dólares estadounidenses", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    case 6:
                        resultado = cantidad / 264.38515;
                        JOptionPane.showMessageDialog(null, cantidad + " Pesos Argentinos" + "\nes igual a\n" + formatearResultado(resultado) + " Dólares estadounidenses", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    case 7:
                        resultado = cantidad / 7.8082411;
                        JOptionPane.showMessageDialog(null, cantidad + " Quetzales" + "\nes igual a\n" + formatearResultado(resultado) + " Dólares estadounidenses", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        cantidadConvertir.setText("0.00");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Algo salio mal", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_convertirGrandeMouseClicked

    private void cancelarGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarGrandeMouseClicked
        // TODO add your handling code here:
        rbtnLocalExtran.setSelected(true);
        cantidadConvertir.setText("0.00");
        LimpiarComboMonedas();
        llenarcomboMonedaLocalExtranjera();
    }//GEN-LAST:event_cancelarGrandeMouseClicked

    private void MenPrincGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenPrincGrandeMouseClicked
        // TODO add your handling code here:
        jPanelSlider1.nextPanel(15, jPanel2, jPanelSlider1.left);
        imagenPrincipal.setIcon(new ImageIcon("C:\\Users\\oscar\\Documents\\NetBeansProjects\\ConversorMonedayMas\\src\\Imagenes\\5AB6.gif"));
        textoImgPrincipal.setText("Bienvenidos");
        imagenPrincipal.setPreferredSize(new Dimension(250, 263));
    }//GEN-LAST:event_MenPrincGrandeMouseClicked

    private void cantidadConvertirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadConvertirKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        int key = (int) evt.getKeyChar();
            //if ((caracter < '0') || (caracter > '9') ) {
            if (key >=46 && key <= 57) {
                if(key==46){
                    String dato = cantidadConvertir.getText();
                    int tamanio = dato.length();
                    for(int i=0;i<=tamanio;i++){
                        if(dato.contains(".")){
                            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                            lblerror.setText("");
                        }
                    }
                }if(key==47){
                    evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                    lblerror.setText("Digite solo numeros");
                }else{
                    lblerror.setText("");
                }
                //evt.consume();
                //lblerror.setText("Digite solo números");
            } else {
                evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                evt.consume();
                lblerror.setText("Digite solo numeros");
            }
    }//GEN-LAST:event_cantidadConvertirKeyTyped

    private void convTemperaturaGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convTemperaturaGrandeMouseClicked
        // TODO add your handling code here:
        jPanelSlider1.nextPanel(15, jPanel5, jPanelSlider1.right);
        imagenPrincipal.setIcon(new ImageIcon("C:\\Users\\oscar\\Documents\\NetBeansProjects\\ConversorMonedayMas\\src\\Imagenes\\very-hot-high-temperature.gif"));
        textoImgPrincipal.setText("Conv. Temperatura");
        imagenPrincipal.setPreferredSize(new Dimension(250, 263));
    }//GEN-LAST:event_convTemperaturaGrandeMouseClicked

    private void convUniMedidasGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convUniMedidasGrandeMouseClicked
        // TODO add your handling code here:
        jPanelSlider1.nextPanel(15, jPanel6, jPanelSlider1.right);
        imagenPrincipal.setIcon(new ImageIcon("C:\\Users\\oscar\\Documents\\NetBeansProjects\\ConversorMonedayMas\\src\\Imagenes\\Imagen-animada-Cinta-metrica-08.gif"));
        textoImgPrincipal.setText("Conv. Unidad de Medidas");
        imagenPrincipal.setPreferredSize(new Dimension(250, 263));
    }//GEN-LAST:event_convUniMedidasGrandeMouseClicked

    private void menuGrandeTempMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGrandeTempMouseExited
        // TODO add your handling code here:
        iniciarBtnMenuPrincipalTemp();
    }//GEN-LAST:event_menuGrandeTempMouseExited

    private void menuPequenioTempMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPequenioTempMouseEntered
        // TODO add your handling code here:
        agrandarBtnMenPrincipalTemp();
    }//GEN-LAST:event_menuPequenioTempMouseEntered

    private void menuGrandeTempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGrandeTempMouseClicked
        // TODO add your handling code here:
        jPanelSlider1.nextPanel(15, jPanel2, jPanelSlider1.left);
        imagenPrincipal.setIcon(new ImageIcon("C:\\Users\\oscar\\Documents\\NetBeansProjects\\ConversorMonedayMas\\src\\Imagenes\\5AB6.gif"));
        textoImgPrincipal.setText("Bienvenidos");
        imagenPrincipal.setPreferredSize(new Dimension(250, 263));
    }//GEN-LAST:event_menuGrandeTempMouseClicked

    private void cancelGrandeTempMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelGrandeTempMouseExited
        // TODO add your handling code here:
        iniciarBtnCancelarTemp();
    }//GEN-LAST:event_cancelGrandeTempMouseExited

    private void cancelPequenioTempMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelPequenioTempMouseEntered
        // TODO add your handling code here:
        agrandarBtnCancelarTemp();
    }//GEN-LAST:event_cancelPequenioTempMouseEntered

    private void convGrandeTempMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convGrandeTempMouseExited
        // TODO add your handling code here:
        iniciarBtnConvertirTemp();
    }//GEN-LAST:event_convGrandeTempMouseExited

    private void convPequenioTempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convPequenioTempMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_convPequenioTempMouseClicked

    private void convPequenioTempMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convPequenioTempMouseEntered
        // TODO add your handling code here:
        agrandarBtnConvertirTemp();
    }//GEN-LAST:event_convPequenioTempMouseEntered

    private void convGrandeTempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convGrandeTempMouseClicked
        // TODO add your handling code here:
        int opcion = comboTemperatura.getSelectedIndex();
        Double cantidad;
        Double resultado;
        if (txtvalorTemp.getText().equalsIgnoreCase("") || txtvalorTemp.getText().equalsIgnoreCase("0.00")) {
            JOptionPane.showMessageDialog(null, "Ingrese la cantidad a convertir", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
                cantidad = Double.parseDouble(txtvalorTemp.getText());
                switch (opcion) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Seleccione una opción de conversión", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1:
                        resultado = (cantidad * 9/5) + 32;
                        JOptionPane.showMessageDialog(null, cantidad + " grados Celcius" + "\nes igual a\n" + formatearResultado(resultado) + " grados Farenheit", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        txtvalorTemp.setText("0.00");
                        break;
                    case 2:
                        resultado = cantidad + 273.15;
                        JOptionPane.showMessageDialog(null, cantidad + " grados Celcius" + "\nes igual a\n" + formatearResultado(resultado) + " grados Kelvin", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        txtvalorTemp.setText("0.00");
                        break;
                    case 3:
                        resultado = (cantidad - 32) * 5/9;
                        JOptionPane.showMessageDialog(null, cantidad + " grados Farenheit" + "\nes igual a\n" + formatearResultado(resultado) + " grados Celcius", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        txtvalorTemp.setText("0.00");
                        break;
                    case 4:
                        resultado = cantidad - 273.15;
                        JOptionPane.showMessageDialog(null, cantidad + " grados Kelvin" + "\nes igual a\n" + formatearResultado(resultado) + " grados Celcius", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        txtvalorTemp.setText("0.00");
                        break;
                    case 5:
                        resultado = (cantidad - 273.15) * 9/5 + 32;
                        JOptionPane.showMessageDialog(null, cantidad + " grados Kelvin" + "\nes igual a\n" + formatearResultado(resultado) + " grados Farenheit", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        txtvalorTemp.setText("0.00");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Algo salio mal", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                
            } 
        }
    }//GEN-LAST:event_convGrandeTempMouseClicked

    private void cancelGrandeTempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelGrandeTempMouseClicked
        // TODO add your handling code here:
        txtvalorTemp.setText("0.00");
        LimpiarComboTemperatura();
        llenarcomboTemperatura();
    }//GEN-LAST:event_cancelGrandeTempMouseClicked

    private void txtvalorTempKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalorTempKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        int key = (int) evt.getKeyChar();
            //if ((caracter < '0') || (caracter > '9') ) {
            if (key >=45 && key <= 57) {
                if(key==46){
                    String dato = txtvalorTemp.getText();
                    int tamanio = dato.length();
                    for(int i=0;i<=tamanio;i++){
                        if(dato.contains(".")){
                            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                            lblerrorTemp.setText("");
                        }
                    }
                }
                if(key==45){
                    String dato = txtvalorTemp.getText();
                    int tamanio = dato.length();
                    for(int i=0;i<=tamanio;i++){
                        if(dato.contains("-")){
                            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                            lblerrorTemp.setText("");
                        }
                    }
                }
                if(key==47){
                    evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                    lblerrorTemp.setText("Digite solo numeros");
                }else{
                    lblerrorTemp.setText("");
                }
                //evt.consume();
                //lblerror.setText("Digite solo números");
            } else {
                evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                evt.consume();
                lblerrorTemp.setText("Digite solo numeros");
            }
    }//GEN-LAST:event_txtvalorTempKeyTyped

    private void convGrandeUMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convGrandeUMMouseExited
        // TODO add your handling code here:
        iniciarBtnConvertirUM();
    }//GEN-LAST:event_convGrandeUMMouseExited

    private void convPequenioUMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convPequenioUMMouseEntered
        // TODO add your handling code here:
        agrandarBtnConvertirUM();
    }//GEN-LAST:event_convPequenioUMMouseEntered

    private void cancelGrandeUMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelGrandeUMMouseExited
        // TODO add your handling code here:
        iniciarBtnCancelarUM();
    }//GEN-LAST:event_cancelGrandeUMMouseExited

    private void cancelPequenioUmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelPequenioUmMouseEntered
        // TODO add your handling code here:
        agrandarBtnCancelarUM();
    }//GEN-LAST:event_cancelPequenioUmMouseEntered

    private void menuGrandeUMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGrandeUMMouseExited
        // TODO add your handling code here:
        iniciarBtnMenuUM();
    }//GEN-LAST:event_menuGrandeUMMouseExited

    private void menuPequenioUMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPequenioUMMouseEntered
        // TODO add your handling code here:
        agrandarBtnMenuUM();
    }//GEN-LAST:event_menuPequenioUMMouseEntered

    private void menuGrandeUMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGrandeUMMouseClicked
        // TODO add your handling code here:
        jPanelSlider1.nextPanel(15, jPanel2, jPanelSlider1.left);
        imagenPrincipal.setIcon(new ImageIcon("C:\\Users\\oscar\\Documents\\NetBeansProjects\\ConversorMonedayMas\\src\\Imagenes\\5AB6.gif"));
        textoImgPrincipal.setText("Bienvenidos");
        imagenPrincipal.setPreferredSize(new Dimension(250, 263));
    }//GEN-LAST:event_menuGrandeUMMouseClicked

    private void convGrandeUMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convGrandeUMMouseClicked
        // TODO add your handling code here:
        int opcion = comboUM.getSelectedIndex();
        Double cantidad;
        Double resultado;
        if (valorUM.getText().equalsIgnoreCase("") || valorUM.getText().equalsIgnoreCase("0.00")) {
            JOptionPane.showMessageDialog(null, "Ingrese la cantidad a convertir", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
                cantidad = Double.parseDouble(valorUM.getText());
                switch (opcion) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Seleccione una opción de conversión", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1:
                        resultado = cantidad/1000;
                        JOptionPane.showMessageDialog(null, cantidad + " Metros" + "\nes igual a\n" + formatearResultado(resultado) + " Kilómetros", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        valorUM.setText("0.00");
                        break;
                    case 2:
                        resultado = cantidad * 100;
                        JOptionPane.showMessageDialog(null, cantidad + " Metros" + "\nes igual a\n" + formatearResultado(resultado) + " Centímetros", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        valorUM.setText("0.00");
                        break;
                    case 3:
                        resultado = cantidad * 39.37;
                        JOptionPane.showMessageDialog(null, cantidad + " Metros" + "\nes igual a\n" + formatearResultado(resultado) + " Pulgadas", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        valorUM.setText("0.00");
                        break;
                    case 4:
                        resultado = cantidad / 100000;
                        JOptionPane.showMessageDialog(null, cantidad + " Centímetros" + "\nes igual a\n" + formatearResultado(resultado) + " Kilómetros", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        valorUM.setText("0.00");
                        break;
                    case 5:
                        resultado = cantidad / 100;
                        JOptionPane.showMessageDialog(null, cantidad + " Centímetros" + "\nes igual a\n" + formatearResultado(resultado) + " Metros", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        valorUM.setText("0.00");
                        break;
                    case 6:
                        resultado = cantidad / 2.54;
                        JOptionPane.showMessageDialog(null, cantidad + " Centímetros" + "\nes igual a\n" + formatearResultado(resultado) + " Pulgadas", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        valorUM.setText("0.00");
                        break;
                    case 7:
                        resultado = cantidad / 39370;
                        JOptionPane.showMessageDialog(null, cantidad + " Pulgadas" + "\nes igual a\n" + formatearResultado(resultado) + " Kilómetros", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        valorUM.setText("0.00");
                        break;
                    case 8:
                        resultado = cantidad / 39.37;
                        JOptionPane.showMessageDialog(null, cantidad + " Pulgadas" + "\nes igual a\n" + formatearResultado(resultado) + " Metros", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        valorUM.setText("0.00");
                        break;
                    case 9:
                        resultado = cantidad * 2.54;
                        JOptionPane.showMessageDialog(null, cantidad + " Pulgadas" + "\nes igual a\n" + formatearResultado(resultado) + " Centímetros", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        valorUM.setText("0.00");
                        break;
                    case 10:
                        resultado = cantidad * 1000;
                        JOptionPane.showMessageDialog(null, cantidad + " Kilómetros" + "\nes igual a\n" + formatearResultado(resultado) + " Metros", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        valorUM.setText("0.00");
                        break;
                    case 11:
                        resultado = cantidad * 100000;
                        JOptionPane.showMessageDialog(null, cantidad + " Kilómetros" + "\nes igual a\n" + formatearResultado(resultado) + " Centímetros", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        valorUM.setText("0.00");
                        break;
                    case 12:
                        resultado = cantidad * 39370;
                        JOptionPane.showMessageDialog(null, cantidad + " Kilómetros" + "\nes igual a\n" + formatearResultado(resultado) + " Pulgadas", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                        valorUM.setText("0.00");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Algo salio mal", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                
            } 
        }
    }//GEN-LAST:event_convGrandeUMMouseClicked

    private void cancelGrandeUMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelGrandeUMMouseClicked
        // TODO add your handling code here:
        valorUM.setText("0.00");
        LimpiarComboUM();
        llenarcomboUM();
    }//GEN-LAST:event_cancelGrandeUMMouseClicked

    private void valorUMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorUMKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        int key = (int) evt.getKeyChar();
            //if ((caracter < '0') || (caracter > '9') ) {
            if (key >=46 && key <= 57) {
                if(key==46){
                    String dato = valorUM.getText();
                    int tamanio = dato.length();
                    for(int i=0;i<=tamanio;i++){
                        if(dato.contains(".")){
                            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                            lblerrorUM.setText("");
                        }
                    }
                }
                if(key==47){
                    evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                    lblerrorUM.setText("Digite solo numeros");
                }else{
                    lblerrorUM.setText("");
                }
                //evt.consume();
                //lblerror.setText("Digite solo números");
            } else {
                evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                evt.consume();
                lblerrorUM.setText("Digite solo numeros");
            }
    }//GEN-LAST:event_valorUMKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MenPrincGrande;
    private javax.swing.JLabel MenPrincPequenio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cancelGrandeTemp;
    private javax.swing.JLabel cancelGrandeUM;
    private javax.swing.JLabel cancelPequenioTemp;
    private javax.swing.JLabel cancelPequenioUm;
    private javax.swing.JLabel cancelarGrande;
    private javax.swing.JLabel cancelarPequenio;
    private javax.swing.JTextField cantidadConvertir;
    private javax.swing.JLabel cerrarGrande;
    private javax.swing.JLabel cerrarPequenio;
    private javax.swing.JComboBox<String> comboSeleccionMoneda;
    private javax.swing.JComboBox<String> comboTemperatura;
    private javax.swing.JComboBox<String> comboUM;
    private javax.swing.JLabel convGrandeTemp;
    private javax.swing.JLabel convGrandeUM;
    private javax.swing.JLabel convMonedaGrande;
    private javax.swing.JLabel convMonedaPequenio;
    private javax.swing.JLabel convPequenioTemp;
    private javax.swing.JLabel convPequenioUM;
    private javax.swing.JLabel convTemperaturaGrande;
    private javax.swing.JLabel convTemperaturaPequenio;
    private javax.swing.JLabel convUniMedidasGrande;
    private javax.swing.JLabel convUniMedidasPequenio;
    private javax.swing.JLabel convertirGrande;
    private javax.swing.JLabel convertirPequenio;
    private javax.swing.JLabel imagenPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private diu.swe.habib.JPanelSlider.JPanelSlider jPanelSlider1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblerror;
    private javax.swing.JLabel lblerrorTemp;
    private javax.swing.JLabel lblerrorUM;
    private javax.swing.JLabel menuGrandeTemp;
    private javax.swing.JLabel menuGrandeUM;
    private javax.swing.JLabel menuPequenioTemp;
    private javax.swing.JLabel menuPequenioUM;
    private javax.swing.JRadioButton rbtnExtranLocal;
    private javax.swing.JRadioButton rbtnLocalExtran;
    private javax.swing.JLabel textoImgPrincipal;
    private javax.swing.JTextField txtvalorTemp;
    private javax.swing.JTextField valorUM;
    // End of variables declaration//GEN-END:variables
}
