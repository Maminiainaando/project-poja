import java.util.Random;

public class RandomNumber {
 
    public static int number() {
        Random random = new Random();
        int nombreAleatoire = random.nextInt(Integer.MAX_VALUE);
        return nombreAleatoire % 2 == 0 ? nombreAleatoire : nombreAleatoire + 1;
    }

    public static void main(String[] args) {
        int nombrePair = number();

        System.out.println("Nombre pair généré : " + nombrePair);

        if (nombrePair % 2 == 0) {
            System.out.println("Le nombre est généré !");
        } else {
            System.out.println("Erreur");
        }
    }

}
