/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seminario2;



/**

 *

 * @author Luis Mario Large Salas

 */

public class Empleado {

    

    private String nombre;

    private float salario;

    private int anyoAlta;



    public Empleado(String nombre, float salario, int anyoAlta) {

        this.nombre = nombre;

        this.salario = salario;

        this.anyoAlta = anyoAlta;

    }

    

  

    

    public int getAnyoAlta() {

        return anyoAlta;

    }



    public String getNombre() {

        return nombre;

    }



    public float getSalario() {

        return salario;

    }



    

    

    public void incSalario (float subida) {

        

        salario += subida;

    }

}