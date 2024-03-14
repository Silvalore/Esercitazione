import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int conta=1;
        String s1 = "";
        String[] nome = new String[100];
        int opzione;
        boolean isPrimo=true;
        do{
            System.out.println("scegli un'opzione tra quelle proproste:1 - Aggiunta di un nome;" +
                    "        2 - Cancellazione del singolo nome;" +
                    "        3 - Ricerca sequenziale di un nome;" +
                    "        4 - Visualizza nomi ripetuti con numero ripetizioni;" +
                    "        5 - Modifica di un nome;" +
                    "        6 - Visualizzazione di tutti i nomi presenti;" +
                    "        7 - Ricerca del nome più lungo e più corto;" +
                    "        8 - Cancellazione di tutte le occorrenze di un nome;" +
                    "        0 - Uscita");

        }while(isPrimo);

    }
}
private static String aggiuntaNome(String[]nome){
    System.out.println("inserisci un nome");

}