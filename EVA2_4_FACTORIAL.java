/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fact,fact2;
      System.out.println("Escribir un numero fact");
        Scanner captu=new Scanner(System.in);
        fact=captu.nextInt();
       captu.nextLine();
        int resu = 1;
        fact2 = fact;
        for(int i = 1; i<=fact2; i++){
            resu= resu * fact ;
            fact--;
        }
        System.out.println("el resultado es ="+ resu);
    }
}
