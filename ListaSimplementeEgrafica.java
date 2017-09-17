package listasimplee;
import javax.swing.JOptionPane;
import listasimplee.Nodo;

/**
 *
 * @author user
 */
public class Principal extends javax.swing.JFrame {
  
    ListaSimpleE lista=new ListaSimpleE();
    ListaSimpleE Nodo=new ListaSimpleE();
     protected Nodo inicio, fin;//punteros para saber donde esta el inicio y el fin
    int opcion=0,el;
  
    
    public Principal() {
       
        initComponents();
        this.setLocationRelativeTo(null); 
         inicio = null;
        fin = null;
    }                      
    private void BTNingresarInicioActionPerformed(java.awt.event.ActionEvent evt) {                                                  
       try{
            int elemento=Integer.parseInt(TXTingresar.getText().toString());
         
              inicio = new Nodo(elemento, inicio);
                 if (fin == null) {
                   fin = inicio;
               
               }
                    //Agregando al Inicio
                  lista.agregarAlInicio(elemento);
                     
                            }catch(NumberFormatException n){
                             
                     JOptionPane.showMessageDialog(null,"Error"+ n.getMessage());
                      TXTingresar.setText("");
                      
                    }  
     JOptionPane.showMessageDialog(null,"Elemento ingresado al INICIO");
    }                                                 

    private void BTNingresarFinalActionPerformed(java.awt.event.ActionEvent evt) {                                                 
      try{
                    int elemento=Integer.parseInt(TXTingresar.getText().toString());
                    
                     if (!estaVacia()) {
                     fin.siguiente = new Nodo(elemento);
                      fin = fin.siguiente;
                    } else {
                        inicio = fin = new Nodo(elemento);

                             }
                    
                    
                    //Agregando al Inicio
                    lista.agregaralFinal(elemento);
                            }catch(NumberFormatException n){
                     JOptionPane.showMessageDialog(null,"Error"+ n.getMessage());
                    
                            }
            JOptionPane.showMessageDialog(null,"Elemento ingresado al FINAL");
    }                                                

    private void BTNmostrarListaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        try{
            if(lista.estaVacia()==true) {
                txt.setText(txt.getText()+"\n");
               JOptionPane.showMessageDialog(null,"Lista vacia");
            }
            else {
                Nodo recorrer = inicio;
                txt.setText(txt.getText()+"\n");
                while (recorrer != null) { 
                    txt.setText(txt.getText()+"[" + recorrer.dato + "]----->");
                    //recorrer = recorrer.siguiente;
                break;
                }
            }
        }catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null,"Error"+ n.getMessage());
        }

         
           
    }                                               

    private void BTNeliminarInicioActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        try{
            if(estaVacia() != true) {
                int elemento=Integer.parseInt(TXTingresar.getText().toString());
                elemento = inicio.dato;
                if (inicio == fin) {
                    inicio = null;
                    fin = null;
                } else {
                    inicio = inicio.siguiente;
                 
                }
                
                JOptionPane.showMessageDialog(null,"El elemento a eliminar es" + elemento,"Eliminando Nodo del Inicio",
                       JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Lista vacia");
            }
        }
        catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null,"Error"+ n.getMessage());
        }
    }                                                 

    private void BTNeliminarFinActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try{
            if(estaVacia() != true) {
                int elemento=Integer.parseInt(TXTingresar.getText().toString());
                elemento = fin.dato;
                if (inicio == fin) {
                    inicio = fin = null;
                } else {
                    Nodo temporal = inicio;
                    while (temporal.siguiente != fin) {
                        temporal = temporal.siguiente;
                    }
                fin = temporal;
                fin.siguiente = null;
                }
                JOptionPane.showMessageDialog(null,"El elemento eliminado es"+elemento,"Eliminando Nodo del Final",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Lista vacia");
            }
        
        }catch(NumberFormatException n){        
                     JOptionPane.showMessageDialog(null,"Error"+ n.getMessage());
        }  
      
    }                                              

    private void BTNsalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
       if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                "Confirme", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
        
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
                try{
            if(lista.estaVacia()==true) {
                txt.setText(txt.getText()+"\n");
               JOptionPane.showMessageDialog(null,"Lista vacia");
            }
            else {
                Nodo recorrer = fin;
                txt.setText(txt.getText()+"\n");
                while (recorrer != null) { 
                    txt.setText(txt.getText()+"[" + recorrer.dato + "]----->");
                    //recorrer = recorrer.siguiente;
                break;
                }
            }
        }catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null,"Error"+ n.getMessage());
        }
    }                                        
//Metodo para saber si la lista esta vacia

   public boolean estaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    
