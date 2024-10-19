import java.util.ArrayList;

public class Veiculo {

    public int id;
    public String placa;
    public String descricao;
    public String modelo;
    public double valorDaDiaria;

    public static ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void addVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public Veiculo(String placa, String descricao, String modelo, double valorDaDiaria) {
        this.placa = placa;
        this.descricao = descricao;
        this.modelo = modelo;
        this.valorDaDiaria = valorDaDiaria;
    }

    public Veiculo (){}

    public String pegueDados(){
        String dados = "";
        for (int i = 0; i < veiculos.size(); i++ ){
            dados += "Placa: " + veiculos.get(i).placa + "\n" +
                    "Descrição: " + veiculos.get(i).descricao + "\n" +
                    "Modelo: " + veiculos.get(i).modelo + "\n" +
                    "Valor da Diária: " + veiculos.get(i).valorDaDiaria + "\n" + "\n";
        }
        return dados;
    }

     public double valorDoVeiculo(String placa){
        double total = 0;
        for (int i = 0; i < veiculos.size(); i++){
            if (veiculos.get(i).placa.equals(placa)){
                total = veiculos.get(i).valorDaDiaria;
            }
        }
        return total;
     }

  }

