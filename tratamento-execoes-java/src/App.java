import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Exeções: Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programado, erros devido a entrada errada ou até mesmo
        //De forma interpretativa, em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drastricamente. Já exceções é um fluxo inesperado da nossa aplicação, como dividir um valor por zero, querer abrir um arquivo que não existe, abrir conexão de banco com usuario ou senha invalido.

        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }

        /*Exeções que podem acontecer: 
         * 1. Não informar o nome e sobrenome;
         * 2. O valor da idade ter um caracter Não numérico;
         * 3. O valor da altura ter uma vírgula ou invês de ser um ponto (conforme padrão americano).
        */

        //Tratamento de exeções: 
        // Try: permite que você defina um bloco de codigo para ser testado quanto a erros enquanto esta sendo executado
        // Catch: Permite definir um bloco de codigo a ser executado caso ocorra um erro no bloco Try
        // Finally: Permite definir um bloco de codigo a ser executado independente de ocorrer um erro ou não.

        // Try e Catch são obrigatoriamente utilizadas juntas enquanto o finally é opcional
        /*
         * try {
         *      bloco de codigo conforme esperado
         * } catch(Exception e) {
         *      bloco de codigo que captura as exeções que podem acontecer em caso de um fluxo não previsto
         * }
         */
    }
}
