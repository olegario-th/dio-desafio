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
        System.out.println("Qual o numero de sua agencia?");
        String agencia = scanner.next();
        System.out.println("Qual o numero da sua conta?");
        int conta = scanner.nextInt();
        System.out.println("Qual o valor do seu saldo?");
        double saldo = scanner.nextDouble();
        System.out.println("Qual o seu nome?");
        String nome = scanner.next();
        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();

    }
}
