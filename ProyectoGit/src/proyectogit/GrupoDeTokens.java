/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogit;

/**
 *
 * @author robij
 */
public class GrupoDeTokens {

    String[] matriz;

    public GrupoDeTokens(int n){
        this.matriz = new String[n];
    }

    public String[] AgruparDeDos(String[] M) {

        int a = 0;
        int e = 0;

        for (int i = 0; i < M.length; i++) {
            /*if (M) {
                matriz[a] = M[i];
                a++;               
            } 
            if(e == 2 ) {
                e = 0;
            }
            e++;*/
        }

        return matriz;
    }

    public void ImprimirMatriz() {
        int a = 0;
        int e = 0;
        System.out.println("Resultado: ");
        for (int i = 0; i < matriz.length; i++) {
            if (e == 0 || e == 1) {
                System.out.println(matriz[i]);
            } 
            if(e == 1) {
                e=0;
            }
        }
    }

}
