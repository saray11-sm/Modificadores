package Banco;

public class Cuenta {
    private String titular;
    double saldo;
    protected String tipo;
    public String numeroCuenta;

       public Cuenta(String titular, double saldo, String tipo, String numero){    
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
        this.numeroCuenta = numero;;
       }

       public String getTitular (){
        return titular;
       }

       public double getSaldo (){
        return saldo;
       }
       public void depositar(double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("deposito de " + monto + " realizado.");
        }
       }

       public void monstrarInfo(){
        System.out.println("Titular " + titular);
        System.out.println("Saldo " + saldo);
        System.out.println("Tipo " + tipo);
        System.out.println("Numero de cuenta " + numeroCuenta);
       }
    }