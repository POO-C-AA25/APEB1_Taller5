import java.util.Arrays;
public class Problema1_EjecutorCarritoCompras {
    public static void main(String[] args) {
        Producto [] stopProductos = {new Producto("P1",10, 2), new Producto("P2", 5, 1)};
        Producto [] productosComprar = {new Producto("P1",100, 10), new Producto("P2", 5, 1)};
        CarritoDeCompras carritoCompras = new CarritoDeCompras(productosComprar, 30);
        carritoCompras.calcularMontoFactura();
        carritoCompras.calcularDescuento();
        System.out.println(carritoCompras);
    }
    
}
class Producto{
    public String nombre;
    public double precio;
    public double cantidad;
    public Producto(String nombre, double precio, double cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return String.format("PRODUCTO\n"
                + "Nombre: %s\n"
                + "Precio: %.2f\n"
                + "Cantidad: %.2f\n", 
                nombre, precio, cantidad);
    }
}
class CarritoDeCompras{
    public Producto [] productos;
    public double efectivo;
    public double montoFactuta;
    public double descuento;

    public CarritoDeCompras(Producto[] productos, double efectivo) {
        this.productos = productos;
        this.efectivo = efectivo;
    }
    public double calcularMontoFactura(){
        for (Producto producto : productos){
            this.montoFactuta += (producto.precio * producto.cantidad);
        }
        return this.montoFactuta;
    }
    public void calcularDescuento(){
        if (this.montoFactuta > 1000)
            this.descuento = this.montoFactuta * 0.1;
    }
    @Override
    public String toString() {
        return String.format("CARRITO:\n"
                           + "Lista Productos: %s\n"
                           + "Efectivo: %.2f\n"
                           + "Monto compra: %.2f\n"
                           + "Descuento: %.2f", 
                            Arrays.toString(productos), efectivo, montoFactuta, descuento);
    }
}