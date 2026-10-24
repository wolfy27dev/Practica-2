public class Ticket {
    private float total;//suma del precio de los productos
    private float ef_rec; //el dinero que nos da el cliente
    private float cambio; //el dinero que se le dara al cliente, o en su defecto recibira 0
    public Ticket (float total, float ef_rec, float cambio){
this.total = total;
this.ef_rec = ef_rec;
this.cambio = cambio;
}
  public float getTotal() {
    return this.total;
}
public float getEf_rec() {
    return this.ef_rec;
}
public float getCambio() {
    return this.cambio;
}
@Override
public String toString() {
    return "Total a pagar: $" + this.total + "\n" +
           "Efectivo recibido: $" + this.ef_rec + "\n" +
           "Su cambio: $" + this.cambio;
}
      
}
