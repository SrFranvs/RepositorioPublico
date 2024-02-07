// Al ser un ejercicio rápido no hay ningún tipo de control por teclado, cualquier dato mal introducido rompe el programa
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para indicar el tamaño del array de usuarios que deseas crear: ");
        int num = sc.nextInt();
        
        // Llamada al método para crear el array de usuarios
        Usuario[] usuarios = crearArrayUsuario(num);
        
        System.out.println("");

        // Y tras crear y llenar el array de usuarios llamamos al método mostrar
        mostrarUsuarios(usuarios);
    }

    // Método crear el array de usuarios
    public static Usuario[] crearArrayUsuario(int tamanyo) {
        Scanner sc = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[tamanyo];
        
        for (int i = 0; i < tamanyo; i++) {
            System.out.println("Ingrese los datos del usuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            
            // Vamos creando un objeto usuario y lo agregamos al array
            usuarios[i] = new Usuario(nombre, apellidos, email);
            System.out.println("");
        }
        return usuarios;
    }

    // Método para mostar el contenido del array de usuarios creado anteriormente
    // Podemos ver que como los métodos son públicos, no ha hecho falta que en la clase hagamos los getters y los setters pues podemos acceder directamente a ellos
    // en este caso es adecuado ya que los datos que vamos a introducir no tienen ningún tipo de filtro
    public static void mostrarUsuarios(Usuario[] usuarios) {
        System.out.println("MOSTRAR USUARIOS");
        System.out.println("1");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Apellidos: " + usuario.apellidos);
            System.out.println("Email: " + usuario.email);
            System.out.println("");
        }
    }
}
