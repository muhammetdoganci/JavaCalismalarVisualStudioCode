package forLoop;

import java.util.Scanner;

public class forLoop02 {
    public static void main(String[] args) {
        
    /*Kullanicidan iki sayi isteyin.
    Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
    sonucu yazdiran bir method yaziniz
    */

    Scanner scan = new Scanner(System.in);
    System.out.println("Baslangic ve bitis degerlerini tam sayi olarak iki sayi girin");

    int baslangicSayi = scan.nextInt();
    int bitisSayi = scan.nextInt();
    toplam(baslangicSayi,bitisSayi);

    }

    public static void toplam(int baslangicSayi, int bitisSayi){

    int topla = 0;
    if(baslangicSayi<=bitisSayi){

    for (int i = baslangicSayi; i <=bitisSayi ; i++) {
        topla+=i;
    }
    }else{
        for (int i = bitisSayi; i <= baslangicSayi; i++) {

            topla+=i; 
    }

    }
    System.out.println(topla);
    
}


}



