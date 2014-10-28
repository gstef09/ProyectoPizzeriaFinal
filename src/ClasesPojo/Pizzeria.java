/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPojo;

/**
 *
 * @author User
 */
public class Pizzeria {
     private int Codigo_Pizzeria;
    private String Nombre_Pizzeria;
    private String Ruc_Pizzeria;
    private int Codigo_Empleado;
    private String Direccion_Pizzeria;
    private String Telefono_Pizzeria;
    private String Ciudad_Pizzeria;

    public Pizzeria(int Codigo_Pizzeria, String Nombre_Pizzeria, String Ruc_Pizzeria, int Codigo_Empleado, String Direccion_Pizzeria, String Telefono_Pizzeria, String Ciudad_Pizzeria) {
        this.Codigo_Pizzeria = Codigo_Pizzeria;
        this.Nombre_Pizzeria = Nombre_Pizzeria;
        this.Ruc_Pizzeria = Ruc_Pizzeria;
        this.Codigo_Empleado = Codigo_Empleado;
        this.Direccion_Pizzeria = Direccion_Pizzeria;
        this.Telefono_Pizzeria = Telefono_Pizzeria;
        this.Ciudad_Pizzeria = Ciudad_Pizzeria;
    }
    
    
    

    public int getCodigo_Pizzeria() {
        return Codigo_Pizzeria;
    }

    public void setCodigo_Pizzeria(int Codigo_Pizzeria) {
        this.Codigo_Pizzeria = Codigo_Pizzeria;
    }

    public String getNombre_Pizzeria() {
        return Nombre_Pizzeria;
    }

    public void setNombre_Pizzeria(String Nombre_Pizzeria) {
        this.Nombre_Pizzeria = Nombre_Pizzeria;
    }

    public String getRuc_Pizzeria() {
        return Ruc_Pizzeria;
    }

    public void setRuc_Pizzeria(String Ruc_Pizzeria) {
        this.Ruc_Pizzeria = Ruc_Pizzeria;
    }

    public int getCodigo_Empleado() {
        return Codigo_Empleado;
    }

    public void setCodigo_Empleado(int Codigo_Empleado) {
        this.Codigo_Empleado = Codigo_Empleado;
    }

    public String getDireccion_Pizzeria() {
        return Direccion_Pizzeria;
    }

    public void setDireccion_Pizzeria(String Direccion_Pizzeria) {
        this.Direccion_Pizzeria = Direccion_Pizzeria;
    }

    public String getTelefono_Pizzeria() {
        return Telefono_Pizzeria;
    }

    public void setTelefono_Pizzeria(String Telefono_Pizzeria) {
        this.Telefono_Pizzeria = Telefono_Pizzeria;
    }

    public String getCiudad_Pizzeria() {
        return Ciudad_Pizzeria;
    }

    public void setCiudad_Pizzeria(String Ciudad_Pizzeria) {
        this.Ciudad_Pizzeria = Ciudad_Pizzeria;
    }
}
