package algoritmosSena;

import java.util.Scanner;

public class cicloFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        Cree un programa que imprima los números enteros entre 0 y 100 en orden ascendente y descendente. Useciclo for.

        System.out.print("numeros del 1 al 100 en forma acendente: \n");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("\nnumeros del 1 al 100 en forma acendente\n");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }

//        Cree un programa que imprima los número del 1 al 20 excepto el 11

        for (int i = 1; i <= 20; i++) {
            if (i != 11) {
                System.out.println(i);
            }
        }

//        Cree un programa que muestre la suma de los números naturales entre 1 y n. Use ciclo for

        int numero, suma = 0;

        System.out.print("Ingrese un número");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            suma += i;
        }

        System.out.println("La suma de los números del 1 al " + numero + " es: " + suma);

//        Cree un programa que muestre la suma de los números entre m y n. Use ciclo for

        int m, n, sumamn = 0;

        System.out.print("Ingrese el valor de m: ");
        m = entrada.nextInt();
        System.out.print("Ingrese el valor n: ");
        n = entrada.nextInt();

        for (int i = m; i <= n; i++) {
            sumamn += i;
        }
        System.out.println("La suma de los números entre " + m + " y " + n + " es: " + sumamn);

//        Cree un programa que muestre la suma de los números entre 1 y 100. Use ciclo for.

        int suma1 = 0;

        for (int i = 1; i <= 100; i++) {
            suma1 += i;
        }

        System.out.println("La suma de los números del 1 al 100 es: " + suma1);

//        Cree un programa que imprima la tabla de multiplicar del 3, del 0 al 50. Use ciclo for.

        System.out.println(" Tabla del 3 - del 0 al 50 ");
        for (int i = 1; i <= 50; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));

//        Cree un programa que pida cinco números al usuario y muestre su promedio. Use ciclo for.

            double num, sumapro = 0, pro;

            for (int j = 1; j <= 5; i++) {
                System.out.print("Digite los numeros: ");
                num = entrada.nextDouble();
                sumapro += num;
            }
            pro = sumapro / 5;
            System.out.println("La suma de su suma fue " + sumapro + "\nEl promedio de los 5 numeros es: " + pro);

//        Cree un programa que calcule el promedio de tres notas para n estudiantes. Use ciclo for.

            double notas, sumapromedio = 0, promedioEstudiante;

            for (int k = 1; k <= 3; i++) {
                System.out.print("Digite las notas: ");
                notas = entrada.nextDouble();
                sumapromedio += notas;
            }
            promedioEstudiante = sumapromedio / 3;
            System.out.println("La suma de sus notas fue " + sumapromedio + "\nEl promedio de las 3 notas es: " + promedioEstudiante);

//        Cree un programa que calcule el promedio de 10 números. Use ciclo for.

            double numeros10,suma10=0,pro10;

            for (int k = 1; k <= 10; i++) {
                System.out.print("Digite los numeros: ");
                numeros10 = entrada.nextDouble();
                suma10+=numeros10;
            }
           pro10=suma10/10;
            System.out.println("La suma de sus numeros fue " + suma10 + "\nEl promedio de los 10 numeros es: " + pro10);

        }
    }
}