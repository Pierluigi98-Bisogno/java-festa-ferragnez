import java.util.Scanner;

/**
 * Programma per il controllo degli invitati alla festa dei Ferragnez
 * Fase 5: Miglioramenti e ottimizzazioni
 * 
 * Questo programma verifica se un nome inserito dall'utente è presente
 * nella lista degli invitati alla festa dei Ferragnez.
 * Utilizza un ciclo WHILE per cercare il nome nella lista (versione bonus).
 */
public class CheckGuestWhile {
    /**
     * Metodo principale del programma.
     * Gestisce l'interazione con l'utente e la verifica del nome nella lista
     * utilizzando un ciclo while invece di un ciclo for.
     * 
     * @param args argomenti da linea di comando (non utilizzati)
     */
    public static void main(String[] args) {
        // Creo e inizializzo l'array contenente i nomi degli invitati
        // Un array è una struttura dati che può contenere più valori dello stesso tipo
        String[] listaInvitati = { // Inizio della dichiarazione e inizializzazione dell'array
            "Dua Lipa", 
            "Paris Hilton", 
            "Manuel Agnelli", 
            "J-Ax", 
            "Francesco Totti", 
            "Ilary Blasi", 
            "Bebe Vio", 
            "Luis", 
            "Pardis Zarei", 
            "Martina Maccherone", 
            "Rachel Zeilic"
        }; // Fine dell'inizializzazione dell'array
        
        // Chiedo all'utente come si chiama
        // Scanner è una classe che permette di leggere input dall'utente
        Scanner scanner = new Scanner(System.in); // System.in rappresenta l'input da tastiera
        // Mostro un messaggio di benvenuto all'utente
        System.out.println("=========================================================");
        System.out.println("* Benvenuto al sistema di controllo invitati dei Ferragnez *");
        System.out.println("* [VERSIONE CON CICLO WHILE]                            *");
        System.out.println("=========================================================");
        
        // Chiedo il nome all'utente
        System.out.print("Per favore, inserisci il tuo nome completo: ");
        String nomeUtente = scanner.nextLine(); // Leggo l'input dell'utente
        
        // Confermo all'utente il nome inserito
        System.out.println("\nHai inserito: \"" + nomeUtente + "\"");
        System.out.println("Verifica in corso...");
        
        // Aggiungo una piccola pausa per simulare il processo di verifica
        try {
            Thread.sleep(1500); // Pausa di 1.5 secondi
        } catch (InterruptedException e) {
            // Gestione dell'eccezione (raramente si verifica)
            e.printStackTrace();
        }
        
        // Implementazione della verifica con ciclo while
        // Dichiaro una variabile booleana per tenere traccia del risultato della ricerca
        boolean trovato = false; // Inizialmente assumiamo che il nome non sia nella lista
        int i = 0; // Indice per scorrere l'array, inizializzato a 0
        
        // Ciclo while per cercare il nome nella lista degli invitati
        // Il ciclo while continua finché ci sono elementi da controllare E non abbiamo trovato il nome
        while (i < listaInvitati.length && !trovato) {
            // Questa condizione ha due parti:
            // 1. i < listaInvitati.length -> verifica che non siamo arrivati alla fine dell'array
            // 2. !trovato -> verifica che non abbiamo ancora trovato il nome
            
            // Confronto il nome inserito con quello nella lista (ignorando maiuscole/minuscole)
            // equalsIgnoreCase confronta due stringhe ignorando la differenza tra maiuscole e minuscole
            if (listaInvitati[i].equalsIgnoreCase(nomeUtente)) {
                trovato = true; // Ho trovato il nome nella lista
                // Non serve il break perché la condizione !trovato nel while interromperà il ciclo
                // Questa è una differenza importante rispetto alla versione con il ciclo for
            }
            
            i++; // Incremento l'indice per passare al prossimo elemento
            // A differenza del ciclo for, qui dobbiamo incrementare manualmente l'indice
        }
        
        // Verifico il risultato della ricerca e mostro il messaggio appropriato
        System.out.println("\n----------------------------------------");
        if (trovato) {
            // Se il nome è stato trovato nella lista
            System.out.println("✅ ACCESSO CONSENTITO ✅");
            System.out.println("Benvenuto alla festa, " + nomeUtente + "!");
            System.out.println("Ti auguriamo una splendida serata.");
        } else {
            // Se il nome non è stato trovato nella lista
            System.out.println("❌ ACCESSO NEGATO ❌");
            System.out.println("Mi dispiace, " + nomeUtente + ", non sei sulla lista degli invitati.");
            System.out.println("Controlla che il nome sia stato inserito correttamente.");
        }
        System.out.println("----------------------------------------");
        
        // Chiudo lo scanner per evitare memory leak
        // È importante chiudere le risorse dopo averle utilizzate
        scanner.close();
        
        // Messaggio finale
        System.out.println("\nGrazie per aver utilizzato il sistema di controllo invitati.");
        System.out.println("Programma terminato.");
    }
}