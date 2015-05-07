package org.kotikov.hh.solution;

import java.util.Random;
  
   /**
    * 
    * Класс занимается вычислением стоимости путешествия.
    *
    */

public class Travel {

    //Это данные о конкретной машине
   private int amortization;
   private int repair;
   private CarForTravel type;

   private int carFactor ;   // Это какое-то число, которое машина о себе не знает и его 
   						       	// надо брать каждый раз для вычислений (как я предположил)
   
   
    public Travel(CarForTravel type) {	 
		this.amortization = type.amortization();
		this.repair = type.repair();
		this.type = type;
	}

	public void doTravel() throws Exception {     	  
	
		this.carFactor = new CarsFactorHandler().getFactorByCarType(type);  		
        System.out.println((this.amortization * this.carFactor + this.repair) * someInnerLogic());
        
	}

    private float someInnerLogic() {
      return new Random().nextFloat() + 1;
    }

	
	
}
