package guia2;

public class Cuenta 
{
    private int saldo;
    private String nombreCuenta;
    
    public void Cuenta()
    {
        
    }
    
    public void Cuenta(int saldo, String nombreCuenta)
    {
        setSaldo(saldo);
        setNombreCuenta(nombreCuenta);
    }
    
    public int getSaldo ()
    {
        return saldo;
    }
    
    public String getNombreCuenta ()
    {
        return nombreCuenta;
    }
    
    public void setSaldo (int saldoRecibido)
    {
        saldo = saldoRecibido;
    }
    
    public void setNombreCuenta (String NombreCuentaRecibido)
    {
        nombreCuenta = NombreCuentaRecibido;
    }
    
    public void ingresar (float recibir)
    {
        saldo += recibir;
    }
    
    public void extraer (float restar)
    {
        if(saldo>=restar)
        {
            saldo -= restar;
        }
        else
        {
            System.out.println("No se puede realizar la operacion.");
        }
    } 
}
