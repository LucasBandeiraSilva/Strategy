import enterprises.DemaisDepartamentos;
import enterprises.Desenvolvimento;
import enterprises.Gerencia;
import enterprises.Suporte;

public class App {
    public static void main(String[] args) throws Exception {
    

        Gerencia gerencia = new Gerencia();
        Desenvolvimento desenvolvimento = new Desenvolvimento();
        Suporte suporte = new Suporte();
        DemaisDepartamentos demaisDepartamentos = new DemaisDepartamentos();

        var bonusSuporte = suporte.calculaBonus(200);
        var bonusDemaisDepartamentos = demaisDepartamentos.calculaBonus(200);
        var bonusDesenvolvimento = desenvolvimento.calculaBonus(200);
        var bonusGerencia = gerencia.calculaBonus(200);
        System.out.println("Bonus gerencia: " + bonusGerencia);
        System.out.println("Bonus Dev: " + bonusDesenvolvimento);
        System.out.println("Bonus suporte: " + bonusSuporte);
        System.out.println("Bonus Dev: " + bonusDemaisDepartamentos);
    }
}
