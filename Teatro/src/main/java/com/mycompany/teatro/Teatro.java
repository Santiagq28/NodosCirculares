/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teatro;

import javax.swing.JOptionPane;

/**
 *
 * @author EXITOPC
 */
public class Teatro {
    
    Nodoscirculares inicio;
    NodoBoleta inicioBoletas;
    
    
    Teatro(){
    inicio=null;    
    inicioBoletas = null;
    }
    int[] boletas = {0};
    
    public void numBoletas(int cantidad){
        boletas[0] = cantidad;
    }
   
    
    public void solicitarTurno( String nombre, String documento, String genero ){
        
        Nodoscirculares nuevo= new Nodoscirculares();
        nuevo.setDocumento(documento);
        nuevo.setNombre(nombre);
        nuevo.setGenero(genero);
        nuevo.setSiguiente(nuevo);
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");   
            
               inicio=nuevo;
        
        }else {
            Nodoscirculares temporal = inicio;
            while (temporal.getSiguiente() != inicio) {
                temporal = temporal.getSiguiente();
            }

            temporal.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
        }
    
    }
    
    public void imprimir(){        
    Nodoscirculares temporal=inicio;
    if(inicio==null){    
        JOptionPane.showMessageDialog(null, "La lista esta vacia");
    
    }
    else{
        
        do{       
              JOptionPane.showMessageDialog(null, "Documento "+
                      temporal.getDocumento()+" Nombre " + temporal.getNombre() +" Genero "+ temporal.getGenero()
                     );
              
              temporal=temporal.getSiguiente();       
        
        }while(temporal!=inicio);
    
    
    
    }


    
        
        
        
        }   
    
    
    public void atender(int nboletas) {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay personas en la fila.");
            return;
        }

        if (nboletas < 1 || nboletas > 3) {
            JOptionPane.showMessageDialog(null, "Las personas pueden comprar entre 1 y 3 boletas.");
            return;
        }
        if(nboletas > boletas[0]){
            JOptionPane.showMessageDialog(null, "Cantidad de Boletas disponibles insuficientes: "+boletas[0]);
            return;
        }else{
            boletas[0] -= nboletas;
        }
        
        Nodoscirculares atendido = inicio;

        if (inicio.getSiguiente() == inicio) {
            inicio = null;
        } else {
            Nodoscirculares temporal = inicio;
            while (temporal.getSiguiente() != inicio) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(inicio.getSiguiente());
            inicio = inicio.getSiguiente();
        }

        NodoBoleta nuevaBoleta = new NodoBoleta(atendido.getDocumento(), nboletas);
        
        if (inicioBoletas == null) {
            inicioBoletas = nuevaBoleta;
        } else {
            NodoBoleta tempBoleta = inicioBoletas;
            while (tempBoleta.getSiguiente() != null) {
                tempBoleta = tempBoleta.getSiguiente();
            }
            tempBoleta.setSiguiente(nuevaBoleta);
        }

        JOptionPane.showMessageDialog(null, "Atendido: " + atendido.getNombre() +
                                            " Documento: " + atendido.getDocumento() + 
                                            " Compró: " + nboletas + " boletas.");
    }
    
    
    
    
    
    public void imprimirBoletasVendidas() {
        NodoBoleta tempBoleta = inicioBoletas;
        if (tempBoleta == null) {
            JOptionPane.showMessageDialog(null, "No se han vendido boletas.");
        } else {
            while (tempBoleta != null) {
                JOptionPane.showMessageDialog(null, "Documento: " + tempBoleta.getDocumentoComprador() +
                                                    " Boletas: " + tempBoleta.getCantidadBoletas());
                tempBoleta = tempBoleta.getSiguiente();
            }
        }
    }
    
    
        
    
    
    
}
