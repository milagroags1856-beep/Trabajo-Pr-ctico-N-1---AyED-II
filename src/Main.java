import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        int indice;
        boolean listaCreada = false;//Variable para poder controlar si existe creada o no una lista
        ListaDeTareas lista = null;//Declaro la lista 

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---\n1. Crear lista de tareas\n2. Agregar tarea\n3. Mostrar tareas\n4. Marcar tarea como completada\n5. Eliminar tarea\n6. Salir");
            System.out.print("Elegí una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    lista = new ListaDeTareas();
                    listaCreada = true;
                    System.out.println("================================\n ¡Lista creada correctamente!\n================================");
                    break;

                case 2:
                    if (!listaCreada) {
                        System.out.println("================================\n ¡Primero cree la lista!\n================================");
                    } else {
                        System.out.print("Título: ");
                        String titulo = sc.nextLine();

                        System.out.print("Descripción: ");
                        String descripcion = sc.nextLine();

                        Tarea nueva = new Tarea(titulo, descripcion);//Crea una nueva tarea en base a los datos que dimos anteriormente
                        lista.agregarTarea(nueva);//Y la agrega a la lista

                        System.out.println("================================\n ¡Tarea agregada!\n================================");
                    }
                    break;

                case 3:
                    if (!listaCreada) {
                        System.out.println("================================\n ¡Primero cree la lista!\n================================");
                    } else {
                        System.out.println("--- LISTA DE TAREAS ---");
                        lista.mostrarTodas();
                    }
                    break;

                case 4:
                    if (!listaCreada) {
                        System.out.println("================================\n ¡Primero cree la lista!\n================================");
                    } else {
                        lista.mostrarTodas();

                        System.out.print("Ingrese el Nº de la tarea que desea marcar como completada: ");
                        indice = sc.nextInt();

                        lista.marcarComoCompletada(indice - 1); // El usuario ingresa un número basado en 1, pero el índice del ArrayList es basado en 0, por eso restamos 1 al índice ingresado por el usuario.
                    }
                    break;

                case 5:
                     if (!listaCreada) {
                         System.out.println("================================\n ¡Primero cree la lista!\n================================");
                     } else {
                         lista.mostrarTodas();

                           System.out.print("Ingrese el Nº de la tarea que desea eliminar: ");
                         int indiceEliminar = sc.nextInt();

                        lista.eliminarTarea(indiceEliminar - 1); 
                        System.out.println("================================\n ¡Tarea eliminada!\n================================");
                     }
                    break;
                
                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}