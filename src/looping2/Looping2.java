/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping2;
import java.util.Scanner;
/**
 *
 * @author vitor
 */
public class Looping2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double f,num,i;
       System.out.println("Digite o grau em Celsius:");
       num=entrada.nextDouble();
       i=1;
       while(i<10)
       {
           f=(9*i/5)+32;
           System.out.println("nº"+f);
           i++;
       }
    }
    
}
