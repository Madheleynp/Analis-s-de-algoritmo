
package ListasSencillas;
import javax.swing.JOptionPane;
/**
 *
 * @author Madhe
 */
public class ListaSencillas {
public static void main (String arg[]){     
   Lista lst = new Lista();
        
            int opcion = 0;
            while (opcion!=5){
                opcion = leerEntero("MENU\n1.Agregar al Inicio\n"+
                        "2.Agregar al Final\n3. Mostar\n4.Eliminar Posición\n5.Salir");
                switch(opcion){
                    case 1:
                        int num1 = leerEntero("Digite un nuemro");
                        lst.agregaralIncio(num1);
                        break;
                    case 2:
                        int num = leerEntero("Digite un nuemro");
                        lst.agregaralFinal(num);
                        break;
                    case 3:
                        lst.mostrarLista();
                        break;
                    case 4:
                       int pos = leerEntero("Digiteb la posición");
                       lst.eliminarporPosición(pos);
                       break;
                    case 5:
                         mostrar("Fin del programa");
                        break;
                    default:
                        mostrar("Opcion Invalida");
                        break;
                        
                }
                
            }
       
    }

    static int leerEntero(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        
    }
    static void mostrar(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}


