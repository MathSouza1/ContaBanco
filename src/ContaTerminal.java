import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        System.out.print("Por favor, digite o número da Agência ! ");
        numero = Integer.parseInt(sc.nextLine());

        System.out.print("Por favor, digite o código da Conta ! ");
        agencia = sc.nextLine();

        System.out.print("Por favor, digite o nome do Cliente ! ");
        nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o Saldo ! ");
        saldo = Double.parseDouble(sc.nextLine());

        System.out.println("\nOlá " +
                        nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                        agencia + ", conta " +
                        numero + " e seu saldo " +
                        saldo + " já está disponível para saque.");
    }
}