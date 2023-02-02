public class terstenYazdirma {
    public static void main(String[] args) {
        String yazi = "Visual Studio Code Ogreniyorum";
        String tesrYazi = "";
        for (int i = yazi.length()-1; i>=0; i--) {
            tesrYazi+=yazi.substring(i, i+1);
            
        }
        System.out.println(tesrYazi);
        System.out.println(yazi.length());
    }
}
