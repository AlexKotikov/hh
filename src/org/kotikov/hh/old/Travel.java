package org.kotikov.hh.old;

import java.util.Random;

public class Travel {

	public Ford ford;   //Очень плохо то, что нужно каждый раз писать ссылку для новой машины

    public Opel opel;

    public Travel(Ford aFord) {   //Плохо что нужно писать новый конструктор для новой машины каждый раз
      ford = aFord;
    }

    public Travel(Opel aOpel) {
      opel = aOpel;
    }

    public void doTravel() {
      if (ford != null) {    //Хорошо бы не допускать null вообще, чтобы не приходилось писать такие условия
        System.out.println((ford.amortization() * 5 + ford.repair()) * someInnerLogic());
      }

      if (opel != null) {
        System.out.println((opel.amortization() * 3 + opel.repair()) * someInnerLogic());
        //Каждая новая машина подразумевает свою формулу, это дублирование. Хорошо если бы формула
        //была всего одна - меньше шансов сделать ошибку при модификации.
        
        //Очень интересно откуда взялись цифры 5 и 3. Похоже они разные для каждой машины, но
        //при этом они не хранятся в классе машины, значит они берутся каждый раз при вычислении.
      }
    }


    private float someInnerLogic() {
      return new Random().nextFloat() + 1;
    }

	
	
}
