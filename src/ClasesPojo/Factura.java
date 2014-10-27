/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPojo;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Factura {

    public Factura(int N_Factura, Date Fecha, int CodigoCliente, int CodigoEmpleado, double Subtotal, double Descuento, double Iva, double TotalF, int Codigo_Pizzeria,ArrayList<Detalle_Factura> detalle) {
        this.N_Factura = N_Factura;
        this.Fecha = Fecha;
        this.CodigoCliente = CodigoCliente;
        this.CodigoEmpleado = CodigoEmpleado;
        this.Subtotal = Subtotal;
        this.Descuento = Descuento;
        this.Iva = Iva;
        this.TotalF = TotalF;
        this.Codigo_Pizzeria=Codigo_Pizzeria;
        this.detalle=detalle;
        
    }

    

    

    
    
    
    
        private int N_Factura;

    /**
     * Get the value of N_Factura
     *
     * @return the value of N_Factura
     */
    public int getN_Factura() {
        return N_Factura;
    }

    /**
     * Set the value of N_Factura
     *
     * @param N_Factura new value of N_Factura
     */
    public void setN_Factura(int N_Factura) {
        this.N_Factura = N_Factura;
    }

    private Date Fecha;

    /**
     * Get the value of Fecha
     *
     * @return the value of Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * Set the value of Fecha
     *
     * @param Fecha new value of Fecha
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    
       private int CodigoCliente;

    /**
     * Get the value of CodigoCliente
     *
     * @return the value of CodigoCliente
     */
    public int getCodigoCliente() {
        return CodigoCliente;
    }

    /**
     * Set the value of CodigoCliente
     *
     * @param CodigoCliente new value of CodigoCliente
     */
    public void setCodigoCliente(int CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }
 
    private int CodigoEmpleado;

    /**
     * Get the value of CodigoEmpleado
     *
     * @return the value of CodigoEmpleado
     */
    public int getCodigoEmpleado() {
        return CodigoEmpleado;
    }

    /**
     * Set the value of CodigoEmpleado
     *
     * @param CodigoEmpleado new value of CodigoEmpleado
     */
    public void setCodigoEmpleado(int CodigoEmpleado) {
        this.CodigoEmpleado = CodigoEmpleado;
    }
    
     private double Subtotal;

    /**
     * Get the value of Subtotal
     *
     * @return the value of Subtotal
     */
    public double getSubtotal() {
        return Subtotal;
    }

    /**
     * Set the value of Subtotal
     *
     * @param Subtotal new value of Subtotal
     */
    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

        private double Descuento;

    /**
     * Get the value of Descuento
     *
     * @return the value of Descuento
     */
    public double getDescuento() {
        return Descuento;
    }

    /**
     * Set the value of Descuento
     *
     * @param Descuento new value of Descuento
     */
    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

        private double Iva;

    /**
     * Get the value of Iva
     *
     * @return the value of Iva
     */
    public double getIva() {
        return Iva;
    }

    /**
     * Set the value of Iva
     *
     * @param Iva new value of Iva
     */
    public void setIva(double Iva) {
        this.Iva = Iva;
    }

    private double TotalF;

    /**
     * Get the value of TotalF
     *
     * @return the value of TotalF
     */
    public double getTotalF() {
        return TotalF;
    }

    /**
     * Set the value of TotalF
     *
     * @param TotalF new value of TotalF
     */
    public void setTotalF(double TotalF) {
        this.TotalF = TotalF;
    }
     private ArrayList<Detalle_Factura> detalle = new  ArrayList<>();

    public ArrayList<Detalle_Factura> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<Detalle_Factura> detalle) {
        this.detalle = detalle;
    }
     private int Codigo_Pizzeria;

    public int getCodigo_Pizzeria() {
        return Codigo_Pizzeria;
    }

    public void setCodigo_Pizzeria(int Codigo_Pizzeria) {
        this.Codigo_Pizzeria = Codigo_Pizzeria;
    }
     
}
