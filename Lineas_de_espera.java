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
    public static void Medidas_de_desempeño(Sistema sistema){
        //System.out.println("Ro:  "+sistema.ro);
        System.out.println("Medidas de desempeño: ");
        System.out.println("\tPo="+sistema.po());
        System.out.println("\tLs="+sistema.Ls());
        System.out.println("\tLq="+sistema.Lq());
        System.out.println("\tWs="+sistema.Ws());
        System.out.println("\tWq="+sistema.Wq());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //MM1 SistemaObj = new MM1(3,5,1,1,2,2);
        MMS SistemaObj = new MMS(80,90,1);
        System.out.println(SistemaObj.toString());
        Medidas_de_desempeño(SistemaObj);
        //System.out.println("¿Desea calcular Pk?");
        //int n=sc.nextInt();
        int n=0;
        System.out.println(SistemaObj.pk(n));

    }
    
}
