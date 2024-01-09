//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EsercizioUno {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
int number = 5;
        int anno = 2024;
System.out.println("Il numero e': "+number +" quindi e' "+PariDisparo(number) );
        System.out.println("Quest'anno 2024 e' bisestile?"+AnnoBisestile(anno));
    }

    public static boolean PariDisparo(int numero) {
        return (numero % 2) == 0;
    }

    public static boolean AnnoBisestile (int anno) {
        return anno % 4 == 0 && (anno % 100  != 0 || anno % 400 == 0);
    }
}