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

    public GrupoDeTokens(int n) {
        this.matriz = new String[n];
    }

    public String[] AgruparDeDos(String[] M) {

        int a = 0;
        int e = 0;

        for (int i = 0; i < M.length; i++) {
            if (!M[i].equals("=") && !M[i].equals(";")) {
                matriz[a] = M[i];
                a++;
            }
        }
        
        return matriz;
    }

    public void ImprimirMatriz() {
        System.out.println("\nProfesiones:");
        int i = 0;
        int a = 0;
        for(i= 0; i<matriz.length; i++){
            if (a == 0){
                System.out.print("El " + matriz[i] + ",");
                a=1;
            }else{
                System.out.print(" profesión: " + matriz[i] + ".");
                a = 0;
                System.out.print("\n");
            }
        }
    }

}
