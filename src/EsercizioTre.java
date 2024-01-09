import java.util.Scanner;

public class EsercizioTre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringa;

        do {
            System.out.println("inserire una stringa");
            stringa = scanner.nextLine();

            int i = 0;

            while(i < stringa.length()&& !stringa.equals(":q")){
                System.out.print(stringa.charAt(i) + ", ");
                i++;
            }
            System.out.println();
        } while (!stringa.equals(":q"));

    }


}



