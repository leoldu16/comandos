package prycedula;
import java.util.Scanner;
public class Persona 
{
    public Persona()
    {
        Scanner teclado = new Scanner (System.in);
    }
       
        
        public String verificarcedula(String cedula_1,String dirección_1)
        {
            int cedula;//"1720411758"
            cedula=Integer.parseInt(cedula_1);
            int ced,pares,impares,total,dec=0;
        int a,b,c,d,e,f,g,h,i,j,k;
       
        //Creamos una variable para obtener la cédula completa
        ced=cedula;
       //Capturamos el último dígito
        a=cedula/1000000000;
        cedula=cedula-(a*1000000000);
        //Capturamos el penúltimo dígito y lo colocamos en una variable 
        b=cedula/100000000;
        //Dejamos a la variable cédula con un nuevo valor para poder dividir la siguiente
        cedula=cedula-(b*100000000);
        c=cedula/10000000;
        cedula=cedula-(c*10000000);
        d=cedula/1000000;
        cedula=cedula-(d*1000000);
        e=cedula/100000;
        cedula=cedula-(e*100000);
        f=cedula/10000;
        cedula=cedula-(f*10000);
        g=cedula/1000;
        cedula=cedula-(g*1000);
        h=cedula/100;
        cedula=cedula-(h*100);
        i=cedula/10;
        cedula=cedula-(i*10);
        j=cedula/1;
        cedula=cedula-(j*1);
       //Imprimimos la cédula
            System.out.println("Estos son los dígitos que usted ingerso de su cédula");
            System.out.println(""+a +" " +b +" "+c +" "+d +" "+e +" "+f +" "+g +" "+h +" "+i +" "+j);
        if (cedula>2400000000f)
        {
                System.out.println("ERROR!! cédula inválido");
        }
        else
        {
               
                pares=b+d+f+h;
               
                a=a*2;
                if (a>9){
                        a=a%10+a/10;
                }
               
                c=c*2;
                if (c>9){
                        c=c%10+c/10;
                }
               
                e=e*2;
                if (e>9){
                        e=e%10+e/10;
                }
               
                g=g*2;
                if (g>9){
                        g=g%10+g/10;
                }
               
                i=i*2;
                if (i>9){
                        i=i%10+i/10;
                }
               
                impares=a+c+e+g+i;
               
                total=pares+impares;
               
               
               
                while (dec-total!=j && dec<total+10){
                        dec=dec+10;
                }
               
                if (dec-total==j)
                {
                        System.out.println("La condición de su cédula es: ");
                        System.out.println("Válida");
                }
                else 
                {
                        System.out.println("Su cédula es: ");
                        System.out.println("Errónea");
                }
               
               
               
       
        }
        

            //-------------------------------//
            
            String dirección_de_vuelta;
            
            dirección_de_vuelta=dirección_1;
            return dirección_de_vuelta;
        }
}
