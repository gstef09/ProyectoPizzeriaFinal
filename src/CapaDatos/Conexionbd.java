/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PROFESORES
 */
public class Conexionbd {

    public static void setCliente(String dba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setCategoria(String dba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setProducto(String dba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Connection conectar = null;
    private PreparedStatement sentencia=null;
    private ResultSet resultado=null;
//    private ResultSetMetaData mtd;
//    private String consulta,error;
    private static Conexionbd instancia;
    
    public static Conexionbd getInstancia()
    {
        if (instancia==null)
        {
            instancia=new Conexionbd();
        }
        return instancia;
    }
    private static String persona;

    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public static String getPersona() {
        return persona;
    }

    /**
     * Set the value of usuario
     *
     * @param persona new value of usuario
     */
    public static void setPersona(String persona) {
        Conexionbd.persona = persona;
    }
    
    private static String clave;

    /**
     * Get the value of clave
     *
     * @return the value of clave
     */
    public static String getClave() {
        return clave;
    }

    /**
     * Set the value of clave
     *
     * @param clave new value of clave
     */
    public static void setClave(String clave) {
        Conexionbd.clave = clave;
    }

    private static String cadenaConexion;

    /**
     * Get the value of cadenaConexion
     *
     * @return the value of cadenaConexion
     */
    public static String getCadenaConexion() {
        return cadenaConexion;
    }

    /**
     * Set the value of cadenaConexion
     *
     * @param cadenaConexion new value of cadenaConexion
     */
    public static void setCadenaConexion(String cadenaConexion) {
        Conexionbd.cadenaConexion = cadenaConexion;
    }

    public Conexionbd() {
        
    }

    public void conectar()
    {
        try {
            conectar = DriverManager.getConnection(cadenaConexion, persona, clave);
        } catch (SQLException ex) {
            Logger.getLogger(Conexionbd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void desconectar()
    {
        try {
            conectar.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexionbd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ejecutar(String cadenaSql)throws SQLException
    {
        try {
            sentencia=conectar.prepareStatement(cadenaSql);
            sentencia.executeUpdate();
        } catch (SQLException ex) {
           throw ex;
        }
    }
     public ResultSet ejecutarbusqueda(String cadenaSql)throws SQLException
    {
        try {
            sentencia=conectar.prepareStatement(cadenaSql);
            resultado=sentencia.executeQuery();
            return resultado;
        } catch (SQLException ex) {
           throw ex;
        }
    }
        public ResultSet ejecutarbusquedatotal(String cadenaSql)throws SQLException
    {
        try {
            sentencia=conectar.prepareStatement(cadenaSql);
            resultado=sentencia.executeQuery();
           
            return resultado;
        } catch (SQLException ex) {
           throw ex;
        }
    }     
            
        
        
    
}
