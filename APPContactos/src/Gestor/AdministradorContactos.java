package Gestor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdministradorContactos {
    private List<Contacto> contactos;

    public AdministradorContactos() {
        this.contactos = new ArrayList<>();
    }

public static void main(String[] args) {
AdministradorContactos gestor = new AdministradorContactos();
gestor.ejecutar();
}
    public void agregarContacto(String nombre, String telefono) {
        Contacto nuevoContacto = new Contacto(nombre, telefono);
        contactos.add(nuevoContacto);
        System.out.println("Contacto añadido: " + nombre);
    }

    public void buscarContacto(String nombre) {
        boolean encontrado = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado:");
                System.out.println(contacto);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void listaDeContactos() {
        System.out.println("Lista de contactos:");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        
        }

    }
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("\n=== Gestor de Contactos ===");
            System.out.println("");
            System.out.println("1. Agregar nuevo contacto");
            System.out.println("2. Buscar contacto por nombre");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.print("Seleccione una opción: ");

            
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                	System.out.println("");
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el número de teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    agregarContacto(nombre, telefono);  
                    break;
                case 2:
                	System.out.println("");
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBusqueda = scanner.nextLine();
                    buscarContacto(nombreBusqueda);
                    break;
                case 3:
                	System.out.println("");
                    listaDeContactos();
                    break;
                case 4:
                    System.out.println("¡nos vemos gracias por usar la agenda de lucas!");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        
        }

}
}
