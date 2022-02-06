package com.oguzhancan.entity;

import java.util.UUID;

public class Urun {
    /**
     * Private ---> sadece sınıf içerisine açıktır.
     */

    private String id;
    private String ad;
    private double fiyat;

    public void save(String ad,double fiyat){
        id = UUID.randomUUID().toString();
        this.ad = ad;
        this.fiyat = fiyat;
    }
    public void yazdır(){
        System.out.println("Ürün id: " + id);
        System.out.println("Ürün ad: " + ad);
        System.out.println("Ürün fiyat: " + fiyat);

    }
}
