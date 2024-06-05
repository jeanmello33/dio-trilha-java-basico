import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Solicitando e lendo os dados
        System.out.println("Por favor, digite o número da Agência (com dígito):");
        String agencia = scanner.next();
        
        System.out.println("Agora, por gentileza, digite o número da Conta (com dígito):");
        String numeroConta = scanner.next();
        
        System.out.println("Digite seu nome completo:");
        scanner.nextLine();  // Consumir a nova linha
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fechando o scanner
        scanner.close();
    }
}
