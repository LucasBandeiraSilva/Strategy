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

        TipoBonus tipoGerencia = new TipoBonus(gerencia);
        TipoBonus tipoDesenvolvedor = new TipoBonus(desenvolvimento);
        TipoBonus tipoSuporte = new TipoBonus(suporte);
        TipoBonus tipoOutrosDepartamentos = new TipoBonus(demaisDepartamentos);

        System.out.println("bonus gerencia: " + tipoGerencia.tipoBonus(2000));
        System.out.println("bonus Desenvolvedor: " + tipoDesenvolvedor.tipoBonus(2000));
        System.out.println("bonus Suporte: " + tipoSuporte.tipoBonus(2000));
        System.out.println("bonus Outros Departamentos: "+ tipoOutrosDepartamentos.tipoBonus(2000));

    }
}
