public class MiHilo extends Thread
 {
    private Semaforo sem;
    private int counter;

    
    //Constructor
     MiHilo(Semaforo semi){        
         this.sem=semi;
         counter=0;
    }
     
     public void iniciar(){         
             start();                  
     }

    //Método run
    public void run (){

        while(true){
        	sem.wait_sem();
        	counter++;        	
           	
            System.out.print("I'm Thread ");
            System.out.print(this.getName());
            System.out.println(" my counter is "+Integer.toString(counter));
            sem.signal_sem();
            //Duerme 10 milisegundos

            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
    
    
   

 }