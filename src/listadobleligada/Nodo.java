package listadobleligada;
/**
 *
 * @author Kevin Huerta Montero 22310411 2P
 */
public class Nodo 
{
    private Nodo previo;
    private Nodo siguiente;
    private int dato;
    
    public Nodo(Nodo previo, int dato, Nodo siguiente)
    {
        this.previo = previo;
        this.dato = dato;
        this.siguiente = siguiente;
    }

    
    public Nodo getSiguiente()
    {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }
    
    public Nodo getPrevio() 
    {
        return previo;
    }

    public void setPrevio(Nodo previo) 
    {
        this.previo = previo;
    }

    public int getDato() 
    {
        return dato;
    }

    public void setDato(int dato) 
    {
        this.dato = dato;
    }
}
