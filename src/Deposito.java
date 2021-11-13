
import Clases.Banco;
import Clases.Coleccion;
import java.util.ArrayList;
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
public class Deposito extends javax.swing.JFrame {

    int monto_depositado;
    String rut = "";
    Coleccion dep; //= new Coleccion();

    public void setDep(Coleccion dep) {
        this.dep = dep;
    }

    boolean bandera; //Validaciones
    //Clases.Coleccion dep = new Clases.Coleccion();

    /**
     * Creates new form Deposito
     */
    public Deposito(Coleccion test) {
        initComponents();
        this.setDep(test);
        dep.mostrarTablaDeposito(jTable1, rut);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jtxt_rut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jrdb_cta_cte = new javax.swing.JRadioButton();
        jrdb_cta_ahorro = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jtxt_monto = new javax.swing.JTextField();
        jbtn_depositar = new javax.swing.JButton();
        jbtn_buscar = new javax.swing.JButton();
        jtxt_ctacte = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxt_ahorro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxt_linea_credito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxt_totalctacte = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar Deposito");

        jLabel1.setText("RUT:");

        jtxt_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_rutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Deposito Bancario");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUT", "Monto", "Cuenta"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Depositar"));

        buttonGroup1.add(jrdb_cta_cte);
        jrdb_cta_cte.setText("Cuenta Corriente");
        jrdb_cta_cte.setEnabled(false);

        buttonGroup1.add(jrdb_cta_ahorro);
        jrdb_cta_ahorro.setText("Cuenta de Ahorro");
        jrdb_cta_ahorro.setEnabled(false);

        jLabel3.setText("Monto $");

        jtxt_monto.setEnabled(false);

        jbtn_depositar.setText("Depositar");
        jbtn_depositar.setEnabled(false);
        jbtn_depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_depositarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtn_depositar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jrdb_cta_cte)
                            .addGap(18, 18, 18)
                            .addComponent(jrdb_cta_ahorro))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrdb_cta_cte)
                    .addComponent(jrdb_cta_ahorro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_depositar)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        jtxt_ctacte.setEnabled(false);

        jLabel4.setText("Saldo Cuenta Corriente");

        jLabel5.setText("Total Cuenta Ahorros");

        jtxt_ahorro.setEnabled(false);

        jLabel6.setText("Linea de Crédito");

        jtxt_linea_credito.setEnabled(false);

        jLabel7.setText("Linea de Crédito + Cuenta Corriente");

        jtxt_totalctacte.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(jtxt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jbtn_buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jtxt_ctacte, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_ahorro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxt_totalctacte, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_linea_credito, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_buscar))
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_ctacte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_ahorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_linea_credito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_totalctacte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_rutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_rutActionPerformed


    private void jbtn_depositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_depositarActionPerformed
        String tipo_cuenta = "";
        monto_depositado = Integer.parseInt(this.jtxt_monto.getText());
        rut = this.jtxt_rut.getText();

        if (this.jrdb_cta_cte.isSelected() || this.jrdb_cta_ahorro.isSelected()) {
            if (jrdb_cta_cte.isSelected()) {
                tipo_cuenta = "Cuenta Corriente";
            }

            if (jrdb_cta_ahorro.isSelected()) {
                tipo_cuenta = "Cuenta de Ahorros";
            }

            if (monto_depositado < 1) {
                JOptionPane.showMessageDialog(this, "El monto debe ser superior a $1", "Error de ingreso valor", 0);
                this.jtxt_monto.setText("");
                this.jtxt_monto.requestFocus();
            } else {

                //Banco banco = new Banco(this.jtxt_rut.getText(), tipo_cuenta, monto_depositado, 0, 0, 0, 0);
                Banco banco = new Banco(rut, tipo_cuenta, monto_depositado, 0, 0, 0, 0);
                dep.depositar(banco);

                JOptionPane.showMessageDialog(this, "Deposito Realizado", "Mensaje", 1);
                this.jtxt_monto.setText("");
                this.jtxt_rut.setEnabled(false);
                this.jbtn_buscar.setEnabled(false);
                this.jtxt_monto.requestFocus();
                dep.mostrarTablaDeposito(this.jTable1, rut);

                if (dep.saldoTotalCtaCte(rut) < 0) {
                    this.jtxt_ctacte.setText(0 + "");
                }else{
                    this.jtxt_ctacte.setText(dep.SaldoCtaCte(rut) + "");
                }
                
                
                this.jtxt_ahorro.setText(dep.SaldoCtaAhorro(rut) + "");

                this.jtxt_linea_credito.setText(dep.SaldoLineaCredito(rut) + "");
                this.jtxt_totalctacte.setText(dep.TotalCtaCte(rut) + dep.SaldoLineaCredito(rut) + "");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una cuenta", "Error cuenta no seleccionada", 0);
            this.jtxt_monto.requestFocus();
        }


    }//GEN-LAST:event_jbtn_depositarActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        rut = this.jtxt_rut.getText();
        bandera = dep.buscarRut(rut);
        limpiar();
        if (bandera == false) {
           
            int resp = JOptionPane.showConfirmDialog(null, "No se ha encontrado el RUT. ¿Desea agregarlo? Sí o No", "Rut no encontrado", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

            switch (resp) {
                case 0:
                    //"Has pulsado Sí";
                    this.jtxt_monto.setEnabled(true);
                    this.jrdb_cta_ahorro.setEnabled(true);
                    this.jrdb_cta_cte.setEnabled(true);
                    this.jbtn_depositar.setEnabled(true);

                    break;
                case 1:
                    //"Has pulsado No";
                    this.jtxt_rut.setText("");
                    this.jtxt_rut.requestFocus();
                    break;
            }

        } else {
            this.jtxt_monto.setEnabled(true);
            this.jrdb_cta_ahorro.setEnabled(true);
            this.jrdb_cta_cte.setEnabled(true);
            this.jbtn_depositar.setEnabled(true);
            dep.mostrarTablaDeposito(this.jTable1, rut);

            //this.jtxt_ctacte.setText(dep.SaldoCtaCte(rut) + "");
            //this.jtxt_ahorro.setText(dep.SaldoCtaAhorro(rut) + "");
            if (dep.saldoTotalCtaCte(rut) < 0) {
                this.jtxt_ctacte.setText(0 + "");
            }else{
                this.jtxt_ctacte.setText(dep.saldoTotalCtaCte(rut) + "");
            }
            
            this.jtxt_ahorro.setText(dep.saldoTotalAhorro(rut) + "");

            this.jtxt_linea_credito.setText(dep.SaldoLineaCredito(rut) + "");
            this.jtxt_totalctacte.setText(dep.TotalCtaCte(rut) + dep.SaldoLineaCredito(rut) + "");
        }

    }//GEN-LAST:event_jbtn_buscarActionPerformed

    private void limpiar() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        this.jtxt_ctacte.setText("");
        this.jtxt_ahorro.setText("");
        this.jtxt_linea_credito.setText("");
        this.jtxt_totalctacte.setText("");
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
//            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Deposito().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_depositar;
    private javax.swing.JRadioButton jrdb_cta_ahorro;
    private javax.swing.JRadioButton jrdb_cta_cte;
    private javax.swing.JTextField jtxt_ahorro;
    private javax.swing.JTextField jtxt_ctacte;
    private javax.swing.JTextField jtxt_linea_credito;
    private javax.swing.JTextField jtxt_monto;
    private javax.swing.JTextField jtxt_rut;
    private javax.swing.JTextField jtxt_totalctacte;
    // End of variables declaration//GEN-END:variables
}
