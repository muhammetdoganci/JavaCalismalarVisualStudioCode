package stringManupilation;

public class dolarAndDobleTopla {
    public static void main(String[] args) {
        String dolar1 = "$13,99";
        String dolar2 = "$10,55";

        dolar1 = dolar1.replaceAll("\\D", "");
        double sayi1 = Double.parseDouble(dolar1);

        dolar2 = dolar2.replaceAll("\\D", "");
        double sayi2 = Double.parseDouble(dolar2); 

        System.out.println("$"+(sayi1+sayi2)/100);

    }
}
