package listasimplementee;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimpleE lista=new ListaSimpleE();
        int opcion=0;
        int dato;
        do{
        
        
        try{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"LISTA SIMPLE ENLAZADA  \n\n "
                    + "1. Agregar un elemento al inicio de la lista\n "
                    + "2. Agregar un elemento al Final de la lista\n "
                    + "3. Eliminar un elemento del Inicio de la lista\n "
                    + "4. Eliminar un elemento del Final de la lista\n"
                    + "5. Mostrar del inicio\n"
                    + "6. Mostrar del fin\n"
                    + "7. Insertar antes del final\n"
                    + "8. Salir","Menu de Opciones",3));
        switch(opcion){
            
            case 1:
                try{
                   dato=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el elemento:","Insertando al incicio",3));
                           //Agregando al Inicio
                            lista.agregarAlInicio(dato);
                            }catch(NumberFormatException n){
                     JOptionPane.showMessageDialog(null,"Error"+ n.getMessage());
                    }
            
            break;
                
            case 2:
                 try{
                    dato=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el elemento:","Insertando al Final",3));
                           //Agregando al Inicio
                            lista.agregaralFinal(dato);
                            }catch(NumberFormatException n){
                     JOptionPane.showMessageDialog(null,"Error"+ n.getMessage());
                    }
                break;
            case 3:
                 dato=lista.borrarDelInicio();
                 JOptionPane.showMessageDialog(null,"El elemento eliminado es"+dato,"Eliminando Nodo del Inicio",
                         JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                 dato=lista.borrarDelFin();
                JOptionPane.showMessageDialog(null,"El elemento eliminado es"+dato,"Eliminando Nodo del Final",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
                lista.mostrarLista();
                break;
            case 6:   
                lista.mostrarAlFinal();
                break;
            /**case 7:
             try{
                   dato=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el elemento:","Insertando antes del final",3));
                           //Agregando al Inicio
                            lista.insertarAntesDelFinal();
                            }catch(NumberFormatException n){
                     JOptionPane.showMessageDialog(null,"Error"+ n.getMessage());
                    
            break;  */
                            
            case 8:
                  JOptionPane.showMessageDialog(null,"Programa Finalizado");
                break;
                default:
                  JOptionPane.showMessageDialog(null,"Opcion Incorrecta ");
        }
        
        
        }catch(Exception e){
              JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
        
        }
        
        }while(opcion!=8);
        
        
    }
    
}