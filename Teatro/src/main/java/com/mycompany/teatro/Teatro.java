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
    Nodossimple inicioSimple;
    
    
    Teatro(){
    inicio=null;    
    inicioSimple = null;
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
            JOptionPane.showMessageDialog(null, "¡Bienvenido, eres el primero en llegar!");   
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
              JOptionPane.showMessageDialog(null, "Documento "+temporal.getDocumento()+"\n"+
                      " Nombre " + temporal.getNombre() +"\n"+
                      " Genero "+ temporal.getGenero()
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
        
        Nodossimple nuevo = new Nodossimple();
        nuevo.setDocumento(atendido.getDocumento());
        nuevo.setNombre(atendido.getNombre());
        nuevo.setNboletas(nboletas);
        nuevo.setGenero(atendido.getGenero());

        if (inicioSimple == null) {
            inicioSimple = nuevo;
        } else {
            Nodossimple tempBoleta = inicioSimple;
            while (tempBoleta.getSiguiente() != null) {
                tempBoleta = tempBoleta.getSiguiente();
            }
            tempBoleta.setSiguiente(nuevo);
        }

        JOptionPane.showMessageDialog(null, "Atendido: " + atendido.getNombre() + "\n"+
                                            " Documento: " + atendido.getDocumento() + "\n"+
                                            " Compró: " + nboletas + " boletas.");
    }
    
    
    
    
    
    public void imprimirBoletasVendidas() {
        Nodossimple tempBoleta = inicioSimple;
        if (tempBoleta == null) {
            JOptionPane.showMessageDialog(null, "No se han vendido boletas.");
        } else {
            while (tempBoleta != null) {
                JOptionPane.showMessageDialog(null, "Documento: " + tempBoleta.getDocumento() +
                                                    " Boletas: " + tempBoleta.getNboletas());
                tempBoleta = tempBoleta.getSiguiente();
            }
        }
    }
    
    
    
    public void consultarPorDocumento(String n){
        Nodossimple tempBoleta = inicioSimple;
        if (tempBoleta == null) {
            JOptionPane.showMessageDialog(null, "No se han vendido boletas.");
        } else {
            while (tempBoleta != null) {
                if(tempBoleta.getDocumento().equals(n)){
                    JOptionPane.showMessageDialog(null, "La persona con el documento No."+tempBoleta.getDocumento()+" ha comprado "+tempBoleta.getNboletas()+" boletas.");
                }
                tempBoleta = tempBoleta.getSiguiente();
            }
        }
    }
    
    
    public void mostrarGeneros(){
        Nodossimple tempBoleta = inicioSimple;
        int hombres = 0;
        int mujeres = 0;
        int total = 0;
        if (tempBoleta == null) {
            JOptionPane.showMessageDialog(null, "No se han vendido boletas.");
        } else {
            while (tempBoleta != null) {
                if(tempBoleta.getGenero().equals("M")){
                    hombres+=tempBoleta.getNboletas();
                }else if(tempBoleta.getGenero().equals("F")){
                    mujeres+=tempBoleta.getNboletas();
                }else{
                    JOptionPane.showMessageDialog(null, "Los generos deben ser 'Masculino'(M) o 'Femenino'(F)");
                }
                total += tempBoleta.getNboletas();
                tempBoleta = tempBoleta.getSiguiente();
                
            }
            JOptionPane.showMessageDialog(null, " -Boletas compradas por hombres: "+((hombres*100)/total)+"%"+"\n"+" -Boletas compradas por mujeres: "+((mujeres*100)/total)+"%");
        }
    }
        
    
    
    
}
