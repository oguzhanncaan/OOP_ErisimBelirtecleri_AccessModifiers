package com.oguzhancan;

import com.oguzhancan.entity.SatisRepository;
import com.oguzhancan.entity.UrunRepository;

public class Runner {
    public static void main(String[] args) {

        /**
         * Erişim Belirteçleri
         * Tanım: Herhangi bir bileşenin (Class, Method, Değişken) erişiminin kontrol edilmesi amacıyla kullanılır.Güvenli kodlamada
         * önemlidir. Daha bir çok alanda kullanılır.
         * Türleri:
         * -Private --> En kapalı türdür, sadece sınıf içine açıktır.
         * -Protected --> Bulunduğu düzey paket içine açıktır.
         * -Public --> Tüm erişimlere açıktır. En geniş kapsamlı kullanımdır.
         * - *Default --> Bazı dökümantasyonlarda görebilirsiniz. Erişim belirteci kullanılmadığı zaman ifade edilir. Özellikle Default diye
         * bir erişim belirteci yoktur.
         */

        UrunRepository repository = new UrunRepository();
        repository.UrunEkleme("Laptop A",2500);
        SatisRepository satisRepository = new SatisRepository();
        satisRepository.satisYap("Muhammet Hoca", "dasda", 23);



    }
}
