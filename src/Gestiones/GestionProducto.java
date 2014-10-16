/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;
import ClasesPojo.Producto;
import CapaDatos.Conexionbd;
import java.sql.SQLException;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Carlos
 */
public class GestionProducto implements IGestion {
     private Object[][] dtPersona;
     DefaultTableModel tablaProducto;
    String consulta;
    private Producto producto;
    
     public GestionProducto() {
        
        producto=new Producto(0,"","","",0.0,0);
        Conexionbd.setPersona("DBA");
        Conexionbd.setClave("sql");
        Conexionbd.setCadenaConexion("jdbc:sqlanywhere:uid=DBA;pwd=sql;database=ProyectoPizzeria");
    }

 /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public Producto getProducto() {
        return producto;
    }
   /**
     * Set the value of usuario
     *
     * @param cliente new value of usuario
     */
    public void setProducto(Producto cliente) {
        this.producto = producto;
    }

    @Override
    public void Nuevo() {
    producto.setCodigo(0);
    producto.setTipo(null);    
    producto.setNombre(null);
    producto.setTamaño(null);
    producto.setPrecio(0.0);
    producto.setStock(0);
        
        
    }

    @Override
    public void Insertar() throws SQLException {
      try
        {
         Conexionbd.getInstancia().conectar();
         Conexionbd.getInstancia().ejecutar("insert into Producto (codigo_producto,tipo_producto,nombre_producto,tamaño_producto,precio_producto, stock_producto) values ("+producto.getCodigo()+",'"+producto.getTipo()+"','"+producto.getNombre()+"','"+producto.getTamaño()+"','"+producto.getPrecio()+"','"+producto.getStock()+"')");
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
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("select Codigo_producto,tipo_producto,Nombre_producto,tamaño_producto,precio_producto, stock_producto FROM Producto WHERE Codigo_producto = "+producto.getCodigo()+";");
           while(rs.next()){
               producto.setCodigo(rs.getInt(1));
               producto.setTipo(rs.getString(2));
               producto.setNombre(rs.getString(3));
               producto.setTamaño(rs.getString(4));
               producto.setPrecio(rs.getDouble(5));
               producto.setStock(rs.getInt(6));
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
    public void Modificar() throws SQLException {
    try
        {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("update Producto SET tipo_producto = '"+producto.getTipo()+"', Nombre_producto = '"+producto.getNombre()+"',  Tamaño_producto = '"+producto.getTamaño()+"',  precio_producto = '"+producto.getPrecio()+"', stock_producto = '"+producto.getStock()+"' WHERE codigo_producto = "+producto.getCodigo());
             
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
            Conexionbd.getInstancia().ejecutar("DELETE FROM Producto WHERE Codigo_producto = "+producto.getCodigo());
               
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
    public void ConsultaTotal() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     @Override
    public DefaultTableModel cargarTabla() throws SQLException {
     
        String[] columnas = {"Codigo","Tipo", "Nombre", "Tamaño", "Precio","Stock" };
        String[] registro = new String[6];
        this.tablaProducto=new DefaultTableModel((Object[][])null,columnas);
        
        try
        {
             Conexionbd.getInstancia().conectar();
            
            ResultSet rs = Conexionbd.getInstancia().ejecutarbusquedatotal("select * from Producto");
            while (rs.next()) {
                registro[0]=rs.getString(1);
                registro[1]=rs.getString(2);
                registro[2]=rs.getString(3);
                registro[3]=rs.getString(4);
                registro[4]=rs.getString(5);
                registro[5]=rs.getString(6);
                this.tablaProducto.addRow(registro);                
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }        
        return tablaProducto;
    }    

    

}
