//package BarrierS;
import java.util.concurrent.Semaphore;
import java.util.*;


public class Barrier extends Thread{
	
	// add missing variables
	
	int num;
    Semaphore semaphore1;  Semaphore semaphore2;
    int counter;
    //private Random snooze_time;
    
    
	Barrier(int n) {
		num=n;
		semaphore2 = new Semaphore(0);
		semaphore1= new Semaphore(1);
	    counter=0;
		// complete this constructor
	}
	
	public void b_wait() throws InterruptedException{
		// this is the only additional method you will need to complete
	
		   semaphore1.acquire();
		   counter=counter+1;
		   semaphore1.release();
		   
	         if(counter == num){
			  semaphore2.release();  
			   }
	    
	      semaphore2.acquire();
	      semaphore2.release();
	  
	   

	}

}
