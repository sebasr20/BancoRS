
import Clases.Coleccion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sebastian Soto
 * @author Stephanie Reese
 */
public class Saldo extends javax.swing.JFrame {

    String rut = "";
    Coleccion saldo;
    boolean bandera; //Validacion
    int num=0;
    public void setDep(Coleccion saldo) {
        this.saldo = saldo;
    }

    /**
     * Creates new form Saldo
     */
    public Saldo(Coleccion test) {
        initComponents();
        this.setDep(test);
        saldo.mostrarTablaDeposito(jTable1, rut);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtxt_saldoctacte = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxt_saldoctaahorro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxt_rut = new javax.swing.JTextField();
        jbtn_buscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jbtn_filtrar = new javax.swing.JButton();
        jchk_ctacte = new javax.swing.JCheckBox();
        jchk_ctaahorro = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RUT", "Depositos", "Giros", "Tipo cuenta"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jtxt_saldoctacte.setEnabled(false);
        jtxt_saldoctacte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_saldoctacteActionPerformed(evt);
            }
        });

        jLabel1.setText("Saldo Cuenta Corriente");

        jLabel2.setText("Saldo Cuenta de Ahorros");

        jtxt_saldoctaahorro.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Saldo de Cuentas");

        jLabel4.setText("RUT:");

        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        jbtn_filtrar.setText("Filtrar");
        jbtn_filtrar.setEnabled(false);
        jbtn_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_filtrarActionPerformed(evt);
            }
        });

        jchk_ctacte.setText("Mostrar Cuenta Corriente");
        jchk_ctacte.setEnabled(false);

        jchk_ctaahorro.setText("Mostrar Cuenta de Ahorros");
        jchk_ctaahorro.setEnabled(false);
        jchk_ctaahorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchk_ctaahorroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jchk_ctacte)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jchk_ctaahorro)
                        .addGap(42, 42, 42)
                        .addComponent(jbtn_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jchk_ctacte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jchk_ctaahorro)
                    .addComponent(jbtn_filtrar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jbtn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxt_saldoctacte, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jtxt_saldoctaahorro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_buscar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_saldoctacte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_saldoctaahorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jchk_ctaahorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchk_ctaahorroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchk_ctaahorroActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jtxt_saldoctacteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_saldoctacteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_saldoctacteActionPerformed

    private void jbtn_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_filtrarActionPerformed
        rut = this.jtxt_rut.getText();
        String tipo_cuenta = "";
        
        if (this.jchk_ctacte.isSelected()) {
            tipo_cuenta = "Cuenta Corriente";
           
        }

        if (this.jchk_ctaahorro.isSelected()) {
            tipo_cuenta = "Cuenta de Ahorros";
            
        }
        
        
        if (this.jchk_ctacte.isSelected()&& !this.jchk_ctaahorro.isSelected()) {
            saldo.mostrarTablaSaldo(this.jTable1, rut,tipo_cuenta);
        } else if (this.jchk_ctaahorro.isSelected() && !this.jchk_ctacte.isSelected()) {
            saldo.mostrarTablaSaldo(this.jTable1, rut,tipo_cuenta);
        } else if (this.jchk_ctacte.isSelected() && this.jchk_ctaahorro.isSelected()) {
            saldo.mostrarTablaSaldoAmbas(this.jTable1, rut);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de cuenta para filtrar", "Error ss-459", 0);
        }

    }//GEN-LAST:event_jbtn_filtrarActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        rut = this.jtxt_rut.getText();
        String tipo_cuenta = "";
        
        if (this.jchk_ctacte.isSelected()) {
            tipo_cuenta = "Cuenta Corriente";
        }

        if (this.jchk_ctaahorro.isSelected()) {
            tipo_cuenta = "Cuenta de Ahorros";
        }
        if (rut != "") {
            bandera = saldo.buscarRut(rut);
            limpiar();
            if (bandera == false) {
                JOptionPane.showMessageDialog(this, "El RUT ingresado no se encuentra en el sistema", "RUT no encontrado", 0);

            } else {
                this.jchk_ctacte.setEnabled(true);
                this.jchk_ctaahorro.setEnabled(true);
                this.jbtn_filtrar.setEnabled(true);

                //saldo.mostrarTablaSaldo(this.jTable1, rut, tipo_cuenta);

                if (saldo.saldoTotalCtaCte(rut) < 0) {
                    this.jtxt_saldoctacte.setText(0 + "");
                } else {
                    this.jtxt_saldoctacte.setText(saldo.saldoTotalCtaCte(rut) + "");
                }

                this.jtxt_saldoctaahorro.setText(saldo.saldoTotalAhorro(rut) + "");

                
                //this.jtxt_totalctacte.setText(giro.TotalCtaCte(rut) + giro.SaldoLineaCredito(rut) + "");
            }
        }
    }//GEN-LAST:event_jbtn_buscarActionPerformed

    private void limpiar() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        this.jtxt_saldoctacte.setText("");
        this.jtxt_saldoctaahorro.setText("");

    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Saldo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_filtrar;
    private javax.swing.JCheckBox jchk_ctaahorro;
    private javax.swing.JCheckBox jchk_ctacte;
    private javax.swing.JTextField jtxt_rut;
    private javax.swing.JTextField jtxt_saldoctaahorro;
    private javax.swing.JTextField jtxt_saldoctacte;
    // End of variables declaration//GEN-END:variables
}
