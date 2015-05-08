package org.kotikov.hh.solution;

import java.util.Random;
  
   /**
    * 
    * Класс занимается только вычислением стоимости путешествия.
    *
    */

public class Travel {

   //Это данные о конкретной машине
   private int amortization;
   private int repair;
   private String name;

   private int carFactor ;      // Это какое-то число, которое машина о себе не знает и его 
   						       	// надо брать каждый раз для вычислений (как я предположил)
   								 
   
   
    public Travel(int amortization,int repair, String type) {	 
		this.amortization = amortization;
		this.repair = repair;
		this.name = type;
	}

	public void doTravel() throws Exception {     	  
	
		this.carFactor = new CarsFactorHandler().getFactorByName(name);  		
        System.out.println((this.amortization * this.carFactor + this.repair) * someInnerLogic());
        
	}

    private float someInnerLogic() {
      return new Random().nextFloat() + 1;
    }

	
	
}
