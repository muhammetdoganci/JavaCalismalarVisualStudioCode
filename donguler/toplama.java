package donguler;

import java.util.Scanner;

public class toplama {
    public static void main(String[] args) {
        
        Scanner giris = new Scanner(System.in);
        int sayac, toplam, sayi;
        toplam = 0;
        sayac = 0;

        System.out.println("Alt alta pozitif sayilar gireceksiniz ve negatif sayi");
        System.out.println("girene kadar onlar toplanacak. Negatif girdiginizde");
        System.out.println("toplama isleminin sonucu size verilecektir.");

        while (true) {
            System.out.println("Sayi giriniz : ");
            sayi = giris.nextInt();

            if(sayi<0){
                break;
            }
            toplam+=sayi;
            sayac++;
            
        }
        System.out.println("Toplami " + toplam + " olan " + sayac + " tane sayi girdiniz ");
    }
}
