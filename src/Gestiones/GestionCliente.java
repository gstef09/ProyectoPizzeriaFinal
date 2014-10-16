/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;
import ClasesPojo.Cliente;
import CapaDatos.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Carlos
 */
public class GestionCliente implements IGestion {
     private Object[][] dtPersona;
     DefaultTableModel tablaCliente;
    //String consulta;
    private Cliente cliente;
    
     public GestionCliente() {
        
        cliente=new Cliente(0,"","","","","","","");
        Conexionbd.setPersona("DBA");
        Conexionbd.setClave("sql");
        Conexionbd.setCadenaConexion("jdbc:sqlanywhere:uid=DBA;pwd=sql;eng=ProyectoPizzeria;database=ProyectoPizzeria");
    }

 /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public Cliente getCliente() {
        return cliente;
    }
   /**
     * Set the value of usuario
     *
     * @param cliente new value of usuario
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void Nuevo() {
    cliente.setCodigo(0);
        cliente.setNombre(null);
        cliente.setApellido(null);
        cliente.setSexo(null);
        cliente.setCedula(null);
        cliente.setTelefono(null);
        cliente.setEmail(null);
        cliente.setDireccion(null);
        
    }

    @Override
    public void Insertar() throws SQLException {
      try
        {
         Conexionbd.getInstancia().conectar();
         Conexionbd.getInstancia().ejecutar("insert into Cliente (codigo_cliente,nombre_cliente,apellido_cliente,sexo_cliente,cedula_cliente, telefono_cliente, email_cliente, direccion_cliente ) values ("+cliente.getCodigo()+",'"+cliente.getNombre()+"','"+cliente.getApellido()+"','"+cliente.getSexo()+"','"+cliente.getCedula()+"','"+cliente.getTelefono()+"','"+cliente.getEmail()+"','"+cliente.getDireccion()+"')");
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
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("select Codigo_Cliente,Nombre_Cliente,Apellido_Cliente,Sexo_Cliente,Cedula_Cliente, Telefono_Cliente, Email_Cliente, Direccion_Cliente FROM Cliente WHERE Codigo_Cliente = "+cliente.getCodigo()+";");
           while(rs.next()){
               cliente.setCodigo(rs.getInt(1));
               cliente.setNombre(rs.getString(2));
               cliente.setApellido(rs.getString(3));
               cliente.setSexo(rs.getString(4));
               cliente.setCedula(rs.getString(5));
               cliente.setTelefono(rs.getString(6));
               cliente.setEmail(rs.getString(7));
               cliente.setDireccion(rs.getString(8));
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
            Conexionbd.getInstancia().ejecutar("update Cliente SET Nombre_cliente = '"+cliente.getNombre()+"', Apellido_cliente = '"+cliente.getApellido()+"', Sexo_cliente = '"+cliente.getSexo()+"',  Cedula_cliente = '"+cliente.getCedula()+"', Telefono_cliente = '"+cliente.getTelefono()+"', Email_cliente = '"+cliente.getEmail()+"', Direccion_cliente = '"+cliente.getDireccion()+"' WHERE codigo_cliente = "+cliente.getCodigo());
             
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
            Conexionbd.getInstancia().ejecutar("DELETE FROM Cliente WHERE Codigo_cliente = "+cliente.getCodigo());
               
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
     
        String[] columnas = {"Codigo","Nombre", "Apellido", "Sexo","Cedula", "Telefono","Email","Direccion" };
        String[] registro = new String[8];
        this.tablaCliente=new DefaultTableModel((Object[][])null,columnas);
        
        try
        {
             Conexionbd.getInstancia().conectar();
            
            ResultSet rs = Conexionbd.getInstancia().ejecutarbusquedatotal("select * from Cliente");
            while (rs.next()) {
                registro[0]=rs.getString(1);
                registro[1]=rs.getString(2);
                registro[2]=rs.getString(3);
                registro[3]=rs.getString(4);
                registro[4]=rs.getString(5);
                registro[5]=rs.getString(6);
                registro[6]=rs.getString(7);
                registro[7]=rs.getString(8);
                this.tablaCliente.addRow(registro);                
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }        
        return tablaCliente;
    }    

   
     

}
