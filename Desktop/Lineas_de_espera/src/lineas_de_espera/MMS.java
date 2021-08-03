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
        return this.lambda/(this.miu-this.lambda);
    }

    @Override
    public double Lq() {
        return Math.pow(this.lambda,2)/(miu*(miu-lambda)); 
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
    public double pk(int n) {
        if (n<=this.servidores){
            return po()*((Math.pow(this.ro, n))/(Factorial(n)));
        }
        return po()*((Math.pow(this.ro, n))/(Factorial(this.servidores)*Math.pow(this.servidores,n-this.servidores)));
    }
}
