package ejercicio7;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    
    public static void Menu() {
        System.out.println("\n\n\t\t\t======Menú Manejo LISTA(LINKEDLIST)======");
        System.out.println("\t\t\t=                                    =");
        System.out.println("\t\t\t= 1- Insertar al principio           =");
        System.out.println("\t\t\t= 2- Insertar al final               =");
        System.out.println("\t\t\t= 3- Eliminar al principio           =");
        System.out.println("\t\t\t= 4- Eliminar al final               =");       
        System.out.println("\t\t\t= 5- Imprimir al principio           =");
        System.out.println("\t\t\t= 6- Imprimir al final               =");
        System.out.println("\t\t\t= 7- Insertar antes del final        =");
        System.out.println("\t\t\t= 8- Salir                           =");
        System.out.println("\t\t\t======================================");
        System.out.print("\t\t\tIngrese Opcion: ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList lista = new LinkedList();
        
        Scanner teclado = new Scanner(System.in);
        int opcion;
        String dato;
        

        do {
            Menu();
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    dato = teclado.nextLine();
                    dato = teclado.nextLine();
                    lista.addFirst(dato);
                    break;
                case 2:
                    dato = teclado.nextLine();
                    dato = teclado.nextLine();
                    lista.addLast(dato);
                    break;
                case 3:
                    lista.removeFirst();
                    break;
                case 4:
                     lista.removeLast();
                    break;
                case 5:
                    System.out.println(lista.getFirst());
                    break;
                case 6:
                    System.out.println(lista.getLast());
                    break;
                case 7:
                    System.out.println("INGRESE LA POSICION: ");
                    int x = teclado.nextInt();
                    System.out.println("INGRESE EL DATO: ");
                    dato = teclado.nextLine();
                    dato = teclado.nextLine();
                    lista.add(x, dato);
                    break;
                case 8:
                    System.out.println(lista);
                    break;
                case 9:                    
                    System.out.println("PROGRAMA FINALIZADO..!!!");
                    break;                    
                default:
                   System.out.println("INGRESE UNA OPCION CORRECTA.!!!");
                    break;
             
            }
        } while (opcion != 9);
    }
    
}