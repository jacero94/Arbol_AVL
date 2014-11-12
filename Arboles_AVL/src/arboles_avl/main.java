/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles_avl;

import java.util.Scanner;

/**
 *
 * @author JAVIER
 */
public class main {
    
    static Arboles_AVL arboles;
    
    
    public static void main( String []args){
        arboles= new Arboles_AVL();
        Scanner s=new Scanner(System.in);
        System.out.println("Cual es el tamaño de la lista");
	int a=s.nextInt();
        for (int o=1;o<=a;o++){
        Scanner nar1= new Scanner(System.in);
        System.out.println("digite los numeros");
        int n=nar1.nextInt();
     
        
        
        arboles.insertar(n);
             
        }     
         arboles.show();
         System.out.println(" ");
         
         
}

}
    

