import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class pendulo
{
   static Scanner teclado = new Scanner(System.in);
   
   private int longitud;
   private int aceleracion;
   private double raiz, periodo;
    
   public pendulo()
   {
      this.longitud =1;
      this.aceleracion =1;
   }
    
      public pendulo(int lon, int ace)
   {
      this.longitud = lon;
      this.aceleracion = ace;
   }
   
   public int obtenerLongitud()
   {
      return this.longitud;
   }
   
   public int obtenerAceleracion()
   {
      return this.aceleracion;
   }
   
   public void cambiarLongitud(int nuevoLongitud)
   {
      this.longitud = nuevoLongitud;
   }
   
   public void cambiarAceleracion(int nuevoAceleracion)
   {
      this.aceleracion = nuevoAceleracion;
   }
   
   public double calcularPeriodo()
   {
       raiz = Math.sqrt((double)this.aceleracion/this.longitud);
       periodo = (2 * Math.PI * raiz);
       return (double) periodo;
   }
   
   
   public void leer() throws Exception
   {
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Digite longitud");
       int n = teclado.nextInt();
       
       System.out.println("Digite el Aceleracion gravitacional");
       int d = teclado.nextInt();
       
       cambiarLongitud(n);
       cambiarAceleracion(d);
       
    }
   
    public static void main(String[] arg) throws Exception
    {
        pendulo unPendulo = new pendulo();
        int opcion;
        Scanner teclado = new Scanner(System.in);
        do { 
             System.out.println("Menu del Pendulo");
             System.out.println("1. Digitar longitud y aceleracion");
             System.out.println("2. Calcular periodo oscilacion del pendulo ");
             System.out.println("0. Salir");
             System.out.print("Entre su opcion; > ");
             opcion = teclado.nextInt();
             switch (opcion)
             {
               case 1:
                 unPendulo.leer();
                 break;
               
               case 2:
                 double calculo = unPendulo.calcularPeriodo();
                 System.out.println("Periodo oscilacion del pendulo : " + convertir(calculo));
                 break;
                 

                 
                }
        } while (opcion!=0);
    }
   
    public static String convertir(double val){
    Locale.setDefault(Locale.US);
    DecimalFormat num = new DecimalFormat("#,###.00");
    return num.format(val);
    }
   
}
