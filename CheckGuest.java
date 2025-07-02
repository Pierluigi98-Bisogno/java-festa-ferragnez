import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        // Array contenente i nomi degli invitati
        String[] invitati = {
            "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", 
            "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", 
            "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"
        };

        Scanner scanner = new Scanner(System.in);

        // Chiedere all'utente come si chiama
        System.out.print("Benvenuto alla festa Ferragnez! Come ti chiami? ");
        String nomeUtente = scanner.nextLine();

        // Verificare che il nome sia presente nella lista usando for
        boolean trovato = false;
        for (int i = 0; i < invitati.length; i++) {
            if (invitati[i].equalsIgnoreCase(nomeUtente)) {
                trovato = true;
                break;
            }
        }

        // Lasciarlo entrare o rispedirlo cortesemente
        if (trovato) {
            System.out.println("Perfetto " + nomeUtente + "! Sei nella lista, benvenuto alla festa! 🎉");
        } else {
            System.out.println("Mi dispiace " + nomeUtente + ", il tuo nome non è nella lista degli invitati. 😎");
            System.out.println("Ti prego di tornare da dove sei venuto. Buona giornata!");
        }

        scanner.close();
    }
}