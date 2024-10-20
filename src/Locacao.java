import java.util.*;

public class Locacao {

    public Veiculo veiculo;
    public int id;
    public String cnhCliente;
    public String placaVeiculo;
    public String data;
    public int diasLocados;

    public Locacao() {}

    public String getCnhCliente() {
        return cnhCliente;
    }

    public String getDiasLocados() {
        var diasLocados = locacoes.get(id);
        return "Dias Locados: " + diasLocados.diasLocados;
    }

    public static ArrayList<Locacao> locacoes = new ArrayList<>();

    public void addLocacao(Locacao locacao) {
        locacoes.add(locacao);
    }

    public Locacao( int id, String cnhCliente, String placaVeiculo, String data, int diasLocados, Veiculo veiculo) {
        this.id = id;
        this.cnhCliente = cnhCliente;
        this.placaVeiculo = placaVeiculo;
        this.data = data;
        this.diasLocados = diasLocados;
        this.veiculo = veiculo;
    }



//    public String pegueDados(){
//        String dados = "";
//        for (int i = 0; i < locacoes.size(); i++ ){
//            dados += "Id: " + locacoes.get(i).id + "\n" +
//                    "CNH do Cliente: " + locacoes.get(i).cnhCliente + "\n" +
//                    "Placa do Veiculo: " + locacoes.get(i).placaVeiculo + "\n" +
//                    "Data: " + locacoes.get(i).data + "\n" +
//                    "Dias Locados: " + locacoes.get(i).diasLocados + "\n" + "\n";
//        }
//        return dados;
//    }

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

    public Optional<Locacao> getLocacao(int id) {
        return locacoes.stream()
                .filter(locacao -> locacao.id == id)
                .findFirst();
    }

    public Optional<Locacao> getLocacaoPorCnh(String cnh) {
        return locacoes.stream()
                .filter(locacao -> locacao.getCnhCliente().equals(cnh))
                .findFirst();
    }

    public String getLocacaoInfo(int id) {
        Optional<Locacao> locacaoOptional = getLocacao(id);
        if (locacaoOptional.isPresent()) {
            Locacao locacao = locacaoOptional.get();
            return "ID: " + locacao.id + "\n" +
                    "CNH do Cliente: " + locacao.cnhCliente + "\n" +
                    "Placa do Veículo: " + locacao.placaVeiculo + "\n" +
                    "Data: " + locacao.data + "\n" +
                    "Dias Locados: " + locacao.diasLocados + "\n";
        } else {
            return "Locação não encontrada.";
        }
    }

    public String getRelatorioInfo(String cnhCliente){
        Optional<Locacao> locacaoOptional = getLocacaoPorCnh(cnhCliente);
        Veiculo veiculo = new Veiculo();
        Cliente cliente = new Cliente();
        if (locacaoOptional.isPresent()) {
            Locacao locacao = locacaoOptional.get();
            return cliente.getNome() + "\t" + veiculo.getPlaca() + "\t" + locacao.getDiasLocados();
        } else {
            return "não encontrado";
        }
    }


    public String veiculoMaisLocado() {
        Map<String, Integer> contagemVeiculos = new HashMap<>();

        for (Locacao locacao : locacoes) {

            if (locacao.veiculo != null) {
                Optional<Veiculo> modelo = locacao.veiculo.getVeiculo(id);

                if (modelo.isPresent()) {
                    Veiculo veiculo = modelo.get();
                    String nomeVeiculo = veiculo.getModelo();
                    contagemVeiculos.put(nomeVeiculo, contagemVeiculos.getOrDefault(nomeVeiculo, 0) + 1);
                }
            }
        }

        String veiculoMaisAlugado = "";
        int maiorQuantidade = 0;
        for (Map.Entry<String, Integer> entry : contagemVeiculos.entrySet()) {
            if (entry.getValue() > maiorQuantidade) {
                maiorQuantidade = entry.getValue();
                veiculoMaisAlugado = entry.getKey();
            }
        }

        return "Veículo mais alugado: " + veiculoMaisAlugado + " (Alugado " + maiorQuantidade + " vezes)";
    }

}

