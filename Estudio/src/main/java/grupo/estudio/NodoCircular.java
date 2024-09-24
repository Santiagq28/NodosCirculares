
package grupo.estudio;

public class NodoCircular {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the prom
     */
    public float getProm() {
        return prom;
    }

    /**
     * @param prom the prom to set
     */
    public void setProm(float prom) {
        this.prom = prom;
    }

    /**
     * @return the siguiente
     */
    public NodoCircular getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }
    private String name;
    private int age;
    private float prom;
    private NodoCircular siguiente;
}
