import java.util.Scanner;

public class Leitura {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite o nome de um filme:");
        String filme = leitura.nextLine();
        System.out.println(filme);
    }
}
