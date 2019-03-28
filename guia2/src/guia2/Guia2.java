package guia2;

import java.io.Console;
import static java.time.Clock.system;
import java.util.Scanner;

public class Guia2 
{
    static Scanner scan;
    
    public static void main(String[] args) 
    {
        Cuenta deposito = null;
        scan = new Scanner(System.in);
     
        menuPrincipal(deposito);
        
        scan.close();
        
        
    }
    
    public static void pausar ()
    {  
        System.out.println("Ingrese un caracter para continuar . . .");
        scan.next();
    }
    
    public static void limpiar(int lineas)
    {
     for (int i=0; i < lineas; i++)
     {
      System.out.println();
     }
    }
    
    public static void mostrarMenu ()
    {
        System.out.println("1.Crear cuenta vacia");
        System.out.println("2.Crear cuenta con saldo inicial");
        System.out.println("3.Ingresar dinero");
        System.out.println("4.Sacar dinero");
        System.out.println("5.Ver saldo");
        System.out.println("6.Salir");
        System.out.println("Ingrese opcion: ");
    }
    
    public static void mostrarDatosDeCuenta (Cuenta deposito)
    {
        System.out.println("Cuenta: " + deposito.getNombreCuenta());
        System.out.println("Saldo: $" + deposito.getSaldo());
    } 
    
    public static void menuPrincipal (Cuenta deposito)
    {
        int opcion = 0;
        
        limpiar(100);
        mostrarMenu();
        opcion = scan.nextInt();
        
        while(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5 && opcion != 6)
        {
            limpiar(100);
            mostrarMenu();
            opcion = scan.nextInt();
        }
        
        switch(opcion)
        {
            case 1:
                limpiar(100);
                
                if (deposito == null)
                {
                    System.out.println("Ingrese nombre: ");
                    deposito = new Cuenta();
                    deposito.setNombreCuenta(scan.next());
                    limpiar(100);
                    System.out.println("Cuenta de " + deposito.getNombreCuenta() + " creada con exito.");
                }
                else
                {
                    System.out.println("Usted ya posee una cuenta.");
                }
                pausar();
                menuPrincipal(deposito);
                break;
            case 2:
                limpiar(100);
                
                if(deposito == null)
                {
                    System.out.println("Ingrese nombre: ");
                    deposito = new Cuenta();
                    deposito.setNombreCuenta(scan.next());
                    System.out.println("Ingrese saldo inicial: ");
                    deposito.setSaldo(scan.nextInt());
                    limpiar(100);
                    System.out.println(deposito.getNombreCuenta() + " ha creado su cuenta con un saldo inicial de $" + deposito.getSaldo() + ".");
                }
                else
                {
                    System.out.println("Usted ya posee una cuenta.");
                }
                pausar();
                menuPrincipal(deposito);
                break;
            case 3:
                limpiar(100);
                
                if (deposito == null)
                {
                    System.out.println("Cuenta aún no creada.");
                }
                else
                {
                    System.out.println("Ingrese saldo: ");
                    deposito.ingresar(scan.nextInt());
                    System.out.println("Saldo agregado con éxito.");
                }
                pausar();
                menuPrincipal(deposito);
                break;
            case 4:
                limpiar(100);
                System.out.println("Ingrese saldo a extraer: ");
                deposito.extraer(scan.nextInt());
                limpiar(100);    
                System.out.println("Saldo extraido con éxito."); 
                pausar();
                menuPrincipal(deposito);
                break;
            case 5:
                limpiar(100);
                mostrarDatosDeCuenta(deposito);
                pausar();
                menuPrincipal(deposito);
                break;
            case 6:
                System.out.close();
                break;
        }
    }
}













