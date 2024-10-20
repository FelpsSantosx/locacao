import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Cliente cliente0 = new Cliente(1, "Felipe", "545274988", 21, "lapacasadokrai", "71699988545");
        cliente0.addCliente(cliente0);
        Cliente cliente1 = new Cliente(2, "Zé", "8548546", 30, "ssa", "84848451");
        cliente1.addCliente(cliente1);
        Cliente cliente2 = new Cliente(3, "Zézo", "85485464848", 50, "ssa", "7584845565");
        cliente1.addCliente(cliente2);
        Cliente cliente3 = new Cliente(4, "Zézinho", "85485463434", 32, "ssa", "71548548");
        cliente1.addCliente(cliente3);
        Cliente cliente4 = new Cliente(5, "fernando", "85485462222", 31, "ssa", "7584545565");
        cliente1.addCliente(cliente4);

//        String infoCl = cliente0.getClientInfo(1);
//        System.out.println(infoCl);

//        infoCl = cliente0.getClientInfo(2);
//        System.out.println(infoCl);

        Veiculo veiculo0 = new Veiculo(1, "F0DA45E8", "Porshe Esportivo", "Panamera Turbo S", 5.269);
        veiculo0.addVeiculo(veiculo0);
        Veiculo veiculo1 = new Veiculo(2, "Faz0L666", "Yamaha AirLine", "MT-09 SP", 2.900);
        veiculo1.addVeiculo(veiculo1);
        Veiculo veiculo2 = new Veiculo(3, "Feti45E8", "Porshe Esportivo", "Panamera", 3.999);
        veiculo0.addVeiculo(veiculo2);
        Veiculo veiculo3 = new Veiculo(4, "50T0ns", "Yamaha AirLine", "MT-03 SP", 900);
        veiculo1.addVeiculo(veiculo3);

//        String infoVei = veiculo0.getVeiculoInfo(1);
//        System.out.println(infoVei);
//
//        infoVei = veiculo0.getVeiculoInfo(2);
//        System.out.println(infoVei);

        Locacao locacao0 = new Locacao(1, "545274988", "F0DA45E8", "12/10/2024", 5, veiculo0 );
        locacao0.addLocacao(locacao0);
        Locacao locacao1 = new Locacao(2, "8548546", "Faz0L666","22/10/2024",10, veiculo1);
        locacao1.addLocacao(locacao1);
        Locacao locacao2 = new Locacao(3, "8548546", "Faz0L666","22/10/2024",15, veiculo1);
        locacao1.addLocacao(locacao2);
        Locacao locacao3 = new Locacao(4, "8548546", "Faz0L666","22/10/2024",18, veiculo1);
        locacao1.addLocacao(locacao3);
        Locacao locacao4 = new Locacao(5, "85485462222", "50T0ns","22/10/2024",12, veiculo3);
        locacao1.addLocacao(locacao4);
        Locacao locacao5 = new Locacao(6, "85485463434", "Feti45E8","22/10/2024",3, veiculo2);
        locacao1.addLocacao(locacao5);

//        String infoLoc = locacao0.getLocacaoInfo(1);
//        System.out.println(infoLoc);
//
//        infoLoc = locacao0.getLocacaoInfo(2);
//        System.out.println(infoLoc);

        System.out.println(locacao0.getRelatorioInfo("545274988"));

        System.out.println(locacao0.veiculoMaisLocado());
    }
}