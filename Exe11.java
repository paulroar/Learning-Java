
package aula04;

import java.util.Scanner;


public class Exe11 {
    
    public static void main(String[] args) {
        
        
        int num1;
        int num2;
        double num3;
        double produto;
        double soma;
        double cubo;
        
                
        Scanner lerDados = new Scanner(System.in);
        
        
        // pedir dados
        
        System.out.println("numero 1 ?");
        num1 = lerDados.nextInt();
        
        System.out.println("numero 2 ?");
        num2 = lerDados.nextInt();
        
        System.out.println("numero 3 ?");
        num3 = lerDados.nextInt();
        
        //---------------------------------
        
        produto = (num1 * 2) * (num2 / 2);
        
        //---------------------------------
        
        soma = (num1 * 3) + (num3);
        
        //---------------------------------
                        
        cubo = Math.pow(num3, 3);
        
        //mostar o resultado --> saidas.
        
        System.out.println(" produto: " + produto);
        System.out.println(" soma: " + soma);
        System.out.println(" cubo:" + cubo);
            
        
       
        
        
        
        
        
        
    }
    
}
