package com.oguzhancan.entity;

import java.util.ArrayList;
import java.util.List;

public class UrunRepository {
    /**
     * sadece class içine açık.
     */
    private List<Urun> urunListesi = new ArrayList<>();

    /**
     * Tüm erişim lokasyonlarına açık.
     * @param ad
     * @param fiyat
     */
    public void UrunEkleme(String ad, double fiyat){
        Urun urun = new Urun();
        urun.save(ad,fiyat);
        urun.yazdır();
    }
    // aynı firmaya ait farklı lokasyon herşeyleri farklı... package farklı..
    // aynı paket içinde protected.

    /**
     * Sade paket içine açık.
     * @param id
     * @return
     */
    protected Urun findById(String id){
        Urun urun = new Urun();
        urun.save("PC 1500", 36500);
        return urun;
    }
}
