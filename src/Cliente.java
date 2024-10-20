import java.util.ArrayList;
import java.util.Optional;


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

    public String getNome(){
        var cliente = clientes.get(id);
        return "Nome: " + cliente.nome;
    }

//    public String pegueDados() {
//        String dados = "";
//        for (Cliente cliente : clientes) {
//            dados += "Nome: " + cliente.nome + "\n" +
//                    "CNH: " + cliente.cnh + "\n" +
//                    "Idade: " + cliente.idade + "\n" +
//                    "Endereço: " + cliente.endereco + "\n" +
//                    "Telefone: " + cliente.telefone + "\n\n";
//        }
//        return dados;
//    }

    public Optional<Cliente> getClient(int id) {
        return clientes.stream()
                .filter(cliente -> cliente.id == id)
                .findFirst();
    }

    public String getClientInfo(int id) {
        var clienteOptional = getClient(id);
        if (clienteOptional.isPresent()) {
            Cliente cliente = clienteOptional.get();
            return "Nome: " + cliente.nome + "\n" +
                    "CNH: " + cliente.cnh + "\n" +
                    "Idade: " + cliente.idade + "\n" +
                    "Endereço: " + cliente.endereco + "\n" +
                    "Telefone: " + cliente.telefone + "\n";
        } else {
            return "Cliente não encontrado.";
        }
    }



}
