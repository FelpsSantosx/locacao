import java.util.ArrayList;

public class Locacao {

    public int id;
    public String cnhCliente;
    public String placaVeiculo;
    public String data;
    public int diasLocados;

    public static ArrayList<Locacao> locacoes = new ArrayList<>();

    public void addLocacao(Locacao locacao) {
        locacoes.add(locacao);
    }

    public Locacao( int id, String cnhCliente, String placaVeiculo, String data, int diasLocados) {
        this.id = id;
        this.cnhCliente = cnhCliente;
        this.placaVeiculo = placaVeiculo;
        this.data = data;
        this.diasLocados = diasLocados;
    }


    public String pegueDados(){
        String dados = "";
        for (int i = 0; i < locacoes.size(); i++ ){
            dados += "Id: " + locacoes.get(i).id + "\n" +
                    "CNH do Cliente: " + locacoes.get(i).cnhCliente + "\n" +
                    "Placa do Veiculo: " + locacoes.get(i).placaVeiculo + "\n" +
                    "Data: " + locacoes.get(i).data + "\n" +
                    "Dias Locados: " + locacoes.get(i).diasLocados + "\n" + "\n";
        }
        return dados;
    }

//    public double valorTotalDeLocacoes(String cnh) {
//        double total = 0;
//        Veiculo veiculo = new Veiculo();
//        for (int i = 0; i < locacoes.size(); i++) {
//            if (locacoes.get(i).cnhCliente.equals(cnh)){
//                total += locacoes.get(i).diasLocados * veiculo.valorDoVeiculo(locacoes.get(i).placaVeiculo);
//            }
//        }
//        return total;
//    }


}

