import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in). useLocale(Locale.US);

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        String nomeCliente = "Gustavo de Jesus";

        double saldo = 250;

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "  + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque" );

        


        
        
    
    }
}
