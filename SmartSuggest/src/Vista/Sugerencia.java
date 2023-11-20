package Vista;

import Entidades.Board;
import Entidades.Fuente;
import Entidades.Procesador;
import Entidades.TarjetaGrafica;
import Logica.LogicaBoard;
import Logica.LogicaFuente;
import Logica.LogicaProcesador;
import Logica.LogicaTarjeta;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;

public class Sugerencia extends javax.swing.JFrame {

    LogicaFuente logFuente = new LogicaFuente();
    LogicaBoard logBoard = new LogicaBoard();
    LogicaProcesador logProcesador = new LogicaProcesador();
    LogicaTarjeta logTarjeta = new LogicaTarjeta();

    ArrayList<Fuente> listaFuente = new ArrayList<>();
    ArrayList<Board> listaBoard = new ArrayList<>();
    ArrayList<Procesador> listaProcesadores = new ArrayList<>();
    ArrayList<TarjetaGrafica> listaTarjetas = new ArrayList<>();
    
    //HashSet<String> organizar = new HashSet();
    public Sugerencia() {
        initComponents();
        
        jtf_GamaProcesador.setEditable(false);
        listaFuente = this.logFuente.consultarFuentes();
        listaProcesadores = this.logProcesador.consultarProcesadores();
        listaBoard = this.logBoard.consultarBoards();
        listaTarjetas = this.logTarjeta.consultarTarjetas();
        for (int i = 0; i < listaFuente.size(); i++) {
            jcb_Fuente.addItem(listaFuente.get(i).getCapacidad() + "");
        
        }
 
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_Regresar = new javax.swing.JButton();
        jcb_Fuente = new javax.swing.JComboBox<>();
        jcb_TipoBoard = new javax.swing.JComboBox<>();
        jcb_SocketBoard = new javax.swing.JComboBox<>();
        jcb_FamiliaProcesador = new javax.swing.JComboBox<>();
        jcb_GeneracionProcesador = new javax.swing.JComboBox<>();
        jcb_ReferenciaProcesador = new javax.swing.JComboBox<>();
        jtf_GamaProcesador = new javax.swing.JTextField();
        jb_GenerarSugerencia = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JText_Puerto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_Sugerencia = new javax.swing.JTextArea();
        minimizar = new javax.swing.JButton();
        cerrar1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        minimizar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_Regresar.setBorderPainted(false);
        jb_Regresar.setContentAreaFilled(false);
        jb_Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_RegresarMouseClicked(evt);
            }
        });
        jb_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 70, 20));

        getContentPane().add(jcb_Fuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 220, -1));

        jcb_TipoBoard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMD", "INTEL" }));
        jcb_TipoBoard.setSelectedIndex(-1);
        jcb_TipoBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_TipoBoardActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_TipoBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 220, -1));

        jcb_SocketBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_SocketBoardActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_SocketBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 220, -1));

        jcb_FamiliaProcesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_FamiliaProcesadorActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_FamiliaProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 220, -1));

        jcb_GeneracionProcesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_GeneracionProcesadorActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_GeneracionProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 220, -1));

        jcb_ReferenciaProcesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_ReferenciaProcesadorActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_ReferenciaProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 220, -1));

        jtf_GamaProcesador.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(jtf_GamaProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 220, -1));

        jb_GenerarSugerencia.setContentAreaFilled(false);
        jb_GenerarSugerencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_GenerarSugerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GenerarSugerenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jb_GenerarSugerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 450, 70));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 115, -1, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 115, -1, -1));

        JText_Puerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JText_PuertoActionPerformed(evt);
            }
        });
        getContentPane().add(JText_Puerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 220, -1));

        JT_Sugerencia.setBackground(new java.awt.Color(33, 34, 45));
        JT_Sugerencia.setColumns(20);
        JT_Sugerencia.setForeground(new java.awt.Color(255, 255, 255));
        JT_Sugerencia.setRows(5);
        JT_Sugerencia.setBorder(null);
        jScrollPane1.setViewportView(JT_Sugerencia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 144, 620, 530));

        minimizar.setContentAreaFilled(false);
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        getContentPane().add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 20, 30));

        cerrar1.setContentAreaFilled(false);
        cerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar1MouseClicked(evt);
            }
        });
        cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 20, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Form.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1200, 710));

        minimizar1.setContentAreaFilled(false);
        minimizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizar1MouseClicked(evt);
            }
        });
        getContentPane().add(minimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 20, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_TipoBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_TipoBoardActionPerformed
        // TODO add your handling code here:
        jcb_SocketBoard.removeAllItems();
        HashSet<String> organizar = new HashSet();
        HashSet<String> organizar2 = new HashSet();
        try {
            for (int i = 0; i < listaBoard.size(); i++) {
                if ((jcb_TipoBoard.getSelectedItem().toString().equals("AMD")) && ((listaBoard.get(i).getTipo().equals("AMD")))) {
                    organizar.add(listaBoard.get(i).getSocket());
                    organizar2.add(listaBoard.get(i).getPuerto());
                } else if ((jcb_TipoBoard.getSelectedItem().toString().equals("INTEL")) && ((listaBoard.get(i).getTipo().equals("INTEL")))) {
                    organizar.add(listaBoard.get(i).getSocket());
                    organizar2.add(listaBoard.get(i).getPuerto());
                }
            }

            ArrayList<String> aux = new ArrayList(organizar);
            ArrayList<String> aux2 = new ArrayList(organizar2);
            Collections.sort(aux);
            Collections.sort(aux2);

            for (int i = 0; i < aux.size(); i++) {
                jcb_SocketBoard.addItem(aux.get(i));
            }
            for (int i = 0; i < aux2.size(); i++) {
                JText_Puerto.setText(aux2.get(i));
            }

            jcb_SocketBoard.setSelectedIndex(0);
        } catch (Exception exc) {
            System.out.println("1) Hay un error: " + exc);
        }
    }//GEN-LAST:event_jcb_TipoBoardActionPerformed

    private void jcb_SocketBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_SocketBoardActionPerformed
        // TODO add your handling code here:
        jcb_FamiliaProcesador.removeAllItems();
        HashSet<String> organizar = new HashSet();

        try {
            for (int i = 0; i < listaProcesadores.size(); i++) {
                if (jcb_SocketBoard.getSelectedItem().toString().equals(listaProcesadores.get(i).getSocket())) {
                    organizar.add(listaProcesadores.get(i).getSerie());
                }
            }

            ArrayList<String> aux = new ArrayList(organizar);
            Collections.sort(aux);

            for (int i = 0; i < aux.size(); i++) {
                jcb_FamiliaProcesador.addItem(aux.get(i));
            }

            jcb_FamiliaProcesador.setSelectedIndex(0);

        } catch (Exception exc) {
            System.out.println("2) Hay un error: " + exc);
        }
    }//GEN-LAST:event_jcb_SocketBoardActionPerformed

    private void jcb_FamiliaProcesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_FamiliaProcesadorActionPerformed
        // TODO add your handling code here:
        jcb_GeneracionProcesador.removeAllItems();
        HashSet<String> organizar = new HashSet();

        try {
            for (int i = 0; i < listaProcesadores.size(); i++) {
                if (jcb_FamiliaProcesador.getSelectedItem().toString().equals(listaProcesadores.get(i).getSerie())) {
                    organizar.add(listaProcesadores.get(i).getGeneracion());
                }
            }

            ArrayList<String> aux = new ArrayList<>(organizar);
            Collections.sort(aux);

            for (int i = 0; i < aux.size(); i++) {
                jcb_GeneracionProcesador.addItem(aux.get(i));
            }

            jcb_GeneracionProcesador.setSelectedIndex(0);

        } catch (Exception exc) {
            System.out.println("3) Hay un error: " + exc);
        }
    }//GEN-LAST:event_jcb_FamiliaProcesadorActionPerformed

    private void jcb_GeneracionProcesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_GeneracionProcesadorActionPerformed
        // TODO add your handling code here:
        jcb_ReferenciaProcesador.removeAllItems();
        HashSet<String> organizar = new HashSet();

        try {
            for (int i = 0; i < listaProcesadores.size(); i++) {
                if ((jcb_GeneracionProcesador.getSelectedItem().toString().equals(listaProcesadores.get(i).getGeneracion()))
                        && (jcb_FamiliaProcesador.getSelectedItem().toString().equals(listaProcesadores.get(i).getSerie()))) {
                    organizar.add(listaProcesadores.get(i).getReferencia());
                }
            }

            ArrayList<String> aux = new ArrayList<>(organizar);
            Collections.sort(aux);

            for (int i = 0; i < aux.size(); i++) {
                jcb_ReferenciaProcesador.addItem(aux.get(i));
            }

            jcb_ReferenciaProcesador.setSelectedIndex(0);
        } catch (Exception exc) {
            System.out.println("4) Hay un error: " + exc);
        }

    }//GEN-LAST:event_jcb_GeneracionProcesadorActionPerformed

    private void jcb_ReferenciaProcesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_ReferenciaProcesadorActionPerformed
        // TODO add your handling code here:
        
        jtf_GamaProcesador.setText(null);

        for (int i = 0; i < listaProcesadores.size(); i++) {
            if (jcb_ReferenciaProcesador.getSelectedItem().toString().equals(listaProcesadores.get(i).getReferencia())) {
                String gama = listaProcesadores.get(i).getGama();
                jtf_GamaProcesador.setText(gama);
                break;
            }
        }
    }//GEN-LAST:event_jcb_ReferenciaProcesadorActionPerformed

    private void jb_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_RegresarActionPerformed
        // TODO add your handling code here:
        Vis_Menu men = new Vis_Menu();
        men.setVisible(true);
        dispose();
    }//GEN-LAST:event_jb_RegresarActionPerformed

    private void jb_GenerarSugerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GenerarSugerenciaActionPerformed
        int consut = Integer.parseInt(jcb_Fuente.getSelectedItem().toString());
        for(int i=0;i<listaTarjetas.size();i++){
           if((jtf_GamaProcesador.getText().equals(listaTarjetas.get(i).getGama())
                   &&(JText_Puerto.getText().equals(listaTarjetas.get(i).getPuerto())))
                   &&(listaTarjetas.get(i).getConsumo())>=consut){
               //pa imprimir
               String tarjeta = listaTarjetas.get(i).getModelo();
               JT_Sugerencia.setText(tarjeta +"\t");
           }
               
       }
    }//GEN-LAST:event_jb_GenerarSugerenciaActionPerformed

    private void JText_PuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JText_PuertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JText_PuertoActionPerformed

    private void cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseClicked

        System.exit(0);

    }//GEN-LAST:event_cerrar1MouseClicked

    private void cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrar1ActionPerformed

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void jb_RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_RegresarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_RegresarMouseClicked

    private void minimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizar1MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizar1MouseClicked

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
            java.util.logging.Logger.getLogger(Sugerencia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sugerencia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sugerencia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sugerencia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Sugerencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JT_Sugerencia;
    private javax.swing.JTextField JText_Puerto;
    private javax.swing.JButton cerrar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_GenerarSugerencia;
    private javax.swing.JButton jb_Regresar;
    private javax.swing.JComboBox<String> jcb_FamiliaProcesador;
    private javax.swing.JComboBox<String> jcb_Fuente;
    private javax.swing.JComboBox<String> jcb_GeneracionProcesador;
    private javax.swing.JComboBox<String> jcb_ReferenciaProcesador;
    private javax.swing.JComboBox<String> jcb_SocketBoard;
    private javax.swing.JComboBox<String> jcb_TipoBoard;
    private javax.swing.JTextField jtf_GamaProcesador;
    private javax.swing.JButton minimizar;
    private javax.swing.JButton minimizar1;
    // End of variables declaration//GEN-END:variables


}


