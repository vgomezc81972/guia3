import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class menup
{

    private int opc;
    private Scanner entrada;
    public static void main(String[] args)
    {
      menup MenuP = new menup();
      MenuP.Mostrar();
    }

    
    public void Mostrar()
	{	
		// 1. Solicitar los datos de entrada
	        Empleado Empleado = new Empleado();
		Empleado.main();
		entrada = new Scanner(System.in);
		do
		{
		    // 2. Crear Menu
			System.out.print("\nSupermercado Santafe\n\n");
			System.out.print("Escoja Una de las Siguientes Opciones:\n");
			System.out.print("1: Ingrese Datos de Empleados\n");
			System.out.print("2: Listar Todos los Empleados\n");
			System.out.print("3: Imprimir Un Empleado\n");
			System.out.print("4: Salir\n");	
			opc = entrada.nextInt();
			switch(opc)
			{
				case 1:
				{
					Empleado.CapturaEmpleados();					
					break;		
				}
				case 2:
				{
					Empleado.ListarEmpleados();
					break;					
				}
				case 3:
				{
					Empleado.mostrarEmpleado();					
					break;		
				}
				case 4:
				{
					System.exit(0);
				}
			}
		}
		while((opc==1)||(opc==2)||(opc==3));
		{
			menup MenuP = new menup();
			MenuP.error("No existe Opcion!!!");
		}	
	}
    
    public void error(String msj)
    {
      System.out.print("\nERROR: "+msj);
      menup MenuP = new menup();
      MenuP.Mostrar();		
    }
    
    public static String convertir(double val){
    Locale.setDefault(Locale.US);
    DecimalFormat num = new DecimalFormat("#,###.00");
    return num.format(val);
    }

}
