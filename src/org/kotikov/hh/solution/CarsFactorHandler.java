package org.kotikov.hh.solution;



  /**
    Сервис-заглушка, который возвращает некое значение для машин чтобы 
    класс Travel мог использовать их в своих вычислениях
  */

public class CarsFactorHandler   {

	public int getFactorByName(String type) throws Exception {
		
		if (type ==null ) throw new Exception("Service: No value for a null car");
		 
		switch (type.toLowerCase()) {
		case "bmw": return 120; 
		case "ford": return 5; 	
		case "opel": return 3; 
		case "chevrolet": return 12; 
		case "subaru": return  0;
 
		default:  throw new Exception("Service: cannot find the car factor for this car");
 		
		}  
	}	
}
