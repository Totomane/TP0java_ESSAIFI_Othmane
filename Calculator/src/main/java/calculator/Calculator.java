/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package calculator;

/**
 *
 * @author PC
 */

import java.util.Scanner;


/**
 * @author PC
 */
public class Calculator {
    public static void main(String[] args) {
        int operateur;
        int operande1;
        int operande2;
        int resultat=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        operateur = sc.nextInt(); // on recupere le choix
        if (operateur<1 || operateur> 5){
            System.out.println("non ce n'est pas valide change l'operateur");
        } else{
            System.out.println("entre le premier nombre :");
            operande1= sc.nextInt();
            System.out.println("entre le deuxieme nombre :");
            operande2= sc.nextInt();// same thing
            switch (operateur){ //on defini les diffenrente operations une par une a la main
                case 1:
                    resultat=operande1+operande2;
                    break;
                case 2:
                    resultat=operande1-operande2;
                    break;
                case 3:
                    resultat =operande1*operande2;
                    break;
                case 4:
                    resultat= operande1/operande2;
                    break;
                case 5:
                    resultat= operande1 % operande2;
                    break;
            }
            System.out.println("Le resultat est : "+resultat);
        }
    }
}
