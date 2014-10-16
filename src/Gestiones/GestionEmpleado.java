/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;

import CapaDatos.Conexionbd;
import CapaInterfaz.InterfazEmpleado;
import ClasesPojo.Empleado;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PROFESORES
 */
public class GestionEmpleado implements IGestion {
     private Object[][] dtPersona;
     DefaultTableModel tablaPersona;
    String consulta;
    
        private Empleado empleado;

    public GestionEmpleado() {
        
        empleado=new Empleado(0,"","","","",0,"","");
        Conexionbd.setPersona("DBA");
        Conexionbd.setClave("sql");
        Conexionbd.setCadenaConexion("jdbc:sqlanywhere:uid=DBA;pwd=sql;database=ProyectoPizzeria");
    }
        
        

    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public Empleado getEmpleados() {
        return empleado;
    }

    /**
     * Set the value of usuario
     *
     * @param empleados new value of usuario
     */
    public void setPersona(Empleado empleados) {
        this.empleado = empleados;
    }

    @Override
    public void Nuevo() {
        empleado.setCodigo(0);
        empleado.setCargo(null);
        empleado.setNombre(null);
        empleado.setApellido(null);
        empleado.setSexo(null);
        empleado.setEdad(0);
        empleado.setCedula(null);
        empleado.setTelefono(null);
        
        
    }

    @Override
    public void Insertar() throws SQLException {
        
        try
        {
         Conexionbd.getInstancia().conectar();
         Conexionbd.getInstancia().ejecutar("insert into Empleado (codigo_empleado,cargo_empleado,nombre_empleado,apellido_empleado,sexo_empleado, edad_empleado, cedula_empleado, telefono_empleado) values ("+empleado.getCodigo()+",'"+empleado.getCargo()+"','"+empleado.getNombre()+"','"+empleado.getApellido()+"','"+empleado.getSexo()+"','"+empleado.getEdad()+"','"+empleado.getCedula()+"','"+empleado.getTelefono()+"')");
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
        
    }

    @Override
    public void Consultar() throws SQLException {
        try
        {
         Conexionbd.getInstancia().conectar();
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT * FROM Empleado WHERE Codigo_empleado = '"+empleado.getCodigo()+"';");
           while(rs.next()){
               empleado.setCodigo(rs.getInt(1));
               empleado.setCargo(rs.getString(2));
               empleado.setNombre(rs.getString(3));
               empleado.setApellido(rs.getString(4));
               empleado.setSexo(rs.getString(5));
               empleado.setEdad(rs.getInt(6));
               empleado.setCedula(rs.getString(7));
               empleado.setTelefono(rs.getString(8));
               
              
        }
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
    }
    @Override
    public void ConsultaTotal()throws SQLException{

}
    
     
    @Override
    public void Modificar() throws SQLException {        
        try
        {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("UPDATE Empleado SET Cargo_empleado = '"+empleado.getCargo()+"',Nombre_empleado = '"+empleado.getNombre()+"', Apellido_empleado = '"+empleado.getApellido()+"', Sexo_empleado = '"+empleado.getSexo()+"', Edad_empleado = '"+empleado.getEdad()+"', Cedula_empleado = '"+empleado.getCedula()+"', Telefono_empleado = '"+empleado.getTelefono()+"' WHERE codigo_empleado = "+empleado.getCodigo());
             
        }
       catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
    }

    @Override
    public void Eliminar() throws SQLException {
         try
        {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("DELETE FROM Empleado WHERE Codigo_empleado = "+empleado.getCodigo());
               
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
    }
    
     @Override
     public DefaultTableModel cargarTabla()throws SQLException{;
     {
        String[] columnas = {"Codigo","Cargo","Nombre", "Apellido", "Cedula","Edad","Telefono","Celular" };
        String[] registro = new String[8];
        this.tablaPersona=new DefaultTableModel((Object[][])null,columnas);
       
        try
        {
             Conexionbd.getInstancia().conectar();
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT Codigo_empleado,Cargo_empleado,Nombre_empleado,Apellido_empleado,Sexo_empleado, Edad_empleado, Cedula_empleado, Telefono_empleado FROM Empleado ");
               while (rs.next()) {
                registro[0]=rs.getString(1);
                registro[1]=rs.getString(2);
                registro[2]=rs.getString(3);
                registro[3]=rs.getString(4);
                registro[4]=rs.getString(5);
                registro[5]=rs.getString(6);
                registro[6]=rs.getString(7);
                registro[7]=rs.getString(8);
                this.tablaPersona.addRow(registro);                
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }        
        return tablaPersona;
    }
}
}
    

