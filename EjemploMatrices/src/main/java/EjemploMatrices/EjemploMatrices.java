package EjemploMatrices;

import javax.swing.JOptionPane;

public class EjemploMatrices {

    /**
     * @Madheleyn perez R.
     */
    public static void main(String[] args) {
       String menu ="1. LLenar Matriz\n2. Imprimir Matriz\n3. Cambiar Elemento\n" + "4. Imprimir Mayor\n5. Imprimir Menor\n6. Imprimir Vertice\n " +"7. Salir";
       
       int opción=1,mayor=Integer.MIN_VALUE,menor=Integer.MAX_VALUE,fila=0,columna=0,num;
       int [][] números= null;
    while(opción!=7){
        opción=LeerEntero(menu);
        switch(opción){
        case 1:
            fila = LeerEntero("Digite el número de Filas");
            columna = LeerEntero("Digite el número de Columnas");
            números = new int[fila][columna];
            for (int i = 0; i < fila; i++) {
                for (int j = 0 ; j < columna; j++) {
                    números [i][j] = LeerEntero("Digite el número ["+i+"]["+j+"]");
                }
            }
            break;
        case 2:
            String temp="";
        for (int i = 0; i < fila; i++) {
            temp += "\n";
                for (int j = 0 ; j < columna; j++) {
                    temp += números[i][j] + "  ";
                }
                }   
        Mostrar(temp);
        break;
        case 3:
            int f,c;
            f = LeerEntero("Digite la Fila a Modificar");
            c = LeerEntero("Digite la Columna a modificar");
            num= LeerEntero("Digite el número a guardar en ["+f+"]["+c+"]");
            números[f][c] = num;
            break;
        case 4:
            mayor = Integer.MIN_VALUE;
            int fmayor=0, cmayor=0;
            for(int i =0; i < fila; i++){
                for(int j = 0; j< columna; j++){
                    if(números[i][j]>=mayor){
                        mayor= números[i][j];
                        fmayor = i;
                        cmayor = j;
                        
               
                }
            }
        }
            Mostrar("El mayor numero es: "+mayor+" ubicado en ["+fmayor+"]["+cmayor+"]");
            break;
        case 5:
           
             menor = Integer.MAX_VALUE;
                    int fmenor = 0, cmenor=0;
                    for (int i=0; i<fila; i++){
                        for (int j= 0; j < columna; j++){
                            if(números[i][j]<=menor){
                                menor = números[i][j];
                                 fmenor = i;
                                cmenor = j;
            }
        }
    }
    Mostrar("El menor es: "+menor+"ubicado en ["+fmenor+"]["+cmenor+"]");
    break;
        case 6:
            Mostrar("["+números[0][0]+"]["+números[0][columna-1]+"]\n"+
                    "["+números[fila-1][0]+"]["+números[fila-1][columna-1]+"]");
            break;
        case 7:
            Mostrar("Fin del Programa");
            break;
        default:
            Mostrar("Opción Invalida");
            break;
            }
        }
    }
    
    static int LeerEntero(String texto) {
        return Integer.parseInt(JOptionPane.showInputDialog(texto));
        
    }
    static void Mostrar(String texto) {
        JOptionPane.showMessageDialog(null,texto);
    }
}
