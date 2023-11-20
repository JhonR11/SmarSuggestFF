package Vista;

import Entidades.TarjetaGrafica;
import Logica.LogicaTarjeta;
import Persistencia.TXTCreate.TXTTarjetas;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.table.DefaultTableModel;

public class AdministrarTarjetas extends javax.swing.JFrame {

    private LogicaTarjeta logica = new LogicaTarjeta();

    DefaultTableModel mdtCatalogo = new DefaultTableModel();
    ArrayList<TarjetaGrafica> listaTarjetas = new ArrayList();
    TXTTarjetas att = new TXTTarjetas();

    HashSet<String> organizarTM = new HashSet();
    HashSet<String> organizarPu = new HashSet();

    ArrayList<String> tipMemoria;
    ArrayList<String> puerto;

    public AdministrarTarjetas() {
        initComponents();

        organizarTM.clear();
        organizarPu.clear();

        jtf_ID.setEditable(false);
        this.att.crearArchivoTexto();
        this.listaTarjetas = this.logica.consultarTarjetas();

        for (int i = 0; i < listaTarjetas.size(); i++) {
            organizarTM.add(listaTarjetas.get(i).getTipoMemoria());
            organizarPu.add(listaTarjetas.get(i).getPuerto());
        }
        tipMemoria = new ArrayList(organizarTM);
        puerto = new ArrayList(organizarPu);

        for (String tipMemoria1 : tipMemoria) {
            jcb_tipMemoria.addItem(tipMemoria1);
        }
        for (String puerto1 : puerto) {
            jcb_Puertos.addItem(puerto1);
        }

        mdtCatalogo.addColumn("ID");
        mdtCatalogo.addColumn("Nombre");
        mdtCatalogo.addColumn("Modelo");
        mdtCatalogo.addColumn("Velocidad de Ram");
        mdtCatalogo.addColumn("Tipo de Memoria");
        mdtCatalogo.addColumn("Consumo");
        mdtCatalogo.addColumn("Alimentación Externa");
        mdtCatalogo.addColumn("Pines");
        mdtCatalogo.addColumn("Puerto");
        mdtCatalogo.addColumn("Procesadores");
        mdtCatalogo.addColumn("Gama");

        jcb_Opciones.setSelectedIndex(0);
        mostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtf_Nombre = new javax.swing.JTextField();
        jtb_Alimentacion = new javax.swing.JToggleButton();
        jtf_Modelo = new javax.swing.JTextField();
        jtf_VRam = new javax.swing.JTextField();
        jtf_Consumo = new javax.swing.JTextField();
        jtf_Pines = new javax.swing.JTextField();
        jtf_Procesador = new javax.swing.JTextField();
        jb_Accion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Catalogo = new javax.swing.JTable();
        jb_Catalogo = new javax.swing.JButton();
        jb_BFP = new javax.swing.JButton();
        jcb_Opciones = new javax.swing.JComboBox<>();
        jcb_tipMemoria = new javax.swing.JComboBox<>();
        jcb_Puertos = new javax.swing.JComboBox<>();
        jcb_Gama = new javax.swing.JComboBox<>();
        jtf_ID = new javax.swing.JTextField();
        minimizar = new javax.swing.JButton();
        cerrar1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf_Nombre.setText("Nvidia");
        getContentPane().add(jtf_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 232, -1));

