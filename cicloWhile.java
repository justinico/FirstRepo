package algoritmosSena;

import java.util.Scanner;

public class cicloWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        Cree un programa que muestre los números naturales de 1 a n. Use ciclo while.
        int n;
        System.out.print("Ingrese el valor de n: ");
        n = entrada.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

//        Cree un programa que calcula la suma de los primeros n números naturales.

        System.out.print("Ingrese el valor de n: ");
        n = entrada.nextInt();

        int suma = 0;
        i = 1;
        while (i <= n) {
            suma += i;
            i++;
        }

        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);


//        Cree un programa que muestre la tabla de multiplicar del 10, del 1 al 50.

        i = 1;

        System.out.println("--- Tabla del 10 (del 1 al 50) ---");

        while (i <= 50) {
            System.out.println("10 x " + i + " = " + (10 * i));
            i++;
        }

//        Cree un programa que muestre los números impares entre 1 y n.

        System.out.print("Ingrese el valor de n: ");
        n = entrada.nextInt();

        i = 1;
        System.out.println("Números impares entre 1 y " + n + ":");
        while (i <= n) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

//        Cree un programa que pregunte al usuario si desea salir, si o no “S/N”, si el usuario teclea la letra S el
//        programa se detendrá, de lo contrario continuará ejecutándose.

        String opcion = "";

        while (!opcion.equalsIgnoreCase("S")) {
            System.out.println("El programa se está ejecutando...");
            System.out.print("¿Desea salir del programa? (S/N): ");
            opcion = entrada.next();
        }

        System.out.println("Programa detenido exitosamente.");

        
//        Cree un programa que calcule el promedio de 10 números.

        double suma1 = 0;
        i = 1;

        while (i <= 10) {
            System.out.print("Ingrese el número " + i + ": ");
            suma1 += entrada.nextDouble();
            i++;
        }

        double promedio = suma1 / 10;
        System.out.println("El promedio de los 10 números es: " + promedio);

//        Cree un programa que muestre el promedio de n números, dejándose de solicitar números cuando seintroduzca el cero.

        double suma2 = 0,numero,promedio1;
        int contador = 0;

        System.out.print("Ingrese un número (o 0 para terminar): ");
        numero = entrada.nextDouble();

        while (numero != 0) {
            suma2 += numero;
            contador++;

            System.out.print("Ingrese el numro 0 para terminar): ");
            numero = entrada.nextDouble();
        }

        if (contador > 0) {
             promedio1 = suma2 / contador;
            System.out.println("Se ingresaron " + contador + " números.");
            System.out.println("El promedio total es: " + promedio1);
        } else {
            System.out.println("No se ingresó ningún número distinto de cero.");
        }

//        Cree un programa que calcule la suma de los cuadrados de los números entre 1 y n.

        System.out.print("Ingrese el valor de n: ");
        n = entrada.nextInt();

        int suma3 = 0;
        i = 1;

        while (i <= n) {
            suma3 += (i * i);
            i++;
        }

        System.out.println("La suma de los cuadrados desde 1 hasta " + n + " es: " + suma);
    }
}




