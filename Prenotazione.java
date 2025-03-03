import java.util.Date;

public class Prenotazione {
    String nomeCliente;
    int riga;
    int colonna;
    Date data;

    // Costruttore parametrizzato
    public Prenotazione(String nomeCliente, int riga, int colonna) {
        this.nomeCliente = nomeCliente;
        this.riga = riga;
        this.colonna = colonna;
        data = new Date(); // Imposta la data alla data e ora attuali
    }

    // Metodo per stampare i dettagli della prenotazione
    public void stampaDettagli() {
        System.out.println("Prenotazione di " + nomeCliente + " per il posto (" + riga + ", " + colonna + ") il " + data);
    }
}
