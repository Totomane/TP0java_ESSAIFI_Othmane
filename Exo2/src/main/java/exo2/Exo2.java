/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exo2;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Exo2 {

    public static void main(String[] args) {
        int nb; // nombre d'entiers a additionner
        int result; // resultat
        int ind; //indice
        Scanner sc = new Scanner(System.in);
        System.out.println("PENSE A UN NOMNBRe : ");
        nb = sc.nextInt(); //on attribut le résultat de la demande à la variable nb
        result=0;
        
        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            ind++;
        }
        
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result);
            }
}
