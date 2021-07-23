
package aula04;

import java.util.Scanner;

public class Exe10 {

    public static void main(String[] args) {
        
        // Transformar celsius para F°.
        
        double c;
        double f;

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor de Tº em Celsius : ");
        c = input.nextDouble();

        f = (c * 1.8) + 32;

        System.out.println("Temperatura Cº: " + c + " é Igual a: " + f + " F°");


    }
    
}
