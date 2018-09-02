import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ascensor
{
    static Scanner teclado = new Scanner(System.in);
    int inicio;
    final int INICIO_PISO = inicio;
    int PISOS = INICIO_PISO;
    String[] Nombres;
    int cantidad, sotanos;
    int Movimiento = 0;
    int ir_al_piso;
    int Direccion;
    int ubicado;
    
    public void ubicacionPiso(int pisoActual)
    {
      this.PISOS = pisoActual;
    }
    
    public void cantidadSotanos(int nuevoSotanos)
    {
      this.inicio = nuevoSotanos;
    }
    
    public void calcularSubir()
    {
        Direccion = 1;
        JOptionPane.showMessageDialog(null, "¡El ascensor se cerrara automaticamente!");
        JOptionPane.showMessageDialog(null, "¡Cerrado!");
        System.out.print("Subiendo...");
        JOptionPane.showMessageDialog(null, "¡El ascensor se abrira automaticamente!");
    }
    
    public void calcularBajar()
    {
        Direccion = -1;
        JOptionPane.showMessageDialog(null, "¡El ascensor se cerrara automaticamente!");
        JOptionPane.showMessageDialog(null, "¡Cerrado!");
        System.out.print("Bajando...");
        JOptionPane.showMessageDialog(null, "¡El ascensor se abrira automaticamente!");
    }
    
    
    public void calcularMovimientoAscensor()
    {
      Nombres = new String[cantidad];
      final String Mensaje_Error = "Seleccione un piso entre el 1 a " + cantidad;
      System.out.print("¿A que piso quiere ir? del [" + inicio + " al " + cantidad + "]? ");
            ir_al_piso = teclado.nextInt();
            while (ir_al_piso < inicio || ir_al_piso > cantidad) {
                System.out.println(Mensaje_Error);
                System.out.print("¿A que piso quiere ir? del [" + inicio + " al " + cantidad + "]? ");
                ir_al_piso = teclado.nextInt();
            }
            
            if (ir_al_piso == PISOS) {
                System.out.println("Ya esta en el PISO Seleccionado: " +PISOS);
            } else {
                Movimiento++;
                if (ir_al_piso > PISOS) {
                    calcularSubir();
                } else {
                    calcularBajar();
                }
                for (PISOS += Direccion;
                        ir_al_piso != PISOS;
                        PISOS += Direccion) {
                    System.out.print(PISOS + "...");
                }
                System.out.println("LLego a su destino " + PISOS);
                JOptionPane.showMessageDialog(null, "¡Abierto!");
            }
    }
    
    public int calcularPisos()
    {
       int TotalPisos = ((this.inicio * -1) + this.cantidad);
       return (int) TotalPisos;
    }
        
    public void leer() throws Exception
    {
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("Ingrese la cantidad de pisos del edificio:");
       cantidad = teclado.nextInt();
       
       System.out.print("Ingrese la cantidad de sotanos del edificio:");
       sotanos = teclado.nextInt();
       
       System.out.print("Ingrese el piso donde esta Ubicado:");
       ubicado = teclado.nextInt();
       
       ubicacionPiso(ubicado);
       cantidadSotanos(sotanos);
       
    }
    
    public static void main(String[] arg) throws Exception
    {
            Ascensor unAscensor = new Ascensor();
            int opcion;
            Scanner teclado = new Scanner(System.in);
            do { 
                 System.out.println("Menu del Ascensor");
                 System.out.println("1. Digitar Pisos y sotanos");
                 System.out.println("2. Total Pisos");
                 System.out.println("3. Movimiento del Ascensor(Subiendo o Bajando) ");
                 System.out.println("0. Salir");
                 System.out.print("Entre su opcion; > ");
                 opcion = teclado.nextInt();
                 switch (opcion)
                 {
                   case 1:
                     unAscensor.leer();
                     break;

                   case 2:
                     int calculo = unAscensor.calcularPisos();
                     System.out.println("Numero de plantas que tiene el edificio = " + calculo);
                     break;
                     
                   case 3:
                     unAscensor.calcularMovimientoAscensor();
                     break;
                   }
            } while (opcion!=0);
    }    
    
}
