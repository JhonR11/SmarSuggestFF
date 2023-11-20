package Vista;


import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.*;
import java.awt.*;

public class Vis_Menu extends javax.swing.JFrame {

    public Vis_Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    
    //bloq de cod para hacer traslucido el fondo de panel llamdo MenuU
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Sugerencia2 = new javax.swing.JButton();
        Catalogo = new javax.swing.JButton();
        Sugerencia = new javax.swing.JButton();
        Administrar = new javax.swing.JButton();
        minimizar = new javax.swing.JButton();
        cerrar1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sugerencia2.setContentAreaFilled(false);
        Sugerencia2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sugerencia2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sugerencia2MouseClicked(evt);
            }
        });
        Sugerencia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sugerencia2ActionPerformed(evt);
            }
        });
        jPanel1.add(Sugerencia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 20));

        Catalogo.setContentAreaFilled(false);
        Catalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Catalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 20));

        Sugerencia.setBorderPainted(false);
        Sugerencia.setContentAreaFilled(false);
        Sugerencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sugerencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SugerenciaMouseClicked(evt);
            }
        });
        jPanel1.add(Sugerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 760, 50));

        Administrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Administrar.setContentAreaFilled(false);
        Administrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Administrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdministrarMouseClicked(evt);
            }
        });
        jPanel1.add(Administrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 233, 100, 30));

        minimizar.setContentAreaFilled(false);
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        jPanel1.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 20, 20));

        cerrar1.setContentAreaFilled(false);
        cerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar1MouseClicked(evt);
            }
        });
        jPanel1.add(cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, 20, 20));

        salir.setContentAreaFilled(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 80, 20));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Dashboard_pages-to-jpg-0001_1_1.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Sugerencia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sugerencia2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sugerencia2ActionPerformed

    private void Sugerencia2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sugerencia2MouseClicked
       Sugerencia sug = new Sugerencia();
            sug.setVisible(true);
            dispose();
   
    }//GEN-LAST:event_Sugerencia2MouseClicked

    private void AdministrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdministrarMouseClicked
      
        AdministrarTarjetas adm = new AdministrarTarjetas();
        adm.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_AdministrarMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        Vis_Login log = new Vis_Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_salirMouseClicked

    private void SugerenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SugerenciaMouseClicked
        Sugerencia sug = new Sugerencia();
            sug.setVisible(true);
            dispose();
    }//GEN-LAST:event_SugerenciaMouseClicked

    private void cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_cerrar1MouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed
    
    public class TranslucentPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Establecer el color de fondo con transparencia
        Color bgColor = new Color(255, 255, 255, 150); // 150 es la opacidad
        g.setColor(bgColor);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
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
            java.util.logging.Logger.getLogger(Vis_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vis_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vis_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vis_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vis_Menu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Administrar;
    private javax.swing.JButton Catalogo;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Sugerencia;
    private javax.swing.JButton Sugerencia2;
    private javax.swing.JButton cerrar1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minimizar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
