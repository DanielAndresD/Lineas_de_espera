/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineas_de_espera;

/**
 *
 * @author daniel davila
 */
import java.util.Scanner;
public class Lineas_de_espera {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MM1 SistemaObj = new MM1(9,5,2,1,2,2);
        System.out.println("M:"+SistemaObj.lambda+"/"+"M:"+SistemaObj.miu+"/"+
                SistemaObj.servidores+"/"+((int)SistemaObj.poblacion)+"/"+((int)SistemaObj.capacidad_sistema)+"/FIFO");
        System.out.println("Ro: "+SistemaObj.Ro(SistemaObj.lambda,SistemaObj.miu,SistemaObj.servidores));
        System.out.println("Medidas de desempeño");
        System.out.println("Po="+SistemaObj.po());
        System.out.println("Ls="+SistemaObj.Ls());
        System.out.println("Lq="+SistemaObj.Lq());
        System.out.println("Ws="+SistemaObj.Ws());
        System.out.println("Wq="+SistemaObj.Wq());
        //System.out.println("¿Desea calcular Pk?");
        //int n=sc.nextInt();
        int n=0;
        System.out.println("P(k="+n+")= "+SistemaObj.pk(0));

    }
    
}
