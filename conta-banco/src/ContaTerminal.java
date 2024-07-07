import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       /* TO DO:
       - CONHECER E IMPORTAR A CLASSE SCANNER;
       - EXIBIR AS MENSAGENS PARA O NOSSO USUÁRIO
       - OBTER PELA CLASSE SCANNER OS VALORES DIGITADOS NO TERINAL
       - EXIBIR A MENSAGEM FINAL  
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o número de sua agência?");
        String agencia = scanner.next();
        System.out.println("Qual o número da sua conta?");
        int conta = scanner.nextInt();
        System.out.println("Qual o valor do seu saldo?");
        double saldo = scanner.nextDouble();
        System.out.println("Qual o seu nome?");
        String nome = scanner.next();
        System.out.pintf("Olá %d, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %d já está disponível para saque", nome, agencia, conta, saldo);

        scanner.close();

    }
}
