package algoritmosSena;

import java.util.Scanner;

public class algoritmo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        Cree un programa que lea la edad de un usuario y muestre cuántos años tendrá el usuario dentro
//        de tantos años como éste indique. Por ejemplo, si el usuario tiene 20 años y quiere saber cuántos años tendrá
//        dentro de 15 años, el programa deberá mostrar que tendrá 35 años.

        int añosFuturos, edad, edadFutura;

        System.out.print("Ingrese su edad actual: ");
        edad = entrada.nextInt();

        System.out.print("Cuantos años quiere agregar?: ");
        añosFuturos = entrada.nextInt();

        edadFutura = edad + añosFuturos;
        System.out.println("Dentro de " + añosFuturos + " años tendrá " + edadFutura + " años.");

//        Cree un programa que lea dos números y muestre su producto, su cociente, su suma y su resta.

        int n1, n2, suma, resta, producto, division;

        System.out.print("Digite el primer numeros: ");
        n1 = entrada.nextInt();
        System.out.print("Digite el segundo numero: ");
        n2 = entrada.nextInt();

        suma = n1 + n2;
        resta = n1 - n2;
        producto = n1 * n2;
        division = n1 / n2;

        System.out.println("El resultado de la suma es: " + suma + "\nEl resultado de la resta: " + resta + "\nEl resultado del producto es: " + producto);

        if (n2 != 0) {
            double cociente = n1 / n2;
            System.out.println("Cociente: " + cociente);
        } else {
            System.out.println("Cociente: No se puede dividir entre cero.");
        }

//      En un almacén de electrodomésticos se venden éstos a crédito y de contado.Si el cliente compra a crédito, el
//      valor global del electrodoméstico aumenta en un 25 %.Cree un programa que lea del usuario el precio de un
//      electrodoméstico y el plazo en meses para pagarlo a crédito y muestre al usuario el valor fijo de las cuotas
//      mensuales que deberá pagar por el electrodoméstico.

        System.out.print("Ingrese el precio base del electrodoméstico: ");
        double precioBase = entrada.nextDouble();

        System.out.print("Ingrese el plazo en meses para pagar: ");
        int meses = entrada.nextInt();

        double precioCredito = precioBase * 0.25;
        double cuotaMensual = precioCredito / meses;

        System.out.println("El valor total a crédito es: " + precioCredito);
        System.out.println("El valor fijo de su cuota mensual es: " + cuotaMensual);

//        Cree un programa que tome la base y la altura de un triángulo e imprima su área.

        double base,altura,area;

        System.out.print("programa que calcuala la base de un triangulo");
        System.out.print("\nDigite la base del triangulo: ");
        base=entrada.nextDouble();
        System.out.print("Digite la altura del triangula: ");
        altura=entrada.nextDouble();

        area=(base*altura)/2;
        System.out.println("El area del triangulo es: "+area);

//        Cree un programa que tome el lado de un cubo e imprima su volumen.

        System.out.println("Programa para calcular el volumen de un cubo");
        double lado, volumen;
        System.out.print("Ingrese la longitud del lado del cubo: ");
        lado = entrada.nextDouble();
//      volumen = Math.pow(lado, 3);
        volumen = lado * lado * lado;

        System.out.println("El volumen del cubo es: " + volumen);


    }

}

