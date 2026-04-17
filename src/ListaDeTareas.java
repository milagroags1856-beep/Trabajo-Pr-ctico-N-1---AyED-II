import java.util.ArrayList;

public class ListaDeTareas {
    private ArrayList<Tarea> tareas;

    //Contructores
    public ListaDeTareas(){
        this.tareas = new ArrayList<>();

    }
        
    //Método para agregar un objeto de tipo tarea
    public void agregarTarea(Tarea t){
        this.tareas.add(t); //Se agrega la tarea a través del .add al ArrayList "Tarea"
    }

    //Marcar como tarea completada
    public void marcarComoCompletada(int indice){
        if(indice >=0 && indice < this.tareas.size()){ //Verifica que el indice sea mayor o igual a 0 y menor al tamaño del ArrayList "Tarea"
            tareas.get(indice).setCompletada(true); //Si el indice es válido, se marca la tarea como completada utilizando el método setCompletada
            System.out.println("¡Tarea marcada como completada!");
        }else{
            System.out.println("Índice inválido");
        }
    }

    //Muestra todas las tareas
    public void mostrarTodas(){
        System.out.println("----Lista de Tareas----");
        for(int i=0;i<tareas.size();i++){
            System.out.println((i+1) + ".\t"); //Imprime el número de la tarea (índice + 1)
            tareas.get(i).mostrar(); //Llama al método mostrar() de cada tarea para mostrar su información
        }
    }

    //Elimina una tarea
    public void eliminarTarea(int indice) {
    if (indice >= 0 && indice < tareas.size()) {
        tareas.remove(indice); //Elimina y corre todo automáticamente
        System.out.println("¡Tarea eliminada!");
    } else {
        System.out.println("¡Índice inválido!");
    }
}
}

