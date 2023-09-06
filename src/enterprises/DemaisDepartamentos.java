package enterprises;

import Strategy.Strategy;

public class DemaisDepartamentos implements Strategy{

    @Override
    public double calculaBonus(double salario) {

        double porcentagem = 3.0;

        double bonus =  salario*(porcentagem/100);

        return salario + bonus;
        
    }

  

   
    
}
