/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogit;

import java.util.StringTokenizer;

/**
 *
 * @author Joanmi
 */
public class ProyectoGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

        //Metodo para separar tokens
        
        StringTokenizer st = new StringTokenizer("Richy=Ajedrez;Joanmi=Futbol;Mario=Programador;Victor=Profesor","=;",true);

        System.out.println("Hay un total de: "+st.countTokens()+" tokens.");

        while (st.hasMoreTokens()) {  System.out.println(st.nextToken());   }

    }

}
    
    

