package Banco_Santander;

import javax.swing.JOptionPane;

public class Cls_CuentaIntermedia extends Banco_Santan
{

    public Cls_CuentaIntermedia(String cuentaus, Float Saldo) {
        super(cuentaus, Saldo);

    }

    @Override
    public void Depositodinero(Float Depositodine) 
    {
        float depositotemp = 0;

        if (Depositodine <= 7000) 
        {
            depositotemp = getSaldoCuenta() + Depositodine;
            setSaldoCuenta(depositotemp);
            setMovimientos();
        }
    }

    @Override
    public void Retiroefectivo(Float Retiroefec) 
    {
        float retemp = 0;
        if (getSaldoCuenta() >= Retiroefec && Retiroefec <= 7000) 
        {

            retemp = getSaldoCuenta() - Retiroefec;
            setSaldoCuenta(retemp);
            setMovimientos();
        } else {
            JOptionPane.showMessageDialog(null, "Tu saldo no es suficiente");
        }

    }

    @Override
    public void Cortedinero() 
    {
        
        float Cortetemp = 0;
         if (getSaldoCuenta() <3000)
         {
         Cortetemp = getSaldoCuenta()-150;
         setSaldoCuenta(Cortetemp);
         }
        
    }
    
}
