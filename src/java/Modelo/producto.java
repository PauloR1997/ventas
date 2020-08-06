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
public class producto {
    int idproducto;
     String numero;
     String cantidad;
     String costo;
     String categoria;
     String situacion;

    public producto() {
    }

    public producto(int idproducto, String numero, String cantidad, String costo, String categoria, String situacion) {
        this.idproducto = idproducto;
        this.numero = numero;
        this.cantidad = cantidad;
        this.costo = costo;
        this.categoria = categoria;
        this.situacion = situacion;
    }
    
    public String getSituacion() {
        return situacion;
}

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
