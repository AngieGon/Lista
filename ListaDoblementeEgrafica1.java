package listadobleenlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class principal extends javax.swing.JFrame {

    ListaDoble lista = new ListaDoble();
    int elemento;
    public principal() {
        initComponents();
    }
    private void BTNaddIncioActionPerformed(java.awt.event.ActionEvent evt) {                                            

        if (TXTinsertar.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese un Dato", "ERROR", JOptionPane.QUESTION_MESSAGE);
        } else {
            lista.addInicio(Integer.parseInt(TXTinsertar.getText()));
            TXTinsertar.setText("");
            JOptionPane.showMessageDialog(null, "Elemento insertado al inicio");
        }
    }                                           

    private void BTNaddFinActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (TXTinsertar.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Ingrese un Dato", "ERROR", JOptionPane.QUESTION_MESSAGE);
        } else {
            lista.addFinal(Integer.parseInt(TXTinsertar.getText()));
            TXTinsertar.setText("");
            JOptionPane.showMessageDialog(null, "Elemento insertado al final");
        }
    }                                         

    private void BTNremoveInicioActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if (!lista.estaVacia()) {
            elemento = lista.removeInicio();
            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento, "Eliminando..",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay Nodos aun..!!", "Lista Vacia",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }                                               

    private void BTNremoveFinalActionPerformed(java.awt.event.ActionEvent evt) {                                               

        if (!lista.estaVacia()) {
            elemento = lista.removeFinal();
            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento, "Eliminando..",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay Nodos aun..!!", "Lista Vacia",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }                                              

    private void BTNremoveActionPerformed(java.awt.event.ActionEvent evt) {                                          
        lista.removeValor(Integer.parseInt(TXTeliminar.getText()));
        JOptionPane.showMessageDialog(null, "El elemento se a eliminado. ", "Eliminando..",
                JOptionPane.INFORMATION_MESSAGE);
    }                                         

    private void BTNmostrarInicioActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        if (!lista.estaVacia()) {
            lista.mostrarInicioFin();
        } else {
            JOptionPane.showMessageDialog(null, "No hay Nodos aun..!!", "Lista Vacia",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }                                                

    private void BTNmostrarFinActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if (!lista.estaVacia()) {
            lista.mostrarFinInicio();
        } else {
            JOptionPane.showMessageDialog(null, "No hay Nodos aun..!!", "Lista Vacia",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }                                             

    private void BTNbuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (!lista.estaVacia()) {
            lista.buscarValor(Integer.parseInt(TXTbuscar.getText()));
            TXTbuscar.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No hay Nodos aun..!!", "Lista Vacia",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }                                         

    private void BTNmodificarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if (!lista.estaVacia()) {
            lista.modificarValor(Integer.parseInt(TXTmodificar.getText()));
            TXTmodificar.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No hay Nodos aun..!!", "Lista Vacia",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }                                            

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        dispose();
    }