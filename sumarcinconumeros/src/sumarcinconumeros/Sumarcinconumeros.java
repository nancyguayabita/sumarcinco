package sumarcinconumeros;
import java.util.Scanner;
public class Sumarcinconumeros 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner (System.in);
        float n1,n2,n3,n4,n5,denny;
        System.out.println("ingresa el primer numero: ");
        n1=leer.nextFloat();
        System.out.println("ingresa el segundo numero: ");
        n2=leer.nextFloat();
        System.out.println("ingresa el tercer numero: ");
        n3=leer.nextFloat();
        System.out.println("ingresa el cuarto numero: ");
        n4=leer.nextFloat();
        System.out.println("ingresa el quinto numero: ");
        n5=leer.nextFloat();
        denny=(n1+n2+n3+n4+n5);
        System.out.println("el resultado de la suma es: " + denny);
    }
    
}
