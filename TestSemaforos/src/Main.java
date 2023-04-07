public class Main{
    //   
    public static void main(String[] args) {
           //Referencias a objetos tipo hilo
           MiHilo hilo0;
           MiHilo hilo1;

           //Se crea el semáforo
           Semaforo sem_console;
           sem_console=new Semaforo(1);

           //Se instancian los dos hilos
           hilo0= new MiHilo(sem_console);
           hilo1= new MiHilo(sem_console);

           //Se inician los hilos
           hilo0.iniciar();
           hilo1.iniciar();
    }  
    
   
    

}
