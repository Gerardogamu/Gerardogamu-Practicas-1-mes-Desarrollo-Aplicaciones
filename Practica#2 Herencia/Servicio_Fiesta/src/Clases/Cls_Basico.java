/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author GERAHIMOVIC
 */
import javax.swing.JOptionPane;

public class Cls_Basico {
private int Boy;
//Constuctor de la clase
public Cls_Basico(int Boy) {
this.Boy = Boy;
}
//Get y Set de la clase Paquete Básico
public int getBoy() {
return Boy;
}
public void setBoy(int v) {
this.Boy = Boy;
}
//Método para calcular el paquete básico
public float Basico()
{
int Costo = 0;
int Extras = 0;
if (this.Boy > 0 && Boy <= 30)
{//Si no hay Niños extra, el costo de éste será $600
Costo = 600;
Extras = (30 - this.Boy);
JOptionPane.showMessageDialog(null, "Cuenta con espacio para " + Extras + " niños más, "+ "Su costo es de "+ Costo);
}
else if (this.Boy > 30)
{
//Si existen Niños extra se multiplicaran por $30 y se sumara
//al precio base que es $600
Extras = (this.Boy - 30);
Costo = (Extras * 30);
JOptionPane.showMessageDialog(null, "Importe extra de: $"
+ Costo +" por "+ Extras +" Niños");
Costo = 600 + Costo;
}
return Costo;
}
}