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
        }else if(inicio.getSiguiente()==null){
            inicio.setAnterior(nuevo);
            inicio.setSiguiente(nuevo);
            nuevo.setAnterior(inicio);
            nuevo.setSiguiente(inicio);
            JOptionPane.showMessageDialog(null,"Persona agregada al final");
        }
        else{
            
            while(temporal.getSiguiente()!=inicio){
                temporal=temporal.getSiguiente();
            }
            inicio.setAnterior(nuevo);
            temporal.setSiguiente(nuevo);
            nuevo.setAnterior(temporal);
            nuevo.setSiguiente(inicio);
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
            while(temporal!=inicio){
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
        }
        else if(temporal.getSiguiente()==null){
            JOptionPane.showMessageDialog(null,"Sólo hay un elemento en la vista");
        }else{
            do{
                    if(pos==posicion){
                        lista +="Persona atrás: Nombre: "+temporal.getAnterior().getName()+", edad:"+temporal.getAnterior().getAge()+"\n";
                        lista +="Persona siguiente: Nombre: "+temporal.getSiguiente().getName()+", edad:"+temporal.getSiguiente().getAge()+"\n";
                    }
                    temporal=temporal.getSiguiente();
                    pos++;
            }while(temporal!=inicio);
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
        }
        else if(temporal.getSiguiente()==null){
            JOptionPane.showMessageDialog(null,"Sólo hay un elemento en la vista");
        }else{
            do{
                    if(temporal.getAge()>=18){
                        lista += "Posición: "+pos +" Nombre: "+temporal.getName()+", edad: "+temporal.getAge()+"\n";
                    }
                    temporal=temporal.getSiguiente();
                    pos++;
            }while(temporal!=inicio);
        }
        JOptionPane.showMessageDialog(null,lista);
    }
    
    public void eliminarMenores(){
        int pos = 1;
        NodoCircular temporal = inicio;
        String lista = "";
        NodoCircular anterior;
        NodoCircular siguiente;
        if(inicio == null){
            JOptionPane.showMessageDialog(null,"Lista vacía");
            return;
        }
        else if(temporal.getSiguiente()==null){
            if(temporal.getAge()<18){
                inicio=null;
                JOptionPane.showMessageDialog(null,"Menor de edad borrado");
            }
            JOptionPane.showMessageDialog(null,"Sólo hay un elemento en la vista");
        }else if(temporal.getSiguiente().getSiguiente()==inicio){
            do{ 
                
                if(temporal.getSiguiente()==null){
                    if(temporal.getAge()<18){
                        inicio=null;
                    JOptionPane.showMessageDialog(null,"Menor de edad borrado");
                    }
                }
                else if(temporal.getAge()<18){
                        temporal.getSiguiente().setSiguiente(null);
                        temporal.getSiguiente().setAnterior(null);
                        JOptionPane.showMessageDialog(null,"Menor de edad borrado");
                        temporal=temporal.getSiguiente();
                        inicio=temporal;
                }
                
            }while(temporal!=null);
            
            
        }else{
            do{
                    if(temporal.getAge()<18){
                        anterior = temporal.getAnterior();
                        siguiente = temporal.getSiguiente();
                        anterior.setSiguiente(siguiente);
                        siguiente.setAnterior(anterior);
                        
                        
                    }
                    temporal=temporal.getSiguiente();
            }while(temporal!=inicio);
            JOptionPane.showMessageDialog(null,"Menor de edad borrado");
        }
    }
}

