import java.util.Scanner;
import java.util.ArrayList;

public class Empleado {
	private String Nombre, DepartamentoF, PosicionF;
        private int salario;
	private double Total_acumulado,cantidad,Promedio_acumulado;
	
	static Scanner teclado = new Scanner(System.in);

	private String []Departamento={"Almacen","Facturacion","Contabilidad","Gerencia"};
	private String []Posicion={"Jefe","Cajero","Contador","Almacenista","Mensajero"};
	//private Scanner teclado;
	public ArrayList Empleado;
	public ArrayList DatosEmpleado;
	public int i,j,n;
	
	public void main()
	{
		Empleado = new ArrayList();
	}
	
	public void CapturaEmpleados()
	{
	   teclado.nextLine();
	   System.out.print("\nDigite el Nombre: ");
    	   Nombre = teclado.nextLine();	
    	   
	   System.out.print("Seleccione El Servicio/Departamento : ");
              n=Departamento.length;
              for(i=0;i<n;i++)
                {
          	   System.out.print("\n"+i+" :"+Departamento[i]);
                }
              System.out.print("\nEscoja Un Numero: ");
              j = teclado.nextInt();
 	      teclado.nextLine();
 	      DepartamentoF = Departamento[j];
 	      
 	      n=Posicion.length;
              for(i=0;i<n;i++)
                {
          	   System.out.print("\n"+i+" :"+Posicion[i]);
                }
              System.out.print("\nEscoja Un Numero: ");
              j = teclado.nextInt();
 	      teclado.nextLine();
 	      PosicionF = Posicion[j];
	     
	   	       
           System.out.print("Digite Sueldo: ");
           salario = teclado.nextInt();
         	
	   DatosEmpleado = new ArrayList();
	   DatosEmpleado.add(0,Nombre);
	   DatosEmpleado.add(1,DepartamentoF);
	   DatosEmpleado.add(2,PosicionF);
	   DatosEmpleado.add(3,salario);				
	   Empleado.add(DatosEmpleado);
	}
	
	public void Mostrar()
	{		
		System.out.print("\n\nDatos del Empleado: ");
		System.out.print("\nNombre: "+DatosEmpleado.get(0));
		System.out.print("\nDepartamento: "+DatosEmpleado.get(1));
		System.out.print("\nCargo: "+DatosEmpleado.get(2));
		System.out.print("\nSalario: "+DatosEmpleado.get(3));
	}
			
	public void mostrarEmpleado()
        {
		n = Empleado.size();
		if(n!=0)
		{
		    i=0;
		    j=0;
		    teclado.nextLine();
                    System.out.println("Digite Nombre Empleado");
                    String nombre1 = teclado.nextLine();
		    for(i=0;i<n;i++)
		    {			
			if(((ArrayList)Empleado.get(i)).get(0).equals(nombre1))
                        {
                          String nombre = (String)((ArrayList)Empleado.get(i)).get(0);
			String Departamento =(String)((ArrayList)Empleado.get(i)).get(1);
			String Posicion = (String)((ArrayList)Empleado.get(i)).get(2);
			int salario = (int)((ArrayList)Empleado.get(i)).get(3);
		        
		        String Msj = i+1+": Nombre del Empleado: "+nombre+"  Area Trabajo: "+Departamento+" Cargo: "+Posicion+"  Salario: "+salario+"\n";
			System.out.print(Msj); 
                        } 
		    }
		}
		else
		{
		    System.out.print("\nLista De Empleado - No hay Datos Registrados.");
		}
	}
	
	public void ListarEmpleados()
	{
		n = Empleado.size();
		if(n!=0)
		{
		    i=0;
		    j=0;
		    System.out.print("\nListado de Empleado: "+n+"\n");
		    for(i=0;i<n;i++)
		    {			
			String nombre = (String)((ArrayList)Empleado.get(i)).get(0);
			String Departamento =(String)((ArrayList)Empleado.get(i)).get(1);
			String Posicion = (String)((ArrayList)Empleado.get(i)).get(2);
			int salario = (int)((ArrayList)Empleado.get(i)).get(3);
		        
		        String Msj = i+1+": Nombre del Empleado: "+nombre+"  Area Trabajo: "+Departamento+" Cargo: "+Posicion+"  Salario: "+salario+"\n";
			System.out.print(Msj);
		    }
		}
		else
		{
		    System.out.print("\nLista De Empleado - No hay Datos Registrados.");
		}
	}
}