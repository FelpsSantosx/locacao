import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Veiculo {

    public int id;
    public String placa;
    public String descricao;
    public String modelo;

    public String getModelo() {
        return modelo;
    }

    public double valorDaDiaria;

    public static ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void addVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public Veiculo(int id, String placa, String descricao, String modelo, double valorDaDiaria) {
        this.id = id;
        this.placa = placa;
        this.descricao = descricao;
        this.modelo = modelo;
        this.valorDaDiaria = valorDaDiaria;
    }

    public String getPlaca() {
        var placa = veiculos.get(id);
        return "Placa: " + placa.placa;
    }

    public Veiculo (){}



//    public String pegueDados(){
//        String dados = "";
//        for (int i = 0; i < veiculos.size(); i++ ){
//            dados += "Placa: " + veiculos.get(i).placa + "\n" +
//                    "Descrição: " + veiculos.get(i).descricao + "\n" +
//                    "Modelo: " + veiculos.get(i).modelo + "\n" +
//                    "Valor da Diária: " + veiculos.get(i).valorDaDiaria + "\n" + "\n";
//        }
//        return dados;
//    }

//     public double valorDoVeiculo(String placa){
//        double total = 0;
//        for (int i = 0; i < veiculos.size(); i++){
//            if (veiculos.get(i).placa.equals(placa)){
//                total = veiculos.get(i).valorDaDiaria;
//            }
//        }
//        return total;
//     }

    public Optional<Veiculo> getVeiculo(int id) {
        return veiculos.stream()
                .filter(veiculo -> veiculo.id == id)
                .findFirst();
    }

    public Optional<Veiculo> getVeiculoModelo(String modelo) {
        return veiculos.stream()
                .filter(veiculo -> veiculo.getModelo().equals(modelo))
                .findFirst();
    }

    public String getVeiculoInfo(int id) {
        Optional<Veiculo> veiculoOptional = getVeiculo(id);
        if (veiculoOptional.isPresent()) {
            Veiculo veiculo = veiculoOptional.get();
            return "Placa: " + veiculo.placa + "\n" +
                    "Descrição: " + veiculo.descricao + "\n" +
                    "Modelo: " + veiculo.modelo + "\n" +
                    "Valor da Diária: " + veiculo.valorDaDiaria + "\n";
        } else {
            return "Veículo não encontrado.";
        }
    }


  }

