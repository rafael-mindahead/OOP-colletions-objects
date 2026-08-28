public class Cliente {
    String nome;
    String cpf;
    String numero;
    String email;
    int id = 0;
    Conta conta;

    public Cliente(String nome, String cpf, String numero, String email, Conta conta){
        this.nome = nome;
        this.cpf = cpf;
        this.numero = numero;
        this.email = email;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getNumero(){
        return numero;
    }
    public String getEmail(){
        return email;
    }
    public int getId(){
        return id;
    }
    public Conta getConta(){
        return conta;
    }
    public void imprimir(){
        System.out.println("id: " + id);
        System.out.println("nome: " + nome);
        System.out.println("cpf: " + cpf);
        System.out.println("numero: " + numero);
        System.out.println("email: " + email);
        System.out.println("agencia: " + conta.getAgencia());
        System.out.println("conta: " + conta.getConta());
    }
}