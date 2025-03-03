public class ProvaClassi {

     public static void main(String[] args){
        Auto auto = new Auto("Fiat", "blu");

        System.out.println("Modello: " + auto.modello);
        System.out.println("Colore: " + auto.colore);

        auto.accellera(50);
        auto.frenare(20);
        auto.accellera(100);
        auto.frenare(200);
     }
}

// class Auto {
//     //attributi
//     public String modello;
//     public String colore;
//     public int velocita;

//     //costruttore
//     public Auto(String modello, String colore){
//         this.modello = modello;
//         this.colore = colore;
//         this.velocita = 0; //Velocità iniziale
//     }

//     //metodi
//     //metodo per accellerare
//     public void accellera(int incremento){
//         velocita += incremento;
//         System.out.println(modello + ": ha accellerato, velocità attuale: " + velocita + " km/h");
//     }

//     //metodo per frenare
//     public void frenare(int decremento){
//         velocita -= decremento;
//         if (velocita < 0){
//             velocita = 0;
//         }

//         System.out.println(modello + ": ha frenato, velocità attuale: " + velocita + " km/h");

//     }
// }