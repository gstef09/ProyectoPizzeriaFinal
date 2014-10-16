/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import CapaDatos.Conexionbd;
import ClasesPojo.Detalle_Factura;
import ClasesPojo.Factura;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Carlos
 */
public class GestionFactura implements IGestion {

    
    private  Factura factura;
    private Object[][] dtFact;
     DefaultTableModel tablaFactura;
     
    public GestionFactura(){
    factura = new Factura(0,null,0,0,0,0,0,0,null);
    Conexionbd.setPersona("DBA");
        Conexionbd.setClave("sql");
        Conexionbd.setCadenaConexion("jdbc:sqlanywhere:uid=DBA;pwd=sql;eng=ProyectoPizzeria;database=ProyectoPizzeria");
    }
    @Override
    public void Nuevo() {
       factura.setN_Factura(0);
       factura.setFecha(null);
       factura.setCodigoCliente(0);
       factura.setCodigoEmpleado(0);
       factura.setSubtotal(0);
       factura.setDescuento(0);
       factura.setIva(0);
       factura.setTotalF(0);
       factura.setDetalle(null);
    }

    @Override
    public void Insertar() throws SQLException {
        try {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("insert into factura (N_Factura , Fecha, Codigo_Cliente ,Codigo_Empleado,Subtotal, Descuento, Iva,Total_Factura)"+
                  "values ("+ factura.getN_Factura()
                 +","+factura.getFecha()
                +","+factura.getCodigoCliente()
                +","+factura.getCodigoEmpleado()+","+factura.getSubtotal()+","+factura.getDescuento()+","+factura.getIva()+","+factura.getTotalF()+")");
          
          for (Detalle_Factura detFact:factura.getDetalle()){
              Conexionbd.getInstancia().ejecutar("inser into FacturaCelular (Codigo_Detalle,N_Factura,Codigo_Producto,Nombre_Producto,Cantidad,Precio_Unitario,Precio_Venta)"
                      +"values("+detFact.getCodigo()+","
                      +factura.getN_Factura()+","
                      +detFact.getCodigoProducto()
                      +",'"+detFact.getNombreProducto()+
                              "',"+detFact.getCantidad()+","+ detFact.getPrecioUnitario()+","+detFact.getPrecioVe()+")");
          }
         
        } catch (SQLException ex) {
           throw ex;
        }
         finally{
            Conexionbd.getInstancia().desconectar();
        }
    }

    @Override
    public void Consultar() throws SQLException {
        try {
          Conexionbd.getInstancia().conectar();
       ResultSet rs =Conexionbd.getInstancia().ejecutarbusqueda("select * from Factura where N_Fact="+factura.getN_Factura());
       while(rs.next()){
              factura.setN_Factura(rs.getInt(1));
              factura.setFecha(rs.getDate(2));
              factura.setCodigoCliente(rs.getInt(3));
              factura.setCodigoEmpleado(rs.getInt(4));
              factura.setSubtotal(rs.getDouble(5));
              factura.setDescuento(rs.getDouble(6));
              factura.setIva(rs.getDouble(7));
              factura.setTotalF(rs.getDouble(8));
              
                      
           }  
        } catch (SQLException e) {
            throw e;
        }
       finally{
            Conexionbd.getInstancia().desconectar();
        }
    }

    @Override
    public void Modificar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar() throws SQLException {
        Conexionbd.getInstancia().conectar();
        Conexionbd.getInstancia().ejecutar("delete * from Factura where N_Fact="+factura.getN_Factura());
        Conexionbd.getInstancia().ejecutar("delete * from Detalle_Factura where N_Fact="+factura.getN_Factura());
    }

    @Override
    public void ConsultaTotal() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultTableModel cargarTabla() throws SQLException {
         String[] columnas = {"N_Factura","Fecha", "Cod_Cliente", "Cod_Empleado","Subtotal", "Descuento","IVA","Total" };
        String[] registro = new String[8];
        this.tablaFactura=new DefaultTableModel((Object[][])null,columnas);
        
        try
        {
             Conexionbd.getInstancia().conectar();
            
            ResultSet rs = Conexionbd.getInstancia().ejecutarbusquedatotal("select * from Factura");
            while (rs.next()) {
                registro[0]=rs.getString(1);
                registro[1]=rs.getString(2);
                registro[2]=rs.getString(3);
                registro[3]=rs.getString(4);
                registro[4]=rs.getString(5);
                registro[5]=rs.getString(6);
                registro[6]=rs.getString(7);
                registro[7]=rs.getString(8);
                this.tablaFactura.addRow(registro);                
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }        
        return tablaFactura;
    }
    
}
