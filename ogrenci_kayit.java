package array_ile_ogrenci_kayit;

import java.util.Scanner;

public class ogrenci_kayit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] ogr_no = new int[30];
        String[] isim = new String[30];
        String[] soyad = new String[30];
        int secim, silinecek_no;
        int i = 0; // i değerini döngü dışında tanımlayın

        while (true) {
            System.out.println("YAPILACAK İŞLEMİ SEÇİNİZ:  \n1-ÖĞRENCİ KAYDI EKLE \n2-ÖĞRENCİ KAYDI SİL \n3-KAYITLARI GÖSTER \n0-ÇIKIŞ");
            secim = scan.nextInt();

            if (secim == 1) {
                if (i == ogr_no.length) {
                    System.out.println("MAKSİMUM KAYIT SAYISINA ULAŞILDI...");//30.kayıda gelindiğinde döngüyü bitirecek.
                    break;
                }
                System.out.println("ÖĞRENCİNİN NUMARASI:  ");
                ogr_no[i] = scan.nextInt();

                System.out.println("ÖĞRENCİNİN ADI:  ");
                scan.nextLine(); // Boş satırı oku
                isim[i] = scan.next();

                System.out.println("ÖĞRENCİNİN SOYADI:  ");
                scan.nextLine(); // Boş satırı oku
                soyad[i] = scan.next();

                i++;
            }

            if (secim == 2) {
                System.out.println("SİLİNECEK ÖĞRENCİNİN NUMARASI:  ");
                silinecek_no = scan.nextInt();//girilen numarayı döngü ile arayıp bulacak.bulduğu kaydı silecek.

                for (int j = 0; j < ogr_no.length; j++) {
                    if (ogr_no[j] == silinecek_no) {
                        ogr_no[j] = 0;
                        isim[j] = null;
                        soyad[j] = null;
                        System.out.println(silinecek_no + " NUMARALI KAYIT SİLİNDİ.");
                        break;
                    }
                }
            }

            if (secim == 3) {
                for (int j = 0; j < i; j++) {//BOŞ BİR KAYIT GELENE KADAR TÜM KAYITLARI YAZDIRACAK.
                    if (ogr_no[j] != 0) {
                        System.out.println("ÖĞRENCİNİN NUMARASI:  " + ogr_no[j]);
                        System.out.println("ÖĞRENCİNİN ADI:  " + isim[j]);
                        System.out.println("ÖĞRENCİNİN SOYADI:  " + soyad[j] +"\n\n");
                    }
                }
                System.out.println("TÜM KAYITLAR GÖSTERİLDİ.");
            }

            if (secim == 0) {
            	System.out.println("SİSTEMDEN ÇIKIŞ YAPILDI...");
                break;
            }
        }
    }
}