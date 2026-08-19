package Cliente;
import Banco.Cuenta;
import Banco.Banco;

public class App {
    public static void main(String[] args) {
  Cuenta c = new Cuenta("Jhermy Berrio", 20000000, "Ahorro", "AH-001");
  
  System.out.println("C.numeroCuenta");
  System.out.println(c.getTitular());
  System.out.println(c.getSaldo());

  c.depositar(20000000);
  c.monstrarInfo();

  System.out.println("------");

    CuentaVIP vip = new CuentaVIP("Jhermy Berrio", 20000000, "Ahorro", "AH-001", 1000000);                                                   
    vip.mostrarInfoVIP();

    System.out.println("------");

    Banco banco = new Banco();
    banco.operar(c);
   }
}
