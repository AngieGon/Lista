package ejercicio7;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class principal extends javax.swing.JFrame {
LinkedList lista = new LinkedList();
    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        lista.addFirst(TXTinsertarP.getText());
        TXTinsertarP.setText("");
        JOptionPane.showMessageDialog(null, "ELEMENTO INGRESADO");
    }                                        

    private void TXTeliminarFActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void TXTimprimirFActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        lista.addLast(TXTinsertarF.getText());
        TXTinsertarF.setText("");
        JOptionPane.showMessageDialog(null, "ELEMENTO INGRESADO");
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
       TXTeliminarP.setText(lista.removeFirst().toString());
        JOptionPane.showMessageDialog(null, "ELEMENTO ELIMINADO");
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        TXTeliminarF.setText(lista.removeLast().toString());
        JOptionPane.showMessageDialog(null, "ELEMENTO ELIMINADO");
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        TXTimprimirP.setText(lista.getFirst().toString());
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        TXTimprimirF.setText(lista.getLast().toString());
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int index = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA POSICION"));
        
        String dato = JOptionPane.showInputDialog("INGRESE LA DATO");
        
        lista.add(index, dato);
        JOptionPane.showMessageDialog(null, "ELEMENTO INSERTADO");
    }