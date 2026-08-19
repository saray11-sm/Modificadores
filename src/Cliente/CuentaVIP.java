package Cliente;
import  Banco.Cuenta;
  public class CuentaVIP extends Cuenta {

    private double limiteCredito;

    public CuentaVIP(String titular, double saldo, String tipo, String numero, double limite){
        super(titular, saldo, tipo, numero);
        this.limiteCredito = limite;
    }

    public void mostrarInfoVIP(){ 
        System.out.println("Tipo" + tipo);
        System.out.println("numero" + numeroCuenta);
        System.out.println("Titular" + getTitular());
        System.out.println("limite de credito" + limiteCredito);
    }
}