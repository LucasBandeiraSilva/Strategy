package enterprises;

import Strategy.Strategy;

public class Suporte  implements Strategy{

    @Override
    public double calculaBonus(double salario) {
        double porcentagem = 4.0;

        double bonus =  salario*(porcentagem/100);

        return salario + bonus;
    }
    
}
