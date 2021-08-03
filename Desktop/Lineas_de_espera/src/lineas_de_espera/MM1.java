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
public class MM1 extends Sistema{

    //Constructores
    public MM1(double lambda,double miu){
        super(lambda, miu);
    }
    public MM1(double lambda, double miu, int servidores, int poblacion, int capacidad_fila, int capacidad_sistema) {
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
        return 1- this.ro;
    }

    @Override
    public double pk(int n) {
        return po()*Math.pow(this.ro,n);
    }
    
}
