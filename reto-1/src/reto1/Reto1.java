/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;
import java.util.Scanner;

public class Reto1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del huevo: ");
        int precioHuevos = sc.nextInt();
        int precioLeche = 2 * precioHuevos + 4;
        int precioCafe = (precioHuevos + precioLeche) / 5;

        System.out.println(precioHuevos + " " + precioLeche + " " + precioCafe);
        
        if (precioCafe > 0 && precioCafe < 20) {
            System.out.println("uno");
        } else if (precioCafe > 21 && precioCafe < 30) {
            System.out.println("dos");
        } else if (precioCafe > 31 && precioCafe < 50) {
            System.out.println("tres");
        } else {
            System.out.println("cuatro");
        }
    }
    
}
