package algoritmosSena;

import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        Cree un programa que lea la edad de un usuario e imprima un mensaje que diga si el usuario es mayor de
//        edad o no.

        int edad;

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("El usuario es mayor de edad.");
        } else {
            System.out.println("El usuario es menor de edad.");
        }

//        Cree un programa que lea los tres ángulos internos de un triángulo y muestre si los ángulos corresponden a un
//        triángulo o no.

        double lado1, lado2, lado3;

        System.out.print("Ingrese el primer ángulo: ");
        lado1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo ángulo: ");
        lado2 = entrada.nextDouble();

        System.out.print("Ingrese el tercer ángulo: ");
        lado3 = entrada.nextDouble();

        if (lado1 + lado2 + lado3 == 180) {
            System.out.println("Los ángulos corresponden a un triángulo válido.");
        } else {
            System.out.println("Los ángulos NO corresponden a un triángulo.");
        }

//        Cree un programa que lea un número y muestre si este es par o impar.

        int numero; //        esta variable numero se recicla en varios ejercicios

        System.out.print("Ingrese un número entero: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

//        Cree un programa que lea un número y muestre si este es divisible entre cinco o no.


        System.out.print("Ingrese un número entero: ");
        numero = entrada.nextInt();

        if (numero % 5 == 0) {
            System.out.println("El número " + numero + " es divisible entre 5.");
        } else {
            System.out.println("El número " + numero + " NO es divisible entre 5.");
        }

//        Cree un programa que lea un número entre 1 y 15 y muestre si éste es primo o no.

        System.out.print("Ingrese un número entero entre 1 y 15: ");
        numero = entrada.nextInt();

        if (numero >= 1 && numero <= 15) {

            if (numero == 2 || numero == 3 || numero == 5 || numero == 7 || numero == 11 || numero == 13) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " NO es primo.");
            }
        } else {
            System.out.println("El número ingresado está fuera del rango de 1 a 15.");
        }

//        Cree un programa que reciba dos números y muestre el mayor. En caso de que los números sean iguales
//        también se debe mostrar al usuario.

        double num1, num2;

        System.out.print("Ingrese el primer número: ");
        num1 = entrada.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = entrada.nextDouble();

        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Ambos números son iguales: " + num1);
        }


//        En un supermercado se tiene los siguientes productos: lentejas, crema, arroz y vino. Las lentejas y el arroz no
//        pagan IVA, el vino y la crema si. Cree un programa que reciba el nombre de alguno de los productos
//        mencionados y muestre si el producto paga IVA o no.

        String producto;

        System.out.print("Ingrese el nombre del producto (lentejas, crema, arroz, vino): ");
        producto = entrada.nextLine().toLowerCase();

        if (producto.equals("vino") || producto.equals("crema")) {
            System.out.println("El producto '" + producto + "' SÍ paga IVA.");
        } else if (producto.equals("lentejas") || producto.equals("arroz")) {
            System.out.println("El producto '" + producto + "' NO paga IVA.");
        } else {
            System.out.println("Producto no reconocido en el inventario.");
        }
    }
}
