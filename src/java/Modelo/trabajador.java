/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Paty Ramirez
 */
public class trabajador {
    private int idtrabajador;
     private String nombre;
     private String codigo;
     private String atencion;
     private String puesto;
     private String salario;

    public trabajador() {
    }

    public trabajador(int idtrabajador, String nombre, String codigo, String atencion, String puesto, String salario) {
        this.idtrabajador = idtrabajador;
        this.nombre = nombre;
        this.codigo = codigo;
        this.atencion = atencion;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public int getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAtencion() {
        return atencion;
    }

    public void setAtencion(String atencion) {
        this.atencion = atencion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
     
}
