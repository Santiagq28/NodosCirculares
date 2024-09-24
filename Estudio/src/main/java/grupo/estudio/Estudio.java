
package grupo.estudio;

import javax.swing.JOptionPane;

public class Estudio {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    NodoCircular inicio;
    
    Estudio(){
        inicio = null;
    }
    
    public void agregarNodo(String nombre, int edad, float promedio){
        
        NodoCircular nuevo = new NodoCircular();
        nuevo.setName(nombre);
        nuevo.setAge(edad);
        nuevo.setProm(promedio);
        nuevo.setSiguiente(nuevo);
        
        
        if(inicio==null){
            inicio = nuevo;
            JOptionPane.showMessageDialog(null,"Lista nueva creada");
            
        }else{
            NodoCircular temporal = inicio;
            while(temporal.getSiguiente() != inicio){
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
        }
    }
    
    public void recorrerLista(){
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        }else{
            NodoCircular temporal = inicio;
            JOptionPane.showMessageDialog(null,temporal.getName());
            while(temporal.getSiguiente() != inicio){
                temporal = temporal.getSiguiente();
                JOptionPane.showMessageDialog(null,temporal.getName());
                
            }
        }
    }
    
    
    
}
