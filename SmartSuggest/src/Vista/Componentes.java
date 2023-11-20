package Vista;

import Persistencia.TXTCreate.TXTBoard;
import Persistencia.TXTCreate.TXTFuente;
import Persistencia.TXTCreate.TXTProcesador;
import Entidades.*;

import Logica.*;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;

public class Componentes extends javax.swing.JFrame {

    TXTBoard btt = new TXTBoard();
    private LogicaBoard logicaBoard = new LogicaBoard();
    DefaultTableModel mdtCatalogoBoard = new DefaultTableModel();
    ArrayList<Board> listaBoards = new ArrayList();

    TXTFuente ftt = new TXTFuente();
    private LogicaProcesador logicaProcesador = new LogicaProcesador();
    DefaultTableModel mdtCatalogoProcesador = new DefaultTableModel();
    ArrayList<Procesador> listaProcesadores = new ArrayList();

    TXTProcesador ptt = new TXTProcesador();
    private LogicaFuente logicaFuente = new LogicaFuente();
    DefaultTableModel mdtCatalogoFuente = new DefaultTableModel();
    ArrayList<Fuente> listaFuentes = new ArrayList();

    TableRowSorter trsBoard = new TableRowSorter();
    TableRowSorter trsFuente = new TableRowSorter();
    TableRowSorter trsProcesador = new TableRowSorter();

