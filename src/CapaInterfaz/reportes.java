/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaInterfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author User
 */
public class reportes {
    public  void reporteCliente() throws JRException,SQLException{
    Connection conect;
    conect=DriverManager.getConnection("jdbc:sqlanywhere:uid=DBA;pwd=sql;eng=ProyectoPizzeria;database=ProyectoPizzeria", "DBA", "sql");
JasperReport report =null;
report= (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\User\\Documents\\GitHub\\Programacion2\\ProyectoPizzeriaFinal\\src\\CapaInterfaz\\reporteCliente.jasper");
       JasperPrint im=JasperFillManager.fillReport(report,null,conect);
       JasperViewer ver = new JasperViewer (im);
       ver.setTitle("Repote Clientes");
       ver.setVisible(true);
       } 
}
