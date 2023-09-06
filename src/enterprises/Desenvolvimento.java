package enterprises;

import Strategy.Strategy;

public class Desenvolvimento implements Strategy {

    @Override
    public double calculaBonus(double salario) {
        double porcentagem = 5.0;

        double bonus = salario * (porcentagem / 100);

        return salario + bonus;
    }

}
