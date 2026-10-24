public class Cajero {
    public static void main(String[] args) {
        
        System.out.println("--- 2.1.1 Pruebas de Nombre ---");
        Producto pruebaNom1 = new Producto("", 1, 50.0f);
        System.out.println("Caso vacío: " + pruebaNom1.getNombre());
        
        Producto pruebaNom2 = new Producto(" ", 1, 50.0f);
        System.out.println("Caso espacio: " + pruebaNom2.getNombre());

        
        System.out.println("\n--- 2.1.2 Pruebas de Precio ---");
        Producto pruebaPrecio1 = new Producto("Galletas", 4, -15.0f);
        System.out.println("Precio negativo: $" + pruebaPrecio1.getPrecio());
        
        Producto pruebaPrecio2 = new Producto("Galletas", 4, 30.0f);
        System.out.println("Precio normal: $" + pruebaPrecio2.getPrecio());

        
        System.out.println("\n--- 2.1.3 Pruebas de los 5 Departamentos ---");
        Producto p1 = new Producto("Camisa", 1, 200.0f);
        Producto p2 = new Producto("Audífonos", 2, 500.0f);
        Producto p3 = new Producto("Jabón", 3, 20.0f);
        Producto p4 = new Producto("Pizza", 4, 150.0f);
        Producto p5 = new Producto("Cosa random/randy", 5, 10.0f);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
   
}
