/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PantallasProyect;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author JHON ORTEGA ECHENIQUE
 */
public class PantallaRegistro extends javax.swing.JFrame {
    int xMouse,yMouse;

     FondoPanel fondoR = new FondoPanel();
    public PantallaRegistro() {
       this.setContentPane (fondoR);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PantallaRegistro = new java.awt.PopupMenu();
        TransparentePanel = new javax.swing.JPanel();
        barraPantalla = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        Panelinicio = new javax.swing.JPanel();
        lblRegistrarse = new javax.swing.JLabel();
        btnXRegistrar = new javax.swing.JButton();
        AunNoteunes = new javax.swing.JLabel();
        btnInicioS = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        lblContraseña = new javax.swing.JLabel();
        lblContraseña1 = new javax.swing.JLabel();
        checkbox2 = new java.awt.Checkbox();
        txtNombresUs = new javax.swing.JTextField();
        TextoPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        PantallaRegistro.setActionCommand("PantallaRegistro");
        PantallaRegistro.setLabel("popupMenu1");
        PantallaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantallaRegistroActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        TransparentePanel.setBackground(new java.awt.Color(0, 0, 0, 150));

        barraPantalla.setBackground(new java.awt.Color(0, 0, 0));
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

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(40, 40));

        btnExit.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setPreferredSize(new java.awt.Dimension(40, 40));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout barraPantallaLayout = new javax.swing.GroupLayout(barraPantalla);
        barraPantalla.setLayout(barraPantallaLayout);
        barraPantallaLayout.setHorizontalGroup(
            barraPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraPantallaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        barraPantallaLayout.setVerticalGroup(
            barraPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panelinicio.setBackground(new java.awt.Color(0, 0, 0));
        Panelinicio.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        Panelinicio.setForeground(new java.awt.Color(255, 255, 255));

        lblRegistrarse.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        lblRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarse.setText("REGISTRARSE");

        btnXRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        btnXRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnXRegistrar.setText("REGISTRARSE");
        btnXRegistrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnXRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXRegistrarMouseExited(evt);
            }
        });
        btnXRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXRegistrarActionPerformed(evt);
            }
        });

        AunNoteunes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        AunNoteunes.setForeground(new java.awt.Color(255, 255, 255));
        AunNoteunes.setText("¿Ya tienes una cuenta?");

        btnInicioS.setBackground(new java.awt.Color(28, 28, 28));
        btnInicioS.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnInicioS.setForeground(new java.awt.Color(0, 98, 221));
        btnInicioS.setText("INICIAR SESION");
        btnInicioS.setBorder(null);
        btnInicioS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSActionPerformed(evt);
            }
        });

        txtContraseña.setBackground(new java.awt.Color(28, 28, 28));
        txtContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });

        lblContraseña.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("CONTRASEÑA");

        lblContraseña1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblContraseña1.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña1.setText("NOMBRE DE USUARIO");

        checkbox2.setBackground(new java.awt.Color(28, 28, 28));
        checkbox2.setForeground(new java.awt.Color(255, 255, 255));
        checkbox2.setLabel("Aceptas la politica de privacidad");

        txtNombresUs.setBackground(new java.awt.Color(28, 28, 28));
        txtNombresUs.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombresUs.setForeground(new java.awt.Color(255, 255, 255));
        txtNombresUs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtNombresUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombresUsMousePressed(evt);
            }
        });
        txtNombresUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresUsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelinicioLayout = new javax.swing.GroupLayout(Panelinicio);
        Panelinicio.setLayout(PanelinicioLayout);
        PanelinicioLayout.setHorizontalGroup(
            PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelinicioLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelinicioLayout.createSequentialGroup()
                        .addComponent(lblContraseña1)
                        .addContainerGap(290, Short.MAX_VALUE))
                    .addGroup(PanelinicioLayout.createSequentialGroup()
                        .addGroup(PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombresUs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addComponent(lblContraseña, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelinicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelinicioLayout.createSequentialGroup()
                        .addComponent(lblRegistrarse)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelinicioLayout.createSequentialGroup()
                        .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelinicioLayout.createSequentialGroup()
                        .addComponent(btnXRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
            .addGroup(PanelinicioLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(AunNoteunes)
                .addGap(27, 27, 27)
                .addComponent(btnInicioS)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelinicioLayout.setVerticalGroup(
            PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelinicioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblRegistrarse)
                .addGap(34, 34, 34)
                .addComponent(lblContraseña1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombresUs, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblContraseña)
                .addGap(18, 18, 18)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnXRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AunNoteunes)
                    .addComponent(btnInicioS))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        TextoPanel.setBackground(new java.awt.Color(0, 0, 0, 0));
        TextoPanel.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 65)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html><center>¿ P A R A  Q U E<P>R E G I S T R A R S E?");
        jLabel3.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><center>Registrarse en un sistema de alarma antirrobos<p>proporciona una capa adicional de seguridad y<p>proteccion para tu hogar o negocio. Aunque implica un<p>costo inicial y posiblemente una tarifa de monitoreo<p>continua, muchos consideran que los beneficios en<p>terminos de seguridad y tranquilidad justifican esta<p>inversion.<html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout TextoPanelLayout = new javax.swing.GroupLayout(TextoPanel);
        TextoPanel.setLayout(TextoPanelLayout);
        TextoPanelLayout.setHorizontalGroup(
            TextoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(TextoPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        TextoPanelLayout.setVerticalGroup(
            TextoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextoPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TransparentePanelLayout = new javax.swing.GroupLayout(TransparentePanel);
        TransparentePanel.setLayout(TransparentePanelLayout);
        TransparentePanelLayout.setHorizontalGroup(
            TransparentePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(TextoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panelinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(barraPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TransparentePanelLayout.setVerticalGroup(
            TransparentePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentePanelLayout.createSequentialGroup()
                .addComponent(barraPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(TransparentePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransparentePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TextoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TransparentePanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Panelinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TransparentePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TransparentePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void barraPantallaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPantallaMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_barraPantallaMouseDragged

    private void barraPantallaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPantallaMousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_barraPantallaMousePressed

    private void btnXRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXRegistrarMouseClicked

    }//GEN-LAST:event_btnXRegistrarMouseClicked

    private void btnXRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXRegistrarMouseEntered

        btnXRegistrar.setBackground(Color.blue);
    }//GEN-LAST:event_btnXRegistrarMouseEntered

    private void btnXRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXRegistrarMouseExited

        btnXRegistrar.setBackground(Color.black);
    }//GEN-LAST:event_btnXRegistrarMouseExited

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        if (String.valueOf(txtContraseña.getPassword()).equals("  Ingrese su contraseña"))
        {
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.white);
        }            
          if (txtNombresUs.getText().isEmpty())
        {
            txtNombresUs.setText("  Ingrese su Nombre de Usuario");
            txtNombresUs.setForeground(Color.gray);
        }  
         
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked

             System.exit(0);        
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered

        btnExit.setForeground(Color.red);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited


        btnExit.setForeground(Color.white);
    }//GEN-LAST:event_btnExitMouseExited

    private void txtNombresUsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombresUsMousePressed
      if (txtNombresUs.getText().equals("  Ingrese su Nombre de Usuario"))
        {
            txtNombresUs.setText("");
            txtNombresUs.setForeground(Color.white);
        }
        if (String.valueOf(txtContraseña.getPassword()).isEmpty())
        {
            txtContraseña.setText("  Ingrese su contraseña");
            txtContraseña.setForeground(Color.gray);
        }        
    }//GEN-LAST:event_txtNombresUsMousePressed

    private void txtNombresUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresUsActionPerformed

    private void btnXRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXRegistrarActionPerformed
       
        Clases.Usuarios user = new Clases.Usuarios();
        user.GuardarUsuario(txtNombresUs, txtContraseña);
        //ClasesCamaraWeb.Consultas con = new ClasesCamaraWeb.Consultas();
        //con.GuardarUsuario(txtNombresUs.getText(), String.valueOf(txtContraseña.getPassword()));        

    }//GEN-LAST:event_btnXRegistrarActionPerformed

    private void btnInicioSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSActionPerformed

 
        PantallaBienve pb = new PantallaBienve();               
        pb.setLocationRelativeTo(this);
        pb.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnInicioSActionPerformed

    private void PantallaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantallaRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PantallaRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AunNoteunes;
    private javax.swing.JPanel Panelinicio;
    private java.awt.PopupMenu PantallaRegistro;
    private javax.swing.JPanel TextoPanel;
    private javax.swing.JPanel TransparentePanel;
    private javax.swing.JPanel barraPantalla;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnInicioS;
    private javax.swing.JButton btnXRegistrar;
    private java.awt.Checkbox checkbox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblContraseña1;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombresUs;
    // End of variables declaration//GEN-END:variables
   class FondoPanel extends JPanel
    {
            
     private Image imagen;
     @Override
     public void paint(Graphics g)
     { 
           imagen = new ImageIcon(getClass().getResource("/Imagenes/PRegistro.jpg")).getImage();
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
           setOpaque(false);
           super.paint(g);
     }
             
    }
}
