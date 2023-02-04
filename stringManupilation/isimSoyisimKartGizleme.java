package stringManupilation;

public class isimSoyisimKartGizleme {
    public static void main(String[] args) {
        String isim = "Muhammet";
        String soyisim = "DOGANCI";
        String kartNo = "1234 5678 9012 34560";

        String isimIlkHarf = isim.substring(0,1).toUpperCase();
        String yildizliIsim = isim.substring(1).replaceAll("\\w", "*");
        System.out.println(isimIlkHarf+yildizliIsim);

        String soyisimIlkHarf = soyisim.substring(0,1).toUpperCase();
        String yildizliSoyisim = soyisim.substring(1).replaceAll("\\w", "*");
        System.out.println(soyisimIlkHarf+yildizliSoyisim);

        String kartIlkDört = kartNo.substring(0,4);
        String yildizliKart = " **** **** ****";
        System.out.println(kartIlkDört+yildizliKart);

    }
    
}
