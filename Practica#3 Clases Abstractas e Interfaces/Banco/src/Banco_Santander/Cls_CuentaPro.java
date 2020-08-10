package Banco_Santander;

import javax.swing.JOptionPane;

public class Cls_CuentaPro extends Banco_Santan

{
    public Cls_CuentaPro(String cuentaus, Float Saldo) 
    {
        super(cuentaus, Saldo);

    }

    @Override
    public void Depositodinero(Float Depositodine) 
    {
        float depositotemp = 0;

        depositotemp = getSaldoCuenta() + Depositodine;
        setSaldoCuenta(depositotemp);
        setMovimientos();
    }

    @Override
    public void Retiroefectivo(Float Retiroefec) 
    {
        float retemp = 0;
        if (getSaldoCuenta() >= Retiroefec) 
        {

            retemp = getSaldoCuenta() - Retiroefec;
            setSaldoCuenta(retemp);
            setMovimientos();
        } else 
        {
            JOptionPane.showMessageDialog(null, "No tiene saldo suficiente :V ");
        }
    }

    @Override
    public void Cortedinero() 
    {
          float Cortetemp = 0;
         if (getSaldoCuenta() <10000)
         {
         Cortetemp = getSaldoCuenta()-250;
         setSaldoCuenta(Cortetemp);
         }
    }
    
}
