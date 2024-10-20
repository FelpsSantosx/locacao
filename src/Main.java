import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Cliente cliente0 = new Cliente(1, "Felipe", "545274988", 80, "lapacasadokrai", "71699988545");
        cliente0.addCliente(cliente0);
        Cliente cliente1 = new Cliente(2, "Zé", "8548546", 30, "ssa", "7584845565");
        cliente1.addCliente(cliente1);

        String infoCl = cliente0.getClientInfo(1);
        System.out.println(infoCl);

        infoCl = cliente0.getClientInfo(2);
        System.out.println(infoCl);

        Veiculo veiculo0 = new Veiculo(1, "F0DA45E8", "Porshe Esportivo", "Panamera Turbo S", 5.269);
        veiculo0.addVeiculo(veiculo0);
        Veiculo veiculo1 = new Veiculo(2, "Faz0L666", "Yamaha AirLine", "MT-09 SP", 900);
        veiculo1.addVeiculo(veiculo1);

        String infoVei = veiculo0.getVeiculoInfo(1);
        System.out.println(infoVei);

        infoVei = veiculo0.getVeiculoInfo(2);
        System.out.println(infoVei);

        Locacao locacao0 = new Locacao(1, "545274988", "F0DA45E8", "12/10/2024", 5 );
        locacao0.addLocacao(locacao0);
        Locacao locacao1 = new Locacao(2, "8548546", "Faz0L666","22/10/2024",10);
        locacao1.addLocacao(locacao1);

        String infoLoc = locacao0.getLocacaoInfo(1);
        System.out.println(infoLoc);

        infoLoc = locacao0.getLocacaoInfo(2);
        System.out.println(infoLoc);

        System.out.println(locacao0.getRelatorioInfo("545274988"));

    }
}