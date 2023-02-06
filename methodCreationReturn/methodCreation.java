package methodCreationReturn;

import java.util.Scanner;

public class methodCreation {

    public static void main(String[] args) {

        String sehir = sehirYaz();
        String tarih = tarihYaz();

        System.out.println("Girdiginiz sehir : " + sehir);
        System.out.println("Girdiginiz tarih = " + tarih);

    }

    public static String sehirYaz(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Sehir adi giriniz : ");
        String sehirAdi = scan.nextLine().toUpperCase();

        return sehirAdi;
    }

    public static String tarihYaz(){

        String tarih = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Yil giriniz : ");
        int yil = scan.nextInt();

        if(yil>1900 && yil<2100){
            tarih=yil+"-";
        }else{
            System.out.println("Yil icin gecerli tarih giriniz (1900-2100)");
        }

        System.out.println("Kacinci ay oldugunuzu tam sayi olarak giriniz : ");
        int ay = scan.nextInt();
        if(ay<=0 || ay>12){
            System.out.println("Gecerli bir ay bumarasi giriniz (1-12)");
        }else if(ay<10){
            tarih=tarih+"0"+ay+"-";        
        }else{
            tarih=tarih+ay+"-";
        }

        System.out.println("Ayin kacinci gunu oldugunu tam sayi olarak girin");
        int gun = scan.nextInt();
        if(gun<=0 || gun>31){
            System.out.println("Gecerli gun giriniz (1-31)");
        }else if(gun<10){
            tarih=tarih+"0"+gun;
        }else{
            tarih = tarih+gun;
        }
        return tarih;
    }
    
}
