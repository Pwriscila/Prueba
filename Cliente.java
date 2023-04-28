import java.lang.*;
import java.io.*;

public class Cliente extends Persona{
    private int codigo;

    private Producto productos[] ;
    
    

    public Cliente(){
        Codigo=0;
        productos=new Producto[10];
        cantidad= -1;
    }

    public Cliente( int codigo){
        super();
        this.codigo=codigo_cliente;
        productos=new Producto[10];
        cantidad= -1;

    }
    public Cliente( String nombre, int CI, int codigo){
        super(nombre, CI);
        this.codigo=codigo_cliente;
        productos=new Producto[10];
        cantidad= -1;

    }
    
    
    public int getCodigo(){
        if (this.codigo=0) return this.codigo;
        else{
            system.out.println(x:"Error: El cliente no tiene registrado un código.");
          return -1;
        }
    }

    
    
   
    public int AdicionarProducto (Producto p)
    {
        int resultado=1;
        if (cantidad < 10){

            productos[cantidad+1]=p;
            cantidad++; 
            resultado=1;
        }
        else{
            
            system.out.print(x:"Error: no se puede adicionar un producto.");
            resultado= 0;
          
        }
        return resultado;
    }

  

}

