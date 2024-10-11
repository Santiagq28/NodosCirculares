/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareanodoscirculares;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-27
 */
public class TareaNodosCirculares {
    NodoCircular inicio;
    TareaNodosCirculares(){
        inicio = null;
    }
    
    public void insertarLista(String name, int age){
        NodoCircular nuevo = new NodoCircular();
        nuevo.setName(name);
        nuevo.setAge(age);
        nuevo.setAnterior(null);
        nuevo.setSiguiente(null);
        
        
        NodoCircular temporal = inicio;
        if(inicio==null){
            inicio=nuevo;
            JOptionPane.showMessageDialog(null,"Lista creada");
        }
        else{
            
            while(temporal.getSiguiente()!=null){
                temporal=temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevo);
            nuevo.setAnterior(temporal);
            nuevo.setSiguiente(null);
            JOptionPane.showMessageDialog(null,"Persona agregada al final");
        }
    }
    
    
    public void imprimir(){
        NodoCircular temporal = inicio;
        String lista = "";
        if(inicio == null){
            JOptionPane.showMessageDialog(null,"Lista vacía");
            return;
        }
        else if(temporal.getSiguiente()==null){
            lista += "Nombre: "+temporal.getName()+", edad:"+temporal.getAge()+"\n";
        }else{
            lista += "Nombre: "+temporal.getName()+", edad:"+temporal.getAge()+"\n";
            temporal=temporal.getSiguiente();
            while(temporal!=null){
                lista += "Nombre: "+temporal.getName()+", edad:"+temporal.getAge()+"\n";
                temporal=temporal.getSiguiente();
            }
            
        }
        JOptionPane.showMessageDialog(null,lista);
    }
    
    public void posicion(int posicion){
        int pos = 1;
        NodoCircular temporal = inicio;
        String lista = "";
        if(inicio == null){
            JOptionPane.showMessageDialog(null,"Lista vacía");
            return;
        }else{
            do{
                    if(pos==posicion){
                        if(temporal.getAnterior()==null && temporal.getSiguiente()==null){
                            lista += "Solo hay una persona en la lista";
                        }else if(temporal.getAnterior()==null && temporal.getSiguiente()!=null){
                            lista +="Persona anterior: No hay \n";
                            lista +="Persona siguiente: Nombre: "+temporal.getSiguiente().getName()+", edad:"+temporal.getSiguiente().getAge()+"\n";
                        }else if(temporal.getAnterior()!=null && temporal.getSiguiente()==null){
                            lista +="Persona atrás: Nombre: "+temporal.getAnterior().getName()+", edad:"+temporal.getAnterior().getAge()+"\n";
                            lista +="Persona siguiente: No hay \n";
                        }else if(temporal.getAnterior()!=null && temporal.getSiguiente()!=null){
                            lista +="Persona atrás: Nombre: "+temporal.getAnterior().getName()+", edad:"+temporal.getAnterior().getAge()+"\n";
                            lista +="Persona siguiente: Nombre: "+temporal.getSiguiente().getName()+", edad:"+temporal.getSiguiente().getAge()+"\n";
                        }
                        
                    }
                    temporal=temporal.getSiguiente();
                    pos++;
            }while(temporal!=null);
        }
        JOptionPane.showMessageDialog(null,lista);
    }
    
    
    public void mayoresPosicion(){
        int pos = 1;
        NodoCircular temporal = inicio;
        String lista = "";
        if(inicio == null){
            JOptionPane.showMessageDialog(null,"Lista vacía");
            return;
        }else{
            do{
                    if(temporal.getAge()>=18){
                        lista += "Posición: "+pos +" Nombre: "+temporal.getName()+", edad: "+temporal.getAge()+"\n";
                    }
                    temporal=temporal.getSiguiente();
                    pos++;
            }while(temporal!=null);
        }
        JOptionPane.showMessageDialog(null,lista);
    }
    
    public void eliminarMenores(){
        NodoCircular temporal = inicio;
        NodoCircular anterior;
        NodoCircular siguiente;
        if(inicio == null){
            JOptionPane.showMessageDialog(null,"Lista vacía");
        }else{
            do{
                    if(temporal.getAge()<18){
                        anterior = temporal.getAnterior();
                        siguiente = temporal.getSiguiente();
                        if(temporal.getAnterior()==null && temporal.getSiguiente()==null){
                            inicio=null;
                        }else if(temporal.getAnterior()==null && temporal.getSiguiente()!=null){
                            siguiente.setAnterior(null);
                            inicio=siguiente;
                            
                        }else if(temporal.getAnterior()!=null && temporal.getSiguiente()==null){
                            anterior.setSiguiente(null);
                        }else if(temporal.getAnterior()!=null && temporal.getSiguiente()!=null){
                            anterior.setSiguiente(siguiente);
                            siguiente.setAnterior(anterior);
                        }
                        
                    }
                    temporal=temporal.getSiguiente();
            }while(temporal!=null);
            JOptionPane.showMessageDialog(null,"Menor de edad borrado");
        }
    }
    
    public void eliminarPosicion(int pos2){
        int pos = 1;
        NodoCircular temporal = inicio;
        NodoCircular anterior;
        NodoCircular siguiente;
        if(inicio == null){
            JOptionPane.showMessageDialog(null,"Lista vacía");
        }else{
            do{
                    if(pos==pos2){
                        
                        anterior = temporal.getAnterior();
                        siguiente = temporal.getSiguiente();
                        if(temporal.getAnterior()==null && temporal.getSiguiente()==null){
                            inicio=null;
                        }else if(temporal.getAnterior()==null && temporal.getSiguiente()!=null){
                            siguiente.setAnterior(null);
                            inicio=siguiente;
                        }else if(temporal.getAnterior()!=null && temporal.getSiguiente()==null){
                            anterior.setSiguiente(null);
                        }else if(temporal.getAnterior()!=null && temporal.getSiguiente()!=null){
                            anterior.setSiguiente(siguiente);
                            siguiente.setAnterior(anterior);
                        }
                        JOptionPane.showMessageDialog(null,"Posición "+pos2+" eliminada.");
                        return;
                    }
                    pos++;
                    temporal=temporal.getSiguiente();
            }while(temporal!=null);
            JOptionPane.showMessageDialog(null,"La posición no existe");
        }
    }
}

