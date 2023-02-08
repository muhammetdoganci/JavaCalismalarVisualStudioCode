import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class switchCase {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Gun giriniz : ");
        String gun = scan.nextLine();
        gun = gun.toLowerCase();

        switch (gun) {
            case "pazartesi":
            System.out.println("Hafta ici");
            break;
            case "sali":
            System.out.println("Hafta ici");
            break;
            case "carsamba":
            System.out.println("Hafta ici");
            break;
            case "persembe":
            System.out.println("Hafta ici");
            break;
            case "cuma":
            System.out.println("Hafta ici");
            break;
            case "cumartesi":
            System.out.println("Hafta sonu");
            break;
            case "pazar":
            System.out.println("Hafta sonu");
            break;
            default:
            System.out.println("Gecerli bir gun girin");

        }

        switch (gun){
            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("Hafta ici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }

    
    }
    
}
