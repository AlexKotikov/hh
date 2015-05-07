package org.kotikov.hh.solution;

public class RunMe {

	/**
	 * @param args
	 * @throws Exception 
	 * 
	 * Запуск
	 */
	public static void main(String[] args) throws Exception {
	
		Travel tr =	new PrepareCar("Subaru").createTravel();
		
        tr.doTravel();
		
        
   

	}

}
