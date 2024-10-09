import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){
        // Criação de um objeto da classe Scanner para receber entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar ao usuário o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Solicitar ao usuário o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        // Solicitar ao usuário o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        scanner.nextLine(); // Limpa o buffer
        String nomeCliente = scanner.nextLine();

        // Solicitar ao usuário o saldo da conta
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibir mensagem de sucesso com os dados da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
    
}
