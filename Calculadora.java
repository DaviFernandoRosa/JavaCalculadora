
package calculadora;

import java.util.Scanner;


public class Calculadora {


    
    public static void main(String[] args) {
        
       float n1;
       float n2;
       String opcao ;
       float resultado = 0;
       
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Digite o Primeiro Numero: ");
       n1 = entrada.nextFloat();
       System.out.println("|-------------------------------------------|");
       System.out.println("|   'Escolha um operador no Menu abaixo:'   |");
       System.out.println("|-------------------------------------------|");
       System.out.println("|                *  /  +  -                 |");
       System.out.println("|-------------------------------------------|");
       opcao = entrada.next();
       
       System.out.println("Digite o Segundo numero: ");
       n2 = entrada.nextFloat();
       
       switch (opcao){
       
           case "*":
                  resultado = n1 * n2;
                  break; 
           case "/":
                  resultado = n1 / n2;
                  break;
           case "+":
                  resultado = n1 + n2;
                  break;
           case "-":
                  resultado = n1 - n2;
                  break;
           default:
                  System.out.println("Opção Invalida");
           
       }
               
       System.out.println("O resultado da operação é: " + resultado);
       entrada.close();
        
  
    }
    
}
