import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cliente {

    public int id;
    public String cnh;
    public String nome;
    public int idade;
    public String endereco;
    public String telefone;

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public Cliente(int id, String nome, String cnh, int idade, String endereco, String telefone ){
        this.id = id;
        this.cnh = cnh;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Cliente() {}

    public String setNome(String nome){
        this.nome = nome;
        return nome;
    }

    public String getNome(){
        return nome;
    }

    public String getCnh() {
        return cnh;
    }

    public Optional<Cliente> pinto(int id) {
        return clientes.stream()
                .filter(cliente -> cliente.id == id)
                .findFirst();
    }

    public String pegueDados(){
        String dados = "";
        for (int i = 0; i < clientes.size(); i++){
            dados += "Nome: " + clientes.get(i).nome + "\n" +
                    "CNH: " + clientes.get(i).cnh + "\n" +
                    "Idade: " + clientes.get(i).idade + "\n" +
                    "Endereço: " + clientes.get(i).endereco + "\n" +
                    "Telefone: " + clientes.get(i).telefone + "\n" + "\n";
        }
        return dados;
    }





}
