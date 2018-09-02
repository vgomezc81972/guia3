import java.util.Scanner;

public class dupla
{
   static Scanner teclado = new Scanner(System.in);
   private int a, b;

    public dupla()
   {
      this.a = 12;
      this.b = 32;
   }
   
   public void guarda(int a2, int b2)
   {
      this.a = a2;
      this.b = b2;
      System.out.print("Par a: "+this.a +" Par a: "+this.b);
   }
    
   public void lee() throws Exception
   {
       System.out.println("Valor primer par a: ");
       int a2 = teclado.nextInt();
       
       System.out.println("Valor primer par b: ");
       int b2 = teclado.nextInt();
       
       guarda(a2,b2);
    }
   
   
   
   public static void main(String[] args) throws Exception
  {
      dupla unDupla = new dupla();
      int x, y;
      int opcion;
      do{
          
          System.out.println("\n--> Valor del Primer Par <--");
             System.out.println("1. Guarda Par");
             System.out.println("2. Ingresa NUmero Primer Par");
             System.out.println("0. Salir");
             opcion = teclado.nextInt();
             switch (opcion)
             {
               case 1:
                 unDupla.guarda(12,32);
               //  System.out.print(Msj); 
                 break;
               case 2:
                   unDupla.lee();
                   break;
               case 0:
                 System.exit(0);
                 break;
             }
      } while (opcion!=0);
    }
    
}
