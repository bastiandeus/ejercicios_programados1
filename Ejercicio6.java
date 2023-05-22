import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (num<=0){
            System.out.println("Ingrese un numero mayor a 0");
            num = input.nextln();
        }
        System.out.println("Ingrese un numero: ");
        int num = input.nextln();
        for (int i = 1;1<=10;i++){
            System.out.println(num+" x " + i + " = " + (num*i));
        }
    }
}
