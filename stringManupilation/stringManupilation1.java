package stringManupilation;
import java.util.Scanner;

public class stringManupilation1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Email adresinizi giriniz : ");
        String email = scan.nextLine();

        if(!email.contains("@gmail.com")){
            System.out.println("Lütfen gmail adresi giriniz");
        }else if(email.lastIndexOf("@gmail.com") == (email.length()-10)){
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("Lütfen yazimi kontrol ediniz");
        }
    }
    
}
