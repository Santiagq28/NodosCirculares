/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teatro;

/**
 *
 * @author USER
 */
public class NodoBoleta {
    private String documentoComprador;
    private int cantidadBoletas;
    private NodoBoleta siguiente;

    public NodoBoleta(String documentoComprador, int cantidadBoletas) {
        this.documentoComprador = documentoComprador;
        this.cantidadBoletas = cantidadBoletas;
        this.siguiente = null;
    }

    public String getDocumentoComprador() {
        return documentoComprador;
    }

    public int getCantidadBoletas() {
        return cantidadBoletas;
    }

    public NodoBoleta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoBoleta siguiente) {
        this.siguiente = siguiente;
    }
}


