package listadobleligada;
import java.util.Scanner;
/**
 *
 * @author Kevin Huerta Montero 22310411 2P
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Lista lista = new Lista();
        
        Scanner scanner = new Scanner(System.in);
         int opcion = 0, dato;

         while (opcion != 10) {
             System.out.println("=== Menu de Operaciones ===");
             System.out.println("1) Insertar al Inicio");
             System.out.println("2) Insertar al Final");
             System.out.println("3) Insertar en Medio");
             System.out.println("4) Eliminar al Inicio");
             System.out.println("5) Eliminar al Final");
             System.out.println("6) Eliminar en Medio");
             System.out.println("7) Mostrar los Elementos de la Lista (De inicio al final)");
             System.out.println("8) Mostrar los Elementos de la Lista (Del Final al inicio)");
             System.out.println("9) Encontrar un elemento en la Lista");
             System.out.println("10) Salir");
             System.out.print("Ingrese una opcion: ");

             opcion = scanner.nextInt();

             switch (opcion) {
                 case 1:
                     System.out.println("Opcion 1 seleccionada: Insertar al Inicio");
                        dato = scanner.nextInt();
                        
                        lista.begin(dato);
                     break;
                 case 2:
                     System.out.println("Opcion 2 seleccionada: Insertar al Final");
                        dato = scanner.nextInt();
                        
                        lista.last(dato);
                     break;
                 case 3:
                     System.out.println("Opcion 3 seleccionada: Insertar en Medio");
                        dato = scanner.nextInt();
                        
                        lista.middle(dato);
                     break;
                 case 4:
                     System.out.println("Opcion 4 seleccionada: Eliminar al Inicio");
                        lista.deleteBegin();
                     break;
                 case 5:
                     System.out.println("Opcion 5 seleccionada: Eliminar al Final");
                        lista.deleteLast();
                     break;
                 case 6:
                     System.out.println("Opcion 6 seleccionada: Eliminar en Medio");
                        lista.deleteMiddle();
                     break;
                 case 7:
                     System.out.println("Opcion 7 seleccionada: Mostrar los Elementos de la Lista (De inicio al final)");
                        lista.showBeginToLast();
                     break;
                 case 8:
                     System.out.println("Opcion 8 seleccionada: Mostrar los Elementos de la Lista (Del Final al inicio)");
                        lista.showLastToBegin();
                     break;
                 case 9:
                     System.out.println("Opcion 9 seleccionada: Encontrar un elemento en la Lista : ");
                        dato = scanner.nextInt();
                        lista.findData(dato);
                     break;
                 case 10:
                     System.out.println("Saliendo...");
                     break;
                 default:
                     System.out.println("Opcion invalida");
                     break;
             }

             System.out.println();
         }

         scanner.close();
    }
    
}
