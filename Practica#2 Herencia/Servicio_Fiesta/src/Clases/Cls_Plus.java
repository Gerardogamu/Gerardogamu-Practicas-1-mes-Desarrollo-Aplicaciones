
package Clases;

/**
 *
 * @author GERAHIMOVIC
 */
import javax.swing.JOptionPane;

public class Cls_Plus extends Cls_Basico{
    
    public Cls_Plus(int Boy) {
        super(Boy);
    }

    private int Payaso,Gift,Botarga;

    public Cls_Plus(int Boy, int Payaso, int Gift, int Botarga) {
        super(Boy);
        this.Botarga = Botarga;
        this.Gift = Gift;
        this.Payaso = Payaso;
    }


    public int getBotarga() {
        return Botarga;
    }

    public void setBotarga(int Botarga) {
        this.Botarga = Botarga;
    }

    public int getGift() {
        return Gift;
    }

    public void setGift(int Regalo) {
        this.Gift = Regalo;
    }

    public int getPayaso() {
        return Payaso;
    }

    public void setPayaso(int Payaso) {
        this.Payaso = Payaso;
    }
    
    
    
     //Método para calcular el paquete Plus
    public float Plus() 
    {
        int Costo = 1000;
        
        if (this.Payaso > 0 || this.Gift > 0 || this.Botarga > 0  && this.getBoy()> 0) 
        {//Por cada payaso o botarga se agregan $200 al costo base, y por regalo $30
            
            Costo=Costo + (this.Payaso * 200) + (this.Gift * 30) + (this.Botarga * 200);
            JOptionPane.showMessageDialog(null,"Cargo extra Payaso "+ (this.Payaso*200) +" Regalo "+ (this.Gift*30) +" Botarga "+( this.Botarga*200) );
        }
        else
        {
           return Costo;
        }
        return Costo;
    }
}