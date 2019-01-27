/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;

/**
 *
 * @author Aji
 */
public class Rumuskonversi {
    
    public int Rumuskonversi(int n1) {
        int x = Integer.valueOf(n1);
        String Hitung = Integer.toBinaryString(x);
        int test = Integer.valueOf(Hitung);
        return test;
    }
    public String Rumuskonversi(String n1) {
        int angka = Integer.parseInt(n1);
        String Hex = Integer.toHexString(angka);
        return Hex;
    }
}
