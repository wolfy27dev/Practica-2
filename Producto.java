



public class Producto {
 private String nombre;
 private String depar;
private float precio;
public Producto(String nombre, int numDepar, float precio) {
    this.nombre = nombreVacio(nombre); 
    
    this.depar = determinarDepartamento(numDepar); 
    
    this.precio = validarPrecio(precio); 
}        public float getPrecio() {
    return this.precio;
}
public static String determinarDepartamento(int numero) {
    return switch (numero) {
        case 1 -> "Ropa";
        case 2 -> "Electrónica y tecnología";
        case 3 -> "Higiene y cuidado personal";
        case 4 -> "Alimentos";
        case 5 -> "Departamento desconocido";
        default -> "Departamento no encontrado";
    };

    }
public String getDepar() {
    return this.depar;
}
public String getNombre() {
    return this.nombre;
}
@Override
public String toString() {
    return "Artículo: " + this.nombre + "  Depto: " + this.depar + "  Precio: $" + this.precio;
}
//metodos support
public String nombreVacio(String nuevoNombre){
if (nuevoNombre.equals("")|| nuevoNombre.equals(" ")){
    System.out.println("no se puede dejar el nombre en blanco");
    return "producto desconocido";
}else{
    return nuevoNombre;
}

}
public float validarPrecio(float posiblePrecio){
    if(posiblePrecio <= 0){
        return 100f;
    }else{
        return posiblePrecio;
    }
}
}

