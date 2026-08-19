package Banco;

public class Banco {

    public void operar(Cuenta c){
        System.out.println(c.saldo);
        System.out.println(c.tipo);
        System.out.println(c.numeroCuenta);
        System.out.println(c.getTitular());
    }
}