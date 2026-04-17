public class Tarea {
    private String titulo;
    private String descripcion;
    private boolean completada;

    //Constructores
    public Tarea(String titulo, String descripcion){
        setTitulo(titulo);
        setDescripcion(descripcion);
        this.completada = false;
    }

    //Getter y Setter

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        if(titulo != null && !titulo.trim().isEmpty()){
            this.titulo = titulo;
        } else {
            this.titulo = "¡Tarea sin título!";
        }     
    }


    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        if(descripcion != null && !descripcion.trim().isEmpty()){
            this.descripcion = descripcion;
        }else{
            this.descripcion = "¡No se encontro descripción!";
        }
    }


    public boolean isCompletada(){
        return completada;
    }

    public void setCompletada(boolean completada){
        this.completada = completada;
    }

    //Método para mostrar la tarea
    public void mostrar(){
        if(this.completada==true){
            System.out.println("[x]" + this.titulo);
        }else{
            System.out.println("[ ]" + this.titulo);
        }
        System.out.println("   Descripción:" + this.descripcion);
    }

}
