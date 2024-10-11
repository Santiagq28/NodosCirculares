/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nodosdoblescirculares;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-27
 */
public class NodosDoblesCirculares {
    NodoDoble inicio;
    NodosDoblesCirculares(){
        inicio=null;
    }
    
    public void insertarInicioLista(String name, int age, String dato){
        NodoDoble nuevo = new NodoDoble();
        nuevo.setName(name);
        nuevo.setAge(age);
        nuevo.setDato(dato);
        nuevo.setAnterior(nuevo);
        nuevo.setSiguiente(nuevo);
        
        
        NodoDoble temporal = inicio;
        if(inicio==null){
            inicio=nuevo;
            JOptionPane.showMessageDialog(null,"Lista creada");
        }
        else{
            
            while(temporal.getSiguiente()!=inicio){
                temporal=temporal.getSiguiente();
            }
            
            temporal.setSiguiente(nuevo);
            nuevo.setAnterior(temporal);
            nuevo.setSiguiente(inicio);
            JOptionPane.showMessageDialog(null,"Persona agregada al inicio");
            inicio=nuevo;
        }
    }
    
    public void insertarFinalLista(String name, int age, String dato){
        NodoDoble nuevo = new NodoDoble();
        nuevo.setName(name);
        nuevo.setAge(age);
        nuevo.setDato(dato);
        nuevo.setAnterior(nuevo);
        nuevo.setSiguiente(nuevo);
        
        
        NodoDoble temporal = inicio;
        if(inicio==null){
            inicio=nuevo;
            JOptionPane.showMessageDialog(null,"Lista creada");
        }
        else{
            
            while(temporal.getSiguiente()!=inicio){
                temporal=temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevo);
            nuevo.setAnterior(temporal);
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            JOptionPane.showMessageDialog(null,"Persona agregada al final");
        }
    }
    
    public void imprimir(){
        NodoDoble temporal = inicio;
        String lista = "";
        if(inicio == null){
            JOptionPane.showMessageDialog(null,"Lista vacía");
            return;
        }
        else if(temporal.getSiguiente()==temporal){
            lista += "Nombre: "+temporal.getName()+", edad:"+temporal.getAge()+", dato:"+temporal.getDato()+"\n";
        }else{
            lista += "Nombre: "+temporal.getName()+", edad:"+temporal.getAge()+", dato:"+temporal.getDato()+"\n";
            temporal=temporal.getSiguiente();
            while(temporal!=inicio){
                lista += "Nombre: "+temporal.getName()+", edad:"+temporal.getAge()+", dato:"+temporal.getDato()+"\n";
                temporal=temporal.getSiguiente();
            }
            
        }
        JOptionPane.showMessageDialog(null,lista);
    }
}
