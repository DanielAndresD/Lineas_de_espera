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
public abstract class Sistema {
    //Atributos
    /*
    lambda: tiempo entre arrivos
    miu: tiempo de servicio
    */
    public double 
        lambda,
        miu,
        ro,
        poblacion=Double.POSITIVE_INFINITY,
        capacidad_fila=Double.POSITIVE_INFINITY,
        capacidad_sistema=Double.POSITIVE_INFINITY;
    public int servidores=1;


    public Sistema(double lambda,double miu,int servidores){
        this.lambda=lambda;
        this.miu=miu; 
        this.servidores=servidores;
        this.ro=this.lambda/(this.miu*this.servidores);
    }
    public Sistema(double lambda,double miu,int servidores,double poblacion,double capacidad_fila,double capacidad_sistema){
        this.lambda=lambda;
        this.miu=miu;
        this.servidores=servidores;
        this.poblacion=poblacion;
        this.capacidad_fila=capacidad_fila;
        this.capacidad_sistema=capacidad_sistema;
        this.ro=this.lambda/(this.miu*this.servidores);

    }
    //metodos
    /*
    Medidas de desempeño del sistema
    Ro: Relacion de explosividad del sistema
    Ls:Número de clientes en el sistema
    Lq:Número de clientes en la fila
    Ws: Tiempo de duracion en el sistema
    Wq Tiempo de duración en la fila
    */



    public abstract double Ls();
    public abstract double Lq();
    public abstract double Ws();
    public abstract double Wq();
    public abstract double po();
    public abstract double pk(int n);
}
