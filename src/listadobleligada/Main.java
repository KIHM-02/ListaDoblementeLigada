package listadobleligada;

/**
 *
 * @author Kevin Huerta Montero 22310411 2P
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Lista lista = new Lista();
        
        lista.begin(1);
        lista.begin(2);
        lista.begin(3);
        
        System.out.println("\n---");
        
        lista.showBeginToLast();
        
        lista.deleteBegin();
        
        lista.showBeginToLast();
        
        System.out.println("\n\n");
        
        
    }
    
}
