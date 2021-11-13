/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Sebastian Soto
 * @author Stephanie Reese
 */
public class Banco {
    protected String rut;
    protected String tipo_cuenta;
    protected int monto_deposito, monto_giro, lineaCredito, totalCtaCte, totalCtaAhorro;

    public Banco() {
    }

    public Banco(String rut, String tipo_cuenta, int monto_deposito, int monto_giro, int lineaCredito, int totalCtaCte, int totalCtaAhorro) {
        this.rut = rut;
        this.tipo_cuenta = tipo_cuenta;
        this.monto_deposito = monto_deposito;
        this.monto_giro = monto_giro;
        this.lineaCredito = lineaCredito;
        this.totalCtaCte = totalCtaCte;
        this.totalCtaAhorro = totalCtaAhorro;
    }

    public Banco(String text, String tipo_cuenta, int monto_depositado, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public int getMonto_deposito() {
        return monto_deposito;
    }

    public void setMonto_deposito(int monto_deposito) {
        this.monto_deposito = monto_deposito;
    }

    public int getMonto_giro() {
        return monto_giro;
    }

    public void setMonto_giro(int monto_giro) {
        this.monto_giro = monto_giro;
    }

    public int getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(int lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public int getTotalCtaCte() {
        return totalCtaCte;
    }

    public void setTotalCtaCte(int totalCtaCte) {
        this.totalCtaCte = totalCtaCte;
    }

    public int getTotalCtaAhorro() {
        return totalCtaAhorro;
    }

    public void setTotalCtaAhorro(int totalCtaAhorro) {
        this.totalCtaAhorro = totalCtaAhorro;
    }

    

    

    

    
    
    
    
}
