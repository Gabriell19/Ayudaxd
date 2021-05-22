/**
 * @(#)EModular.java
 *
 * EModular application
 *
 * @author 
 * @version 1.00 2021/5/21
 */
 
public class EModular {
	
	public static long exponenciacionModular(long a, double k, long n)
    {    
        long b = 1;
            
        if(k==0)
            return b;
            
        long A = a;
        
        if(k%2==1)
            b = a;
            
        while((k = k/2)!=0)
        {                
            A = (A*A)%n;
            if(k%2==1)
                b=(A*b)%n;    
        }
        
        return b;    
    } 
    
    public static void main(String[] args) {
    

   int numero = 1;
		int modulo = 37;
		if(moduloInverso(modulo, numero)){
			System.out.println("La solucion es: "+inv);
		}
		else
			System.out.println("NO EXISTE SOLUCION");
    
    }
}
