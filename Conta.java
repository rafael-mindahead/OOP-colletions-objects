public class Conta {
    String agencia;
    String conta;
    double saldo = 1000;

    public Conta(String agencia, String conta){
        this.agencia = agencia;
        this.conta = conta;
    }
    public String getAgencia(){
        return agencia;
    }
    public String getConta(){
        return conta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void pix(double valor, Conta contaDestino){
        if (saldo >= valor) {
            System.out.println("pix realizado com sucesso");
        } else {
            System.out.println("saldo insuficiente");
            return;
        }
        if (valor < 0) {
            System.out.println("valor invalido");
            return;
        }
        saldo -= valor;
        contaDestino.saldo += valor;
    }

}

