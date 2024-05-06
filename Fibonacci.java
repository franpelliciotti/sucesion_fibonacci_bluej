import java.util.ArrayList;
/**
 * Write a description of class Fibonacci here.
 * 
 * @author Francine 
 * @version 1.0
 */
public class Fibonacci
{
    private long[] terminos;
    private int fin;
    
    /**
     * Constructor for objects of class Fibonacci
     */
    public Fibonacci(int n)
    {
        terminos = new long[n];
        fin = n;
        terminos[0] = 0;
        terminos[1] = 1;
    }
    
    public void sucesion(){
        int i = 2;
        while(i < fin){
            terminos[i] = (terminos[i - 2]) + (terminos[i-1]);
            System.out.println(terminos[i]);
            i++;
        }
    }
    

}