        jtb_Alimentacion.setText("Alimentación Externa");
        jtb_Alimentacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtb_AlimentacionMousePressed(evt);
            }
        });
        getContentPane().add(jtb_Alimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 232, -1));

        jtf_Modelo.setText("GT 710");
        getContentPane().add(jtf_Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 232, -1));

        jtf_VRam.setText("2");
        getContentPane().add(jtf_VRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 232, -1));

        jtf_Consumo.setText("200");
        getContentPane().add(jtf_Consumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 232, -1));

        jtf_Pines.setText("0");
        getContentPane().add(jtf_Pines, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 232, -1));

        jtf_Procesador.setText("192");
        getContentPane().add(jtf_Procesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 232, -1));

        jb_Accion.setContentAreaFilled(false);
        jb_Accion.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jb_Accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AccionActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Accion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 450, 60));

        jt_Catalogo.setBackground(new java.awt.Color(33, 34, 45));
        jt_Catalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jt_Catalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_CatalogoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Catalogo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 124, 650, 530));

        jb_Catalogo.setText("Catalogo");
        jb_Catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CatalogoActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Catalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 382, -1));

        jb_BFP.setContentAreaFilled(false);
        jb_BFP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_BFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BFPActionPerformed(evt);
            }
        });
        getContentPane().add(jb_BFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 643, 340, 30));

        jcb_Opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crear", "Modificar", "Eliminar" }));
        jcb_Opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_OpcionesActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 382, -1));

        getContentPane().add(jcb_tipMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 232, -1));

        getContentPane().add(jcb_Puertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 232, -1));

        jcb_Gama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "baja", "baja-media", "baja-alta", "media-baja", "media", "media-alta", "alta-baja", "alta-media", "alta" }));
        getContentPane().add(jcb_Gama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 232, -1));

        jtf_ID.setText("1");
        getContentPane().add(jtf_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 232, -1));

        minimizar.setContentAreaFilled(false);
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        getContentPane().add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 20, 20));

        cerrar1.setContentAreaFilled(false);
        cerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar1MouseClicked(evt);
            }
        });
        getContentPane().add(cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, 20, 20));

        jLabel12.setToolTipText("");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 406, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/AdminTrjas.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_AccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AccionActionPerformed
        // TODO add your handling code here:
        if (jcb_Opciones.getSelectedItem().equals("Crear")) {
            TarjetaGrafica tg;
            //int ID;
            String nombre = jtf_Nombre.getText();
            String modelo = jtf_Modelo.getText();
            String VRam = jtf_VRam.getText();
            String tipoMemoria = jcb_tipMemoria.getSelectedItem().toString();
            int Consumo = Integer.parseInt(jtf_Consumo.getText());
            boolean alimentacionExterna = jtb_Alimentacion.isSelected();
            String pines = jtf_Pines.getText();
            String puert = jcb_Puertos.getSelectedItem().toString();
            int procesador = Integer.parseInt(jtf_Procesador.getText());
            String gama = jcb_Gama.getSelectedItem().toString();

            ArrayList<TarjetaGrafica> aux;
            aux = this.logica.consultarTarjetas();
            tg = this.logica.crearTarjeta((aux.size() + 1), nombre, modelo, VRam, tipoMemoria, Consumo, alimentacionExterna, pines, puert, procesador, gama);
            this.logica.registrarTarjeta(tg);
            this.mostrarTabla();
        }

        if (jcb_Opciones.getSelectedItem().equals("Modificar")) {
            TarjetaGrafica tg;
            int fila = jt_Catalogo.getSelectedRow();
            int idBuscado = Integer.parseInt(jt_Catalogo.getValueAt(fila, 0).toString());

            int ID = Integer.parseInt(jtf_ID.getText());
            String nombre = jtf_Nombre.getText();
            String modelo = jtf_Modelo.getText();
            String VRam = jtf_VRam.getText();
            String tipoMemoria = jcb_tipMemoria.getSelectedItem().toString();
            int Consumo = Integer.parseInt(jtf_Consumo.getText());
            boolean alimentacionExterna = jtb_Alimentacion.isSelected();
            String pines = jtf_Pines.getText();
            String puert = jcb_Puertos.getSelectedItem().toString();
            int procesador = Integer.parseInt(jtf_Procesador.getText());
            String gama = jcb_Gama.getSelectedItem().toString();

            tg = this.logica.crearTarjeta(
                    ID,
                    nombre,
                    modelo,
                    VRam,
                    tipoMemoria,
                    Consumo,
                    alimentacionExterna,
                    pines,
                    puert,
                    procesador,
                    gama);
            this.logica.reemplazarTarjeta(idBuscado, tg);
            jt_Catalogo.setModel(mdtCatalogo);
            this.mostrarTabla();
        }
        if (jcb_Opciones.getSelectedItem().equals("Eliminar")) {
            int fila = jt_Catalogo.getSelectedRow();
            int idEliminado = Integer.parseInt(jt_Catalogo.getValueAt(fila, 0).toString());
            this.logica.eliminarTarjeta(idEliminado);
            jt_Catalogo.setModel(mdtCatalogo);
            this.mostrarTabla();
        }
    }//GEN-LAST:event_jb_AccionActionPerformed

    private void jb_CatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CatalogoActionPerformed
        // TODO add your handling code here
        this.setVisible(false);
        Sugerencia cat = new Sugerencia();
        cat.setVisible(true);
    }//GEN-LAST:event_jb_CatalogoActionPerformed

    private void jb_BFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BFPActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Componentes prin = new Componentes();
        prin.setVisible(true);
    }//GEN-LAST:event_jb_BFPActionPerformed

    private void jt_CatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_CatalogoMouseClicked
        // TODO add your handling code here:
        if (jcb_Opciones.getSelectedItem().equals("Modificar") || (jcb_Opciones.getSelectedItem().equals("Eliminar"))) {
            mdtCatalogo = (DefaultTableModel) jt_Catalogo.getModel();
            int fila = jt_Catalogo.getSelectedRow();
            jtf_ID.setText(jt_Catalogo.getValueAt(fila, 0).toString());
            jtf_Nombre.setText((String) jt_Catalogo.getValueAt(fila, 1));
            jtf_Modelo.setText((String) jt_Catalogo.getValueAt(fila, 2));
            jtf_VRam.setText((String) jt_Catalogo.getValueAt(fila, 3));

            for (int i = 0; i < jcb_tipMemoria.getItemCount(); i++) {
                if (jt_Catalogo.getValueAt(fila, 4).toString().equals(jcb_tipMemoria.getItemAt(i))) {
                    jcb_tipMemoria.setSelectedIndex(i);
                    break;
                }
            }

            jtf_Consumo.setText(jt_Catalogo.getValueAt(fila, 5).toString());
            if ((Boolean) jt_Catalogo.getValueAt(fila, 6) == true) {
                jtb_Alimentacion.setText("Si");
                jtb_Alimentacion.setSelected(true);
            } else {
                jtb_Alimentacion.setText("No");
                jtb_Alimentacion.setSelected(false);
            }

            jtf_Pines.setText((String) jt_Catalogo.getValueAt(fila, 7));

            for (int i = 0; i < jcb_Puertos.getItemCount(); i++) {
                if (jt_Catalogo.getValueAt(fila, 8).toString().equals(jcb_Puertos.getItemAt(i))) {
                    jcb_Puertos.setSelectedIndex(i);
                    break;
                }
            }

            jtf_Procesador.setText(jt_Catalogo.getValueAt(fila, 9).toString());
            for (int i = 0; i < jcb_Gama.getItemCount(); i++) {
                if (jt_Catalogo.getValueAt(fila, 10).toString().equals(jcb_Gama.getItemAt(i))) {
                    jcb_Gama.setSelectedIndex(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_jt_CatalogoMouseClicked

    private void jcb_OpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_OpcionesActionPerformed
        // TODO add your handling code here:

        if (jcb_Opciones.getSelectedItem().equals("Crear")) {
            jb_Accion.setText("Crear Tarjeta");
        }

        if (jcb_Opciones.getSelectedItem().equals("Modificar")) {
            jb_Accion.setText("Modificar Tarjeta");

        }

        if (jcb_Opciones.getSelectedItem().equals("Eliminar")) {
            jb_Accion.setText("Eliminar Tarjeta");

        }
    }//GEN-LAST:event_jcb_OpcionesActionPerformed

    private void jtb_AlimentacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_AlimentacionMousePressed
        // TODO add your handling code here:
        if (!jtb_Alimentacion.isSelected()) {
            jtb_Alimentacion.setText("Si");
        } else {
            jtb_Alimentacion.setText("No");
        }
    }//GEN-LAST:event_jtb_AlimentacionMousePressed

    private void cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseClicked

        System.exit(0);

    }//GEN-LAST:event_cerrar1MouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void mostrarTabla() {
        this.listaTarjetas.clear();
        this.listaTarjetas = this.logica.consultarTarjetas();
        mdtCatalogo.setRowCount(0);
        for (int i = 0; i < listaTarjetas.size(); i++) {
            Object[] fila = new Object[11];

            fila[0] = listaTarjetas.get(i).getID();
            fila[1] = listaTarjetas.get(i).getNombre();
            fila[2] = listaTarjetas.get(i).getModelo();
            fila[3] = listaTarjetas.get(i).getVRam();
            fila[4] = listaTarjetas.get(i).getTipoMemoria();
            fila[5] = listaTarjetas.get(i).getConsumo();
            fila[6] = listaTarjetas.get(i).isAlimentacionExterna();
            fila[7] = listaTarjetas.get(i).getPines();
            fila[8] = listaTarjetas.get(i).getPuerto();
            fila[9] = listaTarjetas.get(i).getProcesador();
            fila[10] = listaTarjetas.get(i).getGama();
            mdtCatalogo.addRow(fila);
        }
        jt_Catalogo.setModel(mdtCatalogo);
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
            java.util.logging.Logger.getLogger(AdministrarTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrarTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrarTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrarTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrarTarjetas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Accion;
    private javax.swing.JButton jb_BFP;
    private javax.swing.JButton jb_Catalogo;
    private javax.swing.JComboBox<String> jcb_Gama;
    private javax.swing.JComboBox<String> jcb_Opciones;
    private javax.swing.JComboBox<String> jcb_Puertos;
    private javax.swing.JComboBox<String> jcb_tipMemoria;
    private javax.swing.JTable jt_Catalogo;
    private javax.swing.JToggleButton jtb_Alimentacion;
    private javax.swing.JTextField jtf_Consumo;
    private javax.swing.JTextField jtf_ID;
    private javax.swing.JTextField jtf_Modelo;
    private javax.swing.JTextField jtf_Nombre;
    private javax.swing.JTextField jtf_Pines;
    private javax.swing.JTextField jtf_Procesador;
    private javax.swing.JTextField jtf_VRam;
    private javax.swing.JButton minimizar;
    // End of variables declaration//GEN-END:variables
}
