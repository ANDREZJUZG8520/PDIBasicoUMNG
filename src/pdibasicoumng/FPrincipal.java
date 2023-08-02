package pdibasicoumng;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class FPrincipal extends javax.swing.JFrame{

    public FPrincipal(){
        
        initComponents();
        this.mImagenOriginal=new CImagen();
        this.mImagenProcesada=new CImagen();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jLabelImgOriginal = new javax.swing.JLabel();
        jLabelImgResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSliderBrillo = new javax.swing.JSlider();
        jButtonAceptarCambio = new javax.swing.JButton();
        jSliderContraste = new javax.swing.JSlider();
        jButtonNegativo = new javax.swing.JButton();
        Automatico = new javax.swing.JButton();
        jSliderRaiz = new javax.swing.JSlider();
        jMenuBarraPrincipal = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jMenuEdicion = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenupasabajos3 = new javax.swing.JMenuItem();
        jMenuItempasabajos5 = new javax.swing.JMenuItem();
        jMenuItempasabajos7 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenualtos3 = new javax.swing.JMenuItem();
        jMenualtos5 = new javax.swing.JMenuItem();
        jMenualtos7 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenubanda3 = new javax.swing.JMenuItem();
        jMenubanda5 = new javax.swing.JMenuItem();
        jMenubanda7 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuHigh3 = new javax.swing.JMenuItem();
        jMenuHigh5 = new javax.swing.JMenuItem();
        jMenuhigh7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        Maximo = new javax.swing.JMenuItem();
        Minimo = new javax.swing.JMenuItem();
        Mediana = new javax.swing.JMenuItem();
        Moda = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuAcerca = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PDI Básico UMNG");

        jLabelImgOriginal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImgOriginal.setAlignmentY(0.0F);
        jLabelImgOriginal.setAutoscrolls(true);
        jLabelImgOriginal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelImgResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImgResultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelImgResultado.setFocusable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Imagen Original");

        jLabel2.setText("Imagen procesada");

        jSliderBrillo.setMaximum(255);
        jSliderBrillo.setMinimum(-255);
        jSliderBrillo.setPaintLabels(true);
        jSliderBrillo.setPaintTicks(true);
        jSliderBrillo.setSnapToTicks(true);
        jSliderBrillo.setValue(0);
        jSliderBrillo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cambiar Brillo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jSliderBrillo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderBrilloStateChanged(evt);
            }
        });

        jButtonAceptarCambio.setText("Aceptar Cambio");
        jButtonAceptarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarCambioActionPerformed(evt);
            }
        });

        jSliderContraste.setMaximum(200);
        jSliderContraste.setPaintLabels(true);
        jSliderContraste.setPaintTicks(true);
        jSliderContraste.setSnapToTicks(true);
        jSliderContraste.setValue(100);
        jSliderContraste.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraste", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jSliderContraste.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderContrasteStateChanged(evt);
            }
        });

        jButtonNegativo.setText("Negativo");
        jButtonNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNegativoActionPerformed(evt);
            }
        });

        Automatico.setText("Automatico");
        Automatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutomaticoActionPerformed(evt);
            }
        });

        jSliderRaiz.setMaximum(10);
        jSliderRaiz.setMinimum(1);
        jSliderRaiz.setPaintLabels(true);
        jSliderRaiz.setPaintTicks(true);
        jSliderRaiz.setSnapToTicks(true);
        jSliderRaiz.setValue(1);
        jSliderRaiz.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-ésimo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jSliderRaiz.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderRaizStateChanged(evt);
            }
        });

        jMenuArchivo.setText("Archivo");

        jMenuItemAbrir.setText("Abrir");
        jMenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemAbrir);

        jMenuBarraPrincipal.add(jMenuArchivo);

        jMenuEdicion.setText("Edición");
        jMenuBarraPrincipal.add(jMenuEdicion);

        jMenu3.setText("Histgrama");

        jMenuItem1.setText("Histograma");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Ecualizacion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBarraPrincipal.add(jMenu3);

        jMenu4.setText("Filtros");

        jMenu5.setText("Filtros de convolucion");

        jMenu7.setText("Filtro suavizado pasa bajos");

        jMenupasabajos3.setText("3x3");
        jMenupasabajos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenupasabajos3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenupasabajos3);

        jMenuItempasabajos5.setText("5x5");
        jMenuItempasabajos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItempasabajos5ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItempasabajos5);

        jMenuItempasabajos7.setText("7x7");
        jMenu7.add(jMenuItempasabajos7);

        jMenu5.add(jMenu7);

        jMenu8.setText("Filtro realce pasa altos");

        jMenualtos3.setText("3x3");
        jMenu8.add(jMenualtos3);

        jMenualtos5.setText("5x5");
        jMenu8.add(jMenualtos5);

        jMenualtos7.setText("7x7");
        jMenu8.add(jMenualtos7);

        jMenu5.add(jMenu8);

        jMenu9.setText("Filtro pasa banda");

        jMenubanda3.setText("3x3");
        jMenu9.add(jMenubanda3);

        jMenubanda5.setText("5x5");
        jMenu9.add(jMenubanda5);

        jMenubanda7.setText("7x7");
        jMenu9.add(jMenubanda7);

        jMenu5.add(jMenu9);

        jMenu10.setText("Filtro High-Boost");

        jMenuHigh3.setText("3x3");
        jMenu10.add(jMenuHigh3);

        jMenuHigh5.setText("5x5");
        jMenu10.add(jMenuHigh5);

        jMenuhigh7.setText("7x7");
        jMenu10.add(jMenuhigh7);

        jMenu5.add(jMenu10);

        jMenu4.add(jMenu5);

        jMenu6.setText("Filtros no Lineales");

        Maximo.setText("Maximo");
        Maximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaximoActionPerformed(evt);
            }
        });
        jMenu6.add(Maximo);

        Minimo.setText("Minimo");
        Minimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimoActionPerformed(evt);
            }
        });
        jMenu6.add(Minimo);

        Mediana.setText("Mediana");
        jMenu6.add(Mediana);

        Moda.setText("Moda");
        jMenu6.add(Moda);

        jMenu4.add(jMenu6);

        jMenuBarraPrincipal.add(jMenu4);

        jMenu2.setText("Ayuda");

        jMenuAcerca.setText("Acerca de");
        jMenuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAcercaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuAcerca);

        jMenuBarraPrincipal.add(jMenu2);

        setJMenuBar(jMenuBarraPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1)
                .addGap(414, 414, 414)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelImgOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabelImgResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jSliderBrillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSliderContraste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNegativo)
                        .addGap(17, 17, 17)
                        .addComponent(Automatico))
                    .addComponent(jSliderRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAceptarCambio)
                        .addGap(42, 42, 42)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelImgOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                            .addComponent(jLabelImgResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSliderBrillo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSliderContraste, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSliderRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNegativo)
                            .addComponent(Automatico))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAceptarCambio)
                        .addGap(0, 296, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );

        Automatico.getAccessibleContext().setAccessibleName("jButtonAutomatico");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reiniciarComponentes(){
        
        jSliderBrillo.setValue(0);
        
    }
    
    private void jSliderBrilloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderBrilloStateChanged
        
        int constanteBrillo=jSliderBrillo.getValue();        
        BufferedImage ImgCopia=FPrincipal.crearCopiaImagen(this.mImagenOriginal.retornarImagen());
        this.mImagenProcesada.agregarImagen(ImgCopia);
        this.mImagenProcesada.Brillo(constanteBrillo);
        this.mostrarImagenProcesada(this.mImagenProcesada.retornarImagen());
        
    }//GEN-LAST:event_jSliderBrilloStateChanged

    private void jButtonAceptarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarCambioActionPerformed

        BufferedImage ImgCopia=FPrincipal.crearCopiaImagen(this.mImagenProcesada.retornarImagen());
        this.mImagenOriginal.agregarImagen(ImgCopia);
        this.mostrarImagenOriginal(ImgCopia); 
        this.reiniciarComponentes(); 
        
    }//GEN-LAST:event_jButtonAceptarCambioActionPerformed

    private void jSliderContrasteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderContrasteStateChanged
        
        int constanteAutomatico=jSliderContraste.getValue();
        float constante100 = (float)constanteAutomatico/100.0f;        
        BufferedImage ImgCopia=FPrincipal.crearCopiaImagen(this.mImagenOriginal.retornarImagen());
        this.mImagenProcesada.agregarImagen(ImgCopia);
        this.mImagenProcesada.Contraste(constante100);
        this.mostrarImagenProcesada(this.mImagenProcesada.retornarImagen());
        
    }//GEN-LAST:event_jSliderContrasteStateChanged

    private void jButtonNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNegativoActionPerformed
        
        BufferedImage ImgCopia=FPrincipal.crearCopiaImagen(this.mImagenOriginal.retornarImagen());
        this.mImagenProcesada.agregarImagen(ImgCopia);
        this.mImagenProcesada.Negativo();
        this.mostrarImagenProcesada(this.mImagenProcesada.retornarImagen());
        
    }//GEN-LAST:event_jButtonNegativoActionPerformed

    private void AutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutomaticoActionPerformed
      
        BufferedImage ImgCopia=FPrincipal.crearCopiaImagen(this.mImagenOriginal.retornarImagen());
        this.mImagenProcesada.agregarImagen(ImgCopia);
        this.mImagenProcesada.Automatico();
        this.mostrarImagenProcesada(this.mImagenProcesada.retornarImagen());
        
    }//GEN-LAST:event_AutomaticoActionPerformed

    private void jSliderRaizStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderRaizStateChanged

        int constanteRaiz=jSliderRaiz.getValue();        
        BufferedImage ImgCopia=FPrincipal.crearCopiaImagen(this.mImagenOriginal.retornarImagen());
        this.mImagenProcesada.agregarImagen(ImgCopia);
        this.mImagenProcesada.Raiz(constanteRaiz);
        this.mostrarImagenProcesada(this.mImagenProcesada.retornarImagen());
        
    }//GEN-LAST:event_jSliderRaizStateChanged

    private void jMenuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAcercaActionPerformed

        JFramAcerca Acerca = new JFramAcerca();
        Acerca.setVisible(true);

    }//GEN-LAST:event_jMenuAcercaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirActionPerformed

        BufferedImage ImgOr=abrirImagen();
        BufferedImage ImgCopia=this.crearCopiaImagen(ImgOr);
        this.mImagenOriginal.agregarImagen(ImgOr);
        this.mostrarImagenOriginal(ImgOr);
        this.mostrarImagenProcesada(ImgCopia);
        reiniciarComponentes();//Reinicia todos los controles en su posición inicial

    }//GEN-LAST:event_jMenuItemAbrirActionPerformed

    private void MaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaximoActionPerformed
        
        BufferedImage ImgCopia=FPrincipal.crearCopiaImagen(this.mImagenOriginal.retornarImagen());
        this.mImagenProcesada.agregarImagen(ImgCopia);
        this.mImagenProcesada.No_Lineal_Maximo();
        this.mostrarImagenProcesada(this.mImagenProcesada.retornarImagen());
        
    }//GEN-LAST:event_MaximoActionPerformed

    private void MinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimoActionPerformed
        // TODO add your handling code here:
        BufferedImage ImgCopia=FPrincipal.crearCopiaImagen(this.mImagenOriginal.retornarImagen());
        this.mImagenProcesada.agregarImagen(ImgCopia);
        this.mImagenProcesada.Negativo();
        this.mostrarImagenProcesada(this.mImagenProcesada.retornarImagen());
    }//GEN-LAST:event_MinimoActionPerformed

    private void jMenupasabajos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenupasabajos3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenupasabajos3ActionPerformed

    private void jMenuItempasabajos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItempasabajos5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItempasabajos5ActionPerformed

    //Abre la imagen seleccionada
    private BufferedImage abrirImagen(){
        
         JFileChooser jfc =new JFileChooser();
         BufferedImage img= null;
         
          if(jfc.showOpenDialog(jMenuItemAbrir)== JFileChooser.APPROVE_OPTION){
              File f = jfc.getSelectedFile();
              
               try{
                   
                  img =ImageIO.read(f);
                  System.out.println("Imagen seleccionada: "+f.getName()); 
                  
                  System.out.println("Tipo de Imagen: "+img.getType()); 
              }catch (IOException ex){
                  
                System.out.println("No se pudo abrir la imagen seleccionada");
              
              }
               
          }else{
              
              System.out.println("No se escogio nada");
          
          }    
          
          return img;
    
    }
    
    
    
    private void mostrarImagenOriginal(BufferedImage img){
        
        this.jLabelImgOriginal.setIcon(new ImageIcon(img));        
    
    }
    
    private void mostrarImagenProcesada(BufferedImage img){
        
        this.jLabelImgResultado.setIcon(new ImageIcon(img));

    }
    
    public static BufferedImage crearCopiaImagen(BufferedImage bufferImage){
        
        ColorModel colorModel = bufferImage.getColorModel();
        WritableRaster raster = bufferImage.copyData(null);
        boolean isAlphaPremultiplied = colorModel.isAlphaPremultiplied();
        return new BufferedImage(colorModel, raster, isAlphaPremultiplied, null);
        
    }

    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Automatico;
    private javax.swing.JMenuItem Maximo;
    private javax.swing.JMenuItem Mediana;
    private javax.swing.JMenuItem Minimo;
    private javax.swing.JMenuItem Moda;
    private javax.swing.JButton jButtonAceptarCambio;
    private javax.swing.JButton jButtonNegativo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelImgOriginal;
    private javax.swing.JLabel jLabelImgResultado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuItem jMenuAcerca;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBarraPrincipal;
    private javax.swing.JMenu jMenuEdicion;
    private javax.swing.JMenuItem jMenuHigh3;
    private javax.swing.JMenuItem jMenuHigh5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItempasabajos5;
    private javax.swing.JMenuItem jMenuItempasabajos7;
    private javax.swing.JMenuItem jMenualtos3;
    private javax.swing.JMenuItem jMenualtos5;
    private javax.swing.JMenuItem jMenualtos7;
    private javax.swing.JMenuItem jMenubanda3;
    private javax.swing.JMenuItem jMenubanda5;
    private javax.swing.JMenuItem jMenubanda7;
    private javax.swing.JMenuItem jMenuhigh7;
    private javax.swing.JMenuItem jMenupasabajos3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JSlider jSliderBrillo;
    private javax.swing.JSlider jSliderContraste;
    private javax.swing.JSlider jSliderRaiz;
    // End of variables declaration//GEN-END:variables
    private CImagen mImagenOriginal;
    private CImagen mImagenProcesada;
}
