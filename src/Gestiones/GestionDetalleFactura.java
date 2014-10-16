/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import CapaDatos.Conexionbd;
import ClasesPojo.Detalle_Factura;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class GestionDetalleFactura implements IGestion {
    private Detalle_Factura detallefactura;
    public GestionDetalleFactura() {
        
    
        
        detallefactura=new Detalle_Factura(0,0,0,null,0,0,0);
        Conexionbd.setPersona("DBA");
        Conexionbd.setClave("sql");
        Conexionbd.setCadenaConexion("jdbc:sqlanywhere:uid=DBA;pwd=sql;database=ProyectoPizzeria");
    }
    
    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public Detalle_Factura getDetalle_Factura() {
        return detallefactura;
    }
   /**
     * Set the value of usuario
     *
     * @param detallefactura new value of usuario
     */
    public void setDetalle_Factura(Detalle_Factura detallefactura) {
        this.detallefactura = detallefactura;
    }

    @Override
    public void Nuevo() {
            detallefactura.setCodigo(0);
            detallefactura.setN_Factura(0);
            detallefactura.setCodigoProducto(0);
            detallefactura.setNombreProducto(null);
            detallefactura.setCantidad(0);
            detallefactura.setPrecioUnitario(0);
            detallefactura.setPrecioVe(0.0);
    }

    @Override
    public void Insertar() throws SQLException {
       try
        {
         Conexionbd.getInstancia().conectar();
         Conexionbd.getInstancia().ejecutar("insert into Detalle_Factura (n_factura,codigo_producto,nombre_producto,cantidad,precio_unitario,precio_venta) values ("+detallefactura.getN_Factura()+","+detallefactura.getCodigoProducto()+",'"+detallefactura.getNombreProducto()+"',"+detallefactura.getCantidad()+","+detallefactura.getPrecioUnitario()+","+detallefactura.getPrecioVe()+")");
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
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT * FROM Detalle_Factura WHERE Codigo_Detalle = '"+detallefactura.getCodigo()+"';");
           while(rs.next()){
//               detallefactura.setCodigo(rs.getInt(1));
//               detallefactura.setN_Factura(rs.getObject(2));
//               detallefactura.setCodigoProducto(rs.getInt(3));
//               detallefactura.setNombreProducto(rs.getString(4));
//               detallefactura.setCantidad(rs.getInt(5));
//               detallefactura.setPrecioUnitario(rs.getInt(6));
//               detallefactura.setPrecioVe(rs.getInt(7));
              
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ConsultaTotal() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultTableModel cargarTabla() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
