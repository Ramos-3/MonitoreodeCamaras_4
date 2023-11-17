/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PantallasProyect;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class CamarasW extends javax.swing.JFrame {

    FondoPanel FondoC = new FondoPanel();
    int xMouse, yMouse;
    public CamarasW() {
        this.setContentPane (FondoC);
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Transparente = new javax.swing.JPanel();
        barraPantalla = new javax.swing.JPanel();
        ExitBtn = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        Camara1p = new FondoCamera();
        jLabel3 = new javax.swing.JLabel();
        Camara2p = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Camara3p = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Camara4p = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Transparente.setBackground(new java.awt.Color(0, 0, 0, 80));

        barraPantalla.setBackground(new java.awt.Color(0, 0, 0, 100));
        barraPantalla.setOpaque(false);
        barraPantalla.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraPantallaMouseDragged(evt);
            }
        });
        barraPantalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraPantallaMousePressed(evt);
            }
        });

        ExitBtn.setBackground(new java.awt.Color(0, 0, 0));
        ExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitBtnMouseEntered(evt);
            }
        });

        lblExit.setBackground(new java.awt.Color(0, 0, 0));
        lblExit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblExit.setPreferredSize(new java.awt.Dimension(40, 40));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitBtnLayout = new javax.swing.GroupLayout(ExitBtn);
        ExitBtn.setLayout(ExitBtnLayout);
        ExitBtnLayout.setHorizontalGroup(
            ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ExitBtnLayout.setVerticalGroup(
            ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRegresar.setBackground(new java.awt.Color(0, 0, 0, 0));
        btnRegresar.setPreferredSize(new java.awt.Dimension(56, 17));

        lblRegresar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setText("Regresar");
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
            .addGroup(btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnRegresarLayout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(lblRegresar)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnRegresarLayout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(lblRegresar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout barraPantallaLayout = new javax.swing.GroupLayout(barraPantalla);
        barraPantalla.setLayout(barraPantallaLayout);
        barraPantallaLayout.setHorizontalGroup(
            barraPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(1135, 1135, 1135)
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        barraPantallaLayout.setVerticalGroup(
            barraPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Camara1p.setBackground(new java.awt.Color(0, 0, 0));
        Camara1p.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Camara1p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Camara1p.setPreferredSize(new java.awt.Dimension(560, 315));
        Camara1p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Camara1pMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("OFICINA ZONA E");

        javax.swing.GroupLayout Camara1pLayout = new javax.swing.GroupLayout(Camara1p);
        Camara1p.setLayout(Camara1pLayout);
        Camara1pLayout.setHorizontalGroup(
            Camara1pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Camara1pLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addContainerGap(414, Short.MAX_VALUE))
        );
        Camara1pLayout.setVerticalGroup(
            Camara1pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Camara1pLayout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(19, 19, 19))
        );

        Camara2p.setBackground(new java.awt.Color(0, 0, 0));
        Camara2p.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Camara2p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Camara2p.setPreferredSize(new java.awt.Dimension(560, 315));
        Camara2p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Camara2pMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CAMERA 2");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NO SIGNAL");

        javax.swing.GroupLayout Camara2pLayout = new javax.swing.GroupLayout(Camara2p);
        Camara2p.setLayout(Camara2pLayout);
        Camara2pLayout.setHorizontalGroup(
            Camara2pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Camara2pLayout.createSequentialGroup()
                .addGroup(Camara2pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Camara2pLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(Camara2pLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel5)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        Camara2pLayout.setVerticalGroup(
            Camara2pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Camara2pLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(122, 122, 122)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        Camara3p.setBackground(new java.awt.Color(0, 0, 0));
        Camara3p.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Camara3p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Camara3p.setPreferredSize(new java.awt.Dimension(560, 315));
        Camara3p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Camara3pMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CAMERA 3");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NO SIGNAL");

        javax.swing.GroupLayout Camara3pLayout = new javax.swing.GroupLayout(Camara3p);
        Camara3p.setLayout(Camara3pLayout);
        Camara3pLayout.setHorizontalGroup(
            Camara3pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Camara3pLayout.createSequentialGroup()
                .addGroup(Camara3pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Camara3pLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(Camara3pLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel7)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        Camara3pLayout.setVerticalGroup(
            Camara3pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Camara3pLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(114, 114, 114)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        Camara4p.setBackground(new java.awt.Color(0, 0, 0));
        Camara4p.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Camara4p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Camara4p.setPreferredSize(new java.awt.Dimension(560, 315));
        Camara4p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Camara4pMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CAMERA 4");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NO SIGNAL");

        javax.swing.GroupLayout Camara4pLayout = new javax.swing.GroupLayout(Camara4p);
        Camara4p.setLayout(Camara4pLayout);
        Camara4pLayout.setHorizontalGroup(
            Camara4pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Camara4pLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Camara4pLayout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(211, 211, 211))
        );
        Camara4pLayout.setVerticalGroup(
            Camara4pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Camara4pLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout TransparenteLayout = new javax.swing.GroupLayout(Transparente);
        Transparente.setLayout(TransparenteLayout);
        TransparenteLayout.setHorizontalGroup(
            TransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TransparenteLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(TransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Camara1p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Camara3p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(TransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Camara4p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Camara2p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TransparenteLayout.setVerticalGroup(
            TransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparenteLayout.createSequentialGroup()
                .addComponent(barraPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Camara1p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Camara2p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Camara3p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Camara4p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Transparente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Transparente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked

        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered

        lblExit.setForeground(Color.red);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited

        lblExit.setForeground(Color.white);
    }//GEN-LAST:event_lblExitMouseExited

    private void ExitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitBtnMouseEntered

    private void barraPantallaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPantallaMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_barraPantallaMouseDragged

    private void barraPantallaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPantallaMousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_barraPantallaMousePressed

    private void Camara1pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Camara1pMouseClicked


        Camara1 cam1 = new Camara1();
        cam1.setVisible(true);
        cam1.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_Camara1pMouseClicked

    private void Camara2pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Camara2pMouseClicked

        Camara2 cam2 = new Camara2();
        cam2.setVisible(true);
        cam2.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_Camara2pMouseClicked

    private void Camara3pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Camara3pMouseClicked
        Camara3 cam3 = new Camara3();
        cam3.setVisible(true);
        cam3.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_Camara3pMouseClicked

    private void Camara4pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Camara4pMouseClicked
        Camara4 cam4 = new Camara4();
        cam4.setVisible(true);
        cam4.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_Camara4pMouseClicked

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked

        MenuCamera Mc = new MenuCamera();
        Mc.setLocationRelativeTo(this);
        Mc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseEntered
        lblRegresar.setForeground(Color.blue);
    }//GEN-LAST:event_lblRegresarMouseEntered

    private void lblRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseExited
        // TODO add your handling code here:
        lblRegresar.setForeground(Color.white);
    }//GEN-LAST:event_lblRegresarMouseExited

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
            java.util.logging.Logger.getLogger(CamarasW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CamarasW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CamarasW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CamarasW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CamarasW().setVisible(true);
            }
        });
    }

    class FondoPanel extends JPanel
    {
            
     private Image imagen;
     @Override
     public void paint(Graphics g)
     { 
           imagen = new ImageIcon(getClass().getResource("/Imagenes/CamerasPT.jpg")).getImage();
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
           setOpaque(false);
           super.paint(g);
     }
     }
    
     class FondoCamera extends JPanel
    {
            
     private Image imagen;
     @Override
     public void paint(Graphics g)
     { 
           imagen = new ImageIcon(getClass().getResource("/Imagenes/Camera1f.jpg")).getImage();
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
           setOpaque(false);
           super.paint(g);
     }
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Camara1p;
    private javax.swing.JPanel Camara2p;
    private javax.swing.JPanel Camara3p;
    private javax.swing.JPanel Camara4p;
    private javax.swing.JPanel ExitBtn;
    private javax.swing.JPanel Transparente;
    private javax.swing.JPanel barraPantalla;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblRegresar;
    // End of variables declaration//GEN-END:variables
}