    public Componentes() {

        initComponents();

        this.btt.crearArchivoTexto();
        this.ftt.crearArchivoTexto();
        this.ptt.crearArchivoTexto();

        this.listaBoards = this.logicaBoard.consultarBoards();
        this.listaProcesadores = this.logicaProcesador.consultarProcesadores();
        this.listaFuentes = this.logicaFuente.consultarFuentes();

        mdtCatalogoFuente.addColumn("Capacidad");

        mdtCatalogoBoard.addColumn("Tipo");
        mdtCatalogoBoard.addColumn("Soquet");
        mdtCatalogoBoard.addColumn("Puerto");

        mdtCatalogoProcesador.addColumn("Socket");
        mdtCatalogoProcesador.addColumn("Serie");
        mdtCatalogoProcesador.addColumn("Referencia");
        mdtCatalogoProcesador.addColumn("Generación");
        mdtCatalogoProcesador.addColumn("Gama");

        mostrarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtp_CatalogoBFP = new javax.swing.JTabbedPane();
        jsc_Board = new javax.swing.JScrollPane();
        jt_Board = new javax.swing.JTable();
        jsp_Fuentes = new javax.swing.JScrollPane();
        jt_Fuente = new javax.swing.JTable();
        jsp_Procesadores = new javax.swing.JScrollPane();
        jt_Procesadores = new javax.swing.JTable();
        jtf_Buscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cerrar1 = new javax.swing.JButton();
        minimizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtp_CatalogoBFP.setBackground(new java.awt.Color(33, 34, 45));
        jtp_CatalogoBFP.setMaximumSize(new java.awt.Dimension(900, 700));
        jtp_CatalogoBFP.setMinimumSize(new java.awt.Dimension(900, 700));
        jtp_CatalogoBFP.setPreferredSize(new java.awt.Dimension(900, 700));
        jtp_CatalogoBFP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtp_CatalogoBFPMouseClicked(evt);
            }
        });

        jt_Board.setBackground(new java.awt.Color(33, 34, 45));
        jt_Board.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jsc_Board.setViewportView(jt_Board);

        jtp_CatalogoBFP.addTab("Board", jsc_Board);

        jt_Fuente.setBackground(new java.awt.Color(33, 34, 45));
        jt_Fuente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jsp_Fuentes.setViewportView(jt_Fuente);

        jtp_CatalogoBFP.addTab("Fuentes", jsp_Fuentes);

        jt_Procesadores.setBackground(new java.awt.Color(33, 34, 45));
        jt_Procesadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jsp_Procesadores.setViewportView(jt_Procesadores);

        jtp_CatalogoBFP.addTab("Procesadores", jsp_Procesadores);

        getContentPane().add(jtp_CatalogoBFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 660, 530));

        jtf_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_BuscarKeyTyped(evt);
            }
        });
        getContentPane().add(jtf_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 360, -1));

        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 70, 20));

        cerrar1.setContentAreaFilled(false);
        cerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar1MouseClicked(evt);
            }
        });
        getContentPane().add(cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, 20, 20));

        minimizar.setContentAreaFilled(false);
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        getContentPane().add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Componets.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_BuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_BuscarKeyTyped
        // TODO add your handling code here:
        if (jtp_CatalogoBFP.getSelectedIndex() == 0) {
            jl_Buscar.setText("Buscar Board");
            jtf_Buscar.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent ke) {
                    trsBoard.setRowFilter(RowFilter.regexFilter("(?i)" + jtf_Buscar.getText(), 0));
                }
            });

            trsBoard = new TableRowSorter(mdtCatalogoBoard);
            jt_Board.setRowSorter(trsBoard);
        }

        if (jtp_CatalogoBFP.getSelectedIndex() == 1) {
            jl_Buscar.setText("Buscar Fuente");
            jtf_Buscar.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent ke) {
                    trsFuente.setRowFilter(RowFilter.regexFilter("(?i)" + jtf_Buscar.getText(), 0));
                }
            });

            trsFuente = new TableRowSorter(mdtCatalogoFuente);
            jt_Fuente.setRowSorter(trsFuente);
        }

        if (jtp_CatalogoBFP.getSelectedIndex() == 2) {
            jl_Buscar.setText("Buscar Procesador");
            jtf_Buscar.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent ke) {
                    trsProcesador.setRowFilter(RowFilter.regexFilter("(?i)" + jtf_Buscar.getText(), 2));
                }
            });

            trsProcesador = new TableRowSorter(mdtCatalogoProcesador);
            jt_Procesadores.setRowSorter(trsProcesador);
        }
    }//GEN-LAST:event_jtf_BuscarKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdministrarTarjetas prin = new AdministrarTarjetas();
        prin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtp_CatalogoBFPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtp_CatalogoBFPMouseClicked
        // TODO add your handling code here:
        if (jtp_CatalogoBFP.getSelectedIndex() == 0) {
            jl_Buscar.setText("Buscar Board");
        }
        
        if (jtp_CatalogoBFP.getSelectedIndex() == 1) {
            jl_Buscar.setText("Buscar Fuente");
        }
        
        if (jtp_CatalogoBFP.getSelectedIndex() == 2) {
            jl_Buscar.setText("Buscar Procesador");
        }

    }//GEN-LAST:event_jtp_CatalogoBFPMouseClicked

    private void cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseClicked

        System.exit(0);
    }//GEN-LAST:event_cerrar1MouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked
    private void mostrarTablas() {
        this.listaBoards.clear();
        this.listaFuentes.clear();
        this.listaProcesadores.clear();

        this.listaBoards = this.logicaBoard.consultarBoards();
        this.listaFuentes = this.logicaFuente.consultarFuentes();
        this.listaProcesadores = this.logicaProcesador.consultarProcesadores();

        this.mdtCatalogoBoard.setRowCount(0);
        this.mdtCatalogoFuente.setRowCount(0);
        this.mdtCatalogoProcesador.setRowCount(0);

        for (int i = 0; i < listaFuentes.size(); i++) {
            Object[] fila = new Object[1];
            fila[0] = listaFuentes.get(i).getCapacidad();
            mdtCatalogoFuente.addRow(fila);
        }

        for (int i = 0; i < listaBoards.size(); i++) {
            Object[] fila = new Object[3];
            fila[0] = listaBoards.get(i).getTipo();
            fila[1] = listaBoards.get(i).getPuerto();
            fila[2] = listaBoards.get(i).getSocket();
            mdtCatalogoBoard.addRow(fila);
        }

        for (int i = 0; i < listaProcesadores.size(); i++) {
            Object[] fila = new Object[5];
            fila[0] = listaProcesadores.get(i).getSocket();
            fila[1] = listaProcesadores.get(i).getSerie();
            fila[2] = listaProcesadores.get(i).getReferencia();
            fila[3] = listaProcesadores.get(i).getGeneracion();
            fila[4] = listaProcesadores.get(i).getGama();
            mdtCatalogoProcesador.addRow(fila);
        }

        jt_Fuente.setModel(mdtCatalogoFuente);
        jt_Board.setModel(mdtCatalogoBoard);
        jt_Procesadores.setModel(mdtCatalogoProcesador);
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
            java.util.logging.Logger.getLogger(Componentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Componentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Componentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Componentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Componentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jsc_Board;
    private javax.swing.JScrollPane jsp_Fuentes;
    private javax.swing.JScrollPane jsp_Procesadores;
    private javax.swing.JTable jt_Board;
    private javax.swing.JTable jt_Fuente;
    private javax.swing.JTable jt_Procesadores;
    private javax.swing.JTextField jtf_Buscar;
    private javax.swing.JTabbedPane jtp_CatalogoBFP;
    private javax.swing.JButton minimizar;
    // End of variables declaration//GEN-END:variables
}
