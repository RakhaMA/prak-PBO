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
public abstract class BangunRuang {
    private String warna;

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    abstract double volume();
    abstract double luasPermukaan();
    float volume(float jari){
        return 0;
    };
    float luasPermukaan(float jari){
        return 0;
    }
}