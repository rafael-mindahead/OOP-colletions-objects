import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente(
        "rafael", "143.222.111-88", "4198888-0000", "teste@gmail.com",
        new Conta(
        "000-1", "12234-5"
        ));
        Cliente cliente2 = new Cliente(
        "zarg", "123.222.111-03", "41999992222", "teste2@gmail.com",
        new Conta(
        "000-1", "12344-5"
        ));
        ChavesPix chavesPix = new ChavesPix();

        chavesPix.cadastrar(
        cliente.getEmail(),
        cliente
        );
        chavesPix.cadastrar(
        cliente.getCpf(), cliente
        );
        chavesPix.cadastrar(
        cliente.getNumero(), cliente
        );
        chavesPix.cadastrar(
        cliente2.getEmail(),
        cliente2
        );
        chavesPix.cadastrar(
        cliente2.getCpf(), cliente2
        );
        chavesPix.cadastrar(
        cliente2.getNumero(), cliente2
        );
        System.out.println("Digite uma chave PIX:");
        String chaveDigitada = scanner.nextLine();

        Cliente clienteDestino = chavesPix.buscar(chaveDigitada);
        if (clienteDestino == cliente) {
            System.out.println("Você não pode realizar um PIX para sua própria conta.");
            return;
        }
        if (clienteDestino != null) {
            System.out.println("Chave PIX válida!");
            System.out.println("Destinatário: " + clienteDestino.getNome());
            System.out.println("Digite o valor:");
            double valor = scanner.nextDouble();

            cliente.getConta().pix(valor, clienteDestino.getConta());

        } else {
            System.out.println("Chave PIX inválida!");
        }
        System.out.println("Saldo Rafael: R$ "+ cliente.getConta().getSaldo());
        System.out.println("Saldo Zarg: R$ "+ cliente2.getConta().getSaldo());
        scanner.close();
    }
}
