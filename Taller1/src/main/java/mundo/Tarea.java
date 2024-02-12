package mundo;

/**
 *
 * @author German Andres Tulcan 
 */
public class Tarea {
    
    //atributos
    private int idTarea;
    private String descripcion;
    private int prioridad;
    
    //metodos

    public Tarea() {
    }

    public Tarea(int idTarea, String descripcion, int prioridad) {
        this.idTarea = idTarea;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public int getId() {
        return idTarea;
    }

    public void setId(int id) {
        this.idTarea = idTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

  
}

