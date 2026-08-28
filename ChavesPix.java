import java.util.HashMap;

public class ChavesPix {
    HashMap<String, Cliente> chaves = new HashMap<>();

    public void cadastrar(String chave, Cliente cliente){
        chaves.put(chave, cliente);
    }
    public Cliente buscar(String chave){
        return chaves.get(chave);
    }
}
