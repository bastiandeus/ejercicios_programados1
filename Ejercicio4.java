import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero1: ");
        int n1 = scanner.nextInt();

        while(n1<=0){
            System.out.println("Ingrese un numero positivo: ");
            n1 = scanner.nextInt();
        }

        System.out.print("Ingrese el numero2: ");
        int n2 = scanner.nextInt();
        
        while(n2<=0){
            System.out.println("Ingrese un numero positivo: ");
            n2 = scanner.nextInt();
        }

        int suma = n1 + n2;
        int resta = n1 - n2;
        int multiplicacion = n1 * n2;
        double division = (double) n1 / n2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);

        scanner.close();
    }
}
