/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author rakha mohammad
 */
public class Main {
    public static void main(String[] args){
        Kerucut kerucut = new Kerucut(10, 7);
        kerucut.tampilkan();
        
        Bola bola = new Bola((float) 3.5);
        bola.tampilkan();
    }
}
