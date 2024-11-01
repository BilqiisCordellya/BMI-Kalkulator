/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bmical;

/**
 *
 * @author USER
 */
public class bbmi {
    double tinggi;
double berat;

public bbmi (double tinggi, double berat){
this.tinggi = tinggi;
this.berat = berat;
}

public void hitungbbmi(){
System.out.println ("Berat badan kamu : " + berat);
System.out.println ("Tinggi badan kamu : " + tinggi);

double hasil = berat/((tinggi/100)*(tinggi/100));
System.out.println("bbmi kamu : " + hasil);

if (hasil <= 18.5){
System.out.println ("BMI kamu termasuk kategori kekurangan berat badan");
} else if (hasil <= 24.5){
System.out.println ("BMI kamu termasuk kategori normal atau ideal");
} else if (hasil == 25 && hasil <= 29.9) {
System.out.println ("BMI kamu termasuk kategori : kelebihan berat badan");
} else {
System.out.println ("BMI kamu termasuk kategori : Obesitas");
}
}
}

