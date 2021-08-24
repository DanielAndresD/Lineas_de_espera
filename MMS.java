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
public class MMS extends Sistema{

        //Constructores
    public MMS(double lambda,double miu,int servidores){
        super(lambda, miu,servidores);
    }
    public MMS(double lambda, double miu, int servidores, double poblacion, double capacidad_fila, double capacidad_sistema) {
        super(lambda, miu, servidores, poblacion, capacidad_fila, capacidad_sistema);
    }
        @Override
    public double Ls() {
        return Lq()+(this.lambda/this.miu);
    }

    @Override
    public double Lq() {
        return (Math.pow(this.ro,this.servidores)*this.lambda*this.miu*po())/(Factorial(this.servidores-1)*Math.pow(this.servidores*this.miu-this.lambda,2)); 
    }

    @Override
    public double Ws() {
        return Ls()/this.lambda;
    }

    @Override
    public double Wq() {
        return Lq()/this.lambda;}

    @Override
    public double po() {
        int s=this.servidores;
        int Factorial_s=1;
        double sumatoria=0;

        for (int i=0;i<s;i++){
            sumatoria+=Math.pow(this.ro,i)/Factorial(i);
        }
       
        return 1/((Math.pow(this.ro,this.servidores)/Factorial(s))*((s*this.miu)/(s*this.miu-this.lambda))+sumatoria);
    }
    public int Factorial(int s){
        int Factorial_s=1;
        while (s!=0){
            Factorial_s*=s;
            s--;
        }
        return Factorial_s;
    }
    @Override
    public String pk(int n) {
        double p_k;
        if (n<=this.servidores){
            p_k=po()*((Math.pow(this.ro, n))/(Factorial(n)));
        }
            else {
            p_k=po()*((Math.pow(this.ro, n))/(Factorial(this.servidores)*Math.pow(this.servidores,n-this.servidores)));
        }
 
        return "P(k="+n+")= "+p_k;
    }
}
