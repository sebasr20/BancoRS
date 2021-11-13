/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.Text;

/**
 *
 * @author Sebastian Soto
 * @author Stephanie Reese
 */
public class Coleccion {

    private ArrayList<Banco> deposito;

    public Coleccion() {

        deposito = new ArrayList<>();
    }

    public void depositar(Banco banc) {
        deposito.add(banc);
    }

//    public void girar(Banco banc, String rut){
//        for (Banco banco : deposito) {
//            
//        }
//    }
    public void mostrarTablaDeposito(JTable tabla, String rut) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        Object rowData[] = new Object[3];

        for (int i = 0; i < deposito.size(); i++) {
            if (deposito.get(i).getRut().equalsIgnoreCase(rut) && deposito.get(i).getMonto_deposito() > 0) {
                rowData[0] = deposito.get(i).getRut();
                rowData[1] = deposito.get(i).getMonto_deposito();
                rowData[2] = deposito.get(i).getTipo_cuenta();

                model.addRow(rowData);
            }

        }
    }

    public void mostrarTablaGiro(JTable tabla, String rut) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        Object rowData[] = new Object[3];

        for (int i = 0; i < deposito.size(); i++) {
            if (deposito.get(i).getRut().equalsIgnoreCase(rut) && deposito.get(i).getMonto_giro() > 0) {
                rowData[0] = deposito.get(i).getRut();
                rowData[1] = deposito.get(i).getMonto_giro();
                rowData[2] = deposito.get(i).getTipo_cuenta();

                model.addRow(rowData);
            }

        }
    }

    public void mostrarTablaSaldo(JTable tabla, String rut, String cuenta) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        Object rowData[] = new Object[4];

        for (int i = 0; i < deposito.size(); i++) {
            if (deposito.get(i).getRut().equalsIgnoreCase(rut) && deposito.get(i).getTipo_cuenta().equalsIgnoreCase(cuenta)) {
                if (deposito.get(i).getTipo_cuenta().equalsIgnoreCase("Cuenta Corriente")) {
                    rowData[0] = deposito.get(i).getRut();
                    rowData[1] = deposito.get(i).getMonto_deposito();
                    rowData[2] = deposito.get(i).getMonto_giro();
                    rowData[3] = deposito.get(i).getTipo_cuenta();
                } else {
                    rowData[0] = deposito.get(i).getRut();
                    rowData[1] = deposito.get(i).getMonto_deposito();
                    rowData[2] = deposito.get(i).getMonto_giro();
                    rowData[3] = deposito.get(i).getTipo_cuenta();
                }
                model.addRow(rowData);

            }

        }
    }

    public void mostrarTablaSaldoAmbas(JTable tabla, String rut) {
        DefaultTableModel model2 = (DefaultTableModel) tabla.getModel();
        model2.setRowCount(0);
        Object rowData[] = new Object[4];

        for (int i = 0; i < deposito.size(); i++) {
            if (deposito.get(i).getRut().equalsIgnoreCase(rut)
                    && deposito.get(i).getTipo_cuenta().equalsIgnoreCase("Cuenta Corriente") 
                    || deposito.get(i).getTipo_cuenta().equalsIgnoreCase("Cuenta de Ahorros") ) {

                rowData[0] = deposito.get(i).getRut();
                rowData[1] = deposito.get(i).getMonto_deposito();
                rowData[2] = deposito.get(i).getMonto_giro();
                rowData[3] = deposito.get(i).getTipo_cuenta();

                model2.addRow(rowData);

            }

        }
    }

    public boolean buscarRut(String rut) {
        int existe = 0;

        for (int i = 0; i < deposito.size(); i++) {
            if (deposito.get(i).getRut().equalsIgnoreCase(rut)) {
                //existe = 1;
                return true;
            }
        }
//        if (existe == 1) {
//            return true;
//        } else {
//            return false;
//        }
        return false;
    }

    public int SaldoCtaCte(String rut) {
        int total = 0;

        for (int i = 0; i < deposito.size(); i++) {
            if (deposito.get(i).getTipo_cuenta().equalsIgnoreCase("Cuenta Corriente") && deposito.get(i).getRut().equalsIgnoreCase(rut)) {
                total = (total + deposito.get(i).getMonto_deposito() - deposito.get(i).getMonto_giro());
                deposito.get(i).setTotalCtaCte(total);
            }
        }

        return total;

    }

    public int SaldoCtaAhorro(String rut) {
        int total = 0;
        for (int i = 0; i < deposito.size(); i++) {
            if (deposito.get(i).getTipo_cuenta().equalsIgnoreCase("Cuenta de Ahorros") && deposito.get(i).getRut().equalsIgnoreCase(rut)) {
                total = total + deposito.get(i).getMonto_deposito() - deposito.get(i).getMonto_giro();
                deposito.get(i).setTotalCtaAhorro(total);
                //total = deposito.get(i).getTotalCtaAhorro();
            }
        }

        return total;

    }

    public int SaldoLineaCredito(String rut) {
        int lineaCredito = 500000;
        for (int i = 0; i < deposito.size(); i++) {
            if (deposito.get(i).getTipo_cuenta().equalsIgnoreCase("Cuenta Corriente") && deposito.get(i).getRut().equalsIgnoreCase(rut)) {
                lineaCredito = lineaCredito + deposito.get(i).getLineaCredito();
            }
        }
        return lineaCredito;
    }

    public int GirarCtaCte(String rut) {
        //int total = SaldoCtaCte(rut);
        int total = 0;

        for (int i = 0; i < deposito.size(); i++) {
            if (deposito.get(i).getTipo_cuenta().equalsIgnoreCase("Cuenta Corriente") && deposito.get(i).getRut().equalsIgnoreCase(rut)) {
                total = (total + deposito.get(i).getMonto_deposito()) - deposito.get(i).getMonto_giro();
                deposito.get(i).setTotalCtaCte(total);
            }
        }

        return total;

    }

    public int GirarCtaAhorro(String rut) {
        //int total = SaldoCtaAhorro(rut);
        int total = 0;
        for (int i = 0; i < deposito.size(); i++) {
            if (deposito.get(i).getTipo_cuenta().equalsIgnoreCase("Cuenta de Ahorros") && deposito.get(i).getRut().equalsIgnoreCase(rut)) {
                total = (total + deposito.get(i).getMonto_deposito()) - deposito.get(i).getMonto_giro();
                deposito.get(i).setTotalCtaAhorro(total);
            }
        }
        return total;

    }

    public int TotalCtaCte(String rut) {
        int totalctacte = 0;
//        int montoGiro = 0;
//        if (GirarCtaCte(rut,giro)>0) {
//            montoGiro = GirarCtaCte(rut,giro);
//        }
        for (int i = 0; i < deposito.size(); i++) {
            if (deposito.get(i).getTipo_cuenta().equalsIgnoreCase("Cuenta Corriente") && deposito.get(i).getRut().equalsIgnoreCase(rut)) {
                totalctacte = deposito.get(i).getTotalCtaCte() + deposito.get(i).getLineaCredito();
                //totalctacte =  deposito.get(i).getTotalCtaCte() + deposito.get(i).getLineaCredito();
            }
        }
        return totalctacte;
    }

    public int saldoTotalAhorro(String rut) {
        int saldo = 0;
        for (int i = 0; i < deposito.size(); i++) {
            if (deposito.get(i).getTipo_cuenta().equalsIgnoreCase("Cuenta de Ahorros") && deposito.get(i).getRut().equalsIgnoreCase(rut)) {
                saldo = deposito.get(i).getTotalCtaAhorro();
            }
        }
        return saldo;
    }

    public int saldoTotalCtaCte(String rut) {
        int saldo = 0;
        for (int i = 0; i < deposito.size(); i++) {
            if (deposito.get(i).getTipo_cuenta().equalsIgnoreCase("Cuenta Corriente") && deposito.get(i).getRut().equalsIgnoreCase(rut)) {
                saldo = deposito.get(i).getTotalCtaCte();
            }
        }
        return saldo;
    }

}
