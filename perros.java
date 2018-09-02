import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;



public class perros
{
  private String nombre_perroP; 
  private String razaP; 
  private String localidadP; 
  private int cedulaP; 
  private String nombre_dueñoP; 
  private int telefonoP; 
  private String dia_semanaP;
  
  static private String []RazasPerro={"Labrador","Border Collie","Cocker Spaniel","BOXER","PASTOR ALEMAN"};
  static private String []Localidades={"Teusaquillo","Suba","Usaquen","Chapinero"};
  static Scanner teclado = new Scanner(System.in);
  static public int i,j,n;

  public perros(String nombre_perro, String raza, String localidad, int cedula, String nombre_dueño, int telefono, String dia )
  {
      this.nombre_perroP = nombre_perro;
      this.razaP = raza;
      this.localidadP = localidad;
      this.cedulaP = cedula;
      this.nombre_dueñoP = nombre_dueño;
      this.telefonoP = telefono;
      this.dia_semanaP = dia;
  }
  
  public static void ListarPerros(ArrayList<perros> bd)
  {
		
      int p;
      n = bd.size();
        for(int i = 0; i < bd.size(); ++i)
	{			
	   String msg = " Nombre Perro: "+ bd.get(i).nombre_perroP +" Raza:  "+ bd.get(i).razaP +" Localidad:  "+ bd.get(i).localidadP ; 
	   msg = msg + " Cedula: "+ bd.get(i).cedulaP + " Nombre Dueño: " + bd.get(i).nombre_dueñoP + " Telefono: " + bd.get(i).telefonoP;
	   String msg2 = msg + " Dia Semana: "+ bd.get(i).dia_semanaP;
	   System.out.println(msg2); 
	}
      }
  
  public String obtenerLocal()
  {
      return this.localidadP;
  }
  
  public void mostrar()
  {
     String msg = " Nombre Perro: "+ nombre_perroP +" Raza:  "+ razaP +" Localidad:  "+ localidadP ; 
	   msg = msg + " Cedula: "+ cedulaP + " Nombre Dueño: " + nombre_dueñoP + " Telefono: " + telefonoP + " Dia Semana: "+ dia_semanaP;
	   System.out.println(msg); 
  }    
      
  public static void ListadoPerros(ArrayList<perros> bd)
  {
		n = bd.size();
		if(n!=0)
		{
		    i=0;
		    j=0;
		    System.out.print("\nListado de Materias: "+n+"\n");
		    for(i=0;i<n;i++)
		    {			
			String semestre = (String)(bd.get(i)).nombre_perroP;
			String materia =(String)(bd.get(i)).razaP;
		        
		        String Msj = i+1+":Numero de Semestre: "+semestre+"  Materia: "+materia+"\n";
			System.out.print(Msj);
		    }
		}
		else
		{
		    System.out.print("\nLista De Materias - No hay Datos Registrados.");
		}
  }    
  
  
  public static void mostrarAgrupadosLocalidad(ArrayList<perros> bd)
  {
      String local;
      perros perros;
      teclado.nextLine();
      System.out.println("Entre localidad a agrupar");
      local = teclado.nextLine();
      for(perros c : bd)
      {
         if(c.obtenerLocal().equals(local))
         {
           c.mostrar();
         }  
      }
  }
      
  
  public static void main(String[] args)
  {
      ArrayList<perros> perros = new ArrayList<>();

      int opcion;
      
      String nombre_perro; 
      String raza; 
      String localidad; 
      int cedula; 
      String nombre_dueño; 
      int telefono; 
      String dia_semana;
      
      perros c;
      int n;
      do{
          
          System.out.println("--> Menu perros <--");
             System.out.println("1. Agregar perros");
             System.out.println("2. Mostrar perros por Localidad");
             System.out.println("3. Numero de perros");
             System.out.println("4. Mostrar Total perros");
             System.out.println("0. Salir");
             opcion = teclado.nextInt();
             switch (opcion)
             {
               case 1:
                 teclado.nextLine();
                 System.out.print("Digite Nombre del perro: ");
                 nombre_perro = teclado.nextLine();
                 
                 System.out.print("RAZA DEL PERRO, SELECCIONE POR FAVOR DE LA LISTA: ");
                 n = RazasPerro.length;
                 for(i=0;i<n;i++)
                 {
          	  System.out.print("\n"+i+" :"+RazasPerro[i]);
                 }
                 System.out.print("\nDIGITE SU OPCION: ");
                 j = teclado.nextInt();
  		 teclado.nextLine();
                 raza = RazasPerro[j];
                 
                 System.out.print("Localidad, SELECCIONE POR FAVOR DE LA LISTA: ");
                 n = Localidades.length;
                 for(i=0;i<n;i++)
                 {
          	  System.out.print("\n"+i+" :"+Localidades[i]);
                 }
                 System.out.print("\nDIGITE SU OPCION: ");
                 j = teclado.nextInt();
  		 teclado.nextLine();
                 localidad = Localidades[j];
                 
                 System.out.print("Digite cedula: ");
                 cedula = teclado.nextInt();
                 teclado.nextLine();
                 
                 System.out.print("Digite nombre del dueño: ");
                 nombre_dueño = teclado.nextLine();
                             
                 System.out.print("Digite telefono: ");
                 telefono = teclado.nextInt();
                 teclado.nextLine();
                 
                 System.out.print("Digite dia semana: ");
                 dia_semana = teclado.nextLine();
                 
                 c = new perros(nombre_perro, raza, localidad, cedula, nombre_dueño, telefono, dia_semana);
                 perros.add(c);
                 break;
                 
               case 2:
                   mostrarAgrupadosLocalidad(perros);
                   break;
               
               case 3:
                 n = perros.size();
                 System.out.println("El numero de perros: " + n);
                 break;
                 
               case 4:
                 ListarPerros(perros);
                   //ListadoPerros(perros);
                   break;  
               
               case 0:
                 System.exit(0);
                   break;    
              }
         
      } while((opcion==0)||(opcion==1)||(opcion==2)||(opcion==3)||(opcion==4));
		
  }
  
  
}
