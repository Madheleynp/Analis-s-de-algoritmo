
package ListasSencillas;

/**
 *
 * @author Madhe
 */
public class Lista {
    private Nodo inicio;
    private int tamanio;

    public Lista() {
    inicio = null;
    tamanio= 0;
    }
    public boolean estaVacia(){
        return inicio==null;
    }
    public int getTamanio(){
        return tamanio;
    }
    public void agregaralFinal(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if(estaVacia()){
            inicio = nuevo;
        }else{
            Nodo Auxiliar = inicio;
            while(Auxiliar.getSiguiente()!=null)
                Auxiliar = Auxiliar.getSiguiente();
            Auxiliar.setSiguiente(nuevo);
        }
        tamanio++;
    }
    public void eliminaerLaLista(){
        inicio=null;
        tamanio=0;
        
    }
    public void mostrarLista(){
        if(!estaVacia()){
            Nodo Auxiliar = inicio;
            int i =0;
            while(Auxiliar!=null){
            System.out.print(i+". ["+Auxiliar.getValor()+"] ->");
            Auxiliar = Auxiliar.getSiguiente();
            i++;
            }
        }
        System.out.println("");
    }  
    public void agregaralIncio(int valor){
    Nodo nuevo = new Nodo();
    nuevo.setValor(valor);
    if(estaVacia()){
        inicio=nuevo;
    }else{
        nuevo.setSiguiente(inicio);
        inicio=nuevo;
    }
    tamanio++;
    }
    public void eliminarporPosición(int posición){
        if((posición>=0 )&&(posición<tamanio)){
            if(posición==0){
                inicio=inicio.getSiguiente();
            }else{
                Nodo Auxiliar = inicio;
                for(int i =0; i<posición-1; i++){
                    Auxiliar = Auxiliar.getSiguiente();
                }
                Nodo siguiente = Auxiliar.getSiguiente();
                Auxiliar.setSiguiente(siguiente.getSiguiente());
            }
            tamanio--;
        }
    }
}


    
