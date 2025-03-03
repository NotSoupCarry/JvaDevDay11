import java.util.Scanner;

public class EsercizioZ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiediamo all'utente i dati dello Chef
        System.out.print("Inserisci il nome dello Chef: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci il tipo di cucina: ");
        String tipo = scanner.nextLine();

        System.out.print("Inserisci un ingrediente principale (Pasta, Riso, Carne, Pesce, Verdure): ");
        String ingrediente = scanner.nextLine();

        // Creiamo un oggetto Chef
        Chef chef = new Chef(nome, tipo, ingrediente);

        // Lo chef prepara un piatto
        chef.preparaPiatto();

        scanner.close();
    }
}

// Classe Chef
class Chef {
    String nome;
    String tipoCucina;
    String ingrediente;

    // Costruttore
    public Chef(String nome, String tipoCucina, String ingrediente) {
        this.nome = nome;
        this.tipoCucina = tipoCucina;
        this.ingrediente = ingrediente;
    }

    // Metodo per preparare un piatto in base all'ingrediente
    public void preparaPiatto() {
        System.out.println("\nLo chef " + nome + " sta preparando un piatto di cucina " + tipoCucina + "...");

        switch (ingrediente.toLowerCase()) {
            case "pasta":
                System.out.println("CARBONARA???");
                break;
            case "riso":
                System.out.println("Risotto? ma che sei milanese?");
                break;
            case "carne":
                System.out.println("Bistecca grigliata con patate, OTTIMA SCELTA!");
                break;
            case "pesce":
                System.out.println("Pesce tropicale dei caraibi in arrivo!");
                break;
            case "verdure":
                System.out.println("Insalata mista!!! gnam!");
                break;
            default:
                System.out.println("Ingrediente non riconosciuto, lo Chef non sa cosa fare E' ANDATO IN TILT AIUTO.");
                break;
        }
    }
}
