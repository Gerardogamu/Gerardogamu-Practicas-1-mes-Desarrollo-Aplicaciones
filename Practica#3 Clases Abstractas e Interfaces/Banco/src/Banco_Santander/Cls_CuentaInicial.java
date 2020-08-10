
package Banco_Santander;

import javax.swing.JOptionPane;


 public class Cls_CuentaInicial extends Banco_Santan 
 {

  
    public Cls_CuentaInicial(String cuentaus, Float Saldo) 
    {
        super(cuentaus, Saldo);

    }

    @Override
    public void Depositodinero(Float Depositodine) 
    {
        float depositotemp = 0;

        float limite = getSaldoCuenta() + Depositodine;

        if (limite <= 20000) 
        {
            if (Depositodine <= 4000) 
            {
                depositotemp = getSaldoCuenta() + Depositodine;
                setSaldoCuenta(depositotemp);
                setMovimientos();
            } 
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Te has excedido, el limite de depósito es de $20,000");
        }
    }

    @Override
    public void Retiroefectivo(Float Retiroefec) 
    {
        float retemp = 0;
        if (getSaldoCuenta() >= Retiroefec && Retiroefec <=4000) 
        {
            retemp = getSaldoCuenta() - Retiroefec;
            setSaldoCuenta(retemp);
            setMovimientos();
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "No tiene saldo suficiente");
        }

    }

    @Override
    public void Cortedinero() 
    {

        float Cortetemp = 0;

        if (getMovimientoshechos() > 4) 
        {
            Cortetemp = getSaldoCuenta() - (getMovimientoshechos() * 25);

            setSaldoCuenta(Cortetemp);

        }

    }
 }


