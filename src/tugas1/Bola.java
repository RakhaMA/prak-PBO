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
public class Bola extends BangunRuang{
    int jari;
    float jari2;
    
    public Bola(int jari) {
        this.jari = jari;
        super.setWarna("Merah");
    }
    
    public Bola(float jari2) {
        this.jari2 = jari2;
        super.setWarna("Merah");
    }
    
    @Override
    double volume(){
        return Math.PI*jari*jari*jari*4/3;
    }
    
    @Override
    float volume(float jari2){
        return (float) (Math.PI*jari2*jari2*jari2*4/3);
    }
    
    @Override
    double luasPermukaan(){
        return Math.PI*jari*jari*4;
    }
    
    @Override
    float luasPermukaan(float jari2){
        return (float) (Math.PI*jari2*jari2*4);
    }
    
    void tampilkan(){
        System.out.println("Volume Bola : " + volume(jari2));
        System.out.println("Luas Permukaan Bola : " + luasPermukaan(jari2));
        System.out.println("Warna : " + super.getWarna());
    }
}