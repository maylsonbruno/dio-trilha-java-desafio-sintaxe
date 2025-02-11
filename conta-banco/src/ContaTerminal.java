import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe um número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Informe sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Informe seu nome completo: ");
        String nomeCliente = scanner.nextLine(); 

        System.out.print("Informe seu saldo: ");
        double saldo = scanner.nextDouble();

        
        System.out.println("\nOlá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + 
            ", conta " + numero + " e seu saldo R$ " + String.format("%.2f", saldo) + 
            " já está disponível para saque.");

        scanner.close(); 
    }
}
