import java.util.concurrent.Semaphore;

//Clase semáforo.
public class Semaforo extends Semaphore{
  
    public Semaforo (int inicial  ) {
        super(inicial);        
 } 
 
     //Primitiva wait
     public void wait_sem() {
        try {
		    acquire();
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		    e.printStackTrace();
	    }
    }
 
 //Primitiva signal
 public  void signal_sem() {
 release();
}
}