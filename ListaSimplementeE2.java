package listasimplementee;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ListaSimpleE {

   Nodo inicio, fin;//punteros para saber donde esta el inicio y el fin

    public ListaSimpleE() {
        inicio = null;
        fin = null;
        

    }

    //Metodo para saber si la lista esta vacia

    public boolean estaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }

    }

    //Metodo para agregar un nodo al inicio de la lista

public void agregarAlInicio(int elemento) {
        //creando al nodo
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;

        }
    }

    //Metodo para insertar al final de la lista

    public void agregaralFinal(int elemento) {
        if (!estaVacia()) {
            fin.siguiente = new Nodo(elemento);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(elemento);

        }

    }

 
   public void mostrarLista() {
        Nodo recorrer = inicio;
        System.out.println();
        while (recorrer != null) {
            System.out.print("[" + recorrer.dato + "]----->");
            //recorrer = recorrer.siguiente;
            break;
        }

    }
    public void mostrarAlFinal() {
         Nodo recorrer = fin;
        System.out.println();
        while (recorrer != null) {
            System.out.print("[" + recorrer.dato + "]----->");
            recorrer = recorrer.siguiente;
        }
    }
    //Metodo para eliminar un nodo de Inicio
    public int borrarDelInicio() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;

        } else {
            inicio = inicio.siguiente;
        }
        return elemento;
    }

    //Metodo para eliminar Nodo Final

    public int borrarDelFin() {
        int elemento = fin.dato;
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
        return elemento;
    }
    /**public void insertarAntesDelFinal(){
       if (!estaVacia()) {
           int elemento=1;
            fin.siguiente = new Nodo(elemento);
            fin = fin.siguiente;
        } else {
           int elemento=1;
            inicio = fin = new Nodo(elemento);

        } 
    }*/
    //Metodo buscar un elemento

    public boolean estaEnlaLista(int elemento) {
        Nodo temporal = inicio;
        while (temporal != null && temporal.dato != elemento) {
            temporal = temporal.siguiente;
        }
        return temporal != null;
    }

}
