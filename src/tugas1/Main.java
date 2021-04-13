/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author rakha mohammad
 */
public class Main {
    public static void main(String[] args){
        
        int tinggi = 0, jari = 0;
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.printf("Masukkan nilai jari-jari Kerucut: ");
            jari = input.nextInt();
        }catch(InputMismatchException error){
            System.out.println("Input yang anda masukkan bukan integer, errornya adalah " + error.getMessage());
        }try{
            System.out.printf("Masukkan nilai tinggi Kerucut : ");
            tinggi = input.nextInt();
        }catch(InputMismatchException error){
            System.out.println("Input yang anda masukkan bukan integer, errornya adalah " + error.getMessage());
        }finally{
            Kerucut kerucut = new Kerucut(tinggi, jari);
            kerucut.tampilkan();
        }
        
        try{
            System.out.printf("Masukkan nilai jari-jari Bola : ");
            jari = input.nextInt();
        }catch(InputMismatchException error){
            System.out.println("Input yang anda masukkan bukan integer, errornya adalah " + error.getMessage());
        }finally{
            Bola bola = new Bola(jari);
            bola.tampilkan();
        }
    }
}
