import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        
        /*
         kullanicidan bir sayi alin ve rakamlari toplamini yazdirin
         */

         Scanner scan = new Scanner(System.in);
         System.out.println("bir sayi giriniz : ");
         int sayi = scan.nextInt();
         
         int rakamlarToplami = 0;
         int birlerBasamagi= 0;
         int toplam = sayi;

         while(toplam>0){
            birlerBasamagi = toplam%10;
            rakamlarToplami += birlerBasamagi;
            toplam/=10;
         }

         System.out.println(sayi + " sayisinin rakamlar toplami : " + rakamlarToplami);
    }
}
