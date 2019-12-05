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
    //Metodo para separar y contar cuantas cadenas has introducido
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("Richy=Ajedrez;Joanmi=Futbol;Mario=Programador;Victor=Profesor", "=;", true);
        GrupoDeTokens gt = new GrupoDeTokens((st.countTokens() /2)+1);
        String[] matriz = new String[st.countTokens()];
        int i = 0;
        String cadena = "";
        
        System.out.println("Hay un total de: " + st.countTokens() + " tokens.");
        
        while (st.hasMoreTokens()) {
            cadena = st.nextToken();      
            matriz[i] = cadena;
            System.out.println(cadena);
            i++;
        }
        
        gt.AgruparDeDos(matriz);
        gt.ImprimirMatriz();
        

    }

}
