package io.javabrains.springbootstarter.random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {

	
	
	@RequestMapping("/mytest")
	public int sayHi() {
		int min = 10;
	    int max = 50;
	        
	      //Generate random int value from 50 to 100 
	    System.out.println("Random value in int from "+min+" to "+max+ ":");
	   
	    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		String result = "Correct";
	    System.out.println(random_int);
	    if (random_int >15)
	    {
	    	result= "Not Correct";
	    }
	    
	    System.out.println(result);
	    return random_int;
		
	}


		 
	

	
}
