package org.kotikov.hh.solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RunMe {

	/**
	 * @param args
	 * @throws Exception 
	 * 
	 * Запуск
	 */
	public static void main(String[] args) throws Exception {
	
		Travel tr =	new PrepareCar("Opel").createTravel();
		
        tr.doTravel();
		
      
	}

}
