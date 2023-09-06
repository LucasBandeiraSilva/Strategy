package enterprises;

import Strategy.Strategy;

public class Gerencia implements Strategy {

    @Override
    public double calculaBonus(double salario) {
        double porcentagem = 6.0;

        double bonus =  salario*(porcentagem/100);

        return salario + bonus;
    }
    
}
