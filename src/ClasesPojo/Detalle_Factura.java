/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPojo;

/**
 *
 * @author Carlos
 */
public class Detalle_Factura {

    public Detalle_Factura(int Codigo, int N_Factura, int CodigoProducto, String NombreProducto, int Cantidad,double PrecioUnitario, double PrecioVe) {
        this.Codigo = Codigo;
        this.N_Factura = N_Factura;
        this.CodigoProducto = CodigoProducto;
        this.NombreProducto = NombreProducto;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = PrecioUnitario;
        this.PrecioVe = PrecioVe;
    }

   
    
    private int Codigo;

    /**
     * Get the value of Codigo
     *
     * @return the value of Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * Set the value of Codigo
     *
     * @param Codigo new value of Codigo
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
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

    private int CodigoProducto;

    /**
     * Get the value of CodigoProducto
     *
     * @return the value of CodigoProducto
     */
    public int getCodigoProducto() {
        return CodigoProducto;
    }

    /**
     * Set the value of CodigoProducto
     *
     * @param CodigoProducto new value of CodigoProducto
     */
    public void setCodigoProducto(int CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    private String NombreProducto;

    /**
     * Get the value of NombreProducto
     *
     * @return the value of NombreProducto
     */
    public String getNombreProducto() {
        return NombreProducto;
    }

    /**
     * Set the value of NombreProducto
     *
     * @param NombreProducto new value of NombreProducto
     */
    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    private int Cantidad;

    /**
     * Get the value of Cantidad
     *
     * @return the value of Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * Set the value of Cantidad
     *
     * @param Cantidad new value of Cantidad
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    private  double PrecioUnitario;

    /**
     * Get the value of PrecioUnitario
     *
     * @return the value of PrecioUnitario
     */
    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    /**
     * Set the value of PrecioUnitario
     *
     * @param PrecioUnitario new value of PrecioUnitario
     */
    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    private double PrecioVe;

    /**
     * Get the value of PrecioVe
     *
     * @return the value of PrecioVe
     */
    public double getPrecioVe() {
        return PrecioVe;
    }

    /**
     * Set the value of PrecioVe
     *
     * @param PrecioVe new value of PrecioVe
     */
    public void setPrecioVe(double PrecioVe) {
        this.PrecioVe = PrecioVe;
    }


}
