package prycedula;
  import java.util.Scanner;
public class PryCedula 
{
  
    public static void main(String[] args) 
    {
        //Creado con reglas ortográficas
        Scanner teclado = new Scanner (System.in);
        Validación_datos_ingresados sacar = new Validación_datos_ingresados();
        //Variable para guardar el retorno del nombre
        float nombre_val;
        System.out.println("Ingrese el nombre");
        String nombre = teclado.nextLine();
        //Guardamos el retorno del nombre
        nombre_val=sacar.verifica_nombre(nombre);
        //Verificamos el número obtenido y le damos la condición
        if(nombre_val==1)
        {
            System.out.println("ERROR!! Introduzca letras no números");
            
        }
        
        //Ingresamos el año de nacimiento y variables para guardar el retorno
        System.out.println("Ingrese el año de nacimiento");
        String año_nacimiento = teclado.nextLine();
        //VAriable para el retorno de la condición
        Validación_datos_ingresados saca=new Validación_datos_ingresados();
        float año_val;
        //Guardamos el retorno
        año_val=saca.verifica_año_nacimiento(año_nacimiento);
        //Verificamos el nñumero obtenido y le damos la condición
        if(año_val==1)
        {
            System.out.println("Perfecto ");
        }
                     
        //------------------------------------//
        System.out.println("Ingrese el numero de cédula ");
        String cedula = teclado.next();
        System.out.println("Ingrese la dirección ");
        String dirección = teclado.next();
        

        //Variable para enviar o recibir parámetros
        Persona impresión = new Persona();
        
         //Ingresamos el año de nacimiento para el cálculo
        float cálculoaño;
        //Obtenemos el retorno del cálculo
        cálculoaño=saca.cálculo_fecha(año_nacimiento);
        
        System.out.println("-----------------------------");
        System.out.println("Datos del ciudadadano");
        //NOmbre
        System.out.println("Su nombre es: "+nombre);
       
        System.out.println("Edad: "+cálculoaño);
        //Variable para capturar la cédula 
        String captura_cédula;
        captura_cédula=impresión.verificarcedula(cedula,dirección);
        System.out.println("La dirección es: "+captura_cédula);
        
        
       
    }
    
}
