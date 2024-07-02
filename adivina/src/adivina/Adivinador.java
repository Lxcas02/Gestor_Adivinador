package adivina;
import java.util.Random;
import java.util.Scanner;

public class Adivinador {

    public static void main(String[] args) {
    	
       int MAX_INTENTOS = 6;  
       int MIN_NUM = 1;       
       int MAX_NUM = 75;    

        Random random = new Random();
        int numeroAdivinar = random.nextInt(MAX_NUM - MIN_NUM + 1) + MIN_NUM;
        int intentosRealizados = 0;
        boolean Adivinado = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("----Bienvenido al ADIVINADOR BY LUCAS----");
        System.out.println("");
        System.out.println("el numero que pense es entre " + MIN_NUM + " y " + MAX_NUM + ".");

        while (intentosRealizados < MAX_INTENTOS && !Adivinado) {
            System.out.print("Intento numero " + (intentosRealizados + 1) + ": ");
            int intento = scanner.nextInt();
            intentosRealizados++;

            if (intento < numeroAdivinar) {
                System.out.println("El número que estoy pensando es más alto.");
            } else if (intento > numeroAdivinar) {
                System.out.println("El número que estoy pensando es más bajo.");
            } else {
                Adivinado = true;
            }
        }

        if (Adivinado) {
            System.out.println("¡Bien ahi! ¡adivinaste el numero " + numeroAdivinar + " en solo " + intentosRealizados + " intentos!");
        } else {
            System.out.println("Te quedaste sin intentos " + MAX_INTENTOS + " intentos.");
            System.out.println("El número que pense era: " + numeroAdivinar);
            System.out.println("a probar suerte denuevo ja.... ");
        }

        scanner.close();
    }
}