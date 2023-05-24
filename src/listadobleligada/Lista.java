package listadobleligada;

/**
 *
 * @author Kevin Huerta Montero 22310411 2P
 */
public class Lista 
{
    private Nodo inicio;
    
    public Lista()
    {
        inicio = null;
    }
    
    public boolean inicioIsEmpty()
    {
        if(inicio == null)
            return true;
        
        return false;
    }
    
    // Insercion al inicio
    public void begin(int dato)
    {
        Nodo nuevo;
        
        if(inicioIsEmpty())
        {
            firstData(dato);
        }
        else
        {
            nuevo = new Nodo(null, dato, inicio);                               //el dato apunta a nulo siempre al inicio porque es el primero
            inicio.setPrevio(nuevo);
            inicio = nuevo;
            System.out.println("Se agrego el dato "+dato+ " al inicio");
        }
    }
    
    public void deleteBegin()
    {
        if(inicioIsEmpty())
        {
            System.out.println("La lista esta vacia\n");
        }
        else
        {
            inicio = inicio.getSiguiente();
            inicio.setPrevio(null);
            System.out.println("Se ha borrado elemento incial\n");
        }
    }
    
    //Insercion al final
    
    public void last(int dato)
    {
        Nodo temporal, nuevo;
        
        if(inicioIsEmpty())
        {
            firstData(dato);
        }
        else
        {
            temporal = inicio;
            
            while(temporal.getSiguiente() != null)
            {
                temporal = temporal.getSiguiente();
            }
            
            nuevo = new Nodo(temporal, dato, null);
            temporal.setSiguiente(nuevo);
            System.out.println("Se agrego el dato "+dato+" al final de la lista");
        }
    }
    
    public void deleteLast()
    {
        Nodo temporal;
        
        if(inicioIsEmpty())
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            temporal = inicio;
            
            while(temporal.getSiguiente() != null)
                temporal = temporal.getSiguiente();
            
            temporal = temporal.getPrevio();
            temporal.setSiguiente(null);
            System.out.println("Se ha eliminado el ultimo dato");
            
        }
    }
    
    //Mostrar datos
    
    public void showBeginToLast()
    {
        Nodo temporal;
        
        if(inicioIsEmpty())
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            temporal = inicio;
            
            while(temporal != null)
            {
                System.out.print(" "+temporal.getDato());                       //imprime 3 2 1 etc
                temporal = temporal.getSiguiente();
            }
            System.out.println("\n");
        }
    }
    
    public void showLastToBegin()
    {
        Nodo walk_right, walk_left;
        
        if(inicioIsEmpty())
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            walk_right = inicio;
            walk_left = walk_right;
            
            while(walk_right != null)                                             //este me recorre hasta el final del temporal
            {
                walk_left = walk_right;
                walk_right = walk_right.getSiguiente();
            }
            
            while(walk_left != null)
            {
                System.out.print(" "+walk_left.getDato());                       
                walk_left = walk_left.getPrevio();
            }
           
            System.out.println("\n");
        }
    }
    
    public void firstData(int dato)
    {
        Nodo nuevo = new Nodo(null, dato, null);                                //apuntamos a nulo de ambos lados
        inicio = nuevo;
        System.out.println("Se agrego "+dato+" como primer elemento a la lista");
    }
}
