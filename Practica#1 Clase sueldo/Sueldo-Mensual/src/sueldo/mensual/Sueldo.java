package sueldo.mensual;

public class Sueldo 
{
 private int hrt;
 private float phr;
 
    public void Sueldo()
    {
        phr=0;
        hrt=1;
        
    }
    
    public float Getphr()
    {
        return phr;
    }
    
    public void Setphr(float x)
    {
        phr=x;
    }
    
    public int Gethrt()
    {
        return hrt;
    }
    
    public void Sethrt(int x)
    {
        if(x==0 )
        {
            hrt=1;
            return;
        }
        hrt=x;
    }
   
    public  float PagoTrabajador()
    {
            float res;
            res=phr*hrt;
            return res;
    }
}
