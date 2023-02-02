package stringManupilation;

public class stringManupilation2 {
    public static void main(String[] args) {
        
    
    String cümle = "1Bu2Gu3n Ja*va- cok g3uz/el";
    
    cümle = cümle.replaceAll("\\W", "abc");
    System.out.println(cümle);

    cümle = cümle.replaceAll("\\d", "");
    System.out.println(cümle);

    cümle = cümle.replaceAll("abc", " ");
    System.out.println(cümle);
    
    cümle = cümle.replaceAll("BuGun", "Bu Gun");
    cümle = cümle.replaceAll("Ja va", "Java");
    cümle = cümle.replaceAll("guz el", "guzel");
    System.out.println(cümle);    

}
    
}
