import java.lang.*;
import java.io.*;

public class Persona{
    private String nombre;
    private int CI;


    public Persona(){
        nombre="";
        CI=0;
        
    }

    public Persona(String nombre, int CI){
        this.nombre = nombre;
        this.CI=carnet;
    

    }
    
    

    public String getNombre(){
        if(this.nombre !="") return this.nombre;
        else
         return "Error: No se tiene el nombre de la persona.";
    }

    public int getCI(){
        if (this.CI=0) return this.CI;
        else{
            system.out.println(x:"Error: La persona no tiene registrado un carnet de identidad.");
          return -1;
        }
    }

   

  

}

