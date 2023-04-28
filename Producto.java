import java.lang.*;
import java.io.*;

public class Producto{
    private String nombreProducto;
    private int cantidad;
    private double precio;

    

    public Producto(){
        nombreProducto="";
        cantidad=0;
        precio=0;
    }

    public Producto(String nombre, int cantidad, double precio){
        this.nombreProducto = nombreProducto;
        this.cantidad= cantidad;
        this.precio=precio;

    }



    public String getNombreProducto(){
        if(this.nombreProducto !="") return this.nombreProducto;
        else
         return "Error: No se tiene el nombre del producto.";
    }

    public int getCantidad(){
        if (this.Cantidad=0) return this.getCantidad;
        else{
            system.out.println(x:"Error: El producto no tiene registrado una cantidad.");
          return -1;
        }
    }
    public int getPrecio(){
        if (this.Precio=0) return this.getPrecio;
        else{
            system.out.println(x:"Error: El producto no tiene registrado un precio.");
          return -1;
        }
    }

   
  

}

