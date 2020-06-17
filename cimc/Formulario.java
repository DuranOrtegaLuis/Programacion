
package cimc;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame {

   
    static CondicionesDePeso condicion = new CondicionesDePeso();

    java.text.DecimalFormat formato = new java.text.DecimalFormat("###.#");

    static Imc imcI = new Imc();

    public Formulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajaAltura = new javax.swing.JTextField();
        cajaPeso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonLimpiar = new javax.swing.JButton();
        Calcular = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InformacionDelPeso = new javax.swing.JTextArea();
        tipoImc = new javax.swing.JLabel();
        imc = new javax.swing.JLabel();
        botonX = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Peso en Kilogramos (Kg)");

        jLabel2.setText("Altura en metros (m)");

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaPeso)
                            .addComponent(cajaAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Calcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(botonLimpiar)
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calcular)
                    .addComponent(botonLimpiar))
                .addGap(20, 20, 20))
        );

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin nombre.png"))); // NOI18N

        InformacionDelPeso.setEditable(false);
        InformacionDelPeso.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        InformacionDelPeso.setRows(5);
        InformacionDelPeso.setText("ingrese su altura y su peso\nen formatos 0.0 o 0\n\n\n");
        InformacionDelPeso.setAutoscrolls(false);
        InformacionDelPeso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Iformacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        jScrollPane1.setViewportView(InformacionDelPeso);
        InformacionDelPeso.getAccessibleContext().setAccessibleName("");
        InformacionDelPeso.getAccessibleContext().setAccessibleParent(jLabel1);

        tipoImc.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        tipoImc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipoImc.setText("Masa corporal");
        tipoImc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        imc.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        imc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imc.setText("IMC");
        imc.setDoubleBuffered(true);
        imc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botonX.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botonX.setForeground(new java.awt.Color(255, 0, 0));
        botonX.setText("X");
        botonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonX)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipoImc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipoImc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(botonX))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        recogerPesoAltura();
    }//GEN-LAST:event_CalcularActionPerformed


    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        cajaPeso.setText("");
        cajaPeso.setBackground(Color.white);
        cajaAltura.setText("");
        cajaAltura.setBackground(Color.white);
        imc.setText("IMC");
        tipoImc.setText("Masa Corporal");
        tipoImc.setForeground(Color.black);
        InformacionDelPeso.setForeground(Color.black);
        InformacionDelPeso.setText("ingrese su altura y su peso\nen formatos 0.0 o 0\n\n"
                + "limpiar para poner nuevos datos\n\n");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin nombre.png")));

    }//GEN-LAST:event_botonLimpiarActionPerformed


    private void botonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonXActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonXActionPerformed

    public void recogerPesoAltura() {
        double peso = 0;
        double altura = 0;
        boolean hayErrores = false;

        try {
            peso = Double.parseDouble(cajaPeso.getText());
        } catch (Exception e) {
            cajaPeso.setBackground(Color.red);
            IformacionDelError();
            hayErrores = true;
        }

        try {
            altura = Double.parseDouble(cajaAltura.getText());
        } catch (Exception e) {
            cajaAltura.setBackground(Color.red);
            IformacionDelError();
            hayErrores = true;
        }

        if (peso < 1) {
            cajaPeso.setBackground(Color.red);
            IformacionDelError();
            hayErrores = true;
        }

        if (altura < 1) {
            cajaAltura.setBackground(Color.red);
            IformacionDelError();
            hayErrores = true;
        }
        if (!hayErrores) {
            imcI.setPeso(peso);
            imcI.setAltura(altura);
            restauarDespuesDeCorregirErrores();
            calcularImcYMostrarInformacion();
        }
    }

    public void calcularImcYMostrarInformacion() {
        if (imcI.calcularIMC() < 17) {
            desnutricion();
        }
        if (imcI.calcularIMC() >= 17 && imcI.calcularIMC() < 18.5) {
            bajoPeso();
        }
        if (imcI.calcularIMC() >= 18.5 && imcI.calcularIMC() < 26) {
            pesoNormal();
        }
        if (imcI.calcularIMC() >= 25 && imcI.calcularIMC() < 30) {
            sobrePeso();
        }
        if (imcI.calcularIMC() >= 30 && imcI.calcularIMC() < 40) {
            obesidad();
        }
        if (imcI.calcularIMC() >= 40) {
            obesidadMordiba();
        }
    }


    public void desnutricion() {
        tipoImc.setForeground(Color.BLUE);
        tipoImc.setText(condicion.desnutricion());
       
        imc.setText(formato.format(imcI.calcularIMC()));
        InformacionDelPeso.setText(condicion.getDesnutricion());
    }

    public void bajoPeso() {
        tipoImc.setForeground(Color.BLUE);
        tipoImc.setText(condicion.pesoBajo());
      
        imc.setText(formato.format(imcI.calcularIMC()));
        InformacionDelPeso.setText(condicion.getBajoPeso());
    }

    public void pesoNormal() {
        tipoImc.setForeground(Color.GREEN);
        tipoImc.setText(condicion.pesoNormal());
       
        imc.setText(formato.format(imcI.calcularIMC()));
        InformacionDelPeso.setText(condicion.getPesoNormal());
    }

    public void sobrePeso() {
        tipoImc.setForeground(Color.red);
        tipoImc.setText(condicion.sobrepesoLeve());
       
        imc.setText(formato.format(imcI.calcularIMC()));
        InformacionDelPeso.setText(condicion.getSobrePeso());
    }

    public void obesidad() {
        tipoImc.setForeground(Color.red);
        tipoImc.setText(condicion.obesidad());
     
        imc.setText(formato.format(imcI.calcularIMC()));
        InformacionDelPeso.setText(condicion.getObesidad());
    }

    public void obesidadMordiba() {
        tipoImc.setForeground(Color.red);
        tipoImc.setText(condicion.obesidadMordiba());
        
        imc.setText(formato.format(imcI.calcularIMC()));
        InformacionDelPeso.setText(condicion.getObesividadMordiba());
    }

    public void restauarDespuesDeCorregirErrores() {
        cajaPeso.setBackground(Color.white);
        cajaAltura.setBackground(Color.white);
        InformacionDelPeso.setForeground(Color.black);
    }

    public void IformacionDelError() {
        InformacionDelPeso.setForeground(Color.red);
        InformacionDelPeso.setText("No es correcto un caracter"
                + "\nni medidas de peso o"
                + "\naltura menores que 1");

    }

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private static javax.swing.JTextArea InformacionDelPeso;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonX;
    private static javax.swing.JTextField cajaAltura;
    private static javax.swing.JTextField cajaPeso;
    private static javax.swing.JLabel imagen;
    private javax.swing.JLabel imc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tipoImc;
    // End of variables declaration//GEN-END:variables
}
