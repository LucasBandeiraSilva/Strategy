import Strategy.Strategy;

public class TipoBonus {
    private Strategy strategy;

    public TipoBonus(Strategy strategy) {
        this.strategy = strategy;
    }

    public double tipoBonus(double valor){
        return strategy.calculaBonus(valor);
    }
    
}
