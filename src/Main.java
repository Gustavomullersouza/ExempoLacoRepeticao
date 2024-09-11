import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // String[] nomesJogadoes = new String[10];
        //Scanner sc = new Scanner(System.in);
        //sc = new Scanner(System.in);

        //inicialização; condicao; incrmento
        //// ++ -> vai somar +1 i = i + 1
        //for(int i = 0; i < 10;i ++ ){
        //  System.out.println("Infome o nome do Player " + i ) ;
        //nomesJogadoes[i] = sc.next();

        //}

        // Pedir o nome do time A
        // Pedir os nomes do time A(5 nomes)
        // Pedir o nome do time B
        // Pedir os nomes do time B(5 nomes)

        String nomeA = "";
        String nomeB = "";

        String[] nomesA = new String[5];
        String[] nomesB = new String[5];
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);

        System.out.println("Digite o nome do Time A ");
        nomeA = sc.next();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o nomes dos Jogadores A " + i);
            nomesA[i-1] = sc.next();
        }

        System.out.println("Digite o nome do Time B ");
        nomeB = sc.next();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o nomes dos Jogadores B " + i);
            nomesB[i-1] = sc.next();
        }
    }
}