
package umariana.taller1;

import java.util.ArrayList;
import java.util.Scanner;
import mundo.Tarea;

/**
 *
 * @author German Andres Tulcan
 */
public class Taller1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Tarea> misTareas = new ArrayList<>();

        boolean activo = true;
        do{
            
            System.out.println("---Menu de opciones---------");
            System.out.println("---1.Agregar tarea----------");
            System.out.println("---2.Mostrar tarea----------");
            System.out.println("---3.Terminar programa------");
            System.out.println("---Seleccione una opcion----");
            System.out.println("----------------------------");
            
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el id de la tarea");
                    int Id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la descripcion de la tarea");
                    String descripcion =sc.nextLine();
                    sc.nextLine();
                    System.out.println("Ingrese la prioridad de 1-5");
                    int prioridad = sc.nextInt();
                    sc.nextLine();                    //Creacion del objeto y llenar la informacion
                    Tarea nuevaTarea = new Tarea(Id,descripcion,prioridad);

                    // se agrega por prioridad las tareas registradas 
                    
                    boolean agregado = false;
                   for (int tarea =0; tarea < misTareas.size(); tarea++){
                       if (prioridad > misTareas.get(tarea).getPrioridad()){
                           misTareas.add(tarea, nuevaTarea);
                           agregado = true;
                           break;
                       }
                   }
                   
                   if (!agregado){
                       misTareas.add(nuevaTarea);
                   }
                    System.out.println("Tarea agregada correctamente");
                    break;
                case 2:
                    System.out.println("---TAREAS REGISTRADAS---");
                    for(Tarea t: misTareas)
                    {
                        System.out.println("id:"+ t.getId());
                        System.out.println("Descripcion:"+ t.getDescripcion());
                        System.out.println("Prioridad: "+ t.getPrioridad());
                        System.out.println("=======================");
                    }
                    
                    break;
                case 3:
                    
                    activo = false; System.out.println("Programa Terminado");
                    break;
                case 4:
                    
                default:
                    System.out.println("Opcion no valida");
                    
            }
            
        }while(activo);
    }
}
