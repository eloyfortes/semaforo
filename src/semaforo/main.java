package semaforo;
import java.util.concurrent.Semaphore;


public class main{

		public static void Main (String []args) {
	        int permissoes = 1;
	        
	        Semaphore semaforo = new Semaphore(permissoes);
	        
	        for(int i=1; i<=4;i++){
	            Corredor c = new Corredor(i, semaforo);
	            c.start();
	        }  
	    }
	
}
