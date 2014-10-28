/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPojo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Validaciones {
    public void SLetras (JTextField a){//solo letras
a.addKeyListener(new KeyAdapter() {
    public void keyTyped (KeyEvent e){
        char c=e.getKeyChar();
        if(Character.isDigit(c)){
            e.consume();
        }
    }
});
}
public void SNumeros(JTextField a){//solo numeros
a.addKeyListener(new KeyAdapter() {
    public void keyTyped (KeyEvent e){
        char c=e.getKeyChar();
        if(!Character.isDigit(c)){
            e.consume();
        }
    }
});
}
public void Cedula(JTextField a ){
   a.addKeyListener(new KeyAdapter(){
       public void keyTyped (KeyEvent e){
          char c=e.getKeyChar();
        if((c!='-')&&(c<'0'||c>'9'))
                {
            e.consume();
        }
       }
       
   } );
    
}

public void Decimales(JTextField a ){
   a.addKeyListener(new KeyAdapter(){
       public void keyTyped (KeyEvent e){
          char c=e.getKeyChar();
        if((c!='.')&&(c<'0'||c>'9'))
                {
            e.consume();
        }
        if ((c=='.')&& a.getText().contains(".")){
            e.consume();
        }
       }
       
   } );
    
}

}