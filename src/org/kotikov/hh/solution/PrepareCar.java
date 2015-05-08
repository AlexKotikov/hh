package org.kotikov.hh.solution;

public class PrepareCar {

private CarForTravel aCar;	
	

   /**
	 	Класс создает и подготавливает объект "машина"
		для дальнейшего вычисления
   */


public PrepareCar(String carName) throws Exception {  
	
	if (carName == null) throw new Exception("A car cannot be null");
	
	switch (carName.toLowerCase().trim()) {  //v 1.7
	case "opel": aCar = new Opel(); break;
	case "ford": aCar = new Ford(); break;
	case "bmw": aCar = new BMW(); break;
	case "chevrolet": aCar = new Chevrolet(); break;
	case "subaru": aCar = new Subaru(); break;
	// new car
	
	default: throw new Exception("Unknown car");			 
		}
	}


	public Travel createTravel() {
		//Можно тут сделать предварительные вычисления с машиной
			
		
		return  new Travel(
				aCar.amortization(),
				aCar.repair(),
				aCar.getClass().getSimpleName());	  
									 
		
		 
	}

}
