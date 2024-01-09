import java.util.Scanner;

public class EsercizioQuattro {
    public static void main(String[] args) {
        int numero ;
        System.out.println("Numero intero");
        Scanner scanner = new Scanner(System.in);
numero = scanner.nextInt();


        for (int i = numero; i >= 0; --i) {
            System.out.println (i);

        }
    }
}
