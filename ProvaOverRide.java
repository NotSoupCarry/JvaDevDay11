public class ProvaOverRide {

    public static void main(String[] args) {
        // Crea due istanze della classe Penna
        Penna penna1 = new Penna("Blu", 10);
        Penna penna2 = new Penna("Blu", 10);
        Penna penna3 = new Penna("Rosso", 5);

        // Utilizza il metodo toString() per stampare le informazioni sugli oggetti
        System.out.println("Penna 1: " + penna1);  // Questo chiamerà il metodo toString() della classe Penna
        System.out.println("Penna 2: " + penna2);  // Questo chiamerà il metodo toString() della classe Penna
        System.out.println("Penna 3: " + penna3);  // Questo chiamerà il metodo toString() della classe Penna

        // Utilizza il metodo equals() per confrontare le penne
        System.out.println("\nConfronto tra penna1 e penna2:");
        System.out.println(penna1.equals(penna2)); // True, perché sono uguali

        System.out.println("\nConfronto tra penna1 e penna3:");
        System.out.println(penna1.equals(penna3)); // False, perché colore e/o quantità sono diversi

        // Confronta i codici hash
        System.out.println("\nCodici hash:");
        System.out.println("Codice hash di penna1: " + penna1.hashCode());
        System.out.println("Codice hash di penna2: " + penna2.hashCode());
        System.out.println("Codice hash di penna3: " + penna3.hashCode());
    }
}

class Penna {
    private String colore;
    private int quantita;

    // Costruttore
    public Penna(String colore, int quantita) {
        this.colore = colore;
        this.quantita = quantita;
    }

    // Override del metodo toString
    @Override
    public String toString() {
        return "Penna{" +
                "colore='" + colore + '\'' +
                ", quantita=" + quantita +
                '}';
    }

    // Override del metodo equals
    @Override
    public boolean equals(Object obj) {
        // Se gli oggetti sono uguali (stesso riferimento in memoria)
        if (this == obj) {
            return true;
        }
        // Se l'oggetto è null o di classe diversa
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Confronta gli attributi dell'oggetto corrente con quelli dell'oggetto passato
        Penna penna = (Penna) obj;
        return quantita == penna.quantita && colore.equals(penna.colore);
    }

    @Override
    public int hashCode() {
        return colore.hashCode() + quantita * 74; // Calcola un valore hash
    }
}
