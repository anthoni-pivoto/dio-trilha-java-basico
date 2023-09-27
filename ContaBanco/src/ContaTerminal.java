import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        try{System.out.println("Por favor digite o número da sua agência:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor digite o número da sua conta");
        int conta = scanner.nextInt();

        System.out.println("Por favor digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite sue saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta: " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        scanner.close();
        }catch(InputMismatchException e){
            System.out.println("o campo saldo deve utilizar ser numerico, utilizando ponto final para valores decimais");
        }
    }
}
 