import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        String numero = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = sc.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível  para saque");

    }
}
