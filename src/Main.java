import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Cliente cliente0 = new Cliente(1, "Felipe", "545274988", 80, "lapacasadokrai", "71699988545");
        Cliente cliente1 = new Cliente(2, "Souza", "8548546", 30, "ssa", "7584845565");

        cliente0.addCliente(cliente0);
        cliente1.addCliente(cliente1);

        Optional<Cliente> cliente = cliente0.pinto(1);
        System.out.println(cliente);
//        System.out.println(cliente0.pegueDados());
//
//        Veiculo veiculo0 = new Veiculo("F0DA45E8", "Porshe Esportivo", "Panamera Turbo S", 5.269);
//        Veiculo veiculo1 = new Veiculo("Faz0L666", "Yamaha AirLine", "MT-09 SP", 900);
//
//        veiculo0.addVeiculo(veiculo0);
//        veiculo1.addVeiculo(veiculo1);
//
//        System.out.println(veiculo0.pegueDados());
//
//        Locacao locacao0 = new Locacao(1, "545274988", "F0DA45E8", "12/10/2024", 5 );
//
//        locacao0.addLocacao(locacao0);

        //System.out.println(locacao0.relatorioLocacao("545274988"));

        var numero = 10;
        
    }
}