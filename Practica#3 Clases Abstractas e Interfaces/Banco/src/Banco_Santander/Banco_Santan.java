
package Banco_Santander;

import javax.swing.JOptionPane;


public abstract class Banco_Santan{

  
    private String cuentauser;
    private Float Saldo;
    private int movimientoshechos;

  

    
    public Banco_Santan(String cuentaus, Float Saldo) {
        this.cuentauser = cuentaus;
        this.Saldo = Saldo;
    }

    
    public String getTipo_cuen() {
        return cuentauser;
    }

    public Float getSaldoCuenta() {
        return Saldo;
    }

    public int getMovimientoshechos() {
        return movimientoshechos;
    }


    public void setTipo_cuenta(String cuenta) {

        this.cuentauser = cuenta;

    }

    public void setSaldoCuenta(Float Saldo) {
        this.Saldo = Saldo;
    }

    public void setMovimientos() {
        this.movimientoshechos = this.movimientoshechos + 1;
    }

    public abstract void Depositodinero(Float Depositodine);

    public abstract void Retiroefectivo(Float Retiroefec);

    public abstract void Cortedinero();

    public void ConsultaSaldo() {
        JOptionPane.showMessageDialog(null, "Tu saldo es de:" + getSaldoCuenta() + "Pesos");
    }

}    

