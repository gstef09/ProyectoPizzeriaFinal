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
public class Usuario {
    private int codigoUsuario;
    private int codigoEmpleado;
    private String loginUsuario;
    private String passwordUsuario;
    private String permisoUsuario;

    public Usuario(int codigoUsuario, int codigoEmpleado, String loginUsuario, String passwordUsuario, String permisoUsuario) {
        this.codigoUsuario = codigoUsuario;
        this.codigoEmpleado = codigoEmpleado;
        this.loginUsuario = loginUsuario;
        this.passwordUsuario = passwordUsuario;
        this.permisoUsuario = permisoUsuario;
    }

    
    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String contraseñaUsuario) {
        this.passwordUsuario = contraseñaUsuario;
    }

    public String getPermisoUsuario() {
        return permisoUsuario;
    }

    public void setPermisoUsuario(String permisoUsuario) {
        this.permisoUsuario = permisoUsuario;
    }
    
    
    
    
}
