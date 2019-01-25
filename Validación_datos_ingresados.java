package prycedula;
import java.util.Scanner;

public class Validación_datos_ingresados 
{
    String numeros="0123456789";
    String letras="abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÖPQRSTUVWXYZ";
    Scanner teclado = new Scanner (System.in);
    public Validación_datos_ingresados()
    {
        
    }
        public float verifica_nombre(String nombre)
        {
            for(int i=0; i<nombre.length(); i++)
             {
                 if (numeros.indexOf(nombre.charAt(i),0)!=-1)
                 {
                    return 1;
                 }
             }
              
             return 0;
                 
        }
        public float verifica_año_nacimiento(String año_nacimiento)
        {
             año_nacimiento=año_nacimiento.toLowerCase();
            
            for(int i=0;i<año_nacimiento.length();i++)
            {
                if(letras.indexOf(año_nacimiento.charAt(i),0)!=-1);
                {
                    return 1;
                    
                }
                
            }
            return  0;
        }
        
        public float cálculo_fecha(String año_nacimiento)
        {
            System.out.println("Ingrese el año actual");
            float año_actual = teclado.nextFloat();
             float año_nacimiento2 = Float.parseFloat(año_nacimiento);
             float cálculo;
             cálculo=año_actual-año_nacimiento2;
             return cálculo;
        }
                
        
       
}

