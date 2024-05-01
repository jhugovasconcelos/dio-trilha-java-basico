import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
        public static void main(String[] args) {
        String agencia;
        int numeroConta;
        String nomeCliente;
        double saldo;
    
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Insira o seu nome ");
        nomeCliente = scanner.nextLine();

                
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, insira um saldo:");
        saldo = scanner.nextDouble();
            
        scanner.close();

        System.out.println("Olá ," + nomeCliente+ " obrigado por criar uma conta em nosso banco, sua agência é "+  agencia +", conta " + numeroConta +" e seu saldo de R$ "+ saldo + " já está disponível para saque.");
    }
}
