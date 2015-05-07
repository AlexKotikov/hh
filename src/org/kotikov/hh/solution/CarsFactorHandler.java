package org.kotikov.hh.solution;



  /**
    Сервис-заглушка, который возвращает некое значение для машин чтобы 
    класс Travel мог использовать их в своих вычислениях
  */

public class CarsFactorHandler {

	public int getFactorByCarType(CarForTravel type) throws Exception {
		
		if (type ==null ) throw new Exception("Service: No value for a null car");
		
         if (type instanceof BMW)
        	 return 120;
         else  
         if (type instanceof Ford)
        	 return 5;
         else 
         if (type instanceof Opel)
        	 return 3;
         else
         if (type instanceof Chevrolet)
        	 return 0;         
         else 
        if (type instanceof Subaru)
            	 return 22;         
             else 	 
        	 throw new Exception("Service: cannot find the car factor for this car");
         
		  
	}

}
