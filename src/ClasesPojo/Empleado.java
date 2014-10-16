/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPojo;

/**
 *
 * @author PROFESORES
 */
public class Empleado {

    public Empleado(int Codigo, String Cargo, String Nombre, String Apellido, String Sexo, int Edad, String Cedula, String Telefono) {
        this.Codigo = Codigo;
        this.Cargo = Cargo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.Edad = Edad;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
    }

   

        private int Codigo;

    public Empleado(int i, String string, String string0, String string1, int i0, String string2, String string3, String string4, String string5, String string6, String string7) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the value of Id
     *
     * @return the value of Id
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * Set the value of Id
     *
     * @param Codigo new value of Id
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
  private String Cargo;

    /**
     * Get the value of Cargo
     *
     * @return the value of Cargo
     */
    public String getCargo() {
        return Cargo;
    }

    /**
     * Set the value of Cargo
     *
     * @param Cargo new value of Cargo
     */
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    private String Nombre;

    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    private String Apellido;

    /**
     * Get the value of Apellido
     *
     * @return the value of Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * Set the value of Apellido
     *
     * @param Apellido new value of Apellido
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    private String Sexo;

    /**
     * Get the value of Sexo
     *
     * @return the value of Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * Set the value of Sexo
     *
     * @param Sexo new value of Sexo
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }    
    private int Edad;

    /**
     * Get the value of Edad
     *
     * @return the value of Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * Set the value of Edad
     *
     * @param Edad new value of Edad
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
private String Cedula;

    /**
     * Get the value of Cedula
     *
     * @return the value of Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * Set the value of Cedula
     *
     * @param Cedula new value of Cedula
     */
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    private String Telefono;

    /**
     * Get the value of Telefono
     *
     * @return the value of Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * Set the value of Telefono
     *
     * @param Telefono new value of Telefono
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
  

   
}
