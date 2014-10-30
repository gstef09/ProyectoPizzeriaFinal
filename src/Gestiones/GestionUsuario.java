/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;

import CapaDatos.Conexionbd;
import static CapaInterfaz.Login.TXT1;
import static CapaInterfaz.Login.TXT2;
import ClasesPojo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class GestionUsuario implements IGestion{
private Usuario usuario;
    public GestionUsuario() {
         usuario =new Usuario(0,0,"","","");
        Conexionbd.setPersona("DBA");
        Conexionbd.setClave("sql");
        Conexionbd.setCadenaConexion("jdbc:sqlanywhere:uid=DBA;pwd=sql;eng=ProyectoPizzeria;database=ProyectoPizzeria");
    }
    

    @Override
    public void Nuevo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Insertar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Consultar() throws SQLException {
        try
        {
         String usuario;
        String password;
        usuario = TXT1.getText();
        password = TXT2.getText();
       
        if((password.isEmpty() || usuario.isEmpty()))
        {
            JOptionPane.showMessageDialog(null, "Ingrese su nombre de usuario y contraseña");
        }
        else
       
        {
                 
        Conexionbd.getInstancia().conectar();
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT * FROM Usuario where Login_Usuario='"+usuario+"' and Contraseña_Usuario='"+password+"';");
        if(rs.next()){
         JOptionPane.showMessageDialog(null, "logueo correcto");
         }
    else{
        JOptionPane.showMessageDialog(null,"usuario y clave incorrecto");
 
    
        }
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
